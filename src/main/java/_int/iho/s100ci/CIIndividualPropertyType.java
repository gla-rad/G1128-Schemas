//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:50:43 PM BST 
//


package _int.iho.s100ci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI_Individual_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Individual_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.iho.int/S100CI}CI_Individual"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Individual_PropertyType", propOrder = {
    "ciIndividual"
})
public class CIIndividualPropertyType {

    @XmlElement(name = "CI_Individual")
    protected CIIndividualType ciIndividual;

    /**
     * Gets the value of the ciIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link CIIndividualType }
     *     
     */
    public CIIndividualType getCIIndividual() {
        return ciIndividual;
    }

    /**
     * Sets the value of the ciIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIIndividualType }
     *     
     */
    public void setCIIndividual(CIIndividualType value) {
        this.ciIndividual = value;
    }

}