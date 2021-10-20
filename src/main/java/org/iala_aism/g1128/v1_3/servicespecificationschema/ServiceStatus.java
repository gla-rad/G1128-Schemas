//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.20 at 12:23:53 PM BST 
//


package org.iala_aism.g1128.v1_3.servicespecificationschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="provisional"/&gt;
 *     &lt;enumeration value="released"/&gt;
 *     &lt;enumeration value="deprecated"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceStatus")
@XmlEnum
public enum ServiceStatus {

    @XmlEnumValue("provisional")
    PROVISIONAL("provisional"),
    @XmlEnumValue("released")
    RELEASED("released"),
    @XmlEnumValue("deprecated")
    DEPRECATED("deprecated"),
    @XmlEnumValue("deleted")
    DELETED("deleted");
    private final String value;

    ServiceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceStatus fromValue(String v) {
        for (ServiceStatus c: ServiceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
