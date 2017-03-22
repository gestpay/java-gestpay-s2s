
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
 *         &lt;element name="shopTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullFillment" type="{https://ecomms2s.sella.it/}FullFillmentDetails" minOccurs="0"/>
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
    "fullFillment"
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
     * Recupera il valore della proprietà shopTransID.
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
     * Imposta il valore della proprietà shopTransID.
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
     * Recupera il valore della proprietà bankTransID.
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
     * Imposta il valore della proprietà bankTransID.
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
     * Recupera il valore della proprietà fullFillment.
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
     * Imposta il valore della proprietà fullFillment.
     * 
     * @param value
     *     allowed object is
     *     {@link FullFillmentDetails }
     *     
     */
    public void setFullFillment(FullFillmentDetails value) {
        this.fullFillment = value;
    }

}
