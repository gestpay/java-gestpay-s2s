
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shopLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullFillment" type="{https://ecomms2s.sella.it/}FullFillmentDetails" minOccurs="0"/>
 *         &lt;element name="apikey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDeviceDetails" type="{https://ecomms2s.sella.it/}PaymentDeviceDetails" minOccurs="0"/>
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
    "shopLogin",
    "uicCode",
    "amount",
    "shopTransID",
    "bankTransID",
    "fullFillment",
    "apikey",
    "paymentDeviceDetails"
})
@XmlRootElement(name = "callSettleS2S")
public class CallSettleS2S {

    protected String shopLogin;
    protected String uicCode;
    protected String amount;
    protected String shopTransID;
    protected String bankTransID;
    @XmlElement(name = "FullFillment")
    protected FullFillmentDetails fullFillment;
    protected String apikey;
    protected PaymentDeviceDetails paymentDeviceDetails;

    /**
     * Gets the value of the shopLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopLogin() {
        return shopLogin;
    }

    /**
     * Sets the value of the shopLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopLogin(String value) {
        this.shopLogin = value;
    }

    /**
     * Gets the value of the uicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUicCode() {
        return uicCode;
    }

    /**
     * Sets the value of the uicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUicCode(String value) {
        this.uicCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the shopTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopTransID() {
        return shopTransID;
    }

    /**
     * Sets the value of the shopTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopTransID(String value) {
        this.shopTransID = value;
    }

    /**
     * Gets the value of the bankTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransID() {
        return bankTransID;
    }

    /**
     * Sets the value of the bankTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransID(String value) {
        this.bankTransID = value;
    }

    /**
     * Gets the value of the fullFillment property.
     * 
     * @return
     *     possible object is
     *     {@link FullFillmentDetails }
     *     
     */
    public FullFillmentDetails getFullFillment() {
        return fullFillment;
    }

    /**
     * Sets the value of the fullFillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullFillmentDetails }
     *     
     */
    public void setFullFillment(FullFillmentDetails value) {
        this.fullFillment = value;
    }

    /**
     * Gets the value of the apikey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApikey() {
        return apikey;
    }

    /**
     * Sets the value of the apikey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApikey(String value) {
        this.apikey = value;
    }

    /**
     * Gets the value of the paymentDeviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDeviceDetails }
     *     
     */
    public PaymentDeviceDetails getPaymentDeviceDetails() {
        return paymentDeviceDetails;
    }

    /**
     * Sets the value of the paymentDeviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDeviceDetails }
     *     
     */
    public void setPaymentDeviceDetails(PaymentDeviceDetails value) {
        this.paymentDeviceDetails = value;
    }

}
