
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReportRDVReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReportRDVReponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeReponse" type="{http://interop-fibre.fr}codeReponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRDVReponse", propOrder = {
    "codeReponse"
})
public class ReportRDVReponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CodeReponseType codeReponse;

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

}
