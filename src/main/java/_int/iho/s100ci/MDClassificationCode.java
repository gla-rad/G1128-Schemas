//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:32:24 PM BST 
//


package _int.iho.s100ci;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MD_ClassificationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MD_ClassificationCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unclassified"/&gt;
 *     &lt;enumeration value="restricted"/&gt;
 *     &lt;enumeration value="confidential"/&gt;
 *     &lt;enumeration value="secret"/&gt;
 *     &lt;enumeration value="topSecret"/&gt;
 *     &lt;enumeration value="sensitiveButUnclassified"/&gt;
 *     &lt;enumeration value="forOfficialUseOnly"/&gt;
 *     &lt;enumeration value="protected"/&gt;
 *     &lt;enumeration value="limitedDistribution"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MD_ClassificationCode")
@XmlEnum
public enum MDClassificationCode {


    /**
     * available for general disclosure
     * 
     */
    @XmlEnumValue("unclassified")
    UNCLASSIFIED("unclassified"),

    /**
     * not for general disclosure
     * 
     */
    @XmlEnumValue("restricted")
    RESTRICTED("restricted"),

    /**
     * available for someone who can be entrusted with information
     * 
     */
    @XmlEnumValue("confidential")
    CONFIDENTIAL("confidential"),

    /**
     * kept or meant to be kept private, unknown, or hidden from all but a select group of people
     * 
     */
    @XmlEnumValue("secret")
    SECRET("secret"),

    /**
     * of the highest secrecy
     * 
     */
    @XmlEnumValue("topSecret")
    TOP_SECRET("topSecret"),

    /**
     * although unclassified, requires strict controls over its distribution
     * 
     */
    @XmlEnumValue("sensitiveButUnclassified")
    SENSITIVE_BUT_UNCLASSIFIED("sensitiveButUnclassified"),

    /**
     * unclassified information that is to be used only for official purposes determined by the designating body
     * 
     */
    @XmlEnumValue("forOfficialUseOnly")
    FOR_OFFICIAL_USE_ONLY("forOfficialUseOnly"),

    /**
     * compromise of the information could cause damage
     * 
     */
    @XmlEnumValue("protected")
    PROTECTED("protected"),

    /**
     * dissemination limited by designating body
     * 
     */
    @XmlEnumValue("limitedDistribution")
    LIMITED_DISTRIBUTION("limitedDistribution");
    private final String value;

    MDClassificationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDClassificationCode fromValue(String v) {
        for (MDClassificationCode c: MDClassificationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
