
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSocial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSocial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommunityScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfilePicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Following" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Followed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Posts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SocialData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSocial", propOrder = {
    "network",
    "publicUsername",
    "communityScore",
    "profilePicture",
    "email",
    "bio",
    "accountUrl",
    "following",
    "followed",
    "posts",
    "id",
    "authToken",
    "socialData"
})
public class CustomerSocial {

    @XmlElement(name = "Network")
    protected String network;
    @XmlElement(name = "PublicUsername")
    protected String publicUsername;
    @XmlElement(name = "CommunityScore")
    protected String communityScore;
    @XmlElement(name = "ProfilePicture")
    protected String profilePicture;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Bio")
    protected String bio;
    @XmlElement(name = "AccountUrl")
    protected String accountUrl;
    @XmlElement(name = "Following")
    protected String following;
    @XmlElement(name = "Followed")
    protected String followed;
    @XmlElement(name = "Posts")
    protected String posts;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AuthToken")
    protected String authToken;
    @XmlElement(name = "SocialData")
    protected String socialData;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Gets the value of the publicUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicUsername() {
        return publicUsername;
    }

    /**
     * Sets the value of the publicUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicUsername(String value) {
        this.publicUsername = value;
    }

    /**
     * Gets the value of the communityScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityScore() {
        return communityScore;
    }

    /**
     * Sets the value of the communityScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityScore(String value) {
        this.communityScore = value;
    }

    /**
     * Gets the value of the profilePicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilePicture() {
        return profilePicture;
    }

    /**
     * Sets the value of the profilePicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilePicture(String value) {
        this.profilePicture = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the bio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBio() {
        return bio;
    }

    /**
     * Sets the value of the bio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBio(String value) {
        this.bio = value;
    }

    /**
     * Gets the value of the accountUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUrl() {
        return accountUrl;
    }

    /**
     * Sets the value of the accountUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUrl(String value) {
        this.accountUrl = value;
    }

    /**
     * Gets the value of the following property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowing() {
        return following;
    }

    /**
     * Sets the value of the following property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowing(String value) {
        this.following = value;
    }

    /**
     * Gets the value of the followed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowed() {
        return followed;
    }

    /**
     * Sets the value of the followed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowed(String value) {
        this.followed = value;
    }

    /**
     * Gets the value of the posts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosts() {
        return posts;
    }

    /**
     * Sets the value of the posts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosts(String value) {
        this.posts = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the socialData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialData() {
        return socialData;
    }

    /**
     * Sets the value of the socialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialData(String value) {
        this.socialData = value;
    }

}
