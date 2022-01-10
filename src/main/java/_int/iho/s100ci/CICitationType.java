//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.20 at 12:23:53 PM BST 
//


package _int.iho.s100ci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * V. 4.0.0: removed collectiveTitle (not in 19115-1 / 19115-3); intentionally omitted the optional 19115-3 element "graphic" to reduce changes to feature catalogues and the FCB
 * 
 * <p>Java class for CI_Citation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Citation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alternateTitle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.iho.int/S100CI}Date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="editionDate" type="{http://www.iho.int/S100CI}dateExt" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://www.iho.int/S100CI}MD_Identifier_Type" minOccurs="0"/&gt;
 *         &lt;element name="citedResponsibleParty" type="{http://www.iho.int/S100CI}CI_Responsibility_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="presentationForm" type="{http://www.iho.int/S100CI}PresentationFormCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="series" type="{http://www.iho.int/S100CI}CI_Series_Type" minOccurs="0"/&gt;
 *         &lt;element name="otherCitationDetails" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="onlineResource" type="{http://www.iho.int/S100CI}CI_OnlineResource_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Citation_Type", propOrder = {
    "title",
    "alternateTitles",
    "dates",
    "edition",
    "editionDate",
    "identifier",
    "citedResponsibleParties",
    "presentationForms",
    "series",
    "otherCitationDetails",
    "isbn",
    "issn",
    "onlineResources"
})
public class CICitationType {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "alternateTitle")
    protected List<String> alternateTitles;
    @XmlElement(name = "date")
    protected List<Date> dates;
    protected String edition;
    protected DateExt editionDate;
    protected MDIdentifierType identifier;
    @XmlElement(name = "citedResponsibleParty")
    protected List<CIResponsibilityPropertyType> citedResponsibleParties;
    @XmlElement(name = "presentationForm")
    @XmlSchemaType(name = "string")
    protected List<PresentationFormCode> presentationForms;
    protected CISeriesType series;
    protected List<String> otherCitationDetails;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "ISSN")
    protected String issn;
    @XmlElement(name = "onlineResource")
    protected List<CIOnlineResourceType> onlineResources;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the alternateTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternateTitles() {
        if (alternateTitles == null) {
            alternateTitles = new ArrayList<String>();
        }
        return this.alternateTitles;
    }

    /**
     * Gets the value of the dates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Date }
     * 
     * 
     */
    public List<Date> getDates() {
        if (dates == null) {
            dates = new ArrayList<Date>();
        }
        return this.dates;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the editionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateExt }
     *     
     */
    public DateExt getEditionDate() {
        return editionDate;
    }

    /**
     * Sets the value of the editionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateExt }
     *     
     */
    public void setEditionDate(DateExt value) {
        this.editionDate = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierType }
     *     
     */
    public MDIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierType }
     *     
     */
    public void setIdentifier(MDIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the citedResponsibleParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citedResponsibleParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitedResponsibleParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsibilityPropertyType }
     * 
     * 
     */
    public List<CIResponsibilityPropertyType> getCitedResponsibleParties() {
        if (citedResponsibleParties == null) {
            citedResponsibleParties = new ArrayList<CIResponsibilityPropertyType>();
        }
        return this.citedResponsibleParties;
    }

    /**
     * Gets the value of the presentationForms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentationForms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentationForms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentationFormCode }
     * 
     * 
     */
    public List<PresentationFormCode> getPresentationForms() {
        if (presentationForms == null) {
            presentationForms = new ArrayList<PresentationFormCode>();
        }
        return this.presentationForms;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link CISeriesType }
     *     
     */
    public CISeriesType getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link CISeriesType }
     *     
     */
    public void setSeries(CISeriesType value) {
        this.series = value;
    }

    /**
     * Gets the value of the otherCitationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCitationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCitationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherCitationDetails() {
        if (otherCitationDetails == null) {
            otherCitationDetails = new ArrayList<String>();
        }
        return this.otherCitationDetails;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSN() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSN(String value) {
        this.issn = value;
    }

    /**
     * Gets the value of the onlineResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlineResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlineResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIOnlineResourceType }
     * 
     * 
     */
    public List<CIOnlineResourceType> getOnlineResources() {
        if (onlineResources == null) {
            onlineResources = new ArrayList<CIOnlineResourceType>();
        }
        return this.onlineResources;
    }

}
