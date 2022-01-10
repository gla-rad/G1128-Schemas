//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.10 at 02:50:37 PM GMT 
//


package _int.iho.s100fd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_RE_Register complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_RE_Register"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registerInformation" type="{http://www.iho.int/S100FD}RegisterInformation"/&gt;
 *         &lt;element name="referenceDocuments" type="{http://www.iho.int/S100FD}ReferenceDocuments" minOccurs="0"/&gt;
 *         &lt;element name="S100_CD_SimpleAttributeConcepts" type="{http://www.iho.int/S100FD}S100_CD_SimpleAttributeConcepts" minOccurs="0"/&gt;
 *         &lt;element name="S100_CD_ComplexAttributeConcepts" type="{http://www.iho.int/S100FD}S100_CD_ComplexAttributeConcepts" minOccurs="0"/&gt;
 *         &lt;element name="S100_CD_EnumeratedValueConcepts" type="{http://www.iho.int/S100FD}S100_CD_EnumeratedValueConcepts" minOccurs="0"/&gt;
 *         &lt;element name="S100_CD_FeatureConcepts" type="{http://www.iho.int/S100FD}S100_CD_FeatureConcepts" minOccurs="0"/&gt;
 *         &lt;element name="S100_CD_InformationConcepts" type="{http://www.iho.int/S100FD}S100_CD_InformationConcepts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_RE_Register", propOrder = {
    "registerInformation",
    "referenceDocuments",
    "s100CDSimpleAttributeConcepts",
    "s100CDComplexAttributeConcepts",
    "s100CDEnumeratedValueConcepts",
    "s100CDFeatureConcepts",
    "s100CDInformationConcepts"
})
public class S100RERegister {

    @XmlElement(required = true)
    protected RegisterInformation registerInformation;
    protected ReferenceDocuments referenceDocuments;
    @XmlElement(name = "S100_CD_SimpleAttributeConcepts")
    protected S100CDSimpleAttributeConcepts s100CDSimpleAttributeConcepts;
    @XmlElement(name = "S100_CD_ComplexAttributeConcepts")
    protected S100CDComplexAttributeConcepts s100CDComplexAttributeConcepts;
    @XmlElement(name = "S100_CD_EnumeratedValueConcepts")
    protected S100CDEnumeratedValueConcepts s100CDEnumeratedValueConcepts;
    @XmlElement(name = "S100_CD_FeatureConcepts")
    protected S100CDFeatureConcepts s100CDFeatureConcepts;
    @XmlElement(name = "S100_CD_InformationConcepts")
    protected S100CDInformationConcepts s100CDInformationConcepts;

    /**
     * Gets the value of the registerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterInformation }
     *     
     */
    public RegisterInformation getRegisterInformation() {
        return registerInformation;
    }

    /**
     * Sets the value of the registerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterInformation }
     *     
     */
    public void setRegisterInformation(RegisterInformation value) {
        this.registerInformation = value;
    }

    /**
     * Gets the value of the referenceDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDocuments }
     *     
     */
    public ReferenceDocuments getReferenceDocuments() {
        return referenceDocuments;
    }

    /**
     * Sets the value of the referenceDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDocuments }
     *     
     */
    public void setReferenceDocuments(ReferenceDocuments value) {
        this.referenceDocuments = value;
    }

    /**
     * Gets the value of the s100CDSimpleAttributeConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDSimpleAttributeConcepts }
     *     
     */
    public S100CDSimpleAttributeConcepts getS100CDSimpleAttributeConcepts() {
        return s100CDSimpleAttributeConcepts;
    }

    /**
     * Sets the value of the s100CDSimpleAttributeConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDSimpleAttributeConcepts }
     *     
     */
    public void setS100CDSimpleAttributeConcepts(S100CDSimpleAttributeConcepts value) {
        this.s100CDSimpleAttributeConcepts = value;
    }

    /**
     * Gets the value of the s100CDComplexAttributeConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDComplexAttributeConcepts }
     *     
     */
    public S100CDComplexAttributeConcepts getS100CDComplexAttributeConcepts() {
        return s100CDComplexAttributeConcepts;
    }

    /**
     * Sets the value of the s100CDComplexAttributeConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDComplexAttributeConcepts }
     *     
     */
    public void setS100CDComplexAttributeConcepts(S100CDComplexAttributeConcepts value) {
        this.s100CDComplexAttributeConcepts = value;
    }

    /**
     * Gets the value of the s100CDEnumeratedValueConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDEnumeratedValueConcepts }
     *     
     */
    public S100CDEnumeratedValueConcepts getS100CDEnumeratedValueConcepts() {
        return s100CDEnumeratedValueConcepts;
    }

    /**
     * Sets the value of the s100CDEnumeratedValueConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDEnumeratedValueConcepts }
     *     
     */
    public void setS100CDEnumeratedValueConcepts(S100CDEnumeratedValueConcepts value) {
        this.s100CDEnumeratedValueConcepts = value;
    }

    /**
     * Gets the value of the s100CDFeatureConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDFeatureConcepts }
     *     
     */
    public S100CDFeatureConcepts getS100CDFeatureConcepts() {
        return s100CDFeatureConcepts;
    }

    /**
     * Sets the value of the s100CDFeatureConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDFeatureConcepts }
     *     
     */
    public void setS100CDFeatureConcepts(S100CDFeatureConcepts value) {
        this.s100CDFeatureConcepts = value;
    }

    /**
     * Gets the value of the s100CDInformationConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDInformationConcepts }
     *     
     */
    public S100CDInformationConcepts getS100CDInformationConcepts() {
        return s100CDInformationConcepts;
    }

    /**
     * Sets the value of the s100CDInformationConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDInformationConcepts }
     *     
     */
    public void setS100CDInformationConcepts(S100CDInformationConcepts value) {
        this.s100CDInformationConcepts = value;
    }

}
