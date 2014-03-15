//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.hud_hmis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for personAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}personAddressBase">
 *       &lt;attGroup ref="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}dateStampGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personAddress")
public class PersonAddress
    extends PersonAddressBase
{

    @XmlAttribute(name = "dateCollected", namespace = "http://www.hmis.info/schema/3_0/HUD_HMIS.xsd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCollected;
    @XmlAttribute(name = "dateEffective", namespace = "http://www.hmis.info/schema/3_0/HUD_HMIS.xsd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEffective;
    @XmlAttribute(name = "dataCollectionStage", namespace = "http://www.hmis.info/schema/3_0/HUD_HMIS.xsd")
    protected Long dataCollectionStage;

    /**
     * Gets the value of the dateCollected property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCollected() {
        return dateCollected;
    }

    /**
     * Sets the value of the dateCollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCollected(XMLGregorianCalendar value) {
        this.dateCollected = value;
    }

    /**
     * Gets the value of the dateEffective property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEffective() {
        return dateEffective;
    }

    /**
     * Sets the value of the dateEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEffective(XMLGregorianCalendar value) {
        this.dateEffective = value;
    }

    /**
     * Gets the value of the dataCollectionStage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDataCollectionStage() {
        return dataCollectionStage;
    }

    /**
     * Sets the value of the dataCollectionStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDataCollectionStage(Long value) {
        this.dataCollectionStage = value;
    }

}
