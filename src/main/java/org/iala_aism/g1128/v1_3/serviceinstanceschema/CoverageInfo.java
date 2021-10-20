//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.20 at 12:23:53 PM BST 
//


package org.iala_aism.g1128.v1_3.serviceinstanceschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="coversArea" type="{http://iala-aism.org/g1128/v1.3/ServiceInstanceSchema.xsd}CoverageArea"/&gt;
 *         &lt;element name="unLoCode" type="{http://iala-aism.org/g1128/v1.3/ServiceSpecificationSchema.xsd}UnLoCode"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageInfo", propOrder = {
    "coversAreasAndUnLoCodes"
})
public class CoverageInfo {

    @XmlElements({
        @XmlElement(name = "coversArea", type = CoverageArea.class),
        @XmlElement(name = "unLoCode", type = String.class)
    })
    protected List<Object> coversAreasAndUnLoCodes;

    /**
     * Gets the value of the coversAreasAndUnLoCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coversAreasAndUnLoCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoversAreasAndUnLoCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageArea }
     * {@link String }
     * 
     * 
     */
    public List<Object> getCoversAreasAndUnLoCodes() {
        if (coversAreasAndUnLoCodes == null) {
            coversAreasAndUnLoCodes = new ArrayList<Object>();
        }
        return this.coversAreasAndUnLoCodes;
    }

}
