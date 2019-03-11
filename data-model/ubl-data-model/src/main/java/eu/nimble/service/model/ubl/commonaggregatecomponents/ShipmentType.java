//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 08:49:53 AM MSK 
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.nimble.service.model.ubl.commonbasiccomponents.QuantityType;
import eu.nimble.service.model.ubl.commonbasiccomponents.TextType;
import org.hibernate.annotations.Cascade;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTransportHandlingUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Consignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", propOrder = {
    "id",
    "handlingInstructions",
    "totalTransportHandlingUnitQuantity",
    "consignment",
    "goodsItem",
    "shipmentStage",
    "transportHandlingUnit",
    "originAddress"
})
@Entity(name = "ShipmentType")
@Table(name = "SHIPMENT_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class ShipmentType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected String id;
    @XmlElement(name = "HandlingInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TextType> handlingInstructions;
    @XmlElement(name = "TotalTransportHandlingUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType totalTransportHandlingUnitQuantity;
    @XmlElement(name = "Consignment")
    protected List<ConsignmentType> consignment;
    @XmlElement(name = "GoodsItem")
    protected List<GoodsItemType> goodsItem;
    @XmlElement(name = "ShipmentStage")
    protected List<ShipmentStageType> shipmentStage;
    @XmlElement(name = "TransportHandlingUnit")
    protected List<TransportHandlingUnitType> transportHandlingUnit;
    @XmlElement(name = "OriginAddress")
    protected AddressType originAddress;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

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
     * Gets the value of the handlingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    @OneToMany(targetEntity = TextType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "HANDLING_INSTRUCTIONS_SHIPME_0")
    public List<TextType> getHandlingInstructions() {
        if (handlingInstructions == null) {
            handlingInstructions = new ArrayList<TextType>();
        }
        return this.handlingInstructions;
    }

    /**
     * 
     * 
     */
    public void setHandlingInstructions(List<TextType> handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }

    /**
     * Gets the value of the totalTransportHandlingUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    @ManyToOne(targetEntity = QuantityType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "TOTAL_TRANSPORT_HANDLING_UNI_1")
    public QuantityType getTotalTransportHandlingUnitQuantity() {
        return totalTransportHandlingUnitQuantity;
    }

    /**
     * Sets the value of the totalTransportHandlingUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTotalTransportHandlingUnitQuantity(QuantityType value) {
        this.totalTransportHandlingUnitQuantity = value;
    }

    /**
     * Gets the value of the consignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentType }
     * 
     * 
     */
    @OneToMany(orphanRemoval = true,targetEntity = ConsignmentType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "CONSIGNMENT_SHIPMENT_TYPE_HJ_0")
    public List<ConsignmentType> getConsignment() {
        if (consignment == null) {
            consignment = new ArrayList<ConsignmentType>();
        }
        return this.consignment;
    }

    /**
     * 
     * 
     */
    public void setConsignment(List<ConsignmentType> consignment) {
        this.consignment = consignment;
    }

    /**
     * Gets the value of the goodsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemType }
     * 
     * 
     */
    @OneToMany(orphanRemoval = true,targetEntity = GoodsItemType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "GOODS_ITEM_SHIPMENT_TYPE_HJID")
    public List<GoodsItemType> getGoodsItem() {
        if (goodsItem == null) {
            goodsItem = new ArrayList<GoodsItemType>();
        }
        return this.goodsItem;
    }

    /**
     * 
     * 
     */
    public void setGoodsItem(List<GoodsItemType> goodsItem) {
        this.goodsItem = goodsItem;
    }

    /**
     * Gets the value of the shipmentStage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    @OneToMany(orphanRemoval = true,targetEntity = ShipmentStageType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "SHIPMENT_STAGE_SHIPMENT_TYPE_0")
    public List<ShipmentStageType> getShipmentStage() {
        if (shipmentStage == null) {
            shipmentStage = new ArrayList<ShipmentStageType>();
        }
        return this.shipmentStage;
    }

    /**
     * 
     * 
     */
    public void setShipmentStage(List<ShipmentStageType> shipmentStage) {
        this.shipmentStage = shipmentStage;
    }

    /**
     * Gets the value of the transportHandlingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportHandlingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportHandlingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportHandlingUnitType }
     * 
     * 
     */
    @OneToMany(orphanRemoval = true,targetEntity = TransportHandlingUnitType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "TRANSPORT_HANDLING_UNIT_SHIP_0")
    public List<TransportHandlingUnitType> getTransportHandlingUnit() {
        if (transportHandlingUnit == null) {
            transportHandlingUnit = new ArrayList<TransportHandlingUnitType>();
        }
        return this.transportHandlingUnit;
    }

    /**
     * 
     * 
     */
    public void setTransportHandlingUnit(List<TransportHandlingUnitType> transportHandlingUnit) {
        this.transportHandlingUnit = transportHandlingUnit;
    }

    /**
     * Gets the value of the originAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    @ManyToOne(targetEntity = AddressType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "ORIGIN_ADDRESS_SHIPMENT_TYPE_0")
    public AddressType getOriginAddress() {
        return originAddress;
    }

    /**
     * Sets the value of the originAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setOriginAddress(AddressType value) {
        this.originAddress = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ShipmentType that = ((ShipmentType) object);
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
            List<TextType> lhsHandlingInstructions;
            lhsHandlingInstructions = (((this.handlingInstructions!= null)&&(!this.handlingInstructions.isEmpty()))?this.getHandlingInstructions():null);
            List<TextType> rhsHandlingInstructions;
            rhsHandlingInstructions = (((that.handlingInstructions!= null)&&(!that.handlingInstructions.isEmpty()))?that.getHandlingInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlingInstructions", lhsHandlingInstructions), LocatorUtils.property(thatLocator, "handlingInstructions", rhsHandlingInstructions), lhsHandlingInstructions, rhsHandlingInstructions)) {
                return false;
            }
        }
        {
            QuantityType lhsTotalTransportHandlingUnitQuantity;
            lhsTotalTransportHandlingUnitQuantity = this.getTotalTransportHandlingUnitQuantity();
            QuantityType rhsTotalTransportHandlingUnitQuantity;
            rhsTotalTransportHandlingUnitQuantity = that.getTotalTransportHandlingUnitQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalTransportHandlingUnitQuantity", lhsTotalTransportHandlingUnitQuantity), LocatorUtils.property(thatLocator, "totalTransportHandlingUnitQuantity", rhsTotalTransportHandlingUnitQuantity), lhsTotalTransportHandlingUnitQuantity, rhsTotalTransportHandlingUnitQuantity)) {
                return false;
            }
        }
        {
            List<ConsignmentType> lhsConsignment;
            lhsConsignment = (((this.consignment!= null)&&(!this.consignment.isEmpty()))?this.getConsignment():null);
            List<ConsignmentType> rhsConsignment;
            rhsConsignment = (((that.consignment!= null)&&(!that.consignment.isEmpty()))?that.getConsignment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consignment", lhsConsignment), LocatorUtils.property(thatLocator, "consignment", rhsConsignment), lhsConsignment, rhsConsignment)) {
                return false;
            }
        }
        {
            List<GoodsItemType> lhsGoodsItem;
            lhsGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            List<GoodsItemType> rhsGoodsItem;
            rhsGoodsItem = (((that.goodsItem!= null)&&(!that.goodsItem.isEmpty()))?that.getGoodsItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodsItem", lhsGoodsItem), LocatorUtils.property(thatLocator, "goodsItem", rhsGoodsItem), lhsGoodsItem, rhsGoodsItem)) {
                return false;
            }
        }
        {
            List<ShipmentStageType> lhsShipmentStage;
            lhsShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            List<ShipmentStageType> rhsShipmentStage;
            rhsShipmentStage = (((that.shipmentStage!= null)&&(!that.shipmentStage.isEmpty()))?that.getShipmentStage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentStage", lhsShipmentStage), LocatorUtils.property(thatLocator, "shipmentStage", rhsShipmentStage), lhsShipmentStage, rhsShipmentStage)) {
                return false;
            }
        }
        {
            List<TransportHandlingUnitType> lhsTransportHandlingUnit;
            lhsTransportHandlingUnit = (((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty()))?this.getTransportHandlingUnit():null);
            List<TransportHandlingUnitType> rhsTransportHandlingUnit;
            rhsTransportHandlingUnit = (((that.transportHandlingUnit!= null)&&(!that.transportHandlingUnit.isEmpty()))?that.getTransportHandlingUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportHandlingUnit", lhsTransportHandlingUnit), LocatorUtils.property(thatLocator, "transportHandlingUnit", rhsTransportHandlingUnit), lhsTransportHandlingUnit, rhsTransportHandlingUnit)) {
                return false;
            }
        }
        {
            AddressType lhsOriginAddress;
            lhsOriginAddress = this.getOriginAddress();
            AddressType rhsOriginAddress;
            rhsOriginAddress = that.getOriginAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originAddress", lhsOriginAddress), LocatorUtils.property(thatLocator, "originAddress", rhsOriginAddress), lhsOriginAddress, rhsOriginAddress)) {
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
