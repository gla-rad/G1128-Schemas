//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.20 at 12:23:53 PM BST 
//


package _int.iho.s100fd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for S100_RE_RegisterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_RE_RegisterItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemStatus" type="{http://www.iho.int/S100FD}RE_ItemStatus"/&gt;
 *         &lt;element name="dateAccepted" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateAmended" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="itemIdentifier" use="required" type="{http://www.iho.int/S100FD}ItemIdentifier" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_RE_RegisterItem", propOrder = {
    "name",
    "definition",
    "remarks",
    "itemStatus",
    "dateAccepted",
    "dateAmended"
})
@XmlSeeAlso({
    S100CDRegisterItem.class
})
public class S100RERegisterItem {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String definition;
    protected String remarks;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected REItemStatus itemStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateAccepted;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateAmended;
    @XmlAttribute(name = "itemIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String itemIdentifier;

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the itemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link REItemStatus }
     *     
     */
    public REItemStatus getItemStatus() {
        return itemStatus;
    }

    /**
     * Sets the value of the itemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link REItemStatus }
     *     
     */
    public void setItemStatus(REItemStatus value) {
        this.itemStatus = value;
    }

    /**
     * Gets the value of the dateAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAccepted() {
        return dateAccepted;
    }

    /**
     * Sets the value of the dateAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAccepted(XMLGregorianCalendar value) {
        this.dateAccepted = value;
    }

    /**
     * Gets the value of the dateAmended property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAmended() {
        return dateAmended;
    }

    /**
     * Sets the value of the dateAmended property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAmended(XMLGregorianCalendar value) {
        this.dateAmended = value;
    }

    /**
     * Gets the value of the itemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIdentifier() {
        return itemIdentifier;
    }

    /**
     * Sets the value of the itemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIdentifier(String value) {
        this.itemIdentifier = value;
    }

}
