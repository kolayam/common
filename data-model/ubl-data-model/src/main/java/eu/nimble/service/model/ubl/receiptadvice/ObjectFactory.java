//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.24 at 09:44:04 AM MSK 
//


package eu.nimble.service.model.ubl.receiptadvice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.nimble.service.model.ubl.receiptadvice package. 
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

    private final static QName _ReceiptAdvice_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:ReceiptAdvice-2", "ReceiptAdvice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.nimble.service.model.ubl.receiptadvice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReceiptAdviceType }
     * 
     */
    public ReceiptAdviceType createReceiptAdviceType() {
        return new ReceiptAdviceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptAdviceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:ReceiptAdvice-2", name = "ReceiptAdvice")
    public JAXBElement<ReceiptAdviceType> createReceiptAdvice(ReceiptAdviceType value) {
        return new JAXBElement<ReceiptAdviceType>(_ReceiptAdvice_QNAME, ReceiptAdviceType.class, null, value);
    }

}
