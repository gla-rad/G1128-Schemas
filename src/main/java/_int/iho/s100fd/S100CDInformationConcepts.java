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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_CD_InformationConcepts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_CD_InformationConcepts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="S100_CD_InformationConcept" type="{http://www.iho.int/S100FD}S100_CD_InformationConcept" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CD_InformationConcepts", propOrder = {
    "s100CDInformationConcept"
})
public class S100CDInformationConcepts {

    @XmlElement(name = "S100_CD_InformationConcept", required = true)
    protected List<S100CDInformationConcept> s100CDInformationConcept;

    /**
     * Gets the value of the s100CDInformationConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the s100CDInformationConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS100CDInformationConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100CDInformationConcept }
     * 
     * 
     */
    public List<S100CDInformationConcept> getS100CDInformationConcept() {
        if (s100CDInformationConcept == null) {
            s100CDInformationConcept = new ArrayList<S100CDInformationConcept>();
        }
        return this.s100CDInformationConcept;
    }

}
