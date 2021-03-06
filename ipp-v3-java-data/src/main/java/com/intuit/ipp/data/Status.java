/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 		        Product: QBW
 * 		        Description: generic meta data response for any add mod
 * 		      
 * 
 * <p>Java class for Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", propOrder = {
    "requestId",
    "batchId",
    "objectType",
    "stateCode",
    "stateDesc",
    "messageCode",
    "messageDesc"
})
public class Status
    extends IntuitEntity
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "BatchId")
    protected String batchId;
    @XmlElement(name = "ObjectType", required = true)
    protected String objectType;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "StateDesc")
    protected String stateDesc;
    @XmlElement(name = "MessageCode")
    protected String messageCode;
    @XmlElement(name = "MessageDesc")
    protected String messageDesc;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the stateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateDesc() {
        return stateDesc;
    }

    /**
     * Sets the value of the stateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateDesc(String value) {
        this.stateDesc = value;
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the messageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDesc() {
        return messageDesc;
    }

    /**
     * Sets the value of the messageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDesc(String value) {
        this.messageDesc = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Status)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Status that = ((Status) object);
        {
            String lhsRequestId;
            lhsRequestId = this.getRequestId();
            String rhsRequestId;
            rhsRequestId = that.getRequestId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestId", lhsRequestId), LocatorUtils.property(thatLocator, "requestId", rhsRequestId), lhsRequestId, rhsRequestId)) {
                return false;
            }
        }
        {
            String lhsBatchId;
            lhsBatchId = this.getBatchId();
            String rhsBatchId;
            rhsBatchId = that.getBatchId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "batchId", lhsBatchId), LocatorUtils.property(thatLocator, "batchId", rhsBatchId), lhsBatchId, rhsBatchId)) {
                return false;
            }
        }
        {
            String lhsObjectType;
            lhsObjectType = this.getObjectType();
            String rhsObjectType;
            rhsObjectType = that.getObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectType", lhsObjectType), LocatorUtils.property(thatLocator, "objectType", rhsObjectType), lhsObjectType, rhsObjectType)) {
                return false;
            }
        }
        {
            String lhsStateCode;
            lhsStateCode = this.getStateCode();
            String rhsStateCode;
            rhsStateCode = that.getStateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateCode", lhsStateCode), LocatorUtils.property(thatLocator, "stateCode", rhsStateCode), lhsStateCode, rhsStateCode)) {
                return false;
            }
        }
        {
            String lhsStateDesc;
            lhsStateDesc = this.getStateDesc();
            String rhsStateDesc;
            rhsStateDesc = that.getStateDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateDesc", lhsStateDesc), LocatorUtils.property(thatLocator, "stateDesc", rhsStateDesc), lhsStateDesc, rhsStateDesc)) {
                return false;
            }
        }
        {
            String lhsMessageCode;
            lhsMessageCode = this.getMessageCode();
            String rhsMessageCode;
            rhsMessageCode = that.getMessageCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageCode", lhsMessageCode), LocatorUtils.property(thatLocator, "messageCode", rhsMessageCode), lhsMessageCode, rhsMessageCode)) {
                return false;
            }
        }
        {
            String lhsMessageDesc;
            lhsMessageDesc = this.getMessageDesc();
            String rhsMessageDesc;
            rhsMessageDesc = that.getMessageDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageDesc", lhsMessageDesc), LocatorUtils.property(thatLocator, "messageDesc", rhsMessageDesc), lhsMessageDesc, rhsMessageDesc)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theRequestId;
            theRequestId = this.getRequestId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestId", theRequestId), currentHashCode, theRequestId);
        }
        {
            String theBatchId;
            theBatchId = this.getBatchId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchId", theBatchId), currentHashCode, theBatchId);
        }
        {
            String theObjectType;
            theObjectType = this.getObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectType", theObjectType), currentHashCode, theObjectType);
        }
        {
            String theStateCode;
            theStateCode = this.getStateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateCode", theStateCode), currentHashCode, theStateCode);
        }
        {
            String theStateDesc;
            theStateDesc = this.getStateDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateDesc", theStateDesc), currentHashCode, theStateDesc);
        }
        {
            String theMessageCode;
            theMessageCode = this.getMessageCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageCode", theMessageCode), currentHashCode, theMessageCode);
        }
        {
            String theMessageDesc;
            theMessageDesc = this.getMessageDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageDesc", theMessageDesc), currentHashCode, theMessageDesc);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
