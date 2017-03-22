
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RedBillingInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RedBillingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Billing_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedBillingInfo", propOrder = {
    "billingId",
    "billingName",
    "billingSurname",
    "billingDateOfBirth",
    "billingEmail",
    "billingAddress",
    "billingAddress2",
    "billingCity",
    "billingStateCode",
    "billingCountry",
    "billingPostalCode",
    "billingHomePhone",
    "billingWorkPhone",
    "billingMobilePhone"
})
public class RedBillingInfo {

    @XmlElement(name = "Billing_Id")
    protected String billingId;
    @XmlElement(name = "Billing_Name")
    protected String billingName;
    @XmlElement(name = "Billing_Surname")
    protected String billingSurname;
    @XmlElement(name = "Billing_DateOfBirth")
    protected String billingDateOfBirth;
    @XmlElement(name = "Billing_Email")
    protected String billingEmail;
    @XmlElement(name = "Billing_Address")
    protected String billingAddress;
    @XmlElement(name = "Billing_Address2")
    protected String billingAddress2;
    @XmlElement(name = "Billing_City")
    protected String billingCity;
    @XmlElement(name = "Billing_StateCode")
    protected String billingStateCode;
    @XmlElement(name = "Billing_Country")
    protected String billingCountry;
    @XmlElement(name = "Billing_PostalCode")
    protected String billingPostalCode;
    @XmlElement(name = "Billing_HomePhone")
    protected String billingHomePhone;
    @XmlElement(name = "Billing_WorkPhone")
    protected String billingWorkPhone;
    @XmlElement(name = "Billing_MobilePhone")
    protected String billingMobilePhone;

    /**
     * Recupera il valore della proprietà billingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingId() {
        return billingId;
    }

    /**
     * Imposta il valore della proprietà billingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingId(String value) {
        this.billingId = value;
    }

    /**
     * Recupera il valore della proprietà billingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingName() {
        return billingName;
    }

    /**
     * Imposta il valore della proprietà billingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingName(String value) {
        this.billingName = value;
    }

    /**
     * Recupera il valore della proprietà billingSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingSurname() {
        return billingSurname;
    }

    /**
     * Imposta il valore della proprietà billingSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingSurname(String value) {
        this.billingSurname = value;
    }

    /**
     * Recupera il valore della proprietà billingDateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDateOfBirth() {
        return billingDateOfBirth;
    }

    /**
     * Imposta il valore della proprietà billingDateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDateOfBirth(String value) {
        this.billingDateOfBirth = value;
    }

    /**
     * Recupera il valore della proprietà billingEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingEmail() {
        return billingEmail;
    }

    /**
     * Imposta il valore della proprietà billingEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingEmail(String value) {
        this.billingEmail = value;
    }

    /**
     * Recupera il valore della proprietà billingAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Imposta il valore della proprietà billingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress(String value) {
        this.billingAddress = value;
    }

    /**
     * Recupera il valore della proprietà billingAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress2() {
        return billingAddress2;
    }

    /**
     * Imposta il valore della proprietà billingAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress2(String value) {
        this.billingAddress2 = value;
    }

    /**
     * Recupera il valore della proprietà billingCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Imposta il valore della proprietà billingCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCity(String value) {
        this.billingCity = value;
    }

    /**
     * Recupera il valore della proprietà billingStateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingStateCode() {
        return billingStateCode;
    }

    /**
     * Imposta il valore della proprietà billingStateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingStateCode(String value) {
        this.billingStateCode = value;
    }

    /**
     * Recupera il valore della proprietà billingCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Imposta il valore della proprietà billingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCountry(String value) {
        this.billingCountry = value;
    }

    /**
     * Recupera il valore della proprietà billingPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    /**
     * Imposta il valore della proprietà billingPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPostalCode(String value) {
        this.billingPostalCode = value;
    }

    /**
     * Recupera il valore della proprietà billingHomePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingHomePhone() {
        return billingHomePhone;
    }

    /**
     * Imposta il valore della proprietà billingHomePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingHomePhone(String value) {
        this.billingHomePhone = value;
    }

    /**
     * Recupera il valore della proprietà billingWorkPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingWorkPhone() {
        return billingWorkPhone;
    }

    /**
     * Imposta il valore della proprietà billingWorkPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingWorkPhone(String value) {
        this.billingWorkPhone = value;
    }

    /**
     * Recupera il valore della proprietà billingMobilePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMobilePhone() {
        return billingMobilePhone;
    }

    /**
     * Imposta il valore della proprietà billingMobilePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMobilePhone(String value) {
        this.billingMobilePhone = value;
    }

}
