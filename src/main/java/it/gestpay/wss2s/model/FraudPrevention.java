
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FraudPrevention complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà submitForReview.
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
     * Imposta il valore della proprietà submitForReview.
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
     * Recupera il valore della proprietà orderDateTime.
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
     * Imposta il valore della proprietà orderDateTime.
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
     * Recupera il valore della proprietà orderNote.
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
     * Imposta il valore della proprietà orderNote.
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
     * Recupera il valore della proprietà source.
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
     * Imposta il valore della proprietà source.
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
     * Recupera il valore della proprietà submissionReason.
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
     * Imposta il valore della proprietà submissionReason.
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
     * Recupera il valore della proprietà beaconSessionID.
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
     * Imposta il valore della proprietà beaconSessionID.
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
     * Recupera il valore della proprietà vendorID.
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
     * Imposta il valore della proprietà vendorID.
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
     * Recupera il valore della proprietà vendorName.
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
     * Imposta il valore della proprietà vendorName.
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
