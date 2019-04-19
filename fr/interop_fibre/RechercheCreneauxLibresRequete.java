
package fr.interop_fibre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeIntervention" type="{http://interop-fibre.fr}typeInterventionType"/>
 *         &lt;element name="natureProduit" type="{http://interop-fibre.fr}natureProduitType"/>
 *         &lt;element name="segmentMarche" type="{http://interop-fibre.fr}segmentMarcheType"/>
 *         &lt;element name="technicalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercialId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeInsee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="defectPrelocalization" type="{http://interop-fibre.fr}defectPrelocalizationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "typeIntervention",
    "natureProduit",
    "segmentMarche",
    "technicalId",
    "commercialId",
    "codeInsee",
    "dateDebut",
    "dateFin",
    "defectPrelocalization"
})
@XmlRootElement(name = "RechercheCreneauxLibresRequete")
public class RechercheCreneauxLibresRequete {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeInterventionType typeIntervention;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NatureProduitType natureProduit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SegmentMarcheType segmentMarche;
    @XmlElementRef(name = "technicalId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> technicalId;
    @XmlElementRef(name = "commercialId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commercialId;
    @XmlElement(required = true)
    protected String codeInsee;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebut;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DefectPrelocalizationType defectPrelocalization;

    /**
     * Obtient la valeur de la propriété typeIntervention.
     * 
     * @return
     *     possible object is
     *     {@link TypeInterventionType }
     *     
     */
    public TypeInterventionType getTypeIntervention() {
        return typeIntervention;
    }

    /**
     * Définit la valeur de la propriété typeIntervention.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInterventionType }
     *     
     */
    public void setTypeIntervention(TypeInterventionType value) {
        this.typeIntervention = value;
    }

    /**
     * Obtient la valeur de la propriété natureProduit.
     * 
     * @return
     *     possible object is
     *     {@link NatureProduitType }
     *     
     */
    public NatureProduitType getNatureProduit() {
        return natureProduit;
    }

    /**
     * Définit la valeur de la propriété natureProduit.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureProduitType }
     *     
     */
    public void setNatureProduit(NatureProduitType value) {
        this.natureProduit = value;
    }

    /**
     * Obtient la valeur de la propriété segmentMarche.
     * 
     * @return
     *     possible object is
     *     {@link SegmentMarcheType }
     *     
     */
    public SegmentMarcheType getSegmentMarche() {
        return segmentMarche;
    }

    /**
     * Définit la valeur de la propriété segmentMarche.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentMarcheType }
     *     
     */
    public void setSegmentMarche(SegmentMarcheType value) {
        this.segmentMarche = value;
    }

    /**
     * Obtient la valeur de la propriété technicalId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTechnicalId() {
        return technicalId;
    }

    /**
     * Définit la valeur de la propriété technicalId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTechnicalId(JAXBElement<String> value) {
        this.technicalId = value;
    }

    /**
     * Obtient la valeur de la propriété commercialId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommercialId() {
        return commercialId;
    }

    /**
     * Définit la valeur de la propriété commercialId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommercialId(JAXBElement<String> value) {
        this.commercialId = value;
    }

    /**
     * Obtient la valeur de la propriété codeInsee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeInsee() {
        return codeInsee;
    }

    /**
     * Définit la valeur de la propriété codeInsee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeInsee(String value) {
        this.codeInsee = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebut() {
        return dateDebut;
    }

    /**
     * Définit la valeur de la propriété dateDebut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebut(XMLGregorianCalendar value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFin() {
        return dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFin(XMLGregorianCalendar value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propriété defectPrelocalization.
     * 
     * @return
     *     possible object is
     *     {@link DefectPrelocalizationType }
     *     
     */
    public DefectPrelocalizationType getDefectPrelocalization() {
        return defectPrelocalization;
    }

    /**
     * Définit la valeur de la propriété defectPrelocalization.
     * 
     * @param value
     *     allowed object is
     *     {@link DefectPrelocalizationType }
     *     
     */
    public void setDefectPrelocalization(DefectPrelocalizationType value) {
        this.defectPrelocalization = value;
    }

}
