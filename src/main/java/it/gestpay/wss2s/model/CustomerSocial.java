
package it.gestpay.wss2s.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CustomerSocial complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà network.
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
     * Imposta il valore della proprietà network.
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
     * Recupera il valore della proprietà publicUsername.
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
     * Imposta il valore della proprietà publicUsername.
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
     * Recupera il valore della proprietà communityScore.
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
     * Imposta il valore della proprietà communityScore.
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
     * Recupera il valore della proprietà profilePicture.
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
     * Imposta il valore della proprietà profilePicture.
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
     * Recupera il valore della proprietà email.
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
     * Imposta il valore della proprietà email.
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
     * Recupera il valore della proprietà bio.
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
     * Imposta il valore della proprietà bio.
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
     * Recupera il valore della proprietà accountUrl.
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
     * Imposta il valore della proprietà accountUrl.
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
     * Recupera il valore della proprietà following.
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
     * Imposta il valore della proprietà following.
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
     * Recupera il valore della proprietà followed.
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
     * Imposta il valore della proprietà followed.
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
     * Recupera il valore della proprietà posts.
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
     * Imposta il valore della proprietà posts.
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
     * Recupera il valore della proprietà id.
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
     * Imposta il valore della proprietà id.
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
     * Recupera il valore della proprietà authToken.
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
     * Imposta il valore della proprietà authToken.
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
     * Recupera il valore della proprietà socialData.
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
     * Imposta il valore della proprietà socialData.
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
