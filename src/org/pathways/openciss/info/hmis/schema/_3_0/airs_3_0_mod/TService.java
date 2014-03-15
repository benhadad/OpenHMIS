//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.airs_3_0_mod;

import org.pathways.openciss.info.hmis.schema._3_0.hud_hmis.Service;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This type is a modification to the standard 3_0 AIRS Schema.  It existed in version 2.07 and was taken out, yet a suitable replacement for this functionality was not reintroduced.  HUD HMIS XML needs tService(Program) functionality.
 * 
 * <p>Java class for tService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="AgencyKey" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tService", propOrder = {
    "key",
    "agencyKey",
    "name"
})
@XmlSeeAlso({
    Service.class
})
public class TService {

    @XmlElement(name = "Key")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger key;
    @XmlElement(name = "AgencyKey")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger agencyKey;
    @XmlElement(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKey(BigInteger value) {
        this.key = value;
    }

    /**
     * Gets the value of the agencyKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgencyKey() {
        return agencyKey;
    }

    /**
     * Sets the value of the agencyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgencyKey(BigInteger value) {
        this.agencyKey = value;
    }

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

}
