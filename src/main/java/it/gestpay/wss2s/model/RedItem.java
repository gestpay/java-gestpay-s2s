
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item_ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_StockKeepingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_UnitCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_TotalCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_ShippingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_PartEAN_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_ShippingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedItem", propOrder = {
    "itemProductCode",
    "itemStockKeepingUnit",
    "itemDescription",
    "itemQuantity",
    "itemUnitCost",
    "itemTotalCost",
    "itemShippingNumber",
    "itemGiftMessage",
    "itemPartEANNumber",
    "itemShippingComments"
})
public class RedItem {

    @XmlElement(name = "Item_ProductCode")
    protected String itemProductCode;
    @XmlElement(name = "Item_StockKeepingUnit")
    protected String itemStockKeepingUnit;
    @XmlElement(name = "Item_Description")
    protected String itemDescription;
    @XmlElement(name = "Item_Quantity")
    protected String itemQuantity;
    @XmlElement(name = "Item_UnitCost")
    protected String itemUnitCost;
    @XmlElement(name = "Item_TotalCost")
    protected String itemTotalCost;
    @XmlElement(name = "Item_ShippingNumber")
    protected String itemShippingNumber;
    @XmlElement(name = "Item_GiftMessage")
    protected String itemGiftMessage;
    @XmlElement(name = "Item_PartEAN_Number")
    protected String itemPartEANNumber;
    @XmlElement(name = "Item_ShippingComments")
    protected String itemShippingComments;

    /**
     * Gets the value of the itemProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemProductCode() {
        return itemProductCode;
    }

    /**
     * Sets the value of the itemProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemProductCode(String value) {
        this.itemProductCode = value;
    }

    /**
     * Gets the value of the itemStockKeepingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemStockKeepingUnit() {
        return itemStockKeepingUnit;
    }

    /**
     * Sets the value of the itemStockKeepingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemStockKeepingUnit(String value) {
        this.itemStockKeepingUnit = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the itemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemQuantity(String value) {
        this.itemQuantity = value;
    }

    /**
     * Gets the value of the itemUnitCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemUnitCost() {
        return itemUnitCost;
    }

    /**
     * Sets the value of the itemUnitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemUnitCost(String value) {
        this.itemUnitCost = value;
    }

    /**
     * Gets the value of the itemTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTotalCost() {
        return itemTotalCost;
    }

    /**
     * Sets the value of the itemTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTotalCost(String value) {
        this.itemTotalCost = value;
    }

    /**
     * Gets the value of the itemShippingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemShippingNumber() {
        return itemShippingNumber;
    }

    /**
     * Sets the value of the itemShippingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemShippingNumber(String value) {
        this.itemShippingNumber = value;
    }

    /**
     * Gets the value of the itemGiftMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGiftMessage() {
        return itemGiftMessage;
    }

    /**
     * Sets the value of the itemGiftMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGiftMessage(String value) {
        this.itemGiftMessage = value;
    }

    /**
     * Gets the value of the itemPartEANNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPartEANNumber() {
        return itemPartEANNumber;
    }

    /**
     * Sets the value of the itemPartEANNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPartEANNumber(String value) {
        this.itemPartEANNumber = value;
    }

    /**
     * Gets the value of the itemShippingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemShippingComments() {
        return itemShippingComments;
    }

    /**
     * Sets the value of the itemShippingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemShippingComments(String value) {
        this.itemShippingComments = value;
    }

}
