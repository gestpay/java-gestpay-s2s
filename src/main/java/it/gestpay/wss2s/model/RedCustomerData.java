
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedCustomerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedCustomerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerchantWebSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC_FingerPrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Red_Merchant_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Red_ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedCustomerData", propOrder = {
    "merchantWebSite",
    "customerIPAddress",
    "pcFingerPrint",
    "previousCustomer",
    "redMerchantID",
    "redServiceType"
})
public class RedCustomerData {

    @XmlElement(name = "MerchantWebSite")
    protected String merchantWebSite;
    @XmlElement(name = "Customer_IPAddress")
    protected String customerIPAddress;
    @XmlElement(name = "PC_FingerPrint")
    protected String pcFingerPrint;
    @XmlElement(name = "PreviousCustomer")
    protected String previousCustomer;
    @XmlElement(name = "Red_Merchant_ID")
    protected String redMerchantID;
    @XmlElement(name = "Red_ServiceType")
    protected String redServiceType;

    /**
     * Gets the value of the merchantWebSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantWebSite() {
        return merchantWebSite;
    }

    /**
     * Sets the value of the merchantWebSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantWebSite(String value) {
        this.merchantWebSite = value;
    }

    /**
     * Gets the value of the customerIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIPAddress() {
        return customerIPAddress;
    }

    /**
     * Sets the value of the customerIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIPAddress(String value) {
        this.customerIPAddress = value;
    }

    /**
     * Gets the value of the pcFingerPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCFingerPrint() {
        return pcFingerPrint;
    }

    /**
     * Sets the value of the pcFingerPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCFingerPrint(String value) {
        this.pcFingerPrint = value;
    }

    /**
     * Gets the value of the previousCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousCustomer() {
        return previousCustomer;
    }

    /**
     * Sets the value of the previousCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousCustomer(String value) {
        this.previousCustomer = value;
    }

    /**
     * Gets the value of the redMerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedMerchantID() {
        return redMerchantID;
    }

    /**
     * Sets the value of the redMerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedMerchantID(String value) {
        this.redMerchantID = value;
    }

    /**
     * Gets the value of the redServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedServiceType() {
        return redServiceType;
    }

    /**
     * Sets the value of the redServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedServiceType(String value) {
        this.redServiceType = value;
    }

}
