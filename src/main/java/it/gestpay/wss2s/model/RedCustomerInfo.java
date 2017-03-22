
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RedCustomerInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RedCustomerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedCustomerInfo", propOrder = {
    "customerTitle",
    "customerName",
    "customerSurname",
    "customerEmail",
    "customerAddress",
    "customerAddress2",
    "customerCity",
    "customerStateCode",
    "customerCountry",
    "customerPostalCode",
    "customerPhone"
})
public class RedCustomerInfo {

    @XmlElement(name = "Customer_Title")
    protected String customerTitle;
    @XmlElement(name = "Customer_Name")
    protected String customerName;
    @XmlElement(name = "Customer_Surname")
    protected String customerSurname;
    @XmlElement(name = "Customer_Email")
    protected String customerEmail;
    @XmlElement(name = "Customer_Address")
    protected String customerAddress;
    @XmlElement(name = "Customer_Address2")
    protected String customerAddress2;
    @XmlElement(name = "Customer_City")
    protected String customerCity;
    @XmlElement(name = "Customer_StateCode")
    protected String customerStateCode;
    @XmlElement(name = "Customer_Country")
    protected String customerCountry;
    @XmlElement(name = "Customer_PostalCode")
    protected String customerPostalCode;
    @XmlElement(name = "Customer_Phone")
    protected String customerPhone;

    /**
     * Recupera il valore della proprietà customerTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTitle() {
        return customerTitle;
    }

    /**
     * Imposta il valore della proprietà customerTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTitle(String value) {
        this.customerTitle = value;
    }

    /**
     * Recupera il valore della proprietà customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Imposta il valore della proprietà customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Recupera il valore della proprietà customerSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSurname() {
        return customerSurname;
    }

    /**
     * Imposta il valore della proprietà customerSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSurname(String value) {
        this.customerSurname = value;
    }

    /**
     * Recupera il valore della proprietà customerEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Imposta il valore della proprietà customerEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Recupera il valore della proprietà customerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Imposta il valore della proprietà customerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddress(String value) {
        this.customerAddress = value;
    }

    /**
     * Recupera il valore della proprietà customerAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddress2() {
        return customerAddress2;
    }

    /**
     * Imposta il valore della proprietà customerAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddress2(String value) {
        this.customerAddress2 = value;
    }

    /**
     * Recupera il valore della proprietà customerCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * Imposta il valore della proprietà customerCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCity(String value) {
        this.customerCity = value;
    }

    /**
     * Recupera il valore della proprietà customerStateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStateCode() {
        return customerStateCode;
    }

    /**
     * Imposta il valore della proprietà customerStateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStateCode(String value) {
        this.customerStateCode = value;
    }

    /**
     * Recupera il valore della proprietà customerCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCountry() {
        return customerCountry;
    }

    /**
     * Imposta il valore della proprietà customerCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCountry(String value) {
        this.customerCountry = value;
    }

    /**
     * Recupera il valore della proprietà customerPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPostalCode() {
        return customerPostalCode;
    }

    /**
     * Imposta il valore della proprietà customerPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPostalCode(String value) {
        this.customerPostalCode = value;
    }

    /**
     * Recupera il valore della proprietà customerPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Imposta il valore della proprietà customerPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhone(String value) {
        this.customerPhone = value;
    }

}
