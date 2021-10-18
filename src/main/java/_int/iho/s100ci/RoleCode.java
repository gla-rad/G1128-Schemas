//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.18 at 02:24:22 PM BST 
//


package _int.iho.s100ci;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="resourceProvider"/&gt;
 *     &lt;enumeration value="custodian"/&gt;
 *     &lt;enumeration value="owner"/&gt;
 *     &lt;enumeration value="user"/&gt;
 *     &lt;enumeration value="distributor"/&gt;
 *     &lt;enumeration value="originator"/&gt;
 *     &lt;enumeration value="pointOfContact"/&gt;
 *     &lt;enumeration value="principalInvestigator"/&gt;
 *     &lt;enumeration value="processor"/&gt;
 *     &lt;enumeration value="publisher"/&gt;
 *     &lt;enumeration value="author"/&gt;
 *     &lt;enumeration value="sponsor"/&gt;
 *     &lt;enumeration value="coAuthor"/&gt;
 *     &lt;enumeration value="collaborator"/&gt;
 *     &lt;enumeration value="editor"/&gt;
 *     &lt;enumeration value="mediator"/&gt;
 *     &lt;enumeration value="rightsHolder"/&gt;
 *     &lt;enumeration value="contributor"/&gt;
 *     &lt;enumeration value="funder"/&gt;
 *     &lt;enumeration value="stakeholder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleCode")
@XmlEnum
public enum RoleCode {


    /**
     * party that supplies the resource
     * 
     */
    @XmlEnumValue("resourceProvider")
    RESOURCE_PROVIDER("resourceProvider"),

    /**
     * party that accepts accountability and responsibility for the resource and ensures appropriate care and maintenance of the resource
     * 
     */
    @XmlEnumValue("custodian")
    CUSTODIAN("custodian"),

    /**
     * party that owns the resource
     * 
     */
    @XmlEnumValue("owner")
    OWNER("owner"),

    /**
     * party who uses the resource
     * 
     */
    @XmlEnumValue("user")
    USER("user"),

    /**
     * party who distributes the resource
     * 
     */
    @XmlEnumValue("distributor")
    DISTRIBUTOR("distributor"),

    /**
     * party who created the resource
     * 
     */
    @XmlEnumValue("originator")
    ORIGINATOR("originator"),

    /**
     * party who can be contacted for acquiring knowledge about or acquisition of the resource
     * 
     */
    @XmlEnumValue("pointOfContact")
    POINT_OF_CONTACT("pointOfContact"),

    /**
     * key party responsible for gathering information and conducting research
     * 
     */
    @XmlEnumValue("principalInvestigator")
    PRINCIPAL_INVESTIGATOR("principalInvestigator"),

    /**
     * party who has processed the data in a manner such that the resource has been modified
     * 
     */
    @XmlEnumValue("processor")
    PROCESSOR("processor"),

    /**
     * party who published the resource
     * 
     */
    @XmlEnumValue("publisher")
    PUBLISHER("publisher"),

    /**
     * party who authored the resource
     * 
     */
    @XmlEnumValue("author")
    AUTHOR("author"),

    /**
     * party who speaks for the resource
     * 
     */
    @XmlEnumValue("sponsor")
    SPONSOR("sponsor"),

    /**
     * party who jointly authors the resource
     * 
     */
    @XmlEnumValue("coAuthor")
    CO_AUTHOR("coAuthor"),

    /**
     * party who assists with the generation of the resource other than the principal investigator
     * 
     */
    @XmlEnumValue("collaborator")
    COLLABORATOR("collaborator"),

    /**
     * party who reviewed or modified the resource to improve the content
     * 
     */
    @XmlEnumValue("editor")
    EDITOR("editor"),

    /**
     * a class of entity that mediates access to the resource and for whom the resource is intended or useful
     * 
     */
    @XmlEnumValue("mediator")
    MEDIATOR("mediator"),

    /**
     * party owning or managing rights over the resource
     * 
     */
    @XmlEnumValue("rightsHolder")
    RIGHTS_HOLDER("rightsHolder"),

    /**
     * party contributing to the resource
     * 
     */
    @XmlEnumValue("contributor")
    CONTRIBUTOR("contributor"),

    /**
     * party providing monetary support for the resource
     * 
     */
    @XmlEnumValue("funder")
    FUNDER("funder"),

    /**
     * party who has an interest in the resource or the use of the resource
     * 
     */
    @XmlEnumValue("stakeholder")
    STAKEHOLDER("stakeholder");
    private final String value;

    RoleCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleCode fromValue(String v) {
        for (RoleCode c: RoleCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
