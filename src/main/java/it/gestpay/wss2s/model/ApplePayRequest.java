
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ApplePayRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ApplePayRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applePayPKPaymentToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onlinePaymentCryptogram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eciIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplePayRequest", propOrder = {
    "applePayPKPaymentToken",
    "onlinePaymentCryptogram",
    "eciIndicator"
})
public class ApplePayRequest {

    protected String applePayPKPaymentToken;
    protected String onlinePaymentCryptogram;
    protected String eciIndicator;

    /**
     * Recupera il valore della proprietà applePayPKPaymentToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplePayPKPaymentToken() {
        return applePayPKPaymentToken;
    }

    /**
     * Imposta il valore della proprietà applePayPKPaymentToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplePayPKPaymentToken(String value) {
        this.applePayPKPaymentToken = value;
    }

    /**
     * Recupera il valore della proprietà onlinePaymentCryptogram.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlinePaymentCryptogram() {
        return onlinePaymentCryptogram;
    }

    /**
     * Imposta il valore della proprietà onlinePaymentCryptogram.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlinePaymentCryptogram(String value) {
        this.onlinePaymentCryptogram = value;
    }

    /**
     * Recupera il valore della proprietà eciIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciIndicator() {
        return eciIndicator;
    }

    /**
     * Imposta il valore della proprietà eciIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciIndicator(String value) {
        this.eciIndicator = value;
    }

}
