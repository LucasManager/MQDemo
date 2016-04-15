//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.11.11 时间 11:54:26 AM CST 
//


package com.apl.convert.entity;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="AppMessageHeader" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                   &lt;element name="MsgType" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                   &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                   &lt;element name="ServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                   &lt;element name="SourceSysID" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                   &lt;element name="TimestampCreated" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingandBL" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Header"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}BusinessPartner" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Container" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Stage" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Item" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}GeneralCharacteristics" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}CountryCharacteristics" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Status" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}ChargeList" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Note" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}HouseBooking" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}HouseBL" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}StoreDoor" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}ServiceConstraints" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Cargo" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}HousingBL" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CheckResults" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MsgTy" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MsgTxt" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="220"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MsgCat" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RuleInputParam" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Value" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RuleReference" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RuleDescription" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SpecialInstruction" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalRequirement" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalOwner" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalParty" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalRole" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalMode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalLocation" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalTemplate" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApprovalPerson" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DocumentFlow" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PredecessorOrSuccessor" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DocumentNo" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TypeOfDocument" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DocumentStatus" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CutOffTimes" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CutoffCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CutoffDescription" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                             &lt;element name="Location" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MilitaryCargo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SCACCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="GBLNo" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CubicFeet" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OwnersName" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Weight" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="11"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Piece" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "appMessageHeader",
    "bookingandBL"
})
@XmlRootElement(name = "sendBookingBLRequestMsg")
public class SendBookingBLRequestMsg {

    @XmlElement(name = "AppMessageHeader", namespace = "", required = true)
    protected SendBookingBLRequestMsg.AppMessageHeader appMessageHeader;
    @XmlElement(name = "BookingandBL", namespace = "", required = true)
    protected SendBookingBLRequestMsg.BookingandBL bookingandBL;

    /**
     * 获取appMessageHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SendBookingBLRequestMsg.AppMessageHeader }
     *     
     */
    public SendBookingBLRequestMsg.AppMessageHeader getAppMessageHeader() {
        return appMessageHeader;
    }

    /**
     * 设置appMessageHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SendBookingBLRequestMsg.AppMessageHeader }
     *     
     */
    public void setAppMessageHeader(SendBookingBLRequestMsg.AppMessageHeader value) {
        this.appMessageHeader = value;
    }

    /**
     * 获取bookingandBL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SendBookingBLRequestMsg.BookingandBL }
     *     
     */
    public SendBookingBLRequestMsg.BookingandBL getBookingandBL() {
        return bookingandBL;
    }

