//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.hud_hmis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="source">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceID" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}iDIndex"/>
 *         &lt;element name="SoftwareVendor" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}string50Base"/>
 *         &lt;element name="SoftwareVersion" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}version"/>
 *         &lt;element name="SourceContactEmail" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}emailBase" minOccurs="0"/>
 *         &lt;element name="SourceContactExtension" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}extension" minOccurs="0"/>
 *         &lt;element name="SourceContactFirst" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}string20Base" minOccurs="0"/>
 *         &lt;element name="SourceContactLast" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}string20Base" minOccurs="0"/>
 *         &lt;element name="SourceContactPhone" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}phoneNumberBase" minOccurs="0"/>
 *         &lt;element name="SourceName" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}string50Base"/>
 *         &lt;element name="Export" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}export" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "source", propOrder = {
    "sourceID",
    "softwareVendor",
    "softwareVersion",
    "sourceContactEmail",
    "sourceContactExtension",
    "sourceContactFirst",
    "sourceContactLast",
    "sourceContactPhone",
    "sourceName",
    "export"
})
public class Source {

    @XmlElement(name = "SourceID", required = true)
    protected IDIndex sourceID;
    @XmlElement(name = "SoftwareVendor", required = true)
    protected String softwareVendor;
    @XmlElement(name = "SoftwareVersion", required = true)
    protected BigDecimal softwareVersion;
    @XmlElement(name = "SourceContactEmail")
    protected String sourceContactEmail;
    @XmlElement(name = "SourceContactExtension")
    protected String sourceContactExtension;
    @XmlElement(name = "SourceContactFirst")
    protected String sourceContactFirst;
    @XmlElement(name = "SourceContactLast")
    protected String sourceContactLast;
    @XmlElement(name = "SourceContactPhone")
    protected String sourceContactPhone;
    @XmlElement(name = "SourceName", required = true)
    protected String sourceName;
    @XmlElement(name = "Export")
    protected List<Export> export;

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDIndex }
     *     
     */
    public IDIndex getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIndex }
     *     
     */
    public void setSourceID(IDIndex value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the softwareVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVendor() {
        return softwareVendor;
    }

    /**
     * Sets the value of the softwareVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVendor(String value) {
        this.softwareVendor = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSoftwareVersion(BigDecimal value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the sourceContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceContactEmail() {
        return sourceContactEmail;
    }

    /**
     * Sets the value of the sourceContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceContactEmail(String value) {
        this.sourceContactEmail = value;
    }

    /**
     * Gets the value of the sourceContactExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceContactExtension() {
        return sourceContactExtension;
    }

    /**
     * Sets the value of the sourceContactExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceContactExtension(String value) {
        this.sourceContactExtension = value;
    }

    /**
     * Gets the value of the sourceContactFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceContactFirst() {
        return sourceContactFirst;
    }

    /**
     * Sets the value of the sourceContactFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceContactFirst(String value) {
        this.sourceContactFirst = value;
    }

    /**
     * Gets the value of the sourceContactLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceContactLast() {
        return sourceContactLast;
    }

    /**
     * Sets the value of the sourceContactLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceContactLast(String value) {
        this.sourceContactLast = value;
    }

    /**
     * Gets the value of the sourceContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceContactPhone() {
        return sourceContactPhone;
    }

    /**
     * Sets the value of the sourceContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceContactPhone(String value) {
        this.sourceContactPhone = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the export property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the export property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Export }
     * 
     * 
     */
    public List<Export> getExport() {
        if (export == null) {
            export = new ArrayList<Export>();
        }
        return this.export;
    }

}
