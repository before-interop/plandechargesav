
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="idRendezVous" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idRendezVous"
})
@XmlRootElement(name = "ConsultationRdvRequete")
public class ConsultationRdvRequete {

    @XmlElement(required = true)
    protected String idRendezVous;

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

}
