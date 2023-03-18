//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.18 at 05:25:29 PM EET 
//


package com.eks.WeatherApp.pojo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Tempmax_QNAME = new QName("", "tempmax");
    private final static QName _Speedmin_QNAME = new QName("", "speedmin");
    private final static QName _Speedmax_QNAME = new QName("", "speedmax");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Phenomenon_QNAME = new QName("", "phenomenon");
    private final static QName _Text_QNAME = new QName("", "text");
    private final static QName _Peipsi_QNAME = new QName("", "peipsi");
    private final static QName _Tempmin_QNAME = new QName("", "tempmin");
    private final static QName _Sea_QNAME = new QName("", "sea");
    private final static QName _Direction_QNAME = new QName("", "direction");
    private final static QName _Gust_QNAME = new QName("", "gust");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Night }
     * 
     */
    public Night createNight() {
        return new Night();
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link Wind }
     * 
     */
    public Wind createWind() {
        return new Wind();
    }

    /**
     * Create an instance of {@link Forecast }
     * 
     */
    public Forecast createForecast() {
        return new Forecast();
    }

    /**
     * Create an instance of {@link Day }
     * 
     */
    public Day createDay() {
        return new Day();
    }

    /**
     * Create an instance of {@link Forecasts }
     * 
     */
    public Forecasts createForecasts() {
        return new Forecasts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tempmax")
    public JAXBElement<Byte> createTempmax(Byte value) {
        return new JAXBElement<Byte>(_Tempmax_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "speedmin")
    public JAXBElement<Byte> createSpeedmin(Byte value) {
        return new JAXBElement<Byte>(_Speedmin_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "speedmax")
    public JAXBElement<Byte> createSpeedmax(Byte value) {
        return new JAXBElement<Byte>(_Speedmax_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phenomenon")
    public JAXBElement<String> createPhenomenon(String value) {
        return new JAXBElement<String>(_Phenomenon_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "peipsi")
    public JAXBElement<String> createPeipsi(String value) {
        return new JAXBElement<String>(_Peipsi_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tempmin")
    public JAXBElement<Byte> createTempmin(Byte value) {
        return new JAXBElement<Byte>(_Tempmin_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sea")
    public JAXBElement<String> createSea(String value) {
        return new JAXBElement<String>(_Sea_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "direction")
    public JAXBElement<String> createDirection(String value) {
        return new JAXBElement<String>(_Direction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gust")
    public JAXBElement<Byte> createGust(Byte value) {
        return new JAXBElement<Byte>(_Gust_QNAME, Byte.class, null, value);
    }

}
