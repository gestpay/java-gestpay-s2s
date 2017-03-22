
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
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="withAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cardNumber",
    "expMonth",
    "expYear",
    "cvv2",
    "withAuth",
    "tokenValue"
})
@XmlRootElement(name = "callCheckCartaS2S")
public class CallCheckCartaS2S {

    protected String shopLogin;
    protected String shopTransactionId;
    protected String cardNumber;
    protected String expMonth;
    protected String expYear;
    @XmlElement(name = "CVV2")
    protected String cvv2;
    protected String withAuth;
    protected String tokenValue;

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
     * Recupera il valore della proprietà expMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Imposta il valore della proprietà expMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpMonth(String value) {
        this.expMonth = value;
    }

    /**
     * Recupera il valore della proprietà expYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpYear() {
        return expYear;
    }

    /**
     * Imposta il valore della proprietà expYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpYear(String value) {
        this.expYear = value;
    }

    /**
     * Recupera il valore della proprietà cvv2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV2() {
        return cvv2;
    }

    /**
     * Imposta il valore della proprietà cvv2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV2(String value) {
        this.cvv2 = value;
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

}
