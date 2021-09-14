//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.14 at 11:16:45 AM CEST 
//


package _int.iho.s100fc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100base.S100UnitOfMeasure;
import _int.iho.s100fd.S100CDAttributeConstraints;
import _int.iho.s100fd.S100CDAttributeValueType;
import _int.iho.s100fd.S100CDQuantitySpecification;


/**
 * <p>Java class for S100_FC_SimpleAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_SimpleAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FC}S100_FC_Attribute"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueType" type="{http://www.iho.int/S100FD}S100_CD_AttributeValueType"/&gt;
 *         &lt;element name="uom" type="{http://www.iho.int/S100Base}S100_UnitOfMeasure" minOccurs="0"/&gt;
 *         &lt;element name="quantitySpecification" type="{http://www.iho.int/S100FD}S100_CD_QuantitySpecification" minOccurs="0"/&gt;
 *         &lt;element name="constraints" type="{http://www.iho.int/S100FD}S100_CD_AttributeConstraints" minOccurs="0"/&gt;
 *         &lt;element name="listedValues" type="{http://www.iho.int/S100FC}S100_FC_ListedValues" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_SimpleAttribute", propOrder = {
    "valueType",
    "uom",
    "quantitySpecification",
    "constraints",
    "listedValues"
})
public class S100FCSimpleAttribute
    extends S100FCAttribute
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100CDAttributeValueType valueType;
    protected S100UnitOfMeasure uom;
    @XmlSchemaType(name = "string")
    protected S100CDQuantitySpecification quantitySpecification;
    protected S100CDAttributeConstraints constraints;
    protected List<S100FCListedValues> listedValues;

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
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link S100UnitOfMeasure }
     *     
     */
    public S100UnitOfMeasure getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100UnitOfMeasure }
     *     
     */
    public void setUom(S100UnitOfMeasure value) {
        this.uom = value;
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

    /**
     * Gets the value of the listedValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listedValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListedValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCListedValues }
     * 
     * @return list of S100FCListedValues
     */
    public List<S100FCListedValues> getListedValues() {
        if (listedValues == null) {
            listedValues = new ArrayList<S100FCListedValues>();
        }
        return this.listedValues;
    }

}
