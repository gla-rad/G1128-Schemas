//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.10 at 02:50:37 PM GMT 
//


package org.iala_aism.g1128.v1_3.serviceinstanceschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines a geographical area from which the service instance is accessible.
 * 
 *                 Elements of a coverage area are:
 * 
 *                 - name Human readable name of the coverage area, e.g. a well-known name
 *                 like "Bermuda Triangle". The name shall be no longer than one line.
 * 
 *                 - description Human readable description of the coverage area.
 * 
 *                 - geometryAsWKT A polygon described in WKT (Well Known Text) with coordinates in
 *                 coordinate reference system EPSG:4326,
 *                 e.g. POLYGON(LON1 LAT1, LON2 LAT2, LON3, LAT3, LON1 LAT1).
 *                 If the element is empty, the default is the whole world.
 *             
 * 
 * <p>Java class for CoverageArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geometryAsWKT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageArea", propOrder = {

})
public class CoverageArea {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(defaultValue = "POLYGON(-180 -90, 180 -90, 180 90, -180 90, -180 -90)")
    protected String geometryAsWKT;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the geometryAsWKT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometryAsWKT() {
        return geometryAsWKT;
    }

    /**
     * Sets the value of the geometryAsWKT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometryAsWKT(String value) {
        this.geometryAsWKT = value;
    }

}
