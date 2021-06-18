//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:50:43 PM BST 
//


package _int.iho.s100fd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_CD_FeatureUseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="S100_CD_FeatureUseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="geographic"/&gt;
 *     &lt;enumeration value="meta"/&gt;
 *     &lt;enumeration value="cartographic"/&gt;
 *     &lt;enumeration value="theme"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_CD_FeatureUseType")
@XmlEnum
public enum S100CDFeatureUseType {

    @XmlEnumValue("geographic")
    GEOGRAPHIC("geographic"),
    @XmlEnumValue("meta")
    META("meta"),
    @XmlEnumValue("cartographic")
    CARTOGRAPHIC("cartographic"),
    @XmlEnumValue("theme")
    THEME("theme");
    private final String value;

    S100CDFeatureUseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100CDFeatureUseType fromValue(String v) {
        for (S100CDFeatureUseType c: S100CDFeatureUseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}