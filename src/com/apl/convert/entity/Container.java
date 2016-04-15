//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ��ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ���ʱ��: 2015.11.11 ʱ�� 11:54:26 AM CST 
//


package com.apl.convert.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmptyPickupLocationReq" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmptyPickupRemarksReq" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmptyReturnLocationReq" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmptyReturnRemarksReq" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmptyPickupLocationAct" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmptyPickupRemarksAct" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmptyReturnLocationAct" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmptyReturnRemarksAct" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
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
    "emptyPickupLocationReq",
    "emptyPickupRemarksReq",
    "emptyReturnLocationReq",
    "emptyReturnRemarksReq",
    "emptyPickupLocationAct",
    "emptyPickupRemarksAct",
    "emptyReturnLocationAct",
    "emptyReturnRemarksAct"
})
@XmlRootElement(name = "Container")
public class Container {

    @XmlElement(name = "EmptyPickupLocationReq")
    protected String emptyPickupLocationReq;
    @XmlElement(name = "EmptyPickupRemarksReq")
    protected String emptyPickupRemarksReq;
    @XmlElement(name = "EmptyReturnLocationReq")
    protected String emptyReturnLocationReq;
    @XmlElement(name = "EmptyReturnRemarksReq")
    protected String emptyReturnRemarksReq;
    @XmlElement(name = "EmptyPickupLocationAct")
    protected String emptyPickupLocationAct;
    @XmlElement(name = "EmptyPickupRemarksAct")
    protected String emptyPickupRemarksAct;
    @XmlElement(name = "EmptyReturnLocationAct")
    protected String emptyReturnLocationAct;
    @XmlElement(name = "EmptyReturnRemarksAct")
    protected String emptyReturnRemarksAct;

    /**
     * ��ȡemptyPickupLocationReq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyPickupLocationReq() {
        return emptyPickupLocationReq;
    }

    /**
     * ����emptyPickupLocationReq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyPickupLocationReq(String value) {
        this.emptyPickupLocationReq = value;
    }

    /**
     * ��ȡemptyPickupRemarksReq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyPickupRemarksReq() {
        return emptyPickupRemarksReq;
    }

    /**
     * ����emptyPickupRemarksReq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyPickupRemarksReq(String value) {
        this.emptyPickupRemarksReq = value;
    }

    /**
     * ��ȡemptyReturnLocationReq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyReturnLocationReq() {
        return emptyReturnLocationReq;
    }

    /**
     * ����emptyReturnLocationReq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyReturnLocationReq(String value) {
        this.emptyReturnLocationReq = value;
    }

    /**
     * ��ȡemptyReturnRemarksReq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyReturnRemarksReq() {
        return emptyReturnRemarksReq;
    }

    /**
     * ����emptyReturnRemarksReq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyReturnRemarksReq(String value) {
        this.emptyReturnRemarksReq = value;
    }

    /**
     * ��ȡemptyPickupLocationAct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyPickupLocationAct() {
        return emptyPickupLocationAct;
    }

    /**
     * ����emptyPickupLocationAct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyPickupLocationAct(String value) {
        this.emptyPickupLocationAct = value;
    }

    /**
     * ��ȡemptyPickupRemarksAct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyPickupRemarksAct() {
        return emptyPickupRemarksAct;
    }

    /**
     * ����emptyPickupRemarksAct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyPickupRemarksAct(String value) {
        this.emptyPickupRemarksAct = value;
    }

    /**
     * ��ȡemptyReturnLocationAct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyReturnLocationAct() {
        return emptyReturnLocationAct;
    }

    /**
     * ����emptyReturnLocationAct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyReturnLocationAct(String value) {
        this.emptyReturnLocationAct = value;
    }

    /**
     * ��ȡemptyReturnRemarksAct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyReturnRemarksAct() {
        return emptyReturnRemarksAct;
    }

    /**
     * ����emptyReturnRemarksAct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyReturnRemarksAct(String value) {
        this.emptyReturnRemarksAct = value;
    }

}
