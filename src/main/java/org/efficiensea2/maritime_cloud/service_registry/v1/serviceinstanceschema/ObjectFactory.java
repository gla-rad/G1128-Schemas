//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.17 at 05:41:06 PM BST 
//


package org.efficiensea2.maritime_cloud.service_registry.v1.serviceinstanceschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.efficiensea2.maritime_cloud.service_registry.v1.serviceinstanceschema package. 
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

    private final static QName _ServiceInstance_QNAME = new QName("http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceInstanceSchema.xsd", "serviceInstance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.efficiensea2.maritime_cloud.service_registry.v1.serviceinstanceschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceInstance }
     * 
     */
    public ServiceInstance createServiceInstance() {
        return new ServiceInstance();
    }

    /**
     * Create an instance of {@link ServiceDesignReference }
     * 
     */
    public ServiceDesignReference createServiceDesignReference() {
        return new ServiceDesignReference();
    }

    /**
     * Create an instance of {@link ServiceLevel }
     * 
     */
    public ServiceLevel createServiceLevel() {
        return new ServiceLevel();
    }

    /**
     * Create an instance of {@link CoverageArea }
     * 
     */
    public CoverageArea createCoverageArea() {
        return new CoverageArea();
    }

    /**
     * Create an instance of {@link ServiceInstance.CoversAreas }
     * 
     */
    public ServiceInstance.CoversAreas createServiceInstanceCoversAreas() {
        return new ServiceInstance.CoversAreas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInstance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceInstance }{@code >}
     */
    @XmlElementDecl(namespace = "http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceInstanceSchema.xsd", name = "serviceInstance")
    public JAXBElement<ServiceInstance> createServiceInstance(ServiceInstance value) {
        return new JAXBElement<ServiceInstance>(_ServiceInstance_QNAME, ServiceInstance.class, null, value);
    }

}