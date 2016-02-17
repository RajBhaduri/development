/*******************************************************************************
 *  Copyright FUJITSU LIMITED 2016 
 *******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.05 at 01:29:11 PM CET 
//


package org.oscm.billingservice.business.model.billingresult;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Price models.
 * 
 * <p>Java class for PriceModelsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceModelsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceModel" type="{}PriceModelType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceModelsType", propOrder = {
    "priceModel"
})
public class PriceModelsType {

    @XmlElement(name = "PriceModel", required = true)
    protected List<PriceModelType> priceModel;

    /**
     * Gets the value of the priceModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceModelType }
     * 
     * 
     */
    public List<PriceModelType> getPriceModel() {
        if (priceModel == null) {
            priceModel = new ArrayList<PriceModelType>();
        }
        return this.priceModel;
    }

}
