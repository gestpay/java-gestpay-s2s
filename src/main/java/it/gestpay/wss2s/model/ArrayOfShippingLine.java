
package it.gestpay.wss2s.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfShippingLine complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShippingLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingLine" type="{https://ecomms2s.sella.it/}ShippingLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShippingLine", propOrder = {
    "shippingLine"
})
public class ArrayOfShippingLine {

    @XmlElement(name = "ShippingLine", nillable = true)
    protected List<ShippingLine> shippingLine;

    /**
     * Gets the value of the shippingLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingLine }
     * 
     * 
     */
    public List<ShippingLine> getShippingLine() {
        if (shippingLine == null) {
            shippingLine = new ArrayList<ShippingLine>();
        }
        return this.shippingLine;
    }

}