    /**
     * 设置bookingandBL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SendBookingBLRequestMsg.BookingandBL }
     *     
     */
    public void setBookingandBL(SendBookingBLRequestMsg.BookingandBL value) {
        this.bookingandBL = value;
    }


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
     *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
     *         &lt;element name="MsgType" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
     *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
     *         &lt;element name="ServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
     *         &lt;element name="SourceSysID" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
     *         &lt;element name="TimestampCreated" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
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
        "uuid",
        "msgType",
        "serviceID",
        "serviceVersion",
        "sourceSysID",
        "timestampCreated"
    })
    public static class AppMessageHeader {

        @XmlElement(name = "UUID", namespace = "", required = true)
        protected String uuid;
        @XmlElement(name = "MsgType", namespace = "", required = true)
        protected String msgType;
        @XmlElement(name = "ServiceID", namespace = "", required = true)
        protected String serviceID;
        @XmlElement(name = "ServiceVersion", namespace = "", required = true)
        protected String serviceVersion;
        @XmlElement(name = "SourceSysID", namespace = "", required = true)
        protected String sourceSysID;
        @XmlElement(name = "TimestampCreated", namespace = "", required = true)
        protected String timestampCreated;

        /**
         * 获取uuid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUUID() {
            return uuid;
        }

        /**
         * 设置uuid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUUID(String value) {
            this.uuid = value;
        }

        /**
         * 获取msgType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgType() {
            return msgType;
        }

        /**
         * 设置msgType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgType(String value) {
            this.msgType = value;
        }

        /**
         * 获取serviceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceID() {
            return serviceID;
        }

        /**
         * 设置serviceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceID(String value) {
            this.serviceID = value;
        }

        /**
         * 获取serviceVersion属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceVersion() {
            return serviceVersion;
        }

        /**
         * 设置serviceVersion属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceVersion(String value) {
            this.serviceVersion = value;
        }

        /**
         * 获取sourceSysID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceSysID() {
            return sourceSysID;
        }

        /**
         * 设置sourceSysID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceSysID(String value) {
            this.sourceSysID = value;
        }

        /**
         * 获取timestampCreated属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimestampCreated() {
            return timestampCreated;
        }

        /**
         * 设置timestampCreated属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimestampCreated(String value) {
            this.timestampCreated = value;
        }

    }


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
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Header"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}BusinessPartner" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Container" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Stage" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Item" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}GeneralCharacteristics" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}CountryCharacteristics" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Status" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}ChargeList" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Note" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}HouseBooking" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}HouseBL" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}StoreDoor" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}ServiceConstraints" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}Cargo" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.nol.com.sg/intf/q2c/csss/bookingconfirmation/v1}HousingBL" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CheckResults" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MsgTy" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MsgTxt" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="220"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MsgCat" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RuleInputParam" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Value" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RuleReference" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RuleDescription" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SpecialInstruction" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalRequirement" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalOwner" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalParty" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalRole" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalMode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalLocation" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalTemplate" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApprovalPerson" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DocumentFlow" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PredecessorOrSuccessor" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DocumentNo" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TypeOfDocument" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DocumentStatus" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CutOffTimes" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CutoffCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CutoffDescription" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *                   &lt;element name="Location" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MilitaryCargo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SCACCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="GBLNo" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CubicFeet" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OwnersName" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Weight" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="11"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Piece" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "header",
        "businessPartner",
        "container",
        "stage",
        "item",
        "generalCharacteristics",
        "countryCharacteristics",
        "status",
        "chargeList",
        "note",
        "houseBooking",
        "houseBL",
        "storeDoor",
        "serviceConstraints",
        "cargo",
        "housingBL",
        "checkResults",
        "documentFlow",
        "cutOffTimes",
        "militaryCargo"
    })
    public static class BookingandBL {

        @XmlElement(name = "Header", required = true)
        protected Header header;
        @XmlElement(name = "BusinessPartner")
        protected List<BusinessPartner> businessPartner;
        @XmlElement(name = "Container")
        protected List<Container> container;
        @XmlElement(name = "Stage")
        protected List<Stage> stage;
        @XmlElement(name = "Item", required = true)
        protected List<Item> item;
        @XmlElement(name = "GeneralCharacteristics")
        protected List<GeneralCharacteristics> generalCharacteristics;
        @XmlElement(name = "CountryCharacteristics")
        protected CountryCharacteristics countryCharacteristics;
        @XmlElement(name = "Status")
        protected Status status;
        @XmlElement(name = "ChargeList")
        protected List<ChargeList> chargeList;
        @XmlElement(name = "Note")
        protected List<Note> note;
        @XmlElement(name = "HouseBooking")
        protected List<HouseBooking> houseBooking;
        @XmlElement(name = "HouseBL")
        protected List<HouseBL> houseBL;
        @XmlElement(name = "StoreDoor")
        protected List<StoreDoor> storeDoor;
        @XmlElement(name = "ServiceConstraints")
        protected ServiceConstraints serviceConstraints;
        @XmlElement(name = "Cargo")
        protected List<Cargo> cargo;
        @XmlElement(name = "HousingBL")
        protected List<HousingBL> housingBL;
        @XmlElement(name = "CheckResults")
        protected List<SendBookingBLRequestMsg.BookingandBL.CheckResults> checkResults;
        @XmlElement(name = "DocumentFlow")
        protected List<SendBookingBLRequestMsg.BookingandBL.DocumentFlow> documentFlow;
        @XmlElement(name = "CutOffTimes")
        protected List<SendBookingBLRequestMsg.BookingandBL.CutOffTimes> cutOffTimes;
        @XmlElement(name = "MilitaryCargo")
        protected List<SendBookingBLRequestMsg.BookingandBL.MilitaryCargo> militaryCargo;

        /**
         * 获取header属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Header }
         *     
         */
        public Header getHeader() {
            return header;
        }

        /**
         * 设置header属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Header }
         *     
         */
        public void setHeader(Header value) {
            this.header = value;
        }

        /**
         * Gets the value of the businessPartner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the businessPartner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusinessPartner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BusinessPartner }
         * 
         * 
         */
        public List<BusinessPartner> getBusinessPartner() {
            if (businessPartner == null) {
                businessPartner = new ArrayList<BusinessPartner>();
            }
            return this.businessPartner;
        }

        /**
         * Gets the value of the container property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the container property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContainer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Container }
         * 
         * 
         */
        public List<Container> getContainer() {
            if (container == null) {
                container = new ArrayList<Container>();
            }
            return this.container;
        }

        /**
         * Gets the value of the stage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Stage }
         * 
         * 
         */
        public List<Stage> getStage() {
            if (stage == null) {
                stage = new ArrayList<Stage>();
            }
            return this.stage;
        }

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item }
         * 
         * 
         */
        public List<Item> getItem() {
            if (item == null) {
                item = new ArrayList<Item>();
            }
            return this.item;
        }

        /**
         * Gets the value of the generalCharacteristics property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the generalCharacteristics property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeneralCharacteristics().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeneralCharacteristics }
         * 
         * 
         */
        public List<GeneralCharacteristics> getGeneralCharacteristics() {
            if (generalCharacteristics == null) {
                generalCharacteristics = new ArrayList<GeneralCharacteristics>();
            }
            return this.generalCharacteristics;
        }

        /**
         * 获取countryCharacteristics属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CountryCharacteristics }
         *     
         */
        public CountryCharacteristics getCountryCharacteristics() {
            return countryCharacteristics;
        }

        /**
         * 设置countryCharacteristics属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CountryCharacteristics }
         *     
         */
        public void setCountryCharacteristics(CountryCharacteristics value) {
            this.countryCharacteristics = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Status }
         *     
         */
        public Status getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Status }
         *     
         */
        public void setStatus(Status value) {
            this.status = value;
        }

        /**
         * Gets the value of the chargeList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargeList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChargeList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChargeList }
         * 
         * 
         */
        public List<ChargeList> getChargeList() {
            if (chargeList == null) {
                chargeList = new ArrayList<ChargeList>();
            }
            return this.chargeList;
        }

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Note }
         * 
         * 
         */
        public List<Note> getNote() {
            if (note == null) {
                note = new ArrayList<Note>();
            }
            return this.note;
        }

        /**
         * Gets the value of the houseBooking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the houseBooking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHouseBooking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HouseBooking }
         * 
         * 
         */
        public List<HouseBooking> getHouseBooking() {
            if (houseBooking == null) {
                houseBooking = new ArrayList<HouseBooking>();
            }
            return this.houseBooking;
        }

        /**
         * Gets the value of the houseBL property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the houseBL property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHouseBL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HouseBL }
         * 
         * 
         */
        public List<HouseBL> getHouseBL() {
            if (houseBL == null) {
                houseBL = new ArrayList<HouseBL>();
            }
            return this.houseBL;
        }

        /**
         * Gets the value of the storeDoor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the storeDoor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStoreDoor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StoreDoor }
         * 
         * 
         */
        public List<StoreDoor> getStoreDoor() {
            if (storeDoor == null) {
                storeDoor = new ArrayList<StoreDoor>();
            }
            return this.storeDoor;
        }

        /**
         * 获取serviceConstraints属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ServiceConstraints }
         *     
         */
        public ServiceConstraints getServiceConstraints() {
            return serviceConstraints;
        }

        /**
         * 设置serviceConstraints属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceConstraints }
         *     
         */
        public void setServiceConstraints(ServiceConstraints value) {
            this.serviceConstraints = value;
        }

        /**
         * Gets the value of the cargo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cargo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCargo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cargo }
         * 
         * 
         */
        public List<Cargo> getCargo() {
            if (cargo == null) {
                cargo = new ArrayList<Cargo>();
            }
            return this.cargo;
        }

        /**
         * Gets the value of the housingBL property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the housingBL property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHousingBL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HousingBL }
         * 
         * 
         */
        public List<HousingBL> getHousingBL() {
            if (housingBL == null) {
                housingBL = new ArrayList<HousingBL>();
            }
            return this.housingBL;
        }

        /**
         * Gets the value of the checkResults property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkResults property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckResults().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SendBookingBLRequestMsg.BookingandBL.CheckResults }
         * 
         * 
         */
        public List<SendBookingBLRequestMsg.BookingandBL.CheckResults> getCheckResults() {
            if (checkResults == null) {
                checkResults = new ArrayList<SendBookingBLRequestMsg.BookingandBL.CheckResults>();
            }
            return this.checkResults;
        }

        /**
         * Gets the value of the documentFlow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentFlow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentFlow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SendBookingBLRequestMsg.BookingandBL.DocumentFlow }
         * 
         * 
         */
        public List<SendBookingBLRequestMsg.BookingandBL.DocumentFlow> getDocumentFlow() {
            if (documentFlow == null) {
                documentFlow = new ArrayList<SendBookingBLRequestMsg.BookingandBL.DocumentFlow>();
            }
            return this.documentFlow;
        }

        /**
         * Gets the value of the cutOffTimes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cutOffTimes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCutOffTimes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SendBookingBLRequestMsg.BookingandBL.CutOffTimes }
         * 
         * 
         */
        public List<SendBookingBLRequestMsg.BookingandBL.CutOffTimes> getCutOffTimes() {
            if (cutOffTimes == null) {
                cutOffTimes = new ArrayList<SendBookingBLRequestMsg.BookingandBL.CutOffTimes>();
            }
            return this.cutOffTimes;
        }

        /**
         * Gets the value of the militaryCargo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the militaryCargo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMilitaryCargo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SendBookingBLRequestMsg.BookingandBL.MilitaryCargo }
         * 
         * 
         */
        public List<SendBookingBLRequestMsg.BookingandBL.MilitaryCargo> getMilitaryCargo() {
            if (militaryCargo == null) {
                militaryCargo = new ArrayList<SendBookingBLRequestMsg.BookingandBL.MilitaryCargo>();
            }
            return this.militaryCargo;
        }


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
         *         &lt;element name="MsgTy" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MsgTxt" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="220"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MsgCat" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RuleInputParam" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Value" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RuleReference" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RuleDescription" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SpecialInstruction" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalRequirement" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalOwner" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalParty" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalRole" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalMode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalLocation" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalTemplate" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApprovalPerson" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
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
            "msgTy",
            "msgTxt",
            "msgCat",
            "ruleInputParam",
            "ruleReference",
            "ruleDescription",
            "specialInstruction",
            "approvalRequirement",
            "approvalOwner",
            "approvalParty",
            "approvalType",
            "approvalRole",
            "approvalMode",
            "approvalLocation",
            "approvalTemplate",
            "approvalPerson"
        })
        public static class CheckResults {

            @XmlElement(name = "MsgTy")
            protected String msgTy;
            @XmlElement(name = "MsgTxt")
            protected String msgTxt;
            @XmlElement(name = "MsgCat")
            protected String msgCat;
            @XmlElement(name = "RuleInputParam")
            protected List<SendBookingBLRequestMsg.BookingandBL.CheckResults.RuleInputParam> ruleInputParam;
            @XmlElement(name = "RuleReference")
            protected String ruleReference;
            @XmlElement(name = "RuleDescription")
            protected String ruleDescription;
            @XmlElement(name = "SpecialInstruction")
            protected String specialInstruction;
            @XmlElement(name = "ApprovalRequirement")
            protected String approvalRequirement;
            @XmlElement(name = "ApprovalOwner")
            protected String approvalOwner;
            @XmlElement(name = "ApprovalParty")
            protected String approvalParty;
            @XmlElement(name = "ApprovalType")
            protected String approvalType;
            @XmlElement(name = "ApprovalRole")
            protected String approvalRole;
            @XmlElement(name = "ApprovalMode")
            protected String approvalMode;
            @XmlElement(name = "ApprovalLocation")
            protected String approvalLocation;
            @XmlElement(name = "ApprovalTemplate")
            protected String approvalTemplate;
            @XmlElement(name = "ApprovalPerson")
            protected String approvalPerson;

            /**
             * 获取msgTy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsgTy() {
                return msgTy;
            }

            /**
             * 设置msgTy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsgTy(String value) {
                this.msgTy = value;
            }

            /**
             * 获取msgTxt属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsgTxt() {
                return msgTxt;
            }

            /**
             * 设置msgTxt属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsgTxt(String value) {
                this.msgTxt = value;
            }

            /**
             * 获取msgCat属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsgCat() {
                return msgCat;
            }

            /**
             * 设置msgCat属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsgCat(String value) {
                this.msgCat = value;
            }

            /**
             * Gets the value of the ruleInputParam property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ruleInputParam property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRuleInputParam().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SendBookingBLRequestMsg.BookingandBL.CheckResults.RuleInputParam }
             * 
             * 
             */
            public List<SendBookingBLRequestMsg.BookingandBL.CheckResults.RuleInputParam> getRuleInputParam() {
                if (ruleInputParam == null) {
                    ruleInputParam = new ArrayList<SendBookingBLRequestMsg.BookingandBL.CheckResults.RuleInputParam>();
                }
                return this.ruleInputParam;
            }

            /**
             * 获取ruleReference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRuleReference() {
                return ruleReference;
            }

            /**
             * 设置ruleReference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRuleReference(String value) {
                this.ruleReference = value;
            }

            /**
             * 获取ruleDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRuleDescription() {
                return ruleDescription;
            }

            /**
             * 设置ruleDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRuleDescription(String value) {
                this.ruleDescription = value;
            }

            /**
             * 获取specialInstruction属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecialInstruction() {
                return specialInstruction;
            }

            /**
             * 设置specialInstruction属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecialInstruction(String value) {
                this.specialInstruction = value;
            }

            /**
             * 获取approvalRequirement属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalRequirement() {
                return approvalRequirement;
            }

            /**
             * 设置approvalRequirement属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalRequirement(String value) {
                this.approvalRequirement = value;
            }

            /**
             * 获取approvalOwner属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalOwner() {
                return approvalOwner;
            }

            /**
             * 设置approvalOwner属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalOwner(String value) {
                this.approvalOwner = value;
            }

            /**
             * 获取approvalParty属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalParty() {
                return approvalParty;
            }

            /**
             * 设置approvalParty属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalParty(String value) {
                this.approvalParty = value;
            }

            /**
             * 获取approvalType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalType() {
                return approvalType;
            }

            /**
             * 设置approvalType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalType(String value) {
                this.approvalType = value;
            }

            /**
             * 获取approvalRole属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalRole() {
                return approvalRole;
            }

            /**
             * 设置approvalRole属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalRole(String value) {
                this.approvalRole = value;
            }

            /**
             * 获取approvalMode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalMode() {
                return approvalMode;
            }

            /**
             * 设置approvalMode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalMode(String value) {
                this.approvalMode = value;
            }

            /**
             * 获取approvalLocation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalLocation() {
                return approvalLocation;
            }

            /**
             * 设置approvalLocation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalLocation(String value) {
                this.approvalLocation = value;
            }

            /**
             * 获取approvalTemplate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalTemplate() {
                return approvalTemplate;
            }

            /**
             * 设置approvalTemplate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalTemplate(String value) {
                this.approvalTemplate = value;
            }

            /**
             * 获取approvalPerson属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalPerson() {
                return approvalPerson;
            }

            /**
             * 设置approvalPerson属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalPerson(String value) {
                this.approvalPerson = value;
            }


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
             *         &lt;element name="Description" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Value" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
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
                "description",
                "value"
            })
            public static class RuleInputParam {

                @XmlElement(name = "Description")
                protected String description;
                @XmlElement(name = "Value")
                protected String value;

                /**
                 * 获取description属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * 设置description属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

                /**
                 * 获取value属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }


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
         *         &lt;element name="CutoffCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CutoffDescription" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
         *         &lt;element name="Location" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
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
            "cutoffCode",
            "cutoffDescription",
            "date",
            "time",
            "location"
        })
        public static class CutOffTimes {

            @XmlElement(name = "CutoffCode")
            protected String cutoffCode;
            @XmlElement(name = "CutoffDescription")
            protected String cutoffDescription;
            @XmlElement(name = "Date")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlElement(name = "Time")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar time;
            @XmlElement(name = "Location")
            protected String location;

            /**
             * 获取cutoffCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCutoffCode() {
                return cutoffCode;
            }

            /**
             * 设置cutoffCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCutoffCode(String value) {
                this.cutoffCode = value;
            }

            /**
             * 获取cutoffDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCutoffDescription() {
                return cutoffDescription;
            }

            /**
             * 设置cutoffDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCutoffDescription(String value) {
                this.cutoffDescription = value;
            }

            /**
             * 获取date属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * 设置date属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * 获取time属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTime() {
                return time;
            }

            /**
             * 设置time属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTime(XMLGregorianCalendar value) {
                this.time = value;
            }

            /**
             * 获取location属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocation() {
                return location;
            }

            /**
             * 设置location属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocation(String value) {
                this.location = value;
            }

        }


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
         *         &lt;element name="PredecessorOrSuccessor" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DocumentNo" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TypeOfDocument" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DocumentStatus" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
            "predecessorOrSuccessor",
            "documentNo",
            "typeOfDocument",
            "documentStatus",
            "createdOn",
            "createdAt"
        })
        public static class DocumentFlow {

            @XmlElement(name = "PredecessorOrSuccessor")
            protected String predecessorOrSuccessor;
            @XmlElement(name = "DocumentNo")
            protected String documentNo;
            @XmlElement(name = "TypeOfDocument")
            protected String typeOfDocument;
            @XmlElement(name = "DocumentStatus")
            protected String documentStatus;
            @XmlElement(name = "CreatedOn")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "CreatedAt")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar createdAt;

            /**
             * 获取predecessorOrSuccessor属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPredecessorOrSuccessor() {
                return predecessorOrSuccessor;
            }

            /**
             * 设置predecessorOrSuccessor属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPredecessorOrSuccessor(String value) {
                this.predecessorOrSuccessor = value;
            }

            /**
             * 获取documentNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentNo() {
                return documentNo;
            }

            /**
             * 设置documentNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentNo(String value) {
                this.documentNo = value;
            }

            /**
             * 获取typeOfDocument属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeOfDocument() {
                return typeOfDocument;
            }

            /**
             * 设置typeOfDocument属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeOfDocument(String value) {
                this.typeOfDocument = value;
            }

            /**
             * 获取documentStatus属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentStatus() {
                return documentStatus;
            }

            /**
             * 设置documentStatus属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentStatus(String value) {
                this.documentStatus = value;
            }

            /**
             * 获取createdOn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * 设置createdOn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * 获取createdAt属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedAt() {
                return createdAt;
            }

            /**
             * 设置createdAt属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedAt(XMLGregorianCalendar value) {
                this.createdAt = value;
            }

        }


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
         *         &lt;element name="SCACCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="GBLNo" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CubicFeet" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OwnersName" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Weight" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="11"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Piece" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="6"/>
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
            "scacCode",
            "gblNo",
            "cubicFeet",
            "ownersName",
            "weight",
            "piece"
        })
        public static class MilitaryCargo {

            @XmlElement(name = "SCACCode")
            protected String scacCode;
            @XmlElement(name = "GBLNo")
            protected String gblNo;
            @XmlElement(name = "CubicFeet")
            protected String cubicFeet;
            @XmlElement(name = "OwnersName")
            protected String ownersName;
            @XmlElement(name = "Weight")
            protected String weight;
            @XmlElement(name = "Piece")
            protected String piece;

            /**
             * 获取scacCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSCACCode() {
                return scacCode;
            }

            /**
             * 设置scacCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSCACCode(String value) {
                this.scacCode = value;
            }

            /**
             * 获取gblNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGBLNo() {
                return gblNo;
            }

            /**
             * 设置gblNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGBLNo(String value) {
                this.gblNo = value;
            }

            /**
             * 获取cubicFeet属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCubicFeet() {
                return cubicFeet;
            }

            /**
             * 设置cubicFeet属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCubicFeet(String value) {
                this.cubicFeet = value;
            }

            /**
             * 获取ownersName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnersName() {
                return ownersName;
            }

            /**
             * 设置ownersName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnersName(String value) {
                this.ownersName = value;
            }

            /**
             * 获取weight属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWeight() {
                return weight;
            }

            /**
             * 设置weight属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWeight(String value) {
                this.weight = value;
            }

            /**
             * 获取piece属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPiece() {
                return piece;
            }

            /**
             * 设置piece属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPiece(String value) {
                this.piece = value;
            }

        }

    }

}
