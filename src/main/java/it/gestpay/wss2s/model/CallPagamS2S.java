
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
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentTypes" type="{https://ecomms2s.sella.it/}PaymentTypes" minOccurs="0"/>
 *         &lt;element name="paymentDeviceDetails" type="{https://ecomms2s.sella.it/}PaymentDeviceDetails" minOccurs="0"/>
 *         &lt;element name="shippingDetails" type="{https://ecomms2s.sella.it/}ShippingDetails" minOccurs="0"/>
 *         &lt;element name="redFraudPrevention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Red_CustomerInfo" type="{https://ecomms2s.sella.it/}RedCustomerInfo" minOccurs="0"/>
 *         &lt;element name="Red_ShippingInfo" type="{https://ecomms2s.sella.it/}RedShippingInfo" minOccurs="0"/>
 *         &lt;element name="Red_BillingInfo" type="{https://ecomms2s.sella.it/}RedBillingInfo" minOccurs="0"/>
 *         &lt;element name="Red_CustomerData" type="{https://ecomms2s.sella.it/}RedCustomerData" minOccurs="0"/>
 *         &lt;element name="Red_CustomInfo" type="{https://ecomms2s.sella.it/}RedCustomInfo" minOccurs="0"/>
 *         &lt;element name="Red_Items" type="{https://ecomms2s.sella.it/}RedItems" minOccurs="0"/>
 *         &lt;element name="applePay" type="{https://ecomms2s.sella.it/}ApplePayRequest"/>
 *         &lt;element name="cardReaderPayments" type="{https://ecomms2s.sella.it/}CardReaderPayments" minOccurs="0"/>
 *         &lt;element name="OrderDetails" type="{https://ecomms2s.sella.it/}EcommGestpayPaymentDetails" minOccurs="0"/>
 *         &lt;element name="apikey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cardNumber",
    "expiryMonth",
    "expiryYear",
    "buyerName",
    "buyerEmail",
    "languageId",
    "cvv",
    "min",
    "transKey",
    "paRes",
    "customInfo",
    "idea",
    "requestToken",
    "tokenValue",
    "clientIP",
    "itemType",
    "recurrent",
    "subMerchantId",
    "paymentTypes",
    "paymentDeviceDetails",
    "shippingDetails",
    "redFraudPrevention",
    "redCustomerInfo",
    "redShippingInfo",
    "redBillingInfo",
    "redCustomerData",
    "redCustomInfo",
    "redItems",
    "applePay",
    "cardReaderPayments",
    "orderDetails",
    "apikey"
})
@XmlRootElement(name = "callPagamS2S")
public class CallPagamS2S {

