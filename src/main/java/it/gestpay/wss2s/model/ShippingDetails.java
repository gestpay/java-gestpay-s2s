
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ShippingDetails complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ShippingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDetails", propOrder = {
    "shipToName",
    "shipToStreet",
    "shipToCity",
    "shipToState",
    "shipToCountryCode",
    "shipToZip",
    "shipToStreet2"
})
public class ShippingDetails {

    protected String shipToName;
    protected String shipToStreet;
    protected String shipToCity;
    protected String shipToState;
    protected String shipToCountryCode;
    protected String shipToZip;
    protected String shipToStreet2;

    /**
     * Recupera il valore della proprietà shipToName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToName() {
        return shipToName;
    }

    /**
     * Imposta il valore della proprietà shipToName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToName(String value) {
        this.shipToName = value;
    }

    /**
     * Recupera il valore della proprietà shipToStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToStreet() {
        return shipToStreet;
    }

    /**
     * Imposta il valore della proprietà shipToStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToStreet(String value) {
        this.shipToStreet = value;
    }

    /**
     * Recupera il valore della proprietà shipToCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Imposta il valore della proprietà shipToCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Recupera il valore della proprietà shipToState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Imposta il valore della proprietà shipToState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Recupera il valore della proprietà shipToCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    /**
     * Imposta il valore della proprietà shipToCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountryCode(String value) {
        this.shipToCountryCode = value;
    }

    /**
     * Recupera il valore della proprietà shipToZip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip() {
        return shipToZip;
    }

    /**
     * Imposta il valore della proprietà shipToZip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip(String value) {
        this.shipToZip = value;
    }

    /**
     * Recupera il valore della proprietà shipToStreet2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToStreet2() {
        return shipToStreet2;
    }

    /**
     * Imposta il valore della proprietà shipToStreet2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToStreet2(String value) {
        this.shipToStreet2 = value;
    }

}
