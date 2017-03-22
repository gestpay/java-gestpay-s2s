
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RedShippingInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà shippingName.
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
     * Imposta il valore della proprietà shippingName.
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
     * Recupera il valore della proprietà shippingSurname.
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
     * Imposta il valore della proprietà shippingSurname.
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
     * Recupera il valore della proprietà shippingEmail.
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
     * Imposta il valore della proprietà shippingEmail.
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
     * Recupera il valore della proprietà shippingAddress.
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
     * Imposta il valore della proprietà shippingAddress.
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
     * Recupera il valore della proprietà shippingAddress2.
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
     * Imposta il valore della proprietà shippingAddress2.
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
     * Recupera il valore della proprietà shippingCity.
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
     * Imposta il valore della proprietà shippingCity.
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
     * Recupera il valore della proprietà shippingStateCode.
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
     * Imposta il valore della proprietà shippingStateCode.
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
     * Recupera il valore della proprietà shippingCountry.
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
     * Imposta il valore della proprietà shippingCountry.
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
     * Recupera il valore della proprietà shippingPostalCode.
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
     * Imposta il valore della proprietà shippingPostalCode.
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
     * Recupera il valore della proprietà shippingHomePhone.
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
     * Imposta il valore della proprietà shippingHomePhone.
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
     * Recupera il valore della proprietà shippingMobilePhone.
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
     * Imposta il valore della proprietà shippingMobilePhone.
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
     * Recupera il valore della proprietà shippingFaxPhone.
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
     * Imposta il valore della proprietà shippingFaxPhone.
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
     * Recupera il valore della proprietà shippingTimeToDeparture.
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
     * Imposta il valore della proprietà shippingTimeToDeparture.
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
