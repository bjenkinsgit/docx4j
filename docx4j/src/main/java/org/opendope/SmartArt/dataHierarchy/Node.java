
package org.opendope.SmartArt.dataHierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://opendope.org/SmartArt/DataHierarchy}node"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="val" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="valRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imageRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sibTransContentRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "node"
})
@XmlRootElement(name = "node")
public class Node {

    @XmlElement(required = true)
    protected Node node;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short id;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedByte")
    protected Short val;
    @XmlAttribute
    protected String valRef;
    @XmlAttribute
    protected String imageRef;
    @XmlAttribute
    protected String sibTransContentRef;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setNode(Node value) {
        this.node = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(short value) {
        this.id = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVal(Short value) {
        this.val = value;
    }

    /**
     * Gets the value of the valRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValRef() {
        return valRef;
    }

    /**
     * Sets the value of the valRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValRef(String value) {
        this.valRef = value;
    }

    /**
     * Gets the value of the imageRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * Sets the value of the imageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRef(String value) {
        this.imageRef = value;
    }

    /**
     * Gets the value of the sibTransContentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSibTransContentRef() {
        return sibTransContentRef;
    }

    /**
     * Sets the value of the sibTransContentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSibTransContentRef(String value) {
        this.sibTransContentRef = value;
    }

}