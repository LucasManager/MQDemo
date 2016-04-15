package com.apl.convert.q2ctowbp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBElement;

import com.apl.convert.common.BaseBean;
import com.apl.convert.entity.BusinessPartner;
import com.apl.convert.entity.Header;
import com.apl.convert.entity.HouseBooking;
import com.apl.convert.entity.Item;
import com.apl.convert.entity.Note;
import com.apl.convert.entity.SendBookingBLRequestMsg;
import com.apl.convert.entity.SendBookingBLRequestMsg.AppMessageHeader;
import com.apl.convert.exception.DataException;
import com.apl.convert.util.ConvertUtil;

public class Resolve {
	SendBookingBLRequestMsg s;
	Result result;

	public Resolve(SendBookingBLRequestMsg s) {
		this.s = s;
	}

	/**
	 * 
	 * @param results
	 * @return
	 * @throws DataException
	 */
	public List<Result> resolving(List<Result> results) throws DataException {
		result = new Result();
		// resolving the main xml node
		parseAppHeader(s.getAppMessageHeader());
		parseHeader(s.getBookingandBL().getHeader());
		parseNote(s.getBookingandBL().getNote());
		parseBussinessPartner(s.getBookingandBL().getBusinessPartner());
		parseItem(s.getBookingandBL().getItem());
		// verify the value those need to combined whether is null
		validate("Shipper", result.getShipper());
		validate("Consignee", result.getConsignee());
		validate("Notify", result.getNotify());
		validate("Marks", result.getMarks());
		validate("Cargo Description", result.getDescription());
		validate("PackageCode", result.getPkgCode());
		validate("PackageDescription", result.getPkgDesc());
		// If there is HouseBooking node in xml then cloning a new Result 
		if (s.getBookingandBL().getHouseBooking().size() > 0) {
			result.setCtnStatus("L");
			results.add(result);
			List<HouseBooking> houseBookings = s.getBookingandBL().getHouseBooking();

			for (HouseBooking houseBooking : houseBookings) {
				try {
					result = result.clone();
					parseHouseBooking(houseBooking);
					results.add(result);
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		} else {
			result.setCtnStatus("F");
			results.add(result);
		}
		return results;
	}

	/**
	 * parsing AppHeader
	 * 
	 * @param app
	 * @throws DataException
	 */
	private void parseAppHeader(AppMessageHeader app) throws DataException {
		result.setFileCreateTime(getFileCreateTime(app));
	}

	/**
	 * parsing Header
	 * 
	 * @param header
	 * @throws DataException
	 */
	private void parseHeader(Header header) throws DataException {
		result.setShipperReferenceNo(transSymbol(validate("ShipperReferenceNo", header.getShipperReferenceNo())));
		result.setBlNo("APLU".concat(getBlno(transSymbol(validate("BLNO", header.getBLNo())))));
		result.setDelivery(getDelivery(header));
		result.setLoadVessel(getVesselMapping(transSymbol(validate("Load Vessel", header.getLoadVessel())),"Vessel"));
		result.setLoadVoyage(transSymbol(validate("Load Voyage", header.getLoadVoyage())));
		result.setShipmentDate(getShipmentDate(header));
		result.setQuotationNo(header.getQuotationNo() == null ? "" : transSymbol(header.getQuotationNo()));
		result.setPlaceOfReceiptCode(header.getOrigin() == null ? "" : transSymbol(header.getOrigin()));
		result.setPlaceOfReceipt(getPortMapping(result.getPlaceOfReceiptCode(), "Orign"));
		result.setLoadPortCode(header.getLoadPort() == null ? "" : transSymbol(header.getLoadPort()));
		result.setLoadPort(getPortMapping(result.getLoadPortCode(), "LoadPort"));
		result.setDischargePortCode(
				getDischargePortCode(transSymbol(validate("DischargePortCode", header.getDischargePort()))));
		result.setDischargePort(getPortMapping(result.getDischargePortCode(), "DischargePort"));
		result.setPlaceOfDeliveryCode(header.getDestination() == null ? "" : transSymbol(header.getDestination()));
		result.setPlaceOfDelivery(getPortMapping(result.getPlaceOfDeliveryCode(), "Destination"));
		result.setPaymentTermOCF(header.getPaymentTermOCF() == null ? "" : transSymbol(header.getPaymentTermOCF()));
	}

	/**
	 * parsing Item
	 * 
	 * @param list
	 * @throws DataException
	 * @throws NumberFormatException
	 */
	private void parseItem(List<Item> list) throws NumberFormatException, DataException {
		Set<String> cnIdSet = new HashSet();
		// first loop, get the container itemId, get the last itemId and initialize the Container quantity
		for (Item item : list) {
			int itemId = Integer.valueOf(transSymbol(validate("ItemId", item.getItemID())));
			int lastItemId = result.getLastItemId();
			String itemType = transSymbol(validate("ItemType", item.getItemType()));
			result.setLastItemId(itemId > lastItemId ? itemId : lastItemId);
			if ("CN".equals(itemType)) {
				int lastCtnid = result.getLastCtnId();
				result.setLastCtnId(itemId > lastCtnid ? itemId : lastCtnid);
				String equipment = transSymbol(validate("EquipmentType", item.getEquipmentType()));
				String iniCntrCode = mapEquipmentType(equipment);
				Map<String, Integer> cnCount = result.getCtnCounts();
				cnCount.put(iniCntrCode, 0);
				result.setCtnCounts(cnCount);
				cnIdSet.add(transSymbol(item.getItemID()));
			} else if (!"CN".equals(itemType)) {
				int pkgId = result.getLastPkgId();
				result.setLastPkgId(itemId > pkgId ? itemId : pkgId);
			}
		}

		// second loop, get the MARKS and Cargo Description, get the measurement of the first package
		for (Item item : list) {
			int itemId = Integer.valueOf(transSymbol(item.getItemID()));
			String itemType = transSymbol(validate("ItemType", item.getItemType()));
			String parentId = transSymbol(item.getParentItemID() == null ? "" : item.getParentItemID());
			int lastCtnId = result.getLastCtnId();
			int lastPkgId = result.getLastPkgId();
			int lastItemId = result.getLastItemId();
			
			if (itemId == lastItemId) {
				// get MARKS and Cargo Description in Item.Note node
				parseItemNote(item.getNote());
				// get PkgCode and PkgDesc
				setPkgCodeAndDesc(item);
			}
			List<String> measureList = getMeasurementValue(item);
			if ("CN".equals(itemType)) {
				setCargoId(item);
				String equipment = transSymbol(item.getEquipmentType());
				String cargoId = result.getCargoId();
				
				// If the container type is Reffer then get the temperature
				if ("R".equals(cargoId) && itemId == lastCtnId) {
					getTemperature(item);
				}
				setCtnMeasurement(measureList, equipment);
			} else if (!"CN".equals(itemType) && cnIdSet.contains(parentId)) {
				// calculate the measurement
				setPkgMeasurement(measureList);
			}
		}
	}

	/**
	 * get DischargePortCode, combine the value next to the "-" with the Remarks
	 * 
	 * @param dischargePortCode
	 * @return
	 */
	private String getDischargePortCode(String dischargePortCode) {
		
		if (dischargePortCode.length() > 5) {
			String port = dischargePortCode.substring(6);
			result.setRemarks("DischargePortCode?:" + port + ", ");
			return dischargePortCode.substring(0, 5);
		} else {
			return dischargePortCode;
		}
	}

	/**
	 * Parse HouseBooking node
	 * 	Getting master-booking item and business-partner else if the baby-booking has its own item and business-partner
	 * 
	 * @param houseBooking
	 * @throws NumberFormatException
	 * @throws DataException
	 */
	private void parseHouseBooking(HouseBooking houseBooking) throws NumberFormatException, DataException {
		result.setBlNo("APLU" + getBlno(transSymbol(s.getBookingandBL().getHeader().getBLNo()))
				+ transSymbol(validate("HouseBooking Suffix", houseBooking.getSuffix())));
		result.setMasterBl(transSymbol(s.getBookingandBL().getHeader().getBLNo()));
		if (houseBooking.getItem().size() > 0) {
			result.setCtnCounts(new HashMap<String, Integer>());
			parseHouseBookingItem(houseBooking.getItem());
		} else {
			Map<String, Integer> masterCt = result.getCtnCounts();
			Map<String, Integer> houseCt = new HashMap<String, Integer>();
			Iterator<String> itera = masterCt.keySet().iterator();
			while (itera.hasNext()) {
				String equipment = itera.next();
				houseCt.put(equipment, 0);
			}
			result.setCtnCounts(houseCt);
		}
		parseHouseBookingBussinessPartner(houseBooking.getBusinessPartner());
	}
	
	
	/**
	 * Getting the shipmentDate
	 * 	If both of the vessel,the voyage and the shipmentdate are null then throws the exceptions
	 * @param header
	 * @return shipmentDate
	 * @throws DataException
	 */
	private String getShipmentDate(Header header) throws DataException {
		String date = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String vessel = result.getLoadVessel();
		String voyage = result.getLoadVoyage();
		if ("".equals(vessel) || "".equals(voyage)) {
			try {
				String shipmentDate = transSymbol(
						validate("Vessel, Voyage and ShipmentDate", header.getDepartAfterDate().toString()));
				date = new SimpleDateFormat("yyyyMMdd").format(sdf.parse(shipmentDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}

	/**
	 * Get the Delivery 
	 * 	Setting the value "DOOR" instead of "SD"  
	 * 
	 * @param header
	 * @return
	 * @throws DataException
	 */
	public static String getDelivery(Header header) throws DataException {
		String receipt = transSymbol(validate("Receipt", header.getCargoReceiptMode()));
		String delivery = transSymbol(validate("delivery", header.getCargoDeliveryMode()));
		receipt = "SD".equals(receipt) ? "DOOR" : receipt;
		delivery = "SD".equals(delivery) ? "DOOR" : delivery;
		return receipt.concat("-").concat(delivery);
	}

	/**
	 * getFileCreateTime
	 * 
	 * @param app
	 * @return
	 * @throws DataException
	 */
	public String getFileCreateTime(AppMessageHeader app) throws DataException {
		String date = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
		String fileCreateTime = validate("fileCreateTime", app.getTimestampCreated());
		try {
			Date parse = sdf.parse(fileCreateTime);
			date = new SimpleDateFormat("yyyyMMddHHmm").format(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * Parsing HouseBooking.Item
	 * 
	 * @param items
	 * @throws DataException
	 * @throws NumberFormatException
	 */
	private void parseHouseBookingItem(List<HouseBooking.Item> items) throws NumberFormatException, DataException {
		for (HouseBooking.Item item : items) {
			Map<String, Integer> map = result.getCtnCounts();
			String equipment = transSymbol(validate("HouseBooking CtnType", item.getContainerType()));
			String iniCntrCode = mapEquipmentType(equipment);
			int ctnQty = Integer.valueOf(transSymbol(validate("HouseBooking CtnQty", item.getQty())));
			map.put(iniCntrCode, ctnQty);
			result.setCtnCounts(map);
		}
	}

	/**
	 * Parsing Note
	 * 
	 * @param notes
	 * @throws DataException
	 */
	private void parseNote(List<Note> notes) throws DataException {
		for (Note note : notes) {
			String textType = note.getTextType();
			if (textType != null && "AAI".equals(textType)) {
				String remarks = result.getRemarks();
				result.setRemarks(
						remarks.concat(note.getTextContent() == null ? "" : transSymbol(note.getTextContent())));
				break;
			}
		}
	}

	/**
	 * Parsing BusinessPartner
	 * 
	 * @param bpList
	 * @throws DataException
	 */
	private void parseBussinessPartner(List<BusinessPartner> bpList) throws DataException {
		for (BusinessPartner bp : bpList) {
			setOrgName(bp);
		}
	}
	
	/**
	 * Parsing the HouseBooking.BusinessPartner
	 * 
	 * @param bpList
	 * @throws DataException
	 */
	private void parseHouseBookingBussinessPartner(List<HouseBooking.BusinessPartner> bpList) throws DataException {
		for (HouseBooking.BusinessPartner bp : bpList) {
			setHouseBookingOrgName(bp);
		}
	}
	
	/**
	 * Getting the PkgCode and PkgDesc
	 *  Looping the measurement, if the type is "PIECES" then get the next second index value
	 *  Mapping the pkgDesc in WBP by the value
	 *    
	 * @param item
	 * @throws DataException
	 */
	private void setPkgCodeAndDesc(Item item) throws DataException {
		List<JAXBElement<String>> measurement = item.getMeasurement().get(0)
				.getMeasurementTypeAndMeasurementValueAndMeasurementUOM();
		for (int i = 0; i < measurement.size(); i++) {
			String type = measurement.get(i).getValue();
			if ("PIECES".equals(type) && Double.valueOf(measurement.get(i + 1).getValue()) != 0d) {
				result.setPkgCode(measurement.get(i + 2).getValue());
				result.setPkgDesc(getPkgDescMap(measurement.get(i + 2).getValue()));
				break;
			}
		}
	}

	/**
	 * Getting the measurement of Item
	 * 
	 * @param item
	 * @return
	 */
	private List<String> getMeasurementValue(Item item) {
		List<String> measureList = new ArrayList<String>();
		for (JAXBElement<String> a : item.getMeasurement().get(0)
				.getMeasurementTypeAndMeasurementValueAndMeasurementUOM()) {
			if (a.getValue().trim().matches("\\d{1,}[.]\\d{1,}")) {
				measureList.add(transSymbol(a.getValue()));
			}
		}
		return measureList;
	}

	/**
	 * Setting the container measurement
	 * 
	 * @param measureList
	 * @param equipment
	 * @throws DataException
	 */
	public void setCtnMeasurement(List<String> measureList, String equipment) throws DataException {
		int cnPieces = 0;
		Map<String, Integer> cnCounts = result.getCtnCounts();
		String iniCntrCode = mapEquipmentType(equipment);
		cnPieces = cnCounts.get(iniCntrCode);
		cnPieces += Integer.valueOf(measureList.get(3).substring(0, measureList.get(3).indexOf(".")));
		cnCounts.put(iniCntrCode, cnPieces);
	}

	/**
	 * Setting the package measurement
	 * 
	 * @param measureList
	 */
	private void setPkgMeasurement(List<String> measureList) {
		double grossWeight = result.getGrossWeight();
		grossWeight += Double.valueOf(measureList.get(0));
		int pieces = result.getPieces();
		pieces += Integer.valueOf(measureList.get(3).substring(0, measureList.get(3).indexOf(".")));
		double grossVolume = result.getGrossVolume();
		grossVolume += Double.valueOf(measureList.get(1));
		result.setGrossWeight(grossWeight);
		result.setGrossVolume(grossVolume);
		result.setPieces(pieces);
	}

	/**
	 * Getting the BookingParty, Shipper, Consignee, Notify and AlsoNotify
	 * 
	 * @param bp
	 * @throws DataException
	 */
	private void setOrgName(BusinessPartner bp) throws DataException {
		String role = bp.getBPRole();
		if (role == null || "".equals(role))
			return;
		String bpNo = bp.getBusinessPartnerNo() == null ? "" : bp.getBusinessPartnerNo();
		String orgName = bp.getBPOrgName1();
		Boolean alsoReg = "ZANOTIF".equals(role) || "ZANOTIF2".equals(role) || "ZANOTIF3".equals(role)
				|| "ZANOTIF4".equals(role) || "ZANOTIF5".equals(role);
		if (role != null && "6".equals(role)) {
			result.setShipperCode(bpNo);
			String shipper = result.getShipper();
			orgName = transSymbol(validate("Shipper OrgName", orgName).toString());
			result.setShipper("".equals(shipper) ? (shipper + orgName) : (shipper.concat("&") + orgName));
		} else if (role != null && "5".equals(role)) {
			result.setConsigneeCode(bpNo);
			String consignee = result.getConsignee();
			orgName = transSymbol(validate("Consignee OrgName", orgName).toString());
			result.setConsignee("".equals(consignee) ? (consignee + orgName) : (consignee.concat("&") + orgName));
		} else if (role != null && "203".equals(role)) {
			String notify = result.getNotify();
			result.setNotifyCode(bpNo);
			orgName = transSymbol(validate("Notify OrgName", orgName).toString());
			result.setNotify("".equals(notify) ? (notify + orgName) : (notify.concat("&") + orgName));
		} else if (role != null && alsoReg) {
			String alsoNotify = result.getAlsoNotify();
			result.setAlsoNotifyCode(bpNo);
			orgName = transSymbol(validate("Also Notify OrgName", orgName).toString());
			result.setNotify("".equals(alsoNotify) ? (alsoNotify + orgName) : (alsoNotify.concat("&") + orgName));
		} else if (role != null && "1".equals(role)) {
			String capCode = transSymbol(validate("Capcode",
					bp.getAddress().get(0).getCAPCode()));
			//String capCode = "00405653";
			String senderCode = mapSenderCode(capCode);
			orgName = transSymbol(validate("Booking Party OrgName", orgName).toString());
			result.setBookingParty(orgName);
			result.setSenderCode(senderCode);
		}
	}

	/**
	 * Getting the HouseBooking's BookingParty, Shipper, Consignee, Notify and AlsoNotify
	 * 
	 * @param bp
	 * @throws DataException
	 */
	private void setHouseBookingOrgName(HouseBooking.BusinessPartner bp) throws DataException {
		String role = bp.getBPRole();
		if (role == null || "".equals(role))
			return;
		String bpNo = bp.getBusinessPartnerNoHouse() == null ? "" : bp.getBusinessPartnerNoHouse();
		String orgName = bp.getBPOrgName1();
		orgName = orgName == null ? "" : orgName.toString();
		Boolean alsoReg = "ZANOTIF".equals(role) || "ZANOTIF2".equals(role) || "ZANOTIF3".equals(role)
				|| "ZANOTIF4".equals(role) || "ZANOTIF5".equals(role);
		if (role != null && "6".equals(role)) {
			result.setShipperCode(bpNo);
			String shipper = result.getShipper();
			orgName = transSymbol(validate("HouseBooking Shipper", orgName).toString());
			result.setShipper(orgName);
		} else if (role != null && "5".equals(role)) {
			result.setConsigneeCode(bpNo);
			String consignee = result.getConsignee();
			orgName = transSymbol(validate("HouseBooking Consignee", orgName).toString());
			result.setConsignee(orgName);
		} else if (role != null && "203".equals(role)) {
			String notify = result.getNotify();
			result.setNotifyCode(bpNo);
			orgName = transSymbol(validate("HouseBooking Notify", orgName).toString());
			result.setNotify(orgName);
		} else if (role != null && alsoReg) {
			String alsoNotify = result.getAlsoNotify();
			result.setAlsoNotifyCode(bpNo);
			orgName = transSymbol(validate("HouseBooking AlsoNotify", orgName).toString());
			result.setNotify(orgName);
		} else if (role != null && "1".equals(role)) {
			orgName = transSymbol(validate("HouseBooking Booking Party", orgName).toString());
			result.setBookingParty(orgName);
		}
	}

	/**
	 * Getting the cargoId
	 * 
	 * @param item
	 */
	private void setCargoId(Item item) {
		String equipmentType = transSymbol(item.getEquipmentType());
		String hazardousFlag = transSymbol(
				item.getDangerousGood().getHazardousFlag() == null ? "" : item.getDangerousGood().getHazardousFlag());
		if ("R".equals(equipmentType.substring(0, 1))) {
			result.setCargoId("R");
		} else if (hazardousFlag != null && !"".equals(hazardousFlag)) {
			result.setCargoId("D");
		} else {
			result.setCargoId("S");
		}
	}

	/**
	 * Getting the temperature of Reffer container
	 * 
	 * @param item
	 * @throws DataException
	 */
	private void getTemperature(Item item) throws DataException {
		result.setVentilationFlux(
				getAirExchangeRate(transSymbol(validate("VentilationFlux", item.getReefer().getAirExchangeRate()))));
		result.setTemperatureId(
				transSymbol(validate("TemperatureId", item.getReefer().getMeasurement().getMeasurementUOM())));
		result.setTemperatureSetting(getTemperatureSetting(
				transSymbol(validate("TemperatureSetting", item.getReefer().getMeasurement().getMeasurementValue()))));
	}
	
	/**
	 * Getting Marks and Cargo Description
	 * 
	 * @param notes
	 * @throws DataException
	 */
	private void parseItemNote(List<Item.Note> notes) throws DataException {
		for (Item.Note note : notes) {
			String textType = note.getTextType();
			if (textType == null || "".equals(textType))
				break;
			String textContent = note.getTextContent() == null ? "" : transSymbol(note.getTextContent().toString());
			if ("MARKS".equals(textType)) {
				result.setMarks(textContent);
			} else if ("GOODS".equals(textType)) {
				result.setDescription(textContent);
			}
		}
	}
	
	/**
	 * Mapping the send code in WBP
	 * 
	 * @param capCode
	 * @return
	 * @throws DataException
	 */
	private String mapSenderCode(String capCode) throws DataException {
		String senderCode = "";
		String sql = "select BOOKING_PARTY_CODE from WEBEDI.T_BOOKING_PARTY where CAPCODE = ?";

		String[] parm = new String[1];
		parm[0] = String.format("%08d", Integer.parseInt(capCode));
		
		List<String> list = BaseBean.Query(sql, parm);
		if (list.size() > 0) {
			senderCode = list.get(0);
		} else {
			throw new DataException("no mapping of Sender Code");
		}
		return senderCode;
	}

	/**
	 * Getting the AirExchangeRate
	 * 
	 * @param airExchangeRate
	 * @return
	 */
	private String getAirExchangeRate(String airExchangeRate) {
		if ("-".equals(airExchangeRate.substring(airExchangeRate.length() - 1))) {
			airExchangeRate = "-".concat(airExchangeRate.substring(0, airExchangeRate.length() - 1));
		}
		return airExchangeRate;
	}
	
	/**
	 * Getting temperatureSetting
	 * 
	 * @param temperatureSetting
	 * @return
	 */
	private String getTemperatureSetting(String temperatureSetting) {
		if ("-".equals(temperatureSetting.substring(temperatureSetting.length() - 1))) {
			temperatureSetting = "-".concat(temperatureSetting.substring(0, temperatureSetting.length() - 1));
		}
		return temperatureSetting;
	}

	/**
	 * Mapping the container type in WBP
	 * 
	 * @param equipmentType
	 * @return
	 * @throws DataException
	 */
	private String mapEquipmentType(String equipmentType) throws DataException {
		String iniCntrCode = "";
		String sql = "select INI_CNTR_CODE from WEBEDI.T_REF_CONTAINER_TYPE where ISDEL = '0' and SALES_CODE = ?";
		String[] parm = new String[1];
		parm[0] = equipmentType;
		List<String> list = BaseBean.Query(sql, parm);
		if (list.size() > 0) {
			iniCntrCode = list.get(0);
		} else {
			throw new DataException("no mapping of EquipmentType");
		}
		return iniCntrCode;
	}
	
	/**
	 * Mapping the PkgDesc in WBP
	 * 
	 * @param pkgCode
	 * @return
	 * @throws DataException
	 */
	private String getPkgDescMap(String pkgCode) throws DataException {
		String packageDesc = "";
		String sql = "select package_description from WEBEDI.T_REF_PACKAGE_CODE where id = ("
				+ "select max(id) from WEBEDI.T_REF_PACKAGE_CODE where iso_package_code like ?)";
		String[] parm = new String[1];
		//pkgCode = "BR";
		parm[0] = pkgCode + "%";
		List<String> list = BaseBean.Query(sql, parm);
		if (list.size() > 0) {
			packageDesc = list.get(0);
		} else {
			throw new DataException("no mapping of PackageDesc");
		}
		return packageDesc;
	}
	
	/**
	 * Mapping the Port name in WBP
	 * 
	 * @param port
	 * @param name
	 * @return
	 * @throws DataException
	 */
	private String getVesselMapping(String vessel, String name) throws DataException {
		String result = "";
		String sql = "select NAME_EN from WEBEDI.T_VESSEL where CODE = ?";
		String[] parm = new String[1];
		if (vessel == null || "".equals(vessel)) {
			return "";
		} else {
			try {
				parm[0] = vessel.substring(0, 3);
				List<String> list = BaseBean.Query(sql, parm);
				result = list.get(0);
			} catch (StringIndexOutOfBoundsException e) {
				throw new DataException(name + " code is error");
			} catch (IndexOutOfBoundsException e) {
				throw new DataException("none mapping of " + name);
			}
			return result;
		}
	}

	
	/**
	 * Mapping the Port name in WBP
	 * 
	 * @param port
	 * @param name
	 * @return
	 * @throws DataException
	 */
	private String getPortMapping(String port, String name) throws DataException {
		String result = "";
		String sql = "select PORT_NAME from WEBEDI.T_COUNTRY_PORT where UNLOC_CD = ?";
		String[] parm = new String[1];
		if (port == null || "".equals(port)) {
			return "";
		} else {
			try {
				parm[0] = port.substring(0, 5);
				List<String> list = BaseBean.Query(sql, parm);
				result = list.get(0);
			} catch (StringIndexOutOfBoundsException e) {
				throw new DataException(name + " code is error");
			} catch (IndexOutOfBoundsException e) {
				throw new DataException("none mapping of " + name);
			}
			return result;
		}
	}

	/**
	 * Public validating function
	 * 	If the value is null then throwing the exception
	 * 
	 * @param name
	 * @param value
	 * @return
	 * @throws DataException
	 */
	private static String validate(String name, String value) throws DataException {
		if (value == null || "".equals(value)) {
			throw new DataException(name + " is null !");
		} else {
			return value;
		}
	}
	
	/**
	 * Setting the blno filled with eight digits
	 * 
	 * @param blno
	 * @return
	 */
	public static String getBlno(String blno) {
		blno = ConvertUtil.blFormate.format(Integer.valueOf(blno));
		return blno;
	}

	/**
	 * Public function
	 * 	Removing the space and replace the special symbol when getting the node value 
	 * 
	 * @param content
	 * @return
	 */
	private static String transSymbol(String content) {
		content = content.toString();
		content = content.replaceAll("\r", " ");
		content = content.replaceAll("\n", " ");
		content = content.replaceAll("\t", " ");
		content = content.replaceAll("  ", " ");
		content = content.replaceAll(":", "?:");
		content = content.replaceAll("'", "?'");
		content = content.trim();
		return content;
	}
}
