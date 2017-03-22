
package it.gestpay.wss2s.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FullfillmentDetail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FullfillmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDetails" type="{https://ecomms2s.sella.it/}ProductDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrackingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingUrls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Receipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullfillmentDetail", propOrder = {
    "status",
    "productDetails",
    "trackingCompany",
    "trackingNumbers",
    "trackingUrls",
    "message",
    "receipt"
})
public class FullfillmentDetail {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ProductDetails")
    protected List<ProductDetail> productDetails;
    @XmlElement(name = "TrackingCompany")
    protected String trackingCompany;
    @XmlElement(name = "TrackingNumbers")
    protected String trackingNumbers;
    @XmlElement(name = "TrackingUrls")
    protected String trackingUrls;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Receipt")
    protected String receipt;

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDetail }
     * 
     * 
     */
    public List<ProductDetail> getProductDetails() {
        if (productDetails == null) {
            productDetails = new ArrayList<ProductDetail>();
        }
        return this.productDetails;
    }

    /**
     * Recupera il valore della proprietà trackingCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingCompany() {
        return trackingCompany;
    }

    /**
     * Imposta il valore della proprietà trackingCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingCompany(String value) {
        this.trackingCompany = value;
    }

    /**
     * Recupera il valore della proprietà trackingNumbers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumbers() {
        return trackingNumbers;
    }

    /**
     * Imposta il valore della proprietà trackingNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumbers(String value) {
        this.trackingNumbers = value;
    }

    /**
     * Recupera il valore della proprietà trackingUrls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrls() {
        return trackingUrls;
    }

    /**
     * Imposta il valore della proprietà trackingUrls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrls(String value) {
        this.trackingUrls = value;
    }

    /**
     * Recupera il valore della proprietà message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Imposta il valore della proprietà message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Recupera il valore della proprietà receipt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * Imposta il valore della proprietà receipt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceipt(String value) {
        this.receipt = value;
    }

}
