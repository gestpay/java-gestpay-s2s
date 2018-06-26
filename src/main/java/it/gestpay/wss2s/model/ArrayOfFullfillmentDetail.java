
package it.gestpay.wss2s.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFullfillmentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFullfillmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullfillmentDetail" type="{https://ecomms2s.sella.it/}FullfillmentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFullfillmentDetail", propOrder = {
    "fullfillmentDetail"
})
public class ArrayOfFullfillmentDetail {

    @XmlElement(name = "FullfillmentDetail", nillable = true)
    protected List<FullfillmentDetail> fullfillmentDetail;

    /**
     * Gets the value of the fullfillmentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullfillmentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullfillmentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullfillmentDetail }
     * 
     * 
     */
    public List<FullfillmentDetail> getFullfillmentDetail() {
        if (fullfillmentDetail == null) {
            fullfillmentDetail = new ArrayList<FullfillmentDetail>();
        }
        return this.fullfillmentDetail;
    }

}
