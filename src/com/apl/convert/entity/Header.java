//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.11.11 时间 11:54:26 AM CST 
//


package com.apl.convert.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActionSource">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActionReason">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BookingType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BookingTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="PONo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShipperReferenceNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SDDFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SDOFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CargoReceiptMode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CargoDeliveryMode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FreeInOut">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentTermOCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BookingOffice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLReleaseOffice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContractType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QuotationNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChannelOfBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Destination" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LoadPort" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DischargePort" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LoadVessel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LoadVoyage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepartAfterDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DepartAfterTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ArriveByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ArriveByTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="IMDGAmmendmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCFN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VOYDOC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShipperDODACC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConsigneeDODACC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GovernmentMHHGType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MHHG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InvitationNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FASNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NDNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLSubtype" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExportReferenceInformation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLReleaseToParty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OriginOfGoods" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SeaAirFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValidationCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValidationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CollectInvoiceReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrepaidInvoiceReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FMCFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLCreationMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLDatedAt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LCNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CompanyCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrintCheckDigit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "action",
    "actionSource",
    "actionReason",
    "blNo",
    "bookingType",
    "bookingDate",
    "bookingTime",
    "poNo",
    "shipperReferenceNo",
    "sddFlag",
    "sdoFlag",
    "cargoReceiptMode",
    "cargoDeliveryMode",
    "freeInOut",
    "paymentTermOCF",
    "bookingOffice",
    "blReleaseOffice",
    "contractType",
    "quotationNo",
    "channelOfBooking",
    "origin",
    "destination",
    "loadPort",
    "dischargePort",
    "loadVessel",
    "loadVoyage",
    "departAfterDate",
    "departAfterTime",
    "arriveByDate",
    "arriveByTime",
    "imdgAmmendmentNo",
    "pcfn",
    "voydoc",
    "shipperDODACC",
    "consigneeDODACC",
    "governmentMHHGType",
    "mhhg",
    "invitationNo",
    "fasNo",
    "ndNo",
    "blType",
    "blSubtype",
    "exportReferenceInformation",
    "blReleaseToParty",
    "blIssueDate",
    "originOfGoods",
    "seaAirFlag",
    "validationCode",
    "validationDate",
    "collectInvoiceReference",
    "prepaidInvoiceReference",
    "chb",
    "fmcFlag",
    "blCreationMode",
    "blDatedAt",
    "lcNumber",
    "companyCode",
    "printCheckDigit"
})
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(name = "Action", required = true)
    protected String action;
    @XmlElement(name = "ActionSource", required = true)
    protected String actionSource;
    @XmlElement(name = "ActionReason", required = true)
    protected String actionReason;
    @XmlElement(name = "BLNo", required = true)
    protected String blNo;
    @XmlElement(name = "BookingType", required = true)
    protected String bookingType;
    @XmlElement(name = "BookingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookingDate;
    @XmlElement(name = "BookingTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar bookingTime;
    @XmlElement(name = "PONo", required = true)
    protected String poNo;
    @XmlElement(name = "ShipperReferenceNo", required = true)
    protected String shipperReferenceNo;
    @XmlElement(name = "SDDFlag")
    protected boolean sddFlag;
    @XmlElement(name = "SDOFlag")
    protected boolean sdoFlag;
    @XmlElement(name = "CargoReceiptMode", required = true)
    protected String cargoReceiptMode;
    @XmlElement(name = "CargoDeliveryMode", required = true)
    protected String cargoDeliveryMode;
    @XmlElement(name = "FreeInOut", required = true)
    protected String freeInOut;
    @XmlElement(name = "PaymentTermOCF")
    protected String paymentTermOCF;
    @XmlElement(name = "BookingOffice")
    protected String bookingOffice;
    @XmlElement(name = "BLReleaseOffice")
    protected String blReleaseOffice;
    @XmlElement(name = "ContractType")
    protected String contractType;
    @XmlElement(name = "QuotationNo")
    protected String quotationNo;
    @XmlElement(name = "ChannelOfBooking")
    protected String channelOfBooking;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "LoadPort")
    protected String loadPort;
    @XmlElement(name = "DischargePort")
    protected String dischargePort;
    @XmlElement(name = "LoadVessel")
    protected String loadVessel;
    @XmlElement(name = "LoadVoyage")
    protected String loadVoyage;
    @XmlElement(name = "DepartAfterDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departAfterDate;
    @XmlElement(name = "DepartAfterTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departAfterTime;
    @XmlElement(name = "ArriveByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar arriveByDate;
    @XmlElement(name = "ArriveByTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arriveByTime;
    @XmlElement(name = "IMDGAmmendmentNo")
    protected String imdgAmmendmentNo;
    @XmlElement(name = "PCFN")
    protected String pcfn;
    @XmlElement(name = "VOYDOC")
    protected String voydoc;
    @XmlElement(name = "ShipperDODACC")
    protected String shipperDODACC;
    @XmlElement(name = "ConsigneeDODACC")
    protected String consigneeDODACC;
    @XmlElement(name = "GovernmentMHHGType")
    protected String governmentMHHGType;
    @XmlElement(name = "MHHG")
    protected String mhhg;
    @XmlElement(name = "InvitationNo")
    protected String invitationNo;
    @XmlElement(name = "FASNo")
    protected String fasNo;
    @XmlElement(name = "NDNo")
    protected String ndNo;
    @XmlElement(name = "BLType")
    protected String blType;
    @XmlElement(name = "BLSubtype")
    protected String blSubtype;
    @XmlElement(name = "ExportReferenceInformation")
    protected String exportReferenceInformation;
    @XmlElement(name = "BLReleaseToParty")
    protected String blReleaseToParty;
    @XmlElement(name = "BLIssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar blIssueDate;
    @XmlElement(name = "OriginOfGoods")
    protected String originOfGoods;
    @XmlElement(name = "SeaAirFlag")
    protected String seaAirFlag;
    @XmlElement(name = "ValidationCode")
    protected String validationCode;
    @XmlElement(name = "ValidationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validationDate;
    @XmlElement(name = "CollectInvoiceReference")
    protected String collectInvoiceReference;
    @XmlElement(name = "PrepaidInvoiceReference")
    protected String prepaidInvoiceReference;
    @XmlElement(name = "CHB")
    protected String chb;
    @XmlElement(name = "FMCFlag")
    protected String fmcFlag;
    @XmlElement(name = "BLCreationMode")
    protected String blCreationMode;
    @XmlElement(name = "BLDatedAt")
    protected String blDatedAt;
    @XmlElement(name = "LCNumber")
    protected String lcNumber;
    @XmlElement(name = "CompanyCode")
    protected String companyCode;
    @XmlElement(name = "PrintCheckDigit")
    protected String printCheckDigit;

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * 获取actionSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionSource() {
        return actionSource;
    }

    /**
     * 设置actionSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionSource(String value) {
        this.actionSource = value;
    }

    /**
     * 获取actionReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionReason() {
        return actionReason;
    }

    /**
     * 设置actionReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionReason(String value) {
        this.actionReason = value;
    }

    /**
     * 获取blNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLNo() {
        return blNo;
    }

    /**
     * 设置blNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLNo(String value) {
        this.blNo = value;
    }

    /**
     * 获取bookingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingType() {
        return bookingType;
    }

    /**
     * 设置bookingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingType(String value) {
        this.bookingType = value;
    }

    /**
     * 获取bookingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDate() {
        return bookingDate;
    }

    /**
     * 设置bookingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDate(XMLGregorianCalendar value) {
        this.bookingDate = value;
    }

    /**
     * 获取bookingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingTime() {
        return bookingTime;
    }

    /**
     * 设置bookingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingTime(XMLGregorianCalendar value) {
        this.bookingTime = value;
    }

    /**
     * 获取poNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONo() {
        return poNo;
    }

    /**
     * 设置poNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONo(String value) {
        this.poNo = value;
    }

    /**
     * 获取shipperReferenceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperReferenceNo() {
        return shipperReferenceNo;
    }

    /**
     * 设置shipperReferenceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperReferenceNo(String value) {
        this.shipperReferenceNo = value;
    }

    /**
     * 获取sddFlag属性的值。
     * 
     */
    public boolean isSDDFlag() {
        return sddFlag;
    }

    /**
     * 设置sddFlag属性的值。
     * 
     */
    public void setSDDFlag(boolean value) {
        this.sddFlag = value;
    }

    /**
     * 获取sdoFlag属性的值。
     * 
     */
    public boolean isSDOFlag() {
        return sdoFlag;
    }

    /**
     * 设置sdoFlag属性的值。
     * 
     */
    public void setSDOFlag(boolean value) {
        this.sdoFlag = value;
    }

    /**
     * 获取cargoReceiptMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoReceiptMode() {
        return cargoReceiptMode;
    }

    /**
     * 设置cargoReceiptMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoReceiptMode(String value) {
        this.cargoReceiptMode = value;
    }

    /**
     * 获取cargoDeliveryMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoDeliveryMode() {
        return cargoDeliveryMode;
    }

    /**
     * 设置cargoDeliveryMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoDeliveryMode(String value) {
        this.cargoDeliveryMode = value;
    }

    /**
     * 获取freeInOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeInOut() {
        return freeInOut;
    }

    /**
     * 设置freeInOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeInOut(String value) {
        this.freeInOut = value;
    }

    /**
     * 获取paymentTermOCF属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermOCF() {
        return paymentTermOCF;
    }

    /**
     * 设置paymentTermOCF属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermOCF(String value) {
        this.paymentTermOCF = value;
    }

    /**
     * 获取bookingOffice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingOffice() {
        return bookingOffice;
    }

    /**
     * 设置bookingOffice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingOffice(String value) {
        this.bookingOffice = value;
    }

    /**
     * 获取blReleaseOffice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLReleaseOffice() {
        return blReleaseOffice;
    }

    /**
     * 设置blReleaseOffice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLReleaseOffice(String value) {
        this.blReleaseOffice = value;
    }

    /**
     * 获取contractType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * 设置contractType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * 获取quotationNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationNo() {
        return quotationNo;
    }

    /**
     * 设置quotationNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationNo(String value) {
        this.quotationNo = value;
    }

    /**
     * 获取channelOfBooking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelOfBooking() {
        return channelOfBooking;
    }

    /**
     * 设置channelOfBooking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelOfBooking(String value) {
        this.channelOfBooking = value;
    }

    /**
     * 获取origin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 设置origin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * 获取loadPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadPort() {
        return loadPort;
    }

    /**
     * 设置loadPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadPort(String value) {
        this.loadPort = value;
    }

    /**
     * 获取dischargePort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargePort() {
        return dischargePort;
    }

    /**
     * 设置dischargePort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargePort(String value) {
        this.dischargePort = value;
    }

    /**
     * 获取loadVessel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadVessel() {
        return loadVessel;
    }

    /**
     * 设置loadVessel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadVessel(String value) {
        this.loadVessel = value;
    }

    /**
     * 获取loadVoyage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadVoyage() {
        return loadVoyage;
    }

    /**
     * 设置loadVoyage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadVoyage(String value) {
        this.loadVoyage = value;
    }

    /**
     * 获取departAfterDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartAfterDate() {
        return departAfterDate;
    }

    /**
     * 设置departAfterDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartAfterDate(XMLGregorianCalendar value) {
        this.departAfterDate = value;
    }

    /**
     * 获取departAfterTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartAfterTime() {
        return departAfterTime;
    }

    /**
     * 设置departAfterTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartAfterTime(XMLGregorianCalendar value) {
        this.departAfterTime = value;
    }

    /**
     * 获取arriveByDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArriveByDate() {
        return arriveByDate;
    }

    /**
     * 设置arriveByDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArriveByDate(XMLGregorianCalendar value) {
        this.arriveByDate = value;
    }

    /**
     * 获取arriveByTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArriveByTime() {
        return arriveByTime;
    }

    /**
     * 设置arriveByTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArriveByTime(XMLGregorianCalendar value) {
        this.arriveByTime = value;
    }

    /**
     * 获取imdgAmmendmentNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMDGAmmendmentNo() {
        return imdgAmmendmentNo;
    }

    /**
     * 设置imdgAmmendmentNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMDGAmmendmentNo(String value) {
        this.imdgAmmendmentNo = value;
    }

    /**
     * 获取pcfn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCFN() {
        return pcfn;
    }

    /**
     * 设置pcfn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCFN(String value) {
        this.pcfn = value;
    }

    /**
     * 获取voydoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOYDOC() {
        return voydoc;
    }

    /**
     * 设置voydoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOYDOC(String value) {
        this.voydoc = value;
    }

    /**
     * 获取shipperDODACC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperDODACC() {
        return shipperDODACC;
    }

    /**
     * 设置shipperDODACC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperDODACC(String value) {
        this.shipperDODACC = value;
    }

    /**
     * 获取consigneeDODACC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeDODACC() {
        return consigneeDODACC;
    }

    /**
     * 设置consigneeDODACC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeDODACC(String value) {
        this.consigneeDODACC = value;
    }

    /**
     * 获取governmentMHHGType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentMHHGType() {
        return governmentMHHGType;
    }

    /**
     * 设置governmentMHHGType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentMHHGType(String value) {
        this.governmentMHHGType = value;
    }

    /**
     * 获取mhhg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMHHG() {
        return mhhg;
    }

    /**
     * 设置mhhg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMHHG(String value) {
        this.mhhg = value;
    }

    /**
     * 获取invitationNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitationNo() {
        return invitationNo;
    }

    /**
     * 设置invitationNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitationNo(String value) {
        this.invitationNo = value;
    }

    /**
     * 获取fasNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASNo() {
        return fasNo;
    }

    /**
     * 设置fasNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASNo(String value) {
        this.fasNo = value;
    }

    /**
     * 获取ndNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDNo() {
        return ndNo;
    }

    /**
     * 设置ndNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDNo(String value) {
        this.ndNo = value;
    }

    /**
     * 获取blType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLType() {
        return blType;
    }

    /**
     * 设置blType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLType(String value) {
        this.blType = value;
    }

    /**
     * 获取blSubtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLSubtype() {
        return blSubtype;
    }

    /**
     * 设置blSubtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLSubtype(String value) {
        this.blSubtype = value;
    }

    /**
     * 获取exportReferenceInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportReferenceInformation() {
        return exportReferenceInformation;
    }

    /**
     * 设置exportReferenceInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportReferenceInformation(String value) {
        this.exportReferenceInformation = value;
    }

    /**
     * 获取blReleaseToParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLReleaseToParty() {
        return blReleaseToParty;
    }

    /**
     * 设置blReleaseToParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLReleaseToParty(String value) {
        this.blReleaseToParty = value;
    }

    /**
     * 获取blIssueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBLIssueDate() {
        return blIssueDate;
    }

    /**
     * 设置blIssueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBLIssueDate(XMLGregorianCalendar value) {
        this.blIssueDate = value;
    }

    /**
     * 获取originOfGoods属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginOfGoods() {
        return originOfGoods;
    }

    /**
     * 设置originOfGoods属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginOfGoods(String value) {
        this.originOfGoods = value;
    }

    /**
     * 获取seaAirFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaAirFlag() {
        return seaAirFlag;
    }

    /**
     * 设置seaAirFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeaAirFlag(String value) {
        this.seaAirFlag = value;
    }

    /**
     * 获取validationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCode() {
        return validationCode;
    }

    /**
     * 设置validationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCode(String value) {
        this.validationCode = value;
    }

    /**
     * 获取validationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidationDate() {
        return validationDate;
    }

    /**
     * 设置validationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidationDate(XMLGregorianCalendar value) {
        this.validationDate = value;
    }

    /**
     * 获取collectInvoiceReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectInvoiceReference() {
        return collectInvoiceReference;
    }

    /**
     * 设置collectInvoiceReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectInvoiceReference(String value) {
        this.collectInvoiceReference = value;
    }

    /**
     * 获取prepaidInvoiceReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidInvoiceReference() {
        return prepaidInvoiceReference;
    }

    /**
     * 设置prepaidInvoiceReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidInvoiceReference(String value) {
        this.prepaidInvoiceReference = value;
    }

    /**
     * 获取chb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHB() {
        return chb;
    }

    /**
     * 设置chb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHB(String value) {
        this.chb = value;
    }

    /**
     * 获取fmcFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFMCFlag() {
        return fmcFlag;
    }

    /**
     * 设置fmcFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFMCFlag(String value) {
        this.fmcFlag = value;
    }

    /**
     * 获取blCreationMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLCreationMode() {
        return blCreationMode;
    }

    /**
     * 设置blCreationMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLCreationMode(String value) {
        this.blCreationMode = value;
    }

    /**
     * 获取blDatedAt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLDatedAt() {
        return blDatedAt;
    }

    /**
     * 设置blDatedAt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLDatedAt(String value) {
        this.blDatedAt = value;
    }

    /**
     * 获取lcNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCNumber() {
        return lcNumber;
    }

    /**
     * 设置lcNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCNumber(String value) {
        this.lcNumber = value;
    }

    /**
     * 获取companyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置companyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * 获取printCheckDigit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintCheckDigit() {
        return printCheckDigit;
    }

    /**
     * 设置printCheckDigit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintCheckDigit(String value) {
        this.printCheckDigit = value;
    }

}
