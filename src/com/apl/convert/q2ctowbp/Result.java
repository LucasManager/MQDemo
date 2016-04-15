package com.apl.convert.q2ctowbp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
	private String senderCode;
	private String fileCreateTime;
	private String shipperReferenceNo;
	private String BlNo;
	private String delivery;
	private String bookingParty;
	private String quotationNo;
	private String shipmentDate;
	private String cargoId;
	private String masterBl;
	private double grossWeight;
	private int pieces;
	private double grossVolume;
	private Map<String, Integer> ctnCounts;
	private String shipperCode;
	private String shipper;
	private String consigneeCode;
	private String consignee;
	private String notifyCode;
	private String notify;
	private String alsoNotifyCode;
	private String alsoNotify;
	private String ventilationFlux;
	private String temperatureId;
	private String temperatureSetting;
	private String marks;
	private String description;
	private String remarks;
	private String pkgCode;
	private String pkgDesc;
	private int lastCtnId;
	private int lastPkgId;
	private int lastItemId;
	private String currentCtn;
	private int currentCtnQty;
	private String ctnStatus;
	private String loadVessel;
	private String loadVoyage;
	private String placeOfReceiptCode;
	private String placeOfReceipt;
	private String loadPortCode;
	private String loadPort;
	private String dischargePortCode;
	private String dischargePort;
	private String placeOfDeliveryCode;
	private String placeOfDelivery;
	private String paymentTermOCF;

	public Result() {
		lastCtnId = 0;
		lastPkgId = 0;
		lastItemId = 0;
		marks = "";
		remarks = "";
		shipper = "";
		consignee = "";
		notify = "";
		alsoNotify = "";
		ctnCounts = new HashMap<String, Integer>();
	}

	public Result(Result r) {
		senderCode = r.senderCode;
		fileCreateTime = r.fileCreateTime;
		shipperReferenceNo = r.shipperReferenceNo;
		BlNo = r.BlNo;
		delivery = r.delivery;
		bookingParty = r.bookingParty;
		quotationNo = r.quotationNo;
		shipmentDate = r.shipmentDate;
		cargoId = r.cargoId;
		masterBl = r.masterBl;
		grossWeight = r.grossWeight;
		pieces = r.pieces;
		grossVolume = r.grossVolume;
		ventilationFlux = r.ventilationFlux;
		temperatureId = r.temperatureId;
		temperatureSetting = r.temperatureSetting;
		marks = r.marks;
		description = r.description;
		remarks = r.remarks;
		pkgCode = r.pkgCode;
		pkgDesc = r.pkgDesc;
		lastCtnId = r.lastCtnId;
		lastPkgId = r.lastPkgId;
		lastItemId = r.lastItemId;
		currentCtn = r.currentCtn;
		currentCtnQty = r.currentCtnQty;
		ctnStatus = r.ctnStatus;
		loadVessel = r.loadVessel;
		loadVoyage = r.loadVoyage;
		placeOfReceiptCode = r.placeOfReceiptCode;
		placeOfReceipt = r.placeOfReceipt;
		loadPortCode = r.loadPortCode;
		loadPort = r.loadPort;
		dischargePortCode = r.dischargePortCode;
		dischargePort = r.dischargePort;
		placeOfDeliveryCode = r.placeOfDeliveryCode;
		placeOfDelivery = r.placeOfDelivery;
		paymentTermOCF = r.paymentTermOCF;
		ctnCounts = r.ctnCounts;
		shipper = r.shipper;
		consignee = r.consignee;
		notify = r.notify;
		alsoNotify = r.alsoNotify;
	}

	@Override
	protected Result clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Result(this);
	}

	public String getSenderCode() {
		return senderCode;
	}

	public void setSenderCode(String senderCode) {
		this.senderCode = senderCode;
	}

	public String getFileCreateTime() {
		return fileCreateTime;
	}

	public void setFileCreateTime(String fileCreateTime) {
		this.fileCreateTime = fileCreateTime;
	}

	public String getShipperReferenceNo() {
		return shipperReferenceNo;
	}

	public void setShipperReferenceNo(String shipperReferenceNo) {
		this.shipperReferenceNo = shipperReferenceNo;
	}

	public String getBlNo() {
		return BlNo;
	}

	public void setBlNo(String blNo) {
		BlNo = blNo;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getBookingParty() {
		return bookingParty;
	}

	public void setBookingParty(String bookingParty) {
		this.bookingParty = bookingParty;
	}

	public String getQuotationNo() {
		return quotationNo;
	}

	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}

	public String getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getCargoId() {
		return cargoId;
	}

	public void setCargoId(String cargoId) {
		this.cargoId = cargoId;
	}

	public String getMasterBl() {
		return masterBl;
	}

	public void setMasterBl(String masterBl) {
		this.masterBl = masterBl;
	}

	public double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(double grossWeight) {
		this.grossWeight = grossWeight;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public double getGrossVolume() {
		return grossVolume;
	}

	public void setGrossVolume(double grossVolume) {
		this.grossVolume = grossVolume;
	}

	public Map<String, Integer> getCtnCounts() {
		return ctnCounts;
	}

	public void setCtnCounts(Map<String, Integer> ctnCounts) {
		this.ctnCounts = ctnCounts;
	}

	public String getShipperCode() {
		return shipperCode;
	}

	public void setShipperCode(String shipperCode) {
		this.shipperCode = shipperCode;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getConsigneeCode() {
		return consigneeCode;
	}

	public void setConsigneeCode(String consigneeCode) {
		this.consigneeCode = consigneeCode;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getNotifyCode() {
		return notifyCode;
	}

	public void setNotifyCode(String notifyCode) {
		this.notifyCode = notifyCode;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public String getAlsoNotifyCode() {
		return alsoNotifyCode;
	}

	public void setAlsoNotifyCode(String alsoNotifyCode) {
		this.alsoNotifyCode = alsoNotifyCode;
	}

	public String getAlsoNotify() {
		return alsoNotify;
	}

	public void setAlsoNotify(String alsoNotify) {
		this.alsoNotify = alsoNotify;
	}

	public String getVentilationFlux() {
		return ventilationFlux;
	}

	public void setVentilationFlux(String ventilationFlux) {
		this.ventilationFlux = ventilationFlux;
	}

	public String getTemperatureId() {
		return temperatureId;
	}

	public void setTemperatureId(String temperatureId) {
		this.temperatureId = temperatureId;
	}

	public String getTemperatureSetting() {
		return temperatureSetting;
	}

	public void setTemperatureSetting(String temperatureSetting) {
		this.temperatureSetting = temperatureSetting;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPkgCode() {
		return pkgCode;
	}

	public void setPkgCode(String pkgCode) {
		this.pkgCode = pkgCode;
	}

	public String getPkgDesc() {
		return pkgDesc;
	}

	public void setPkgDesc(String pkgDesc) {
		this.pkgDesc = pkgDesc;
	}

	public int getLastCtnId() {
		return lastCtnId;
	}

	public void setLastCtnId(int lastCtnId) {
		this.lastCtnId = lastCtnId;
	}

	public int getLastPkgId() {
		return lastPkgId;
	}

	public void setLastPkgId(int lastPkgId) {
		this.lastPkgId = lastPkgId;
	}

	public int getLastItemId() {
		return lastItemId;
	}

	public void setLastItemId(int lastItemId) {
		this.lastItemId = lastItemId;
	}

	public String getCurrentCtn() {
		return currentCtn;
	}

	public void setCurrentCtn(String currentCtn) {
		this.currentCtn = currentCtn;
	}

	public int getCurrentCtnQty() {
		return currentCtnQty;
	}

	public void setCurrentCtnQty(int currentCtnQty) {
		this.currentCtnQty = currentCtnQty;
	}

	public String getCtnStatus() {
		return ctnStatus;
	}

	public void setCtnStatus(String ctnStatus) {
		this.ctnStatus = ctnStatus;
	}

	public String getLoadVessel() {
		return loadVessel;
	}

	public void setLoadVessel(String loadVessel) {
		this.loadVessel = loadVessel;
	}

	public String getLoadVoyage() {
		return loadVoyage;
	}

	public void setLoadVoyage(String loadVoyage) {
		this.loadVoyage = loadVoyage;
	}

	public String getPlaceOfReceiptCode() {
		return placeOfReceiptCode;
	}

	public void setPlaceOfReceiptCode(String placeOfReceiptCode) {
		this.placeOfReceiptCode = placeOfReceiptCode;
	}

	public String getPlaceOfReceipt() {
		return placeOfReceipt;
	}

	public void setPlaceOfReceipt(String placeOfReceipt) {
		this.placeOfReceipt = placeOfReceipt;
	}

	public String getLoadPortCode() {
		return loadPortCode;
	}

	public void setLoadPortCode(String loadPortCode) {
		this.loadPortCode = loadPortCode;
	}

	public String getLoadPort() {
		return loadPort;
	}

	public void setLoadPort(String loadPort) {
		this.loadPort = loadPort;
	}

	public String getDischargePortCode() {
		return dischargePortCode;
	}

	public void setDischargePortCode(String dischargePortCode) {
		this.dischargePortCode = dischargePortCode;
	}

	public String getDischargePort() {
		return dischargePort;
	}

	public void setDischargePort(String dischargePort) {
		this.dischargePort = dischargePort;
	}

	public String getPlaceOfDeliveryCode() {
		return placeOfDeliveryCode;
	}

	public void setPlaceOfDeliveryCode(String placeOfDeliveryCode) {
		this.placeOfDeliveryCode = placeOfDeliveryCode;
	}

	public String getPlaceOfDelivery() {
		return placeOfDelivery;
	}

	public void setPlaceOfDelivery(String placeOfDelivery) {
		this.placeOfDelivery = placeOfDelivery;
	}

	public String getPaymentTermOCF() {
		return paymentTermOCF;
	}

	public void setPaymentTermOCF(String paymentTermOCF) {
		this.paymentTermOCF = paymentTermOCF;
	}

}
