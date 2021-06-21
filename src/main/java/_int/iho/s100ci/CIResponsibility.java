//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:03:52 AM BST 
//


package _int.iho.s100ci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * V. 4.0.0: as defined in 19115-3 with the optional "extent" attribute omitted.
 * 
 * <p>Java class for CI_Responsibility_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Responsibility_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="role" type="{http://www.iho.int/S100CI}S100_RoleCode_PropertyType"/&gt;
 *         &lt;element name="party" type="{http://www.iho.int/S100CI}AbstractCI_Party_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Responsibility_Type", propOrder = {
    "role",
    "parties"
})
@XmlRootElement(name = "CI_Responsibility")
public class CIResponsibility {

    @XmlElement(required = true)
    protected S100RoleCodePropertyType role;
    @XmlElement(name = "party", required = true)
    protected List<AbstractCIPartyPropertyType> parties;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link S100RoleCodePropertyType }
     *     
     */
    public S100RoleCodePropertyType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100RoleCodePropertyType }
     *     
     */
    public void setRole(S100RoleCodePropertyType value) {
        this.role = value;
    }

    /**
     * Gets the value of the parties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCIPartyPropertyType }
     * 
     * 
     */
    public List<AbstractCIPartyPropertyType> getParties() {
        if (parties == null) {
            parties = new ArrayList<AbstractCIPartyPropertyType>();
        }
        return this.parties;
    }

}