
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ProductDetail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProductDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequiresShipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetail", propOrder = {
    "productCode",
    "sku",
    "name",
    "description",
    "quantity",
    "price",
    "unitPrice",
    "type",
    "vat",
    "discount",
    "requiresShipping",
    "condition",
    "seller",
    "category",
    "subCategory",
    "brand",
    "deliveryAt"
})
public class ProductDetail {

    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "Price")
    protected String price;
    @XmlElement(name = "UnitPrice")
    protected String unitPrice;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Vat")
    protected String vat;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "RequiresShipping")
    protected String requiresShipping;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "Seller")
    protected String seller;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "SubCategory")
    protected String subCategory;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "DeliveryAt")
    protected String deliveryAt;

    /**
     * Recupera il valore della proprietà productCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Imposta il valore della proprietà productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Recupera il valore della proprietà sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Imposta il valore della proprietà sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà quantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Imposta il valore della proprietà quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Recupera il valore della proprietà price.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Imposta il valore della proprietà price.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Recupera il valore della proprietà unitPrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Imposta il valore della proprietà unitPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà vat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVat() {
        return vat;
    }

    /**
     * Imposta il valore della proprietà vat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVat(String value) {
        this.vat = value;
    }

    /**
     * Recupera il valore della proprietà discount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Imposta il valore della proprietà discount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Recupera il valore della proprietà requiresShipping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiresShipping() {
        return requiresShipping;
    }

    /**
     * Imposta il valore della proprietà requiresShipping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiresShipping(String value) {
        this.requiresShipping = value;
    }

    /**
     * Recupera il valore della proprietà condition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Imposta il valore della proprietà condition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Recupera il valore della proprietà seller.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeller() {
        return seller;
    }

    /**
     * Imposta il valore della proprietà seller.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeller(String value) {
        this.seller = value;
    }

    /**
     * Recupera il valore della proprietà category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Imposta il valore della proprietà category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Recupera il valore della proprietà subCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * Imposta il valore della proprietà subCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategory(String value) {
        this.subCategory = value;
    }

    /**
     * Recupera il valore della proprietà brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Imposta il valore della proprietà brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Recupera il valore della proprietà deliveryAt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAt() {
        return deliveryAt;
    }

    /**
     * Imposta il valore della proprietà deliveryAt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAt(String value) {
        this.deliveryAt = value;
    }

}
