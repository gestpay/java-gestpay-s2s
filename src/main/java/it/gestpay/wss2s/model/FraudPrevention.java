
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudPrevention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudPrevention">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubmitForReview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmissionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeaconSessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudPrevention", propOrder = {
    "submitForReview",
    "orderDateTime",
    "orderNote",
    "source",
    "submissionReason",
    "beaconSessionID",
    "vendorID",
    "vendorName"
})
public class FraudPrevention {

    @XmlElement(name = "SubmitForReview")
    protected String submitForReview;
    @XmlElement(name = "OrderDateTime")
    protected String orderDateTime;
    @XmlElement(name = "OrderNote")
    protected String orderNote;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "SubmissionReason")
    protected String submissionReason;
    @XmlElement(name = "BeaconSessionID")
    protected String beaconSessionID;
    @XmlElement(name = "VendorID")
    protected String vendorID;
    @XmlElement(name = "VendorName")
    protected String vendorName;

    /**
     * Gets the value of the submitForReview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitForReview() {
        return submitForReview;
    }

    /**
     * Sets the value of the submitForReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitForReview(String value) {
        this.submitForReview = value;
    }

    /**
     * Gets the value of the orderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDateTime() {
        return orderDateTime;
    }

    /**
     * Sets the value of the orderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDateTime(String value) {
        this.orderDateTime = value;
    }

    /**
     * Gets the value of the orderNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNote() {
        return orderNote;
    }

    /**
     * Sets the value of the orderNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNote(String value) {
        this.orderNote = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the submissionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionReason() {
        return submissionReason;
    }

    /**
     * Sets the value of the submissionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionReason(String value) {
        this.submissionReason = value;
    }

    /**
     * Gets the value of the beaconSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeaconSessionID() {
        return beaconSessionID;
    }

    /**
     * Sets the value of the beaconSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeaconSessionID(String value) {
        this.beaconSessionID = value;
    }

    /**
     * Gets the value of the vendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorID(String value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

}
