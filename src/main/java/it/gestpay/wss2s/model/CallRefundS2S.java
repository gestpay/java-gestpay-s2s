
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
 *         &lt;element name="bankTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDetail" type="{https://ecomms2s.sella.it/}RefundProductDetail"/>
 *         &lt;element name="RefundReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeBackFraud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "chargeBackFraud"
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
     * Recupera il valore della proprietà bankTransactionId.
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
     * Imposta il valore della proprietà bankTransactionId.
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
     * Recupera il valore della proprietà orderDetail.
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
     * Imposta il valore della proprietà orderDetail.
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
     * Recupera il valore della proprietà refundReason.
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
     * Imposta il valore della proprietà refundReason.
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
     * Recupera il valore della proprietà chargeBackFraud.
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
     * Imposta il valore della proprietà chargeBackFraud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeBackFraud(String value) {
        this.chargeBackFraud = value;
    }

}
