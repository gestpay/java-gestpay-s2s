
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
 *         &lt;element name="shopTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "shopTransactionId",
    "bankTransactionId",
    "orderDetails"
})
@XmlRootElement(name = "CallUpdateOrderS2S")
public class CallUpdateOrderS2S {

    protected String shopLogin;
    protected String shopTransactionId;
    protected String bankTransactionId;
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
