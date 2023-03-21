//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.18 at 05:25:29 PM EET 
//

package com.eks.WeatherApp.pojo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}night"/>
 *         &lt;element ref="{}day"/>
 *       &lt;/sequence>
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "night",
        "day"
})
@XmlRootElement(name = "forecast")
public class Forecast {

    @XmlElement(required = true)
    protected Night night;
    @XmlElement(required = true)
    protected Day day;
    @XmlAttribute(name = "date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the night property.
     * 
     * @return
     *         possible object is
     *         {@link Night }
     * 
     */
    public Night getNight() {
        return night;
    }

    /**
     * Sets the value of the night property.
     * 
     * @param value
     *              allowed object is
     *              {@link Night }
     * 
     */
    public void setNight(Night value) {
        this.night = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *         possible object is
     *         {@link Day }
     * 
     */
    public Day getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *              allowed object is
     *              {@link Day }
     * 
     */
    public void setDay(Day value) {
        this.day = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
