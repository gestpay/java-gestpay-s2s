
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="withAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "requestToken",
    "cardNumber",
    "expiryMonth",
    "expiryYear",
    "cvv",
    "withAuth"
})
@XmlRootElement(name = "CallRequestTokenS2S")
public class CallRequestTokenS2S {

    protected String shopLogin;
    protected String requestToken;
    protected String cardNumber;
    protected String expiryMonth;
    protected String expiryYear;
    protected String cvv;
    protected String withAuth;

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
     * Recupera il valore della proprietà withAuth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithAuth() {
        return withAuth;
    }

    /**
     * Imposta il valore della proprietà withAuth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithAuth(String value) {
        this.withAuth = value;
    }

}
