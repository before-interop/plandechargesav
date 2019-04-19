
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="codeInsee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idRendezvous" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="natureReport" type="{http://interop-fibre.fr}natureReportType"/>
 *         &lt;element name="idCreneau" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "codeInsee",
    "idRendezvous",
    "natureReport",
    "idCreneau"
})
@XmlRootElement(name = "ReportRDVRequete")
public class ReportRDVRequete {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeInterventionType typeIntervention;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NatureProduitType natureProduit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SegmentMarcheType segmentMarche;
    @XmlElement(required = true)
    protected String codeInsee;
    @XmlElement(required = true)
    protected String idRendezvous;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NatureReportType natureReport;
    @XmlElement(required = true)
    protected String idCreneau;

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
     * Obtient la valeur de la propriété idRendezvous.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRendezvous() {
        return idRendezvous;
    }

    /**
     * Définit la valeur de la propriété idRendezvous.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRendezvous(String value) {
        this.idRendezvous = value;
    }

    /**
     * Obtient la valeur de la propriété natureReport.
     * 
     * @return
     *     possible object is
     *     {@link NatureReportType }
     *     
     */
    public NatureReportType getNatureReport() {
        return natureReport;
    }

    /**
     * Définit la valeur de la propriété natureReport.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureReportType }
     *     
     */
    public void setNatureReport(NatureReportType value) {
        this.natureReport = value;
    }

    /**
     * Obtient la valeur de la propriété idCreneau.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCreneau() {
        return idCreneau;
    }

    /**
     * Définit la valeur de la propriété idCreneau.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCreneau(String value) {
        this.idCreneau = value;
    }

}
