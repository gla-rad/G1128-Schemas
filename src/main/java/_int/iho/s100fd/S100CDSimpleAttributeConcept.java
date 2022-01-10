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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_CD_SimpleAttributeConcept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_CD_SimpleAttributeConcept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FD}S100_CD_AttributeConcept"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueType" type="{http://www.iho.int/S100FD}S100_CD_AttributeValueType"/&gt;
 *         &lt;element name="quantitySpecification" type="{http://www.iho.int/S100FD}S100_CD_QuantitySpecification" minOccurs="0"/&gt;
 *         &lt;element name="constraints" type="{http://www.iho.int/S100FD}S100_CD_AttributeConstraints" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CD_SimpleAttributeConcept", propOrder = {
    "valueType",
    "quantitySpecification",
    "constraints"
})
public class S100CDSimpleAttributeConcept
    extends S100CDAttributeConcept
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100CDAttributeValueType valueType;
    @XmlSchemaType(name = "string")
    protected S100CDQuantitySpecification quantitySpecification;
    protected S100CDAttributeConstraints constraints;

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDAttributeValueType }
     *     
     */
    public S100CDAttributeValueType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDAttributeValueType }
     *     
     */
    public void setValueType(S100CDAttributeValueType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the quantitySpecification property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDQuantitySpecification }
     *     
     */
    public S100CDQuantitySpecification getQuantitySpecification() {
        return quantitySpecification;
    }

    /**
     * Sets the value of the quantitySpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDQuantitySpecification }
     *     
     */
    public void setQuantitySpecification(S100CDQuantitySpecification value) {
        this.quantitySpecification = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDAttributeConstraints }
     *     
     */
    public S100CDAttributeConstraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDAttributeConstraints }
     *     
     */
    public void setConstraints(S100CDAttributeConstraints value) {
        this.constraints = value;
    }

}
