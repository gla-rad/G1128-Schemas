//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.10 at 02:50:37 PM GMT 
//


package _int.iho.s100base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_IntervalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="S100_IntervalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="openInterval"/&gt;
 *     &lt;enumeration value="geLtInterval"/&gt;
 *     &lt;enumeration value="gtLeInterval"/&gt;
 *     &lt;enumeration value="closedInterval"/&gt;
 *     &lt;enumeration value="gtSemiInterval"/&gt;
 *     &lt;enumeration value="geSemiInterval"/&gt;
 *     &lt;enumeration value="ltSemiInterval"/&gt;
 *     &lt;enumeration value="leSemiInterval"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_IntervalType")
@XmlEnum
public enum S100IntervalType {

    @XmlEnumValue("openInterval")
    OPEN_INTERVAL("openInterval"),
    @XmlEnumValue("geLtInterval")
    GE_LT_INTERVAL("geLtInterval"),
    @XmlEnumValue("gtLeInterval")
    GT_LE_INTERVAL("gtLeInterval"),
    @XmlEnumValue("closedInterval")
    CLOSED_INTERVAL("closedInterval"),
    @XmlEnumValue("gtSemiInterval")
    GT_SEMI_INTERVAL("gtSemiInterval"),
    @XmlEnumValue("geSemiInterval")
    GE_SEMI_INTERVAL("geSemiInterval"),
    @XmlEnumValue("ltSemiInterval")
    LT_SEMI_INTERVAL("ltSemiInterval"),
    @XmlEnumValue("leSemiInterval")
    LE_SEMI_INTERVAL("leSemiInterval");
    private final String value;

    S100IntervalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100IntervalType fromValue(String v) {
        for (S100IntervalType c: S100IntervalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
