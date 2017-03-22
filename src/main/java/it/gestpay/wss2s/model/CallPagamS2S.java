
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
 *         &lt;element name="shippingDetails" type="{https://ecomms2s.sella.it/}ShippingDetails" minOccurs="0"/>
 *         &lt;element name="redFraudPrevention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Red_CustomerInfo" type="{https://ecomms2s.sella.it/}RedCustomerInfo" minOccurs="0"/>
 *         &lt;element name="Red_ShippingInfo" type="{https://ecomms2s.sella.it/}RedShippingInfo" minOccurs="0"/>
 *         &lt;element name="Red_BillingInfo" type="{https://ecomms2s.sella.it/}RedBillingInfo" minOccurs="0"/>
 *         &lt;element name="Red_CustomerData" type="{https://ecomms2s.sella.it/}RedCustomerData" minOccurs="0"/>
 *         &lt;element name="Red_CustomInfo" type="{https://ecomms2s.sella.it/}RedCustomInfo" minOccurs="0"/>
 *         &lt;element name="Red_Items" type="{https://ecomms2s.sella.it/}RedItems" minOccurs="0"/>
 *         &lt;element name="applePay" type="{https://ecomms2s.sella.it/}ApplePayRequest"/>
 *         &lt;element name="OrderDetails" type="{https://ecomms2s.sella.it/}EcommGestpayPaymentDetails" minOccurs="0"/>
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
    "shippingDetails",
    "redFraudPrevention",
    "redCustomerInfo",
    "redShippingInfo",
    "redBillingInfo",
    "redCustomerData",
    "redCustomInfo",
    "redItems",
    "applePay",
    "orderDetails"
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
    @XmlElement(name = "OrderDetails")
    protected EcommGestpayPaymentDetails orderDetails;

    /**
     * Recupera il valore della proprietà shopLogin.
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
     * Imposta il valore della proprietà shopLogin.
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
     * Recupera il valore della proprietà uicCode.
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
     * Imposta il valore della proprietà uicCode.
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
     * Recupera il valore della proprietà amount.
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
     * Imposta il valore della proprietà amount.
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
     * Recupera il valore della proprietà shopTransactionId.
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
     * Imposta il valore della proprietà shopTransactionId.
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
     * Recupera il valore della proprietà cardNumber.
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
     * Imposta il valore della proprietà cardNumber.
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
     * Recupera il valore della proprietà expiryMonth.
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
     * Imposta il valore della proprietà expiryMonth.
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
     * Recupera il valore della proprietà expiryYear.
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
     * Imposta il valore della proprietà expiryYear.
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
     * Recupera il valore della proprietà buyerName.
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
     * Imposta il valore della proprietà buyerName.
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
     * Recupera il valore della proprietà buyerEmail.
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
     * Imposta il valore della proprietà buyerEmail.
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
     * Recupera il valore della proprietà languageId.
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
     * Imposta il valore della proprietà languageId.
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
     * Recupera il valore della proprietà cvv.
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
     * Imposta il valore della proprietà cvv.
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
     * Recupera il valore della proprietà min.
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
     * Imposta il valore della proprietà min.
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
     * Recupera il valore della proprietà transKey.
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
     * Imposta il valore della proprietà transKey.
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
     * Recupera il valore della proprietà paRes.
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
     * Imposta il valore della proprietà paRes.
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
     * Recupera il valore della proprietà customInfo.
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
     * Imposta il valore della proprietà customInfo.
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
     * Recupera il valore della proprietà idea.
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
     * Imposta il valore della proprietà idea.
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
     * Recupera il valore della proprietà requestToken.
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
     * Imposta il valore della proprietà requestToken.
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
     * Recupera il valore della proprietà tokenValue.
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
     * Imposta il valore della proprietà tokenValue.
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
     * Recupera il valore della proprietà clientIP.
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
     * Imposta il valore della proprietà clientIP.
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
     * Recupera il valore della proprietà itemType.
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
     * Imposta il valore della proprietà itemType.
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
     * Recupera il valore della proprietà recurrent.
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
     * Imposta il valore della proprietà recurrent.
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
     * Recupera il valore della proprietà shippingDetails.
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
     * Imposta il valore della proprietà shippingDetails.
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
     * Recupera il valore della proprietà redFraudPrevention.
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
     * Imposta il valore della proprietà redFraudPrevention.
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
     * Recupera il valore della proprietà redCustomerInfo.
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
     * Imposta il valore della proprietà redCustomerInfo.
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
     * Recupera il valore della proprietà redShippingInfo.
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
     * Imposta il valore della proprietà redShippingInfo.
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
     * Recupera il valore della proprietà redBillingInfo.
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
     * Imposta il valore della proprietà redBillingInfo.
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
     * Recupera il valore della proprietà redCustomerData.
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
     * Imposta il valore della proprietà redCustomerData.
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
     * Recupera il valore della proprietà redCustomInfo.
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
     * Imposta il valore della proprietà redCustomInfo.
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
     * Recupera il valore della proprietà redItems.
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
     * Imposta il valore della proprietà redItems.
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
     * Recupera il valore della proprietà applePay.
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
     * Imposta il valore della proprietà applePay.
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
     * Recupera il valore della proprietà orderDetails.
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
     * Imposta il valore della proprietà orderDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link EcommGestpayPaymentDetails }
     *     
     */
    public void setOrderDetails(EcommGestpayPaymentDetails value) {
        this.orderDetails = value;
    }

}
