//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:50:43 PM BST 
//


package _int.iho.s100fc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_FC_RoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="S100_FC_RoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="association"/&gt;
 *     &lt;enumeration value="aggregation"/&gt;
 *     &lt;enumeration value="composition"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_FC_RoleType")
@XmlEnum
public enum S100FCRoleType {

    @XmlEnumValue("association")
    ASSOCIATION("association"),
    @XmlEnumValue("aggregation")
    AGGREGATION("aggregation"),
    @XmlEnumValue("composition")
    COMPOSITION("composition");
    private final String value;

    S100FCRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100FCRoleType fromValue(String v) {
        for (S100FCRoleType c: S100FCRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}