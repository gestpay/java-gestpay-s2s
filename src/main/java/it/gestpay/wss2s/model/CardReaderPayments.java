
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardReaderPayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardReaderPayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceProvidedInfo" type="{https://ecomms2s.sella.it/}DeviceProvidedInfo" minOccurs="0"/>
 *         &lt;element name="buyerSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardReaderPayments", propOrder = {
    "deviceName",
    "deviceProvidedInfo",
    "buyerSignature"
})
public class CardReaderPayments {

    protected String deviceName;
    protected DeviceProvidedInfo deviceProvidedInfo;
    protected String buyerSignature;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceProvidedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceProvidedInfo }
     *     
     */
    public DeviceProvidedInfo getDeviceProvidedInfo() {
        return deviceProvidedInfo;
    }

    /**
     * Sets the value of the deviceProvidedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceProvidedInfo }
     *     
     */
    public void setDeviceProvidedInfo(DeviceProvidedInfo value) {
        this.deviceProvidedInfo = value;
    }

    /**
     * Gets the value of the buyerSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerSignature() {
        return buyerSignature;
    }

    /**
     * Sets the value of the buyerSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerSignature(String value) {
        this.buyerSignature = value;
    }

}
