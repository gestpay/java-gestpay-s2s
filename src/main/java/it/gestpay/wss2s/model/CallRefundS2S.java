
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
 *         &lt;element name="shopTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDetail" type="{https://ecomms2s.sella.it/}RefundProductDetail"/>
 *         &lt;element name="RefundReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeBackFraud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "shopTransactionId",
    "bankTransactionId",
    "orderDetail",
    "refundReason",
    "chargeBackFraud",
    "apikey",
    "paymentDeviceDetails"
})
@XmlRootElement(name = "callRefundS2S")
public class CallRefundS2S {

    protected String shopLogin;
    protected String uicCode;
    protected String amount;
    protected String shopTransactionId;
    protected String bankTransactionId;
    @XmlElement(name = "OrderDetail", required = true, nillable = true)
    protected RefundProductDetail orderDetail;
    @XmlElement(name = "RefundReason")
    protected String refundReason;
    protected String chargeBackFraud;
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
     * Gets the value of the shopTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopTransactionId() {
        return shopTransactionId;
    }

    /**
     * Sets the value of the shopTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopTransactionId(String value) {
        this.shopTransactionId = value;
    }

    /**
     * Gets the value of the bankTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransactionId() {
        return bankTransactionId;
    }

    /**
     * Sets the value of the bankTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransactionId(String value) {
        this.bankTransactionId = value;
    }

    /**
     * Gets the value of the orderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RefundProductDetail }
     *     
     */
    public RefundProductDetail getOrderDetail() {
        return orderDetail;
    }

    /**
     * Sets the value of the orderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundProductDetail }
     *     
     */
    public void setOrderDetail(RefundProductDetail value) {
        this.orderDetail = value;
    }

    /**
     * Gets the value of the refundReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Sets the value of the refundReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReason(String value) {
        this.refundReason = value;
    }

    /**
     * Gets the value of the chargeBackFraud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeBackFraud() {
        return chargeBackFraud;
    }

    /**
     * Sets the value of the chargeBackFraud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeBackFraud(String value) {
        this.chargeBackFraud = value;
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
