//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.24 at 09:44:04 AM MSK 
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import eu.nimble.service.model.ubl.commonbasiccomponents.BinaryObjectType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProductImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ManufacturersItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemSpecificationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ManufacturerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Dimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportationServiceDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TrackAndTraceDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "description",
    "name",
    "productImage",
    "manufacturersItemIdentification",
    "catalogueDocumentReference",
    "itemSpecificationDocumentReference",
    "commodityClassification",
    "additionalItemProperty",
    "manufacturerParty",
    "certificate",
    "dimension",
    "transportationServiceDetails",
    "trackAndTraceDetails"
})
@Entity(name = "ItemType")
@Table(name = "ITEM_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class ItemType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String description;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String name;
    @XmlElement(name = "ProductImage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<BinaryObjectType> productImage;
    @XmlElement(name = "ManufacturersItemIdentification")
    protected ItemIdentificationType manufacturersItemIdentification;
    @XmlElement(name = "CatalogueDocumentReference")
    protected DocumentReferenceType catalogueDocumentReference;
    @XmlElement(name = "ItemSpecificationDocumentReference")
    protected List<DocumentReferenceType> itemSpecificationDocumentReference;
    @XmlElement(name = "CommodityClassification")
    protected List<CommodityClassificationType> commodityClassification;
    @XmlElement(name = "AdditionalItemProperty")
    protected List<ItemPropertyType> additionalItemProperty;
    @XmlElement(name = "ManufacturerParty")
    protected PartyType manufacturerParty;
    @XmlElement(name = "Certificate")
    protected List<CertificateType> certificate;
    @XmlElement(name = "Dimension")
    protected List<DimensionType> dimension;
    @XmlElement(name = "TransportationServiceDetails")
    protected TransportationServiceType transportationServiceDetails;
    @XmlElement(name = "TrackAndTraceDetails")
    protected TrackAndTraceDetailsType trackAndTraceDetails;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESCRIPTION", columnDefinition = "TEXT", length = 255)
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_", columnDefinition = "TEXT", length = 255)
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the productImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryObjectType }
     * 
     * 
     */
    @OneToMany(targetEntity = BinaryObjectType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRODUCT_IMAGE_ITEM_TYPE_HJID")
    public List<BinaryObjectType> getProductImage() {
        if (productImage == null) {
            productImage = new ArrayList<BinaryObjectType>();
        }
        return this.productImage;
    }

    /**
     * 
     * 
     */
    public void setProductImage(List<BinaryObjectType> productImage) {
        this.productImage = productImage;
    }

    /**
     * Gets the value of the manufacturersItemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    @ManyToOne(targetEntity = ItemIdentificationType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MANUFACTURERS_ITEM_IDENTIFIC_1")
    public ItemIdentificationType getManufacturersItemIdentification() {
        return manufacturersItemIdentification;
    }

    /**
     * Sets the value of the manufacturersItemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setManufacturersItemIdentification(ItemIdentificationType value) {
        this.manufacturersItemIdentification = value;
    }

    /**
     * Gets the value of the catalogueDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    @ManyToOne(targetEntity = DocumentReferenceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CATALOGUE_DOCUMENT_REFERENCE_0")
    public DocumentReferenceType getCatalogueDocumentReference() {
        return catalogueDocumentReference;
    }

    /**
     * Sets the value of the catalogueDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCatalogueDocumentReference(DocumentReferenceType value) {
        this.catalogueDocumentReference = value;
    }

    /**
     * Gets the value of the itemSpecificationDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSpecificationDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSpecificationDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    @OneToMany(targetEntity = DocumentReferenceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ITEM_SPECIFICATION_DOCUMENT__1")
    public List<DocumentReferenceType> getItemSpecificationDocumentReference() {
        if (itemSpecificationDocumentReference == null) {
            itemSpecificationDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.itemSpecificationDocumentReference;
    }

    /**
     * 
     * 
     */
    public void setItemSpecificationDocumentReference(List<DocumentReferenceType> itemSpecificationDocumentReference) {
        this.itemSpecificationDocumentReference = itemSpecificationDocumentReference;
    }

    /**
     * Gets the value of the commodityClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    @OneToMany(targetEntity = CommodityClassificationType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COMMODITY_CLASSIFICATION_ITE_0")
    public List<CommodityClassificationType> getCommodityClassification() {
        if (commodityClassification == null) {
            commodityClassification = new ArrayList<CommodityClassificationType>();
        }
        return this.commodityClassification;
    }

    /**
     * 
     * 
     */
    public void setCommodityClassification(List<CommodityClassificationType> commodityClassification) {
        this.commodityClassification = commodityClassification;
    }

    /**
     * Gets the value of the additionalItemProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = ItemPropertyType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDITIONAL_ITEM_PROPERTY_ITE_0")
    public List<ItemPropertyType> getAdditionalItemProperty() {
        if (additionalItemProperty == null) {
            additionalItemProperty = new ArrayList<ItemPropertyType>();
        }
        return this.additionalItemProperty;
    }

    /**
     * 
     * 
     */
    public void setAdditionalItemProperty(List<ItemPropertyType> additionalItemProperty) {
        this.additionalItemProperty = additionalItemProperty;
    }

    /**
     * Gets the value of the manufacturerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    @ManyToOne(targetEntity = PartyType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MANUFACTURER_PARTY_ITEM_TYPE_0")
    public PartyType getManufacturerParty() {
        return manufacturerParty;
    }

    /**
     * Sets the value of the manufacturerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setManufacturerParty(PartyType value) {
        this.manufacturerParty = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateType }
     * 
     * 
     */
    @OneToMany(targetEntity = CertificateType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CERTIFICATE_ITEM_TYPE_HJID")
    public List<CertificateType> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<CertificateType>();
        }
        return this.certificate;
    }

    /**
     * 
     * 
     */
    public void setCertificate(List<CertificateType> certificate) {
        this.certificate = certificate;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = DimensionType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DIMENSION_ITEM_TYPE_HJID")
    public List<DimensionType> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<DimensionType>();
        }
        return this.dimension;
    }

    /**
     * 
     * 
     */
    public void setDimension(List<DimensionType> dimension) {
        this.dimension = dimension;
    }

    /**
     * Gets the value of the transportationServiceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceType }
     *     
     */
    @ManyToOne(targetEntity = TransportationServiceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TRANSPORTATION_SERVICE_DETAI_1")
    public TransportationServiceType getTransportationServiceDetails() {
        return transportationServiceDetails;
    }

    /**
     * Sets the value of the transportationServiceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceType }
     *     
     */
    public void setTransportationServiceDetails(TransportationServiceType value) {
        this.transportationServiceDetails = value;
    }

    /**
     * Gets the value of the trackAndTraceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TrackAndTraceDetailsType }
     *     
     */
    @ManyToOne(targetEntity = TrackAndTraceDetailsType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TRACK_AND_TRACE_DETAILS_ITEM_0")
    public TrackAndTraceDetailsType getTrackAndTraceDetails() {
        return trackAndTraceDetails;
    }

    /**
     * Sets the value of the trackAndTraceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAndTraceDetailsType }
     *     
     */
    public void setTrackAndTraceDetails(TrackAndTraceDetailsType value) {
        this.trackAndTraceDetails = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemType that = ((ItemType) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            List<BinaryObjectType> lhsProductImage;
            lhsProductImage = (((this.productImage!= null)&&(!this.productImage.isEmpty()))?this.getProductImage():null);
            List<BinaryObjectType> rhsProductImage;
            rhsProductImage = (((that.productImage!= null)&&(!that.productImage.isEmpty()))?that.getProductImage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productImage", lhsProductImage), LocatorUtils.property(thatLocator, "productImage", rhsProductImage), lhsProductImage, rhsProductImage)) {
                return false;
            }
        }
        {
            ItemIdentificationType lhsManufacturersItemIdentification;
            lhsManufacturersItemIdentification = this.getManufacturersItemIdentification();
            ItemIdentificationType rhsManufacturersItemIdentification;
            rhsManufacturersItemIdentification = that.getManufacturersItemIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturersItemIdentification", lhsManufacturersItemIdentification), LocatorUtils.property(thatLocator, "manufacturersItemIdentification", rhsManufacturersItemIdentification), lhsManufacturersItemIdentification, rhsManufacturersItemIdentification)) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsCatalogueDocumentReference;
            lhsCatalogueDocumentReference = this.getCatalogueDocumentReference();
            DocumentReferenceType rhsCatalogueDocumentReference;
            rhsCatalogueDocumentReference = that.getCatalogueDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catalogueDocumentReference", lhsCatalogueDocumentReference), LocatorUtils.property(thatLocator, "catalogueDocumentReference", rhsCatalogueDocumentReference), lhsCatalogueDocumentReference, rhsCatalogueDocumentReference)) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsItemSpecificationDocumentReference;
            lhsItemSpecificationDocumentReference = (((this.itemSpecificationDocumentReference!= null)&&(!this.itemSpecificationDocumentReference.isEmpty()))?this.getItemSpecificationDocumentReference():null);
            List<DocumentReferenceType> rhsItemSpecificationDocumentReference;
            rhsItemSpecificationDocumentReference = (((that.itemSpecificationDocumentReference!= null)&&(!that.itemSpecificationDocumentReference.isEmpty()))?that.getItemSpecificationDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemSpecificationDocumentReference", lhsItemSpecificationDocumentReference), LocatorUtils.property(thatLocator, "itemSpecificationDocumentReference", rhsItemSpecificationDocumentReference), lhsItemSpecificationDocumentReference, rhsItemSpecificationDocumentReference)) {
                return false;
            }
        }
        {
            List<CommodityClassificationType> lhsCommodityClassification;
            lhsCommodityClassification = (((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty()))?this.getCommodityClassification():null);
            List<CommodityClassificationType> rhsCommodityClassification;
            rhsCommodityClassification = (((that.commodityClassification!= null)&&(!that.commodityClassification.isEmpty()))?that.getCommodityClassification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commodityClassification", lhsCommodityClassification), LocatorUtils.property(thatLocator, "commodityClassification", rhsCommodityClassification), lhsCommodityClassification, rhsCommodityClassification)) {
                return false;
            }
        }
        {
            List<ItemPropertyType> lhsAdditionalItemProperty;
            lhsAdditionalItemProperty = (((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty()))?this.getAdditionalItemProperty():null);
            List<ItemPropertyType> rhsAdditionalItemProperty;
            rhsAdditionalItemProperty = (((that.additionalItemProperty!= null)&&(!that.additionalItemProperty.isEmpty()))?that.getAdditionalItemProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalItemProperty", lhsAdditionalItemProperty), LocatorUtils.property(thatLocator, "additionalItemProperty", rhsAdditionalItemProperty), lhsAdditionalItemProperty, rhsAdditionalItemProperty)) {
                return false;
            }
        }
        {
            PartyType lhsManufacturerParty;
            lhsManufacturerParty = this.getManufacturerParty();
            PartyType rhsManufacturerParty;
            rhsManufacturerParty = that.getManufacturerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerParty", lhsManufacturerParty), LocatorUtils.property(thatLocator, "manufacturerParty", rhsManufacturerParty), lhsManufacturerParty, rhsManufacturerParty)) {
                return false;
            }
        }
        {
            List<CertificateType> lhsCertificate;
            lhsCertificate = (((this.certificate!= null)&&(!this.certificate.isEmpty()))?this.getCertificate():null);
            List<CertificateType> rhsCertificate;
            rhsCertificate = (((that.certificate!= null)&&(!that.certificate.isEmpty()))?that.getCertificate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificate", lhsCertificate), LocatorUtils.property(thatLocator, "certificate", rhsCertificate), lhsCertificate, rhsCertificate)) {
                return false;
            }
        }
        {
            List<DimensionType> lhsDimension;
            lhsDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            List<DimensionType> rhsDimension;
            rhsDimension = (((that.dimension!= null)&&(!that.dimension.isEmpty()))?that.getDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dimension", lhsDimension), LocatorUtils.property(thatLocator, "dimension", rhsDimension), lhsDimension, rhsDimension)) {
                return false;
            }
        }
        {
            TransportationServiceType lhsTransportationServiceDetails;
            lhsTransportationServiceDetails = this.getTransportationServiceDetails();
            TransportationServiceType rhsTransportationServiceDetails;
            rhsTransportationServiceDetails = that.getTransportationServiceDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportationServiceDetails", lhsTransportationServiceDetails), LocatorUtils.property(thatLocator, "transportationServiceDetails", rhsTransportationServiceDetails), lhsTransportationServiceDetails, rhsTransportationServiceDetails)) {
                return false;
            }
        }
        {
            TrackAndTraceDetailsType lhsTrackAndTraceDetails;
            lhsTrackAndTraceDetails = this.getTrackAndTraceDetails();
            TrackAndTraceDetailsType rhsTrackAndTraceDetails;
            rhsTrackAndTraceDetails = that.getTrackAndTraceDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackAndTraceDetails", lhsTrackAndTraceDetails), LocatorUtils.property(thatLocator, "trackAndTraceDetails", rhsTrackAndTraceDetails), lhsTrackAndTraceDetails, rhsTrackAndTraceDetails)) {
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
