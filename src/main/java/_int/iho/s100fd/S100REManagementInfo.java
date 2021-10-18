//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.18 at 02:22:38 PM BST 
//


package _int.iho.s100fd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for S100_RE_ManagementInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_RE_ManagementInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="decisionStatus" type="{http://www.iho.int/S100FD}S100_CD_DecisionStatus"/&gt;
 *         &lt;element name="proposalType" type="{http://www.iho.int/S100FD}ProposalType"/&gt;
 *         &lt;element name="submittingOrganisation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="proposedChange" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="justification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateProposed" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateDisposed" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="disposition" type="{http://www.iho.int/S100FD}Disposition"/&gt;
 *         &lt;element name="decision" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="controlBodyNotes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_RE_ManagementInfo", propOrder = {
    "decisionStatus",
    "proposalType",
    "submittingOrganisation",
    "proposedChange",
    "justification",
    "dateProposed",
    "dateDisposed",
    "disposition",
    "decision",
    "controlBodyNotes"
})
public class S100REManagementInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100CDDecisionStatus decisionStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProposalType proposalType;
    @XmlElement(required = true)
    protected String submittingOrganisation;
    @XmlElement(required = true)
    protected String proposedChange;
    @XmlElement(required = true)
    protected String justification;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateProposed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDisposed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Disposition disposition;
    @XmlElement(required = true)
    protected String decision;
    @XmlElement(required = true)
    protected List<String> controlBodyNotes;

    /**
     * Gets the value of the decisionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDDecisionStatus }
     *     
     */
    public S100CDDecisionStatus getDecisionStatus() {
        return decisionStatus;
    }

    /**
     * Sets the value of the decisionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDDecisionStatus }
     *     
     */
    public void setDecisionStatus(S100CDDecisionStatus value) {
        this.decisionStatus = value;
    }

    /**
     * Gets the value of the proposalType property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalType }
     *     
     */
    public ProposalType getProposalType() {
        return proposalType;
    }

    /**
     * Sets the value of the proposalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalType }
     *     
     */
    public void setProposalType(ProposalType value) {
        this.proposalType = value;
    }

    /**
     * Gets the value of the submittingOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittingOrganisation() {
        return submittingOrganisation;
    }

    /**
     * Sets the value of the submittingOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittingOrganisation(String value) {
        this.submittingOrganisation = value;
    }

    /**
     * Gets the value of the proposedChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposedChange() {
        return proposedChange;
    }

    /**
     * Sets the value of the proposedChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposedChange(String value) {
        this.proposedChange = value;
    }

    /**
     * Gets the value of the justification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Sets the value of the justification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustification(String value) {
        this.justification = value;
    }

    /**
     * Gets the value of the dateProposed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateProposed() {
        return dateProposed;
    }

    /**
     * Sets the value of the dateProposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateProposed(XMLGregorianCalendar value) {
        this.dateProposed = value;
    }

    /**
     * Gets the value of the dateDisposed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDisposed() {
        return dateDisposed;
    }

    /**
     * Sets the value of the dateDisposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDisposed(XMLGregorianCalendar value) {
        this.dateDisposed = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link Disposition }
     *     
     */
    public Disposition getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disposition }
     *     
     */
    public void setDisposition(Disposition value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision(String value) {
        this.decision = value;
    }

    /**
     * Gets the value of the controlBodyNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlBodyNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlBodyNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getControlBodyNotes() {
        if (controlBodyNotes == null) {
            controlBodyNotes = new ArrayList<String>();
        }
        return this.controlBodyNotes;
    }

}
