//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.10 at 02:50:37 PM GMT 
//


package _int.iho.s100fc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_FC_ListedValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_ListedValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listedValue" type="{http://www.iho.int/S100FC}S100_FC_ListedValue" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_ListedValues", propOrder = {
    "listedValues"
})
public class S100FCListedValues {

    @XmlElement(name = "listedValue", required = true)
    protected List<S100FCListedValue> listedValues;

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
     * {@link S100FCListedValue }
     * 
     * 
     */
    public List<S100FCListedValue> getListedValues() {
        if (listedValues == null) {
            listedValues = new ArrayList<S100FCListedValue>();
        }
        return this.listedValues;
    }

}
