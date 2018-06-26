
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullFillmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullFillmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullFillmentlst" type="{https://ecomms2s.sella.it/}ArrayOfFullfillmentDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullFillmentDetails", propOrder = {
    "fullFillmentlst"
})
public class FullFillmentDetails {

    @XmlElement(name = "FullFillmentlst")
    protected ArrayOfFullfillmentDetail fullFillmentlst;

    /**
     * Gets the value of the fullFillmentlst property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFullfillmentDetail }
     *     
     */
    public ArrayOfFullfillmentDetail getFullFillmentlst() {
        return fullFillmentlst;
    }

    /**
     * Sets the value of the fullFillmentlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFullfillmentDetail }
     *     
     */
    public void setFullFillmentlst(ArrayOfFullfillmentDetail value) {
        this.fullFillmentlst = value;
    }

}
