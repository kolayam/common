//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.24 at 10:06:20 AM MSK 
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for DemandLastSeenInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandLastSeenInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastSeenDemandID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PersonID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandLastSeenInfo", propOrder = {
    "lastSeenDemandID",
    "personID"
})
@Entity(name = "DemandLastSeenInfo")
@Table(name = "DEMAND_LAST_SEEN_INFO")
@Inheritance(strategy = InheritanceType.JOINED)
public class DemandLastSeenInfo
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LastSeenDemandID")
    protected long lastSeenDemandID;
    @XmlElement(name = "PersonID", required = true)
    protected String personID;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the lastSeenDemandID property.
     * 
     */
    @Basic
    @Column(name = "LAST_SEEN_DEMAND_ID", precision = 20, scale = 0)
    public long getLastSeenDemandID() {
        return lastSeenDemandID;
    }

    /**
     * Sets the value of the lastSeenDemandID property.
     * 
     */
    public void setLastSeenDemandID(long value) {
        this.lastSeenDemandID = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PERSON_ID", length = 255)
    public String getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonID(String value) {
        this.personID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DemandLastSeenInfo that = ((DemandLastSeenInfo) object);
        {
            long lhsLastSeenDemandID;
            lhsLastSeenDemandID = this.getLastSeenDemandID();
            long rhsLastSeenDemandID;
            rhsLastSeenDemandID = that.getLastSeenDemandID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastSeenDemandID", lhsLastSeenDemandID), LocatorUtils.property(thatLocator, "lastSeenDemandID", rhsLastSeenDemandID), lhsLastSeenDemandID, rhsLastSeenDemandID)) {
                return false;
            }
        }
        {
            String lhsPersonID;
            lhsPersonID = this.getPersonID();
            String rhsPersonID;
            rhsPersonID = that.getPersonID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personID", lhsPersonID), LocatorUtils.property(thatLocator, "personID", rhsPersonID), lhsPersonID, rhsPersonID)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
