
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EcommGestpayPaymentDetails complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EcommGestpayPaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FraudPrevention" type="{https://ecomms2s.sella.it/}FraudPrevention" minOccurs="0"/>
 *         &lt;element name="CustomerDetail" type="{https://ecomms2s.sella.it/}CustomerDetail" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{https://ecomms2s.sella.it/}ShippingAddress" minOccurs="0"/>
 *         &lt;element name="BillingAddress" type="{https://ecomms2s.sella.it/}BillingAddress" minOccurs="0"/>
 *         &lt;element name="ProductDetails" type="{https://ecomms2s.sella.it/}ArrayOfProductDetail" minOccurs="0"/>
 *         &lt;element name="DiscountCodes" type="{https://ecomms2s.sella.it/}ArrayOfDiscountCode" minOccurs="0"/>
 *         &lt;element name="ShippingLines" type="{https://ecomms2s.sella.it/}ArrayOfShippingLine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcommGestpayPaymentDetails", propOrder = {
    "fraudPrevention",
    "customerDetail",
    "shippingAddress",
    "billingAddress",
    "productDetails",
    "discountCodes",
    "shippingLines"
})
public class EcommGestpayPaymentDetails {

    @XmlElement(name = "FraudPrevention")
    protected FraudPrevention fraudPrevention;
    @XmlElement(name = "CustomerDetail")
    protected CustomerDetail customerDetail;
    @XmlElement(name = "ShippingAddress")
    protected ShippingAddress shippingAddress;
    @XmlElement(name = "BillingAddress")
    protected BillingAddress billingAddress;
    @XmlElement(name = "ProductDetails")
    protected ArrayOfProductDetail productDetails;
    @XmlElement(name = "DiscountCodes")
    protected ArrayOfDiscountCode discountCodes;
    @XmlElement(name = "ShippingLines")
    protected ArrayOfShippingLine shippingLines;

    /**
     * Recupera il valore della proprietà fraudPrevention.
     * 
     * @return
     *     possible object is
     *     {@link FraudPrevention }
     *     
     */
    public FraudPrevention getFraudPrevention() {
        return fraudPrevention;
    }

    /**
     * Imposta il valore della proprietà fraudPrevention.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPrevention }
     *     
     */
    public void setFraudPrevention(FraudPrevention value) {
        this.fraudPrevention = value;
    }

    /**
     * Recupera il valore della proprietà customerDetail.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetail }
     *     
     */
    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    /**
     * Imposta il valore della proprietà customerDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetail }
     *     
     */
    public void setCustomerDetail(CustomerDetail value) {
        this.customerDetail = value;
    }

    /**
     * Recupera il valore della proprietà shippingAddress.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddress }
     *     
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Imposta il valore della proprietà shippingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddress }
     *     
     */
    public void setShippingAddress(ShippingAddress value) {
        this.shippingAddress = value;
    }

    /**
     * Recupera il valore della proprietà billingAddress.
     * 
     * @return
     *     possible object is
     *     {@link BillingAddress }
     *     
     */
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Imposta il valore della proprietà billingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAddress }
     *     
     */
    public void setBillingAddress(BillingAddress value) {
        this.billingAddress = value;
    }

    /**
     * Recupera il valore della proprietà productDetails.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductDetail }
     *     
     */
    public ArrayOfProductDetail getProductDetails() {
        return productDetails;
    }

    /**
     * Imposta il valore della proprietà productDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductDetail }
     *     
     */
    public void setProductDetails(ArrayOfProductDetail value) {
        this.productDetails = value;
    }

    /**
     * Recupera il valore della proprietà discountCodes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiscountCode }
     *     
     */
    public ArrayOfDiscountCode getDiscountCodes() {
        return discountCodes;
    }

    /**
     * Imposta il valore della proprietà discountCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiscountCode }
     *     
     */
    public void setDiscountCodes(ArrayOfDiscountCode value) {
        this.discountCodes = value;
    }

    /**
     * Recupera il valore della proprietà shippingLines.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShippingLine }
     *     
     */
    public ArrayOfShippingLine getShippingLines() {
        return shippingLines;
    }

    /**
     * Imposta il valore della proprietà shippingLines.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShippingLine }
     *     
     */
    public void setShippingLines(ArrayOfShippingLine value) {
        this.shippingLines = value;
    }

}
