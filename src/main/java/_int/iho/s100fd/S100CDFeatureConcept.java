//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:32:24 PM BST 
//


package _int.iho.s100fd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_CD_FeatureConcept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_CD_FeatureConcept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FD}S100_CD_RegisterItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alphaCode" type="{http://www.iho.int/S100FD}S100_CD_AlphaCode" minOccurs="0"/&gt;
 *         &lt;element name="featureUseType" type="{http://www.iho.int/S100FD}S100_CD_FeatureUseType"/&gt;
 *         &lt;element name="distinction" type="{http://www.iho.int/S100FD}CamelCaseId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CD_FeatureConcept", propOrder = {
    "alphaCode",
    "featureUseType",
    "distinction"
})
public class S100CDFeatureConcept
    extends S100CDRegisterItem
{

    protected String alphaCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100CDFeatureUseType featureUseType;
    protected List<String> distinction;

    /**
     * Gets the value of the alphaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaCode() {
        return alphaCode;
    }

    /**
     * Sets the value of the alphaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaCode(String value) {
        this.alphaCode = value;
    }

    /**
     * Gets the value of the featureUseType property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDFeatureUseType }
     *     
     */
    public S100CDFeatureUseType getFeatureUseType() {
        return featureUseType;
    }

    /**
     * Sets the value of the featureUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDFeatureUseType }
     *     
     */
    public void setFeatureUseType(S100CDFeatureUseType value) {
        this.featureUseType = value;
    }

    /**
     * Gets the value of the distinction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distinction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistinction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistinction() {
        if (distinction == null) {
            distinction = new ArrayList<String>();
        }
        return this.distinction;
    }

}
