
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RedItem complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà itemProductCode.
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
     * Imposta il valore della proprietà itemProductCode.
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
     * Recupera il valore della proprietà itemStockKeepingUnit.
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
     * Imposta il valore della proprietà itemStockKeepingUnit.
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
     * Recupera il valore della proprietà itemDescription.
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
     * Imposta il valore della proprietà itemDescription.
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
     * Recupera il valore della proprietà itemQuantity.
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
     * Imposta il valore della proprietà itemQuantity.
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
     * Recupera il valore della proprietà itemUnitCost.
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
     * Imposta il valore della proprietà itemUnitCost.
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
     * Recupera il valore della proprietà itemTotalCost.
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
     * Imposta il valore della proprietà itemTotalCost.
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
     * Recupera il valore della proprietà itemShippingNumber.
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
     * Imposta il valore della proprietà itemShippingNumber.
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
     * Recupera il valore della proprietà itemGiftMessage.
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
     * Imposta il valore della proprietà itemGiftMessage.
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
     * Recupera il valore della proprietà itemPartEANNumber.
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
     * Imposta il valore della proprietà itemPartEANNumber.
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
     * Recupera il valore della proprietà itemShippingComments.
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
     * Imposta il valore della proprietà itemShippingComments.
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
