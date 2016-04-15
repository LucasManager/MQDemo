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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="StageID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StageType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransportationMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceLocation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceUNLOCODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceCity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceLocationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceLocationFLO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DestinationLocation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DestinationUNLOCODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DestinationCity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DestinationLocationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DestinationLocationFLO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Vessel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Voyage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Service" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StageStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBoundPortNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ETA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ETD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
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
    "stageID",
    "stageType",
    "transportationMode",
    "sourceLocation",
    "sourceUNLOCODE",
    "sourceCity",
    "sourceLocationType",
    "sourceLocationFLO",
    "destinationLocation",
    "destinationUNLOCODE",
    "destinationCity",
    "destinationLocationType",
    "destinationLocationFLO",
    "vessel",
    "voyage",
    "service",
    "stageStatus",
    "statusInfo",
    "outBoundPortNumber",
    "eta",
    "etd"
})
@XmlRootElement(name = "Stage")
public class Stage {

    @XmlElement(name = "StageID")
    protected String stageID;
    @XmlElement(name = "StageType")
    protected String stageType;
    @XmlElement(name = "TransportationMode")
    protected String transportationMode;
    @XmlElement(name = "SourceLocation")
    protected String sourceLocation;
    @XmlElement(name = "SourceUNLOCODE")
    protected String sourceUNLOCODE;
    @XmlElement(name = "SourceCity")
    protected String sourceCity;
    @XmlElement(name = "SourceLocationType")
    protected String sourceLocationType;
    @XmlElement(name = "SourceLocationFLO")
    protected String sourceLocationFLO;
    @XmlElement(name = "DestinationLocation")
    protected String destinationLocation;
    @XmlElement(name = "DestinationUNLOCODE")
    protected String destinationUNLOCODE;
    @XmlElement(name = "DestinationCity")
    protected String destinationCity;
    @XmlElement(name = "DestinationLocationType")
    protected String destinationLocationType;
    @XmlElement(name = "DestinationLocationFLO")
    protected String destinationLocationFLO;
    @XmlElement(name = "Vessel")
    protected String vessel;
    @XmlElement(name = "Voyage")
    protected String voyage;
    @XmlElement(name = "Service")
    protected String service;
    @XmlElement(name = "StageStatus")
    protected String stageStatus;
    @XmlElement(name = "StatusInfo")
    protected String statusInfo;
    @XmlElement(name = "OutBoundPortNumber")
    protected String outBoundPortNumber;
    @XmlElement(name = "ETA")
    protected String eta;
    @XmlElement(name = "ETD")
    protected String etd;

    /**
     * 获取stageID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageID() {
        return stageID;
    }

    /**
     * 设置stageID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageID(String value) {
        this.stageID = value;
    }

    /**
     * 获取stageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageType() {
        return stageType;
    }

    /**
     * 设置stageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageType(String value) {
        this.stageType = value;
    }

    /**
     * 获取transportationMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationMode() {
        return transportationMode;
    }

    /**
     * 设置transportationMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationMode(String value) {
        this.transportationMode = value;
    }

    /**
     * 获取sourceLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLocation() {
        return sourceLocation;
    }

    /**
     * 设置sourceLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLocation(String value) {
        this.sourceLocation = value;
    }

    /**
     * 获取sourceUNLOCODE属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUNLOCODE() {
        return sourceUNLOCODE;
    }

    /**
     * 设置sourceUNLOCODE属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUNLOCODE(String value) {
        this.sourceUNLOCODE = value;
    }

    /**
     * 获取sourceCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCity() {
        return sourceCity;
    }

    /**
     * 设置sourceCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCity(String value) {
        this.sourceCity = value;
    }

    /**
     * 获取sourceLocationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLocationType() {
        return sourceLocationType;
    }

    /**
     * 设置sourceLocationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLocationType(String value) {
        this.sourceLocationType = value;
    }

    /**
     * 获取sourceLocationFLO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLocationFLO() {
        return sourceLocationFLO;
    }

    /**
     * 设置sourceLocationFLO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLocationFLO(String value) {
        this.sourceLocationFLO = value;
    }

    /**
     * 获取destinationLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * 设置destinationLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocation(String value) {
        this.destinationLocation = value;
    }

    /**
     * 获取destinationUNLOCODE属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUNLOCODE() {
        return destinationUNLOCODE;
    }

    /**
     * 设置destinationUNLOCODE属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUNLOCODE(String value) {
        this.destinationUNLOCODE = value;
    }

    /**
     * 获取destinationCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * 设置destinationCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

    /**
     * 获取destinationLocationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationType() {
        return destinationLocationType;
    }

    /**
     * 设置destinationLocationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationType(String value) {
        this.destinationLocationType = value;
    }

    /**
     * 获取destinationLocationFLO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationFLO() {
        return destinationLocationFLO;
    }

    /**
     * 设置destinationLocationFLO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationFLO(String value) {
        this.destinationLocationFLO = value;
    }

    /**
     * 获取vessel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVessel() {
        return vessel;
    }

    /**
     * 设置vessel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVessel(String value) {
        this.vessel = value;
    }

    /**
     * 获取voyage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoyage() {
        return voyage;
    }

    /**
     * 设置voyage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoyage(String value) {
        this.voyage = value;
    }

    /**
     * 获取service属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * 设置service属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * 获取stageStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageStatus() {
        return stageStatus;
    }

    /**
     * 设置stageStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageStatus(String value) {
        this.stageStatus = value;
    }

    /**
     * 获取statusInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusInfo() {
        return statusInfo;
    }

    /**
     * 设置statusInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusInfo(String value) {
        this.statusInfo = value;
    }

    /**
     * 获取outBoundPortNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBoundPortNumber() {
        return outBoundPortNumber;
    }

    /**
     * 设置outBoundPortNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBoundPortNumber(String value) {
        this.outBoundPortNumber = value;
    }

    /**
     * 获取eta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETA() {
        return eta;
    }

    /**
     * 设置eta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETA(String value) {
        this.eta = value;
    }

    /**
     * 获取etd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETD() {
        return etd;
    }

    /**
     * 设置etd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETD(String value) {
        this.etd = value;
    }

}
