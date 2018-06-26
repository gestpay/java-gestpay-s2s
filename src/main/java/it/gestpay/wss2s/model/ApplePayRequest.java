
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplePayRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the applePayPKPaymentToken property.
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
     * Sets the value of the applePayPKPaymentToken property.
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
     * Gets the value of the onlinePaymentCryptogram property.
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
     * Sets the value of the onlinePaymentCryptogram property.
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
     * Gets the value of the eciIndicator property.
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
     * Sets the value of the eciIndicator property.
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
