
package fr.interop_fibre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReservationCreneauReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReservationCreneauReponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeReponse" type="{http://interop-fibre.fr}codeReponseType"/>
 *         &lt;element name="idRendezvous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationCreneauReponse", propOrder = {
    "codeReponse",
    "idRendezvous"
})
public class ReservationCreneauReponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CodeReponseType codeReponse;
    @XmlElementRef(name = "idRendezvous", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idRendezvous;

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
     * Obtient la valeur de la propriété idRendezvous.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdRendezvous() {
        return idRendezvous;
    }

    /**
     * Définit la valeur de la propriété idRendezvous.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdRendezvous(JAXBElement<String> value) {
        this.idRendezvous = value;
    }

}
