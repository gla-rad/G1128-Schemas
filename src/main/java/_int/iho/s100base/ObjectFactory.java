//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.18 at 02:22:38 PM BST 
//


package _int.iho.s100base;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _int.iho.s100base package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _int.iho.s100base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnlimitedInteger }
     * 
     */
    public UnlimitedInteger createUnlimitedInteger() {
        return new UnlimitedInteger();
    }

    /**
     * Create an instance of {@link S100Multiplicity }
     * 
     */
    public S100Multiplicity createS100Multiplicity() {
        return new S100Multiplicity();
    }

    /**
     * Create an instance of {@link S100NumericRange }
     * 
     */
    public S100NumericRange createS100NumericRange() {
        return new S100NumericRange();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link S100UnitOfMeasure }
     * 
     */
    public S100UnitOfMeasure createS100UnitOfMeasure() {
        return new S100UnitOfMeasure();
    }

}
