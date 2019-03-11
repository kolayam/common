//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 10:22:04 AM MSK 
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hibernate.annotations.Cascade;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for UnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UnitCode" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitType", propOrder = {
    "id",
    "unitCode"
})
@Entity(name = "UnitType")
@Table(name = "UNIT_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class UnitType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected String id;
    @XmlElement(name = "UnitCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected List<String> unitCode;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<UnitTypeUnitCodeItem> unitCodeItems;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ID", length = 255)
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Transient
    public List<String> getUnitCode() {
        if (unitCode == null) {
            unitCode = new ArrayList<String>();
        }
        return this.unitCode;
    }

    /**
     * 
     * 
     */
    public void setUnitCode(List<String> unitCode) {
        this.unitCode = unitCode;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UnitType that = ((UnitType) object);
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            List<String> lhsUnitCode;
            lhsUnitCode = (((this.unitCode!= null)&&(!this.unitCode.isEmpty()))?this.getUnitCode():null);
            List<String> rhsUnitCode;
            rhsUnitCode = (((that.unitCode!= null)&&(!that.unitCode.isEmpty()))?that.getUnitCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitCode", lhsUnitCode), LocatorUtils.property(thatLocator, "unitCode", rhsUnitCode), lhsUnitCode, rhsUnitCode)) {
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

    @OneToMany(orphanRemoval = true, targetEntity = UnitTypeUnitCodeItem.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "UNIT_CODE_ITEMS_UNIT_TYPE_HJ_0")
    public List<UnitTypeUnitCodeItem> getUnitCodeItems() {
        if (this.unitCodeItems == null) {
            this.unitCodeItems = new ArrayList<UnitTypeUnitCodeItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.unitCode)) {
            this.unitCode = ItemUtils.wrap(this.unitCode, this.unitCodeItems, UnitTypeUnitCodeItem.class);
        }
        return this.unitCodeItems;
    }

    public void setUnitCodeItems(List<UnitTypeUnitCodeItem> value) {
        this.unitCode = null;
        this.unitCodeItems = null;
        this.unitCodeItems = value;
        if (this.unitCodeItems == null) {
            this.unitCodeItems = new ArrayList<UnitTypeUnitCodeItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.unitCode)) {
            this.unitCode = ItemUtils.wrap(this.unitCode, this.unitCodeItems, UnitTypeUnitCodeItem.class);
        }
    }

}