    protected String shopLogin;
    protected String uicCode;
    protected String amount;
    protected String shopTransactionId;
    protected String cardNumber;
    protected String expiryMonth;
    protected String expiryYear;
    protected String buyerName;
    protected String buyerEmail;
    protected String languageId;
    protected String cvv;
    protected String min;
    protected String transKey;
    @XmlElement(name = "PARes")
    protected String paRes;
    protected String customInfo;
    @XmlElement(name = "IDEA")
    protected String idea;
    protected String requestToken;
    protected String tokenValue;
    protected String clientIP;
    protected String itemType;
    protected String recurrent;
    protected String subMerchantId;
    protected PaymentTypes paymentTypes;
    protected PaymentDeviceDetails paymentDeviceDetails;
    protected ShippingDetails shippingDetails;
    protected String redFraudPrevention;
    @XmlElement(name = "Red_CustomerInfo")
    protected RedCustomerInfo redCustomerInfo;
    @XmlElement(name = "Red_ShippingInfo")
    protected RedShippingInfo redShippingInfo;
    @XmlElement(name = "Red_BillingInfo")
    protected RedBillingInfo redBillingInfo;
    @XmlElement(name = "Red_CustomerData")
    protected RedCustomerData redCustomerData;
    @XmlElement(name = "Red_CustomInfo")
    protected RedCustomInfo redCustomInfo;
    @XmlElement(name = "Red_Items")
    protected RedItems redItems;
    @XmlElement(required = true, nillable = true)
    protected ApplePayRequest applePay;
    protected CardReaderPayments cardReaderPayments;
    @XmlElement(name = "OrderDetails")
    protected EcommGestpayPaymentDetails orderDetails;
    protected String apikey;

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
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonth(String value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the buyerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * Sets the value of the buyerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerName(String value) {
        this.buyerName = value;
    }

    /**
     * Gets the value of the buyerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * Sets the value of the buyerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerEmail(String value) {
        this.buyerEmail = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageId(String value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the cvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the transKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransKey() {
        return transKey;
    }

    /**
     * Sets the value of the transKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransKey(String value) {
        this.transKey = value;
    }

    /**
     * Gets the value of the paRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARes() {
        return paRes;
    }

    /**
     * Sets the value of the paRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARes(String value) {
        this.paRes = value;
    }

    /**
     * Gets the value of the customInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomInfo() {
        return customInfo;
    }

    /**
     * Sets the value of the customInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomInfo(String value) {
        this.customInfo = value;
    }

    /**
     * Gets the value of the idea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEA() {
        return idea;
    }

    /**
     * Sets the value of the idea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEA(String value) {
        this.idea = value;
    }

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
    }

    /**
     * Gets the value of the tokenValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenValue() {
        return tokenValue;
    }

    /**
     * Sets the value of the tokenValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenValue(String value) {
        this.tokenValue = value;
    }

    /**
     * Gets the value of the clientIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIP() {
        return clientIP;
    }

    /**
     * Sets the value of the clientIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIP(String value) {
        this.clientIP = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the recurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrent() {
        return recurrent;
    }

    /**
     * Sets the value of the recurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrent(String value) {
        this.recurrent = value;
    }

    /**
     * Gets the value of the subMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubMerchantId() {
        return subMerchantId;
    }

    /**
     * Sets the value of the subMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubMerchantId(String value) {
        this.subMerchantId = value;
    }

    /**
     * Gets the value of the paymentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypes }
     *     
     */
    public PaymentTypes getPaymentTypes() {
        return paymentTypes;
    }

    /**
     * Sets the value of the paymentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypes }
     *     
     */
    public void setPaymentTypes(PaymentTypes value) {
        this.paymentTypes = value;
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

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetails }
     *     
     */
    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetails }
     *     
     */
    public void setShippingDetails(ShippingDetails value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the redFraudPrevention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedFraudPrevention() {
        return redFraudPrevention;
    }

    /**
     * Sets the value of the redFraudPrevention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedFraudPrevention(String value) {
        this.redFraudPrevention = value;
    }

    /**
     * Gets the value of the redCustomerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RedCustomerInfo }
     *     
     */
    public RedCustomerInfo getRedCustomerInfo() {
        return redCustomerInfo;
    }

    /**
     * Sets the value of the redCustomerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedCustomerInfo }
     *     
     */
    public void setRedCustomerInfo(RedCustomerInfo value) {
        this.redCustomerInfo = value;
    }

    /**
     * Gets the value of the redShippingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RedShippingInfo }
     *     
     */
    public RedShippingInfo getRedShippingInfo() {
        return redShippingInfo;
    }

    /**
     * Sets the value of the redShippingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedShippingInfo }
     *     
     */
    public void setRedShippingInfo(RedShippingInfo value) {
        this.redShippingInfo = value;
    }

    /**
     * Gets the value of the redBillingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RedBillingInfo }
     *     
     */
    public RedBillingInfo getRedBillingInfo() {
        return redBillingInfo;
    }

    /**
     * Sets the value of the redBillingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedBillingInfo }
     *     
     */
    public void setRedBillingInfo(RedBillingInfo value) {
        this.redBillingInfo = value;
    }

    /**
     * Gets the value of the redCustomerData property.
     * 
     * @return
     *     possible object is
     *     {@link RedCustomerData }
     *     
     */
    public RedCustomerData getRedCustomerData() {
        return redCustomerData;
    }

    /**
     * Sets the value of the redCustomerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedCustomerData }
     *     
     */
    public void setRedCustomerData(RedCustomerData value) {
        this.redCustomerData = value;
    }

    /**
     * Gets the value of the redCustomInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RedCustomInfo }
     *     
     */
    public RedCustomInfo getRedCustomInfo() {
        return redCustomInfo;
    }

    /**
     * Sets the value of the redCustomInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedCustomInfo }
     *     
     */
    public void setRedCustomInfo(RedCustomInfo value) {
        this.redCustomInfo = value;
    }

    /**
     * Gets the value of the redItems property.
     * 
     * @return
     *     possible object is
     *     {@link RedItems }
     *     
     */
    public RedItems getRedItems() {
        return redItems;
    }

    /**
     * Sets the value of the redItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedItems }
     *     
     */
    public void setRedItems(RedItems value) {
        this.redItems = value;
    }

    /**
     * Gets the value of the applePay property.
     * 
     * @return
     *     possible object is
     *     {@link ApplePayRequest }
     *     
     */
    public ApplePayRequest getApplePay() {
        return applePay;
    }

    /**
     * Sets the value of the applePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplePayRequest }
     *     
     */
    public void setApplePay(ApplePayRequest value) {
        this.applePay = value;
    }

    /**
     * Gets the value of the cardReaderPayments property.
     * 
     * @return
     *     possible object is
     *     {@link CardReaderPayments }
     *     
     */
    public CardReaderPayments getCardReaderPayments() {
        return cardReaderPayments;
    }

    /**
     * Sets the value of the cardReaderPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardReaderPayments }
     *     
     */
    public void setCardReaderPayments(CardReaderPayments value) {
        this.cardReaderPayments = value;
    }

    /**
     * Gets the value of the orderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EcommGestpayPaymentDetails }
     *     
     */
    public EcommGestpayPaymentDetails getOrderDetails() {
        return orderDetails;
    }

    /**
     * Sets the value of the orderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcommGestpayPaymentDetails }
     *     
     */
    public void setOrderDetails(EcommGestpayPaymentDetails value) {
        this.orderDetails = value;
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

}
