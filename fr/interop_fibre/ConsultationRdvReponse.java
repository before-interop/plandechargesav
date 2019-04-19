
package fr.interop_fibre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ConsultationRdvReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultationRdvReponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeReponse" type="{http://interop-fibre.fr}codeReponseType"/>
 *         &lt;element name="idRendezVous" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="codeInsee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeIntervention" type="{http://interop-fibre.fr}typeInterventionType"/>
 *         &lt;element name="natureProduit" type="{http://interop-fibre.fr}natureProduitType" minOccurs="0"/>
 *         &lt;element name="segmentMarche" type="{http://interop-fibre.fr}segmentMarcheType" minOccurs="0"/>
 *         &lt;element name="statutRendezVous" type="{http://interop-fibre.fr}statutRendezVousType"/>
 *         &lt;element name="referencePrestationPrise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultationRdvReponse", propOrder = {
    "codeReponse",
    "idRendezVous",
    "dateDebut",
    "dateFin",
    "codeInsee",
    "typeIntervention",
    "natureProduit",
    "segmentMarche",
    "statutRendezVous",
    "referencePrestationPrise"
})
public class ConsultationRdvReponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CodeReponseType codeReponse;
    @XmlElement(required = true)
    protected String idRendezVous;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebut;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFin;
    protected int codeInsee;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeInterventionType typeIntervention;
    @XmlElementRef(name = "natureProduit", type = JAXBElement.class, required = false)
    protected JAXBElement<NatureProduitType> natureProduit;
    @XmlElementRef(name = "segmentMarche", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentMarcheType> segmentMarche;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatutRendezVousType statutRendezVous;
    @XmlElementRef(name = "referencePrestationPrise", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencePrestationPrise;

    /**
     * Obtient la valeur de la propriété codeReponse.
     * 
     * @return
     *     possible object is
     *     {@link CodeReponseType }
     *     
     */
    public CodeReponseType getCodeReponse() {
        return codeReponse;
    }

    /**
     * Définit la valeur de la propriété codeReponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeReponseType }
     *     
     */
    public void setCodeReponse(CodeReponseType value) {
        this.codeReponse = value;
    }

    /**
     * Obtient la valeur de la propriété idRendezVous.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRendezVous() {
        return idRendezVous;
    }

    /**
     * Définit la valeur de la propriété idRendezVous.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRendezVous(String value) {
        this.idRendezVous = value;
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
     * Obtient la valeur de la propriété codeInsee.
     * 
     */
    public int getCodeInsee() {
        return codeInsee;
    }

    /**
     * Définit la valeur de la propriété codeInsee.
     * 
     */
    public void setCodeInsee(int value) {
        this.codeInsee = value;
    }

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
     *     {@link JAXBElement }{@code <}{@link NatureProduitType }{@code >}
     *     
     */
    public JAXBElement<NatureProduitType> getNatureProduit() {
        return natureProduit;
    }

    /**
     * Définit la valeur de la propriété natureProduit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NatureProduitType }{@code >}
     *     
     */
    public void setNatureProduit(JAXBElement<NatureProduitType> value) {
        this.natureProduit = value;
    }

    /**
     * Obtient la valeur de la propriété segmentMarche.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SegmentMarcheType }{@code >}
     *     
     */
    public JAXBElement<SegmentMarcheType> getSegmentMarche() {
        return segmentMarche;
    }

    /**
     * Définit la valeur de la propriété segmentMarche.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SegmentMarcheType }{@code >}
     *     
     */
    public void setSegmentMarche(JAXBElement<SegmentMarcheType> value) {
        this.segmentMarche = value;
    }

    /**
     * Obtient la valeur de la propriété statutRendezVous.
     * 
     * @return
     *     possible object is
     *     {@link StatutRendezVousType }
     *     
     */
    public StatutRendezVousType getStatutRendezVous() {
        return statutRendezVous;
    }

    /**
     * Définit la valeur de la propriété statutRendezVous.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutRendezVousType }
     *     
     */
    public void setStatutRendezVous(StatutRendezVousType value) {
        this.statutRendezVous = value;
    }

    /**
     * Obtient la valeur de la propriété referencePrestationPrise.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencePrestationPrise() {
        return referencePrestationPrise;
    }

    /**
     * Définit la valeur de la propriété referencePrestationPrise.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencePrestationPrise(JAXBElement<String> value) {
        this.referencePrestationPrise = value;
    }

}
