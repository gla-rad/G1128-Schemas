//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:50:43 PM BST 
//


package _int.iho.s100ci;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _int.iho.s100ci package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CIResponsibility_QNAME = new QName("http://www.iho.int/S100CI", "CI_Responsibility");
    private final static QName _AbstractCIParty_QNAME = new QName("http://www.iho.int/S100CI", "AbstractCI_Party");
    private final static QName _CIIndividual_QNAME = new QName("http://www.iho.int/S100CI", "CI_Individual");
    private final static QName _CIOrganisation_QNAME = new QName("http://www.iho.int/S100CI", "CI_Organisation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _int.iho.s100ci
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CIResponsibilityType }
     * 
     */
    public CIResponsibilityType createCIResponsibilityType() {
        return new CIResponsibilityType();
    }

    /**
     * Create an instance of {@link CIIndividualType }
     * 
     */
    public CIIndividualType createCIIndividualType() {
        return new CIIndividualType();
    }

    /**
     * Create an instance of {@link CIOrganisationType }
     * 
     */
    public CIOrganisationType createCIOrganisationType() {
        return new CIOrganisationType();
    }

    /**
     * Create an instance of {@link DateExt }
     * 
     */
    public DateExt createDateExt() {
        return new DateExt();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link S100RoleCodePropertyType }
     * 
     */
    public S100RoleCodePropertyType createS100RoleCodePropertyType() {
        return new S100RoleCodePropertyType();
    }

    /**
     * Create an instance of {@link CISeriesType }
     * 
     */
    public CISeriesType createCISeriesType() {
        return new CISeriesType();
    }

    /**
     * Create an instance of {@link CIOnlineResourceType }
     * 
     */
    public CIOnlineResourceType createCIOnlineResourceType() {
        return new CIOnlineResourceType();
    }

    /**
     * Create an instance of {@link CIAddressType }
     * 
     */
    public CIAddressType createCIAddressType() {
        return new CIAddressType();
    }

    /**
     * Create an instance of {@link CICitationType }
     * 
     */
    public CICitationType createCICitationType() {
        return new CICitationType();
    }

    /**
     * Create an instance of {@link CIResponsibilityPropertyType }
     * 
     */
    public CIResponsibilityPropertyType createCIResponsibilityPropertyType() {
        return new CIResponsibilityPropertyType();
    }

    /**
     * Create an instance of {@link AbstractCIPartyPropertyType }
     * 
     */
    public AbstractCIPartyPropertyType createAbstractCIPartyPropertyType() {
        return new AbstractCIPartyPropertyType();
    }

    /**
     * Create an instance of {@link MDIdentifierType }
     * 
     */
    public MDIdentifierType createMDIdentifierType() {
        return new MDIdentifierType();
    }

    /**
     * Create an instance of {@link CIIndividualPropertyType }
     * 
     */
    public CIIndividualPropertyType createCIIndividualPropertyType() {
        return new CIIndividualPropertyType();
    }

    /**
     * Create an instance of {@link CIContactType }
     * 
     */
    public CIContactType createCIContactType() {
        return new CIContactType();
    }

    /**
     * Create an instance of {@link CITelephoneType }
     * 
     */
    public CITelephoneType createCITelephoneType() {
        return new CITelephoneType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIResponsibilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CIResponsibilityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100CI", name = "CI_Responsibility")
    public JAXBElement<CIResponsibilityType> createCIResponsibility(CIResponsibilityType value) {
        return new JAXBElement<CIResponsibilityType>(_CIResponsibility_QNAME, CIResponsibilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCIPartyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractCIPartyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100CI", name = "AbstractCI_Party")
    public JAXBElement<AbstractCIPartyType> createAbstractCIParty(AbstractCIPartyType value) {
        return new JAXBElement<AbstractCIPartyType>(_AbstractCIParty_QNAME, AbstractCIPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIIndividualType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CIIndividualType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100CI", name = "CI_Individual", substitutionHeadNamespace = "http://www.iho.int/S100CI", substitutionHeadName = "AbstractCI_Party")
    public JAXBElement<CIIndividualType> createCIIndividual(CIIndividualType value) {
        return new JAXBElement<CIIndividualType>(_CIIndividual_QNAME, CIIndividualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIOrganisationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CIOrganisationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100CI", name = "CI_Organisation", substitutionHeadNamespace = "http://www.iho.int/S100CI", substitutionHeadName = "AbstractCI_Party")
    public JAXBElement<CIOrganisationType> createCIOrganisation(CIOrganisationType value) {
        return new JAXBElement<CIOrganisationType>(_CIOrganisation_QNAME, CIOrganisationType.class, null, value);
    }

}