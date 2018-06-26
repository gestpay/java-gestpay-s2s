
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedShippingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedShippingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shipping_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_FaxPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_TimeToDeparture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedShippingInfo", propOrder = {
    "shippingName",
    "shippingSurname",
    "shippingEmail",
    "shippingAddress",
    "shippingAddress2",
    "shippingCity",
    "shippingStateCode",
    "shippingCountry",
    "shippingPostalCode",
    "shippingHomePhone",
    "shippingMobilePhone",
    "shippingFaxPhone",
    "shippingTimeToDeparture"
})
public class RedShippingInfo {

    @XmlElement(name = "Shipping_Name")
    protected String shippingName;
    @XmlElement(name = "Shipping_Surname")
    protected String shippingSurname;
    @XmlElement(name = "Shipping_Email")
    protected String shippingEmail;
    @XmlElement(name = "Shipping_Address")
    protected String shippingAddress;
    @XmlElement(name = "Shipping_Address2")
    protected String shippingAddress2;
    @XmlElement(name = "Shipping_City")
    protected String shippingCity;
    @XmlElement(name = "Shipping_StateCode")
    protected String shippingStateCode;
    @XmlElement(name = "Shipping_Country")
    protected String shippingCountry;
    @XmlElement(name = "Shipping_PostalCode")
    protected String shippingPostalCode;
    @XmlElement(name = "Shipping_HomePhone")
    protected String shippingHomePhone;
    @XmlElement(name = "Shipping_MobilePhone")
    protected String shippingMobilePhone;
    @XmlElement(name = "Shipping_FaxPhone")
    protected String shippingFaxPhone;
    @XmlElement(name = "Shipping_TimeToDeparture")
    protected String shippingTimeToDeparture;

    /**
     * Gets the value of the shippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * Sets the value of the shippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingName(String value) {
        this.shippingName = value;
    }

    /**
     * Gets the value of the shippingSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingSurname() {
        return shippingSurname;
    }

    /**
     * Sets the value of the shippingSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingSurname(String value) {
        this.shippingSurname = value;
    }

    /**
     * Gets the value of the shippingEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingEmail() {
        return shippingEmail;
    }

    /**
     * Sets the value of the shippingEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingEmail(String value) {
        this.shippingEmail = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddress(String value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the shippingAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddress2() {
        return shippingAddress2;
    }

    /**
     * Sets the value of the shippingAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddress2(String value) {
        this.shippingAddress2 = value;
    }

    /**
     * Gets the value of the shippingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets the value of the shippingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCity(String value) {
        this.shippingCity = value;
    }

    /**
     * Gets the value of the shippingStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStateCode() {
        return shippingStateCode;
    }

    /**
     * Sets the value of the shippingStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStateCode(String value) {
        this.shippingStateCode = value;
    }

    /**
     * Gets the value of the shippingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the value of the shippingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCountry(String value) {
        this.shippingCountry = value;
    }

    /**
     * Gets the value of the shippingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    /**
     * Sets the value of the shippingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPostalCode(String value) {
        this.shippingPostalCode = value;
    }

    /**
     * Gets the value of the shippingHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingHomePhone() {
        return shippingHomePhone;
    }

    /**
     * Sets the value of the shippingHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingHomePhone(String value) {
        this.shippingHomePhone = value;
    }

    /**
     * Gets the value of the shippingMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMobilePhone() {
        return shippingMobilePhone;
    }

    /**
     * Sets the value of the shippingMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMobilePhone(String value) {
        this.shippingMobilePhone = value;
    }

    /**
     * Gets the value of the shippingFaxPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingFaxPhone() {
        return shippingFaxPhone;
    }

    /**
     * Sets the value of the shippingFaxPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingFaxPhone(String value) {
        this.shippingFaxPhone = value;
    }

    /**
     * Gets the value of the shippingTimeToDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTimeToDeparture() {
        return shippingTimeToDeparture;
    }

    /**
     * Sets the value of the shippingTimeToDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTimeToDeparture(String value) {
        this.shippingTimeToDeparture = value;
    }

}
