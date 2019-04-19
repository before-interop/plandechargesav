
package fr.interop_fibre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RechercheCreneauxLibresReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RechercheCreneauxLibresReponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeReponse" type="{http://interop-fibre.fr}codeReponseType"/>
 *         &lt;element name="listeCreneau" type="{http://interop-fibre.fr}listeCreneauType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechercheCreneauxLibresReponse", propOrder = {
    "codeReponse",
    "listeCreneau"
})
public class RechercheCreneauxLibresReponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CodeReponseType codeReponse;
    @XmlElementRef(name = "listeCreneau", type = JAXBElement.class, required = false)
    protected JAXBElement<ListeCreneauType> listeCreneau;

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
     * Obtient la valeur de la propriété listeCreneau.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListeCreneauType }{@code >}
     *     
     */
    public JAXBElement<ListeCreneauType> getListeCreneau() {
        return listeCreneau;
    }

    /**
     * Définit la valeur de la propriété listeCreneau.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListeCreneauType }{@code >}
     *     
     */
    public void setListeCreneau(JAXBElement<ListeCreneauType> value) {
        this.listeCreneau = value;
    }

}
