//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.18 at 02:24:22 PM BST 
//


package _int.iho.s100base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_NumericRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_NumericRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lowerBound" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="upperBound" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="closure" type="{http://www.iho.int/S100Base}S100_IntervalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_NumericRange", propOrder = {
    "lowerBound",
    "upperBound",
    "closure"
})
public class S100NumericRange {

    protected Double lowerBound;
    protected Double upperBound;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100IntervalType closure;

    /**
     * Gets the value of the lowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLowerBound(Double value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpperBound(Double value) {
        this.upperBound = value;
    }

    /**
     * Gets the value of the closure property.
     * 
     * @return
     *     possible object is
     *     {@link S100IntervalType }
     *     
     */
    public S100IntervalType getClosure() {
        return closure;
    }

    /**
     * Sets the value of the closure property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100IntervalType }
     *     
     */
    public void setClosure(S100IntervalType value) {
        this.closure = value;
    }

}
