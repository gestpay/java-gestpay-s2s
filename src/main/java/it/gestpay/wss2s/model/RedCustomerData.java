
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RedCustomerData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà merchantWebSite.
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
     * Imposta il valore della proprietà merchantWebSite.
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
     * Recupera il valore della proprietà customerIPAddress.
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
     * Imposta il valore della proprietà customerIPAddress.
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
     * Recupera il valore della proprietà pcFingerPrint.
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
     * Imposta il valore della proprietà pcFingerPrint.
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
     * Recupera il valore della proprietà previousCustomer.
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
     * Imposta il valore della proprietà previousCustomer.
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
     * Recupera il valore della proprietà redMerchantID.
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
     * Imposta il valore della proprietà redMerchantID.
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
     * Recupera il valore della proprietà redServiceType.
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
     * Imposta il valore della proprietà redServiceType.
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
