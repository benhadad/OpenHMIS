//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.hud_hmis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sevenValDKRefused2HashingChoiceStatic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sevenValDKRefused2HashingChoiceStatic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Unhashed" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}sevenValDKRefused2Static" minOccurs="0"/>
 *         &lt;element name="Hashed" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}string50Base" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sevenValDKRefused2HashingChoiceStatic", propOrder = {
    "unhashed",
    "hashed"
})
public class SevenValDKRefused2HashingChoiceStatic {

    @XmlElement(name = "Unhashed")
    protected SevenValDKRefused2Static unhashed;
    @XmlElement(name = "Hashed")
    protected String hashed;

    /**
     * Gets the value of the unhashed property.
     * 
     * @return
     *     possible object is
     *     {@link SevenValDKRefused2Static }
     *     
     */
    public SevenValDKRefused2Static getUnhashed() {
        return unhashed;
    }

    /**
     * Sets the value of the unhashed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SevenValDKRefused2Static }
     *     
     */
    public void setUnhashed(SevenValDKRefused2Static value) {
        this.unhashed = value;
    }

    /**
     * Gets the value of the hashed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashed() {
        return hashed;
    }

    /**
     * Sets the value of the hashed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashed(String value) {
        this.hashed = value;
    }

}
