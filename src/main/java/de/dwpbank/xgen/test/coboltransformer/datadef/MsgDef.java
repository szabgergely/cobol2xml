//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.13 at 06:34:55 AM CET 
//


package de.dwpbank.xgen.test.coboltransformer.datadef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TypeAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="History" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}AttributeSet"/>
 *         &lt;element ref="{}Fields"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FileId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FileVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creator",
    "date",
    "author",
    "typeAlias",
    "history",
    "attributeSet",
    "fields"
})
@XmlRootElement(name = "MsgDef")
public class MsgDef {

    @XmlElement(name = "Creator", required = true)
    protected String creator;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Author", required = true)
    protected String author;
    @XmlElement(name = "TypeAlias", required = true)
    protected String typeAlias;
    @XmlElement(name = "History", required = true)
    protected String history;
    @XmlElement(name = "AttributeSet", required = true)
    protected AttributeSet attributeSet;
    @XmlElement(name = "Fields", required = true)
    protected Fields fields;
    @XmlAttribute(name = "Count", required = true)
    protected String count;
    @XmlAttribute(name = "FileId", required = true)
    protected String fileId;
    @XmlAttribute(name = "FileVersion", required = true)
    protected String fileVersion;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the typeAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAlias() {
        return typeAlias;
    }

    /**
     * Sets the value of the typeAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAlias(String value) {
        this.typeAlias = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistory(String value) {
        this.history = value;
    }

    /**
     * Gets the value of the attributeSet property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSet }
     *     
     */
    public AttributeSet getAttributeSet() {
        return attributeSet;
    }

    /**
     * Sets the value of the attributeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSet }
     *     
     */
    public void setAttributeSet(AttributeSet value) {
        this.attributeSet = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link Fields }
     *     
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fields }
     *     
     */
    public void setFields(Fields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the fileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileVersion() {
        return fileVersion;
    }

    /**
     * Sets the value of the fileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileVersion(String value) {
        this.fileVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    @Override
    public String toString() {
        return "MsgDef{" + "creator=" + creator + ", date=" + date + ", author=" + author + ", typeAlias=" + typeAlias + ", history=" + history + ", attributeSet=" + attributeSet + ", fields=" + fields + ", count=" + count + ", fileId=" + fileId + ", fileVersion=" + fileVersion + ", version=" + version + '}';
    }

}
