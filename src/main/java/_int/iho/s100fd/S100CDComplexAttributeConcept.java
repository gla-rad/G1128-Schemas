//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.10 at 02:50:37 PM GMT 
//


package _int.iho.s100fd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_CD_ComplexAttributeConcept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_CD_ComplexAttributeConcept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FD}S100_CD_AttributeConcept"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subAttribute" type="{http://www.iho.int/S100FD}SubAttribute" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CD_ComplexAttributeConcept", propOrder = {
    "subAttributes"
})
public class S100CDComplexAttributeConcept
    extends S100CDAttributeConcept
{

    @XmlElement(name = "subAttribute", required = true)
    protected List<SubAttribute> subAttributes;

    /**
     * Gets the value of the subAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAttribute }
     * 
     * 
     */
    public List<SubAttribute> getSubAttributes() {
        if (subAttributes == null) {
            subAttributes = new ArrayList<SubAttribute>();
        }
        return this.subAttributes;
    }

}
