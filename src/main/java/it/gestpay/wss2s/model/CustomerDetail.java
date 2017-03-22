
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CustomerDetail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SocialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedAtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerifiedEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Social" type="{https://ecomms2s.sella.it/}CustomerSocial" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDetail", propOrder = {
    "profileID",
    "merchantCustomerID",
    "firstName",
    "middleName",
    "lastname",
    "primaryEmail",
    "secondaryEmail",
    "primaryPhone",
    "secondaryPhone",
    "dateOfBirth",
    "gender",
    "socialSecurityNumber",
    "company",
    "createdAtDate",
    "verifiedEmail",
    "accountType",
    "social"
})
public class CustomerDetail {

    @XmlElement(name = "ProfileID")
    protected String profileID;
    @XmlElement(name = "MerchantCustomerID")
    protected String merchantCustomerID;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Lastname")
    protected String lastname;
    @XmlElement(name = "PrimaryEmail")
    protected String primaryEmail;
    @XmlElement(name = "SecondaryEmail")
    protected String secondaryEmail;
    @XmlElement(name = "PrimaryPhone")
    protected String primaryPhone;
    @XmlElement(name = "SecondaryPhone")
    protected String secondaryPhone;
    @XmlElement(name = "DateOfBirth")
    protected String dateOfBirth;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "SocialSecurityNumber")
    protected String socialSecurityNumber;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "CreatedAtDate")
    protected String createdAtDate;
    @XmlElement(name = "VerifiedEmail")
    protected String verifiedEmail;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "Social")
    protected CustomerSocial social;

    /**
     * Recupera il valore della proprietà profileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Imposta il valore della proprietà profileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Recupera il valore della proprietà merchantCustomerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCustomerID() {
        return merchantCustomerID;
    }

    /**
     * Imposta il valore della proprietà merchantCustomerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCustomerID(String value) {
        this.merchantCustomerID = value;
    }

    /**
     * Recupera il valore della proprietà firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Imposta il valore della proprietà firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Recupera il valore della proprietà middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Imposta il valore della proprietà middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Recupera il valore della proprietà lastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Imposta il valore della proprietà lastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Recupera il valore della proprietà primaryEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEmail() {
        return primaryEmail;
    }

    /**
     * Imposta il valore della proprietà primaryEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEmail(String value) {
        this.primaryEmail = value;
    }

    /**
     * Recupera il valore della proprietà secondaryEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    /**
     * Imposta il valore della proprietà secondaryEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryEmail(String value) {
        this.secondaryEmail = value;
    }

    /**
     * Recupera il valore della proprietà primaryPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Imposta il valore della proprietà primaryPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhone(String value) {
        this.primaryPhone = value;
    }

    /**
     * Recupera il valore della proprietà secondaryPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    /**
     * Imposta il valore della proprietà secondaryPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryPhone(String value) {
        this.secondaryPhone = value;
    }

    /**
     * Recupera il valore della proprietà dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Imposta il valore della proprietà dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Recupera il valore della proprietà gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Imposta il valore della proprietà gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Recupera il valore della proprietà socialSecurityNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Imposta il valore della proprietà socialSecurityNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà createdAtDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedAtDate() {
        return createdAtDate;
    }

    /**
     * Imposta il valore della proprietà createdAtDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAtDate(String value) {
        this.createdAtDate = value;
    }

    /**
     * Recupera il valore della proprietà verifiedEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifiedEmail() {
        return verifiedEmail;
    }

    /**
     * Imposta il valore della proprietà verifiedEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifiedEmail(String value) {
        this.verifiedEmail = value;
    }

    /**
     * Recupera il valore della proprietà accountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Imposta il valore della proprietà accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Recupera il valore della proprietà social.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSocial }
     *     
     */
    public CustomerSocial getSocial() {
        return social;
    }

    /**
     * Imposta il valore della proprietà social.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSocial }
     *     
     */
    public void setSocial(CustomerSocial value) {
        this.social = value;
    }

}
