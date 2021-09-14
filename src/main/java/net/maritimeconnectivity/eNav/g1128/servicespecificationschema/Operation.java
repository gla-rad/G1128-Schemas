//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.14 at 11:16:45 AM CEST 
//


package net.maritimeconnectivity.eNav.g1128.servicespecificationschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of a service operation. Operations allow a service consumer to interact with
 *                 the service. An operation describes a dedicated function of the service or the consumer.
 * 
 *                 Elements of an operation are:
 * 
 *                 - name Human readable operation name. The name shall be no longer than one line.
 * 
 *                 - description Human readable description of the operation.
 * 
 *                 - returnValueType Optional definition of the return value for the operation. The return value
 *                 could be a business object or a simple status code. The return value data type
 *                 has to be defined in the logical service data model.
 * 
 *                 - parameterTypes Definition of one or more parameters for the operation. This could be business
 *                 objects or simple types. Parameters have to be defined in the logical
 *                 service data model.
 *             
 * 
 * <p>Java class for Operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnValueType" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}ValueTypeDataModelMapping" minOccurs="0"/&gt;
 *         &lt;element name="parameterTypes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="parameterType" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}ValueTypeDataModelMapping" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operation", propOrder = {

})
public class Operation {

    /**
     * Human readable operation name. The name shall be no longer than one line.
     */
    @XmlElement(required = true)
    protected String name;
    /**
     * Human readable description of the operation.
     */
    @XmlElement(required = true)
    protected String description;
    /**
     * Definition of the return value for the operation. The return value
     *  could be a business object or a simple status code. The return value data type
     *  has to be defined in the logical service data model.
     */
    protected ValueTypeDataModelMapping returnValueType;
    /**
     * Definition of one or more parameters for the operation. This could be business
     *  objects or simple types. Parameters have to be defined in the logical
     *  service data model.
     */
    protected Operation.ParameterTypes parameterTypes;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the returnValueType property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeDataModelMapping }
     *     
     */
    public ValueTypeDataModelMapping getReturnValueType() {
        return returnValueType;
    }

    /**
     * Sets the value of the returnValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeDataModelMapping }
     *     
     */
    public void setReturnValueType(ValueTypeDataModelMapping value) {
        this.returnValueType = value;
    }

    /**
     * Gets the value of the parameterTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Operation.ParameterTypes }
     *     
     */
    public Operation.ParameterTypes getParameterTypes() {
        return parameterTypes;
    }

    /**
     * Sets the value of the parameterTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation.ParameterTypes }
     *     
     */
    public void setParameterTypes(Operation.ParameterTypes value) {
        this.parameterTypes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="parameterType" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}ValueTypeDataModelMapping" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parameterTypes"
    })
    public static class ParameterTypes {

        @XmlElement(name = "parameterType", required = true)
        protected List<ValueTypeDataModelMapping> parameterTypes;

        /**
         * Gets the value of the parameterTypes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterTypes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameterTypes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValueTypeDataModelMapping }
         * 
         * @return list of ValueTypeDataModelMapping
         */
        public List<ValueTypeDataModelMapping> getParameterTypes() {
            if (parameterTypes == null) {
                parameterTypes = new ArrayList<ValueTypeDataModelMapping>();
            }
            return this.parameterTypes;
        }

    }

}