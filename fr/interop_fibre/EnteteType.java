
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="versionWS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horodatageRequete" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="horodatageReponse" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sirenOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sirenOI" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "versionWS",
    "horodatageRequete",
    "horodatageReponse",
    "sirenOC",
    "sirenOI"
})
@XmlRootElement(name = "EnteteType")
public class EnteteType {

    @XmlElement(required = true)
    protected String versionWS;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horodatageRequete;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horodatageReponse;
    @XmlElement(required = true)
    protected String sirenOC;
    @XmlElement(required = true)
    protected String sirenOI;

    /**
     * Obtient la valeur de la propriété versionWS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionWS() {
        return versionWS;
    }

    /**
     * Définit la valeur de la propriété versionWS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionWS(String value) {
        this.versionWS = value;
    }

    /**
     * Obtient la valeur de la propriété horodatageRequete.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorodatageRequete() {
        return horodatageRequete;
    }

    /**
     * Définit la valeur de la propriété horodatageRequete.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorodatageRequete(XMLGregorianCalendar value) {
        this.horodatageRequete = value;
    }

    /**
     * Obtient la valeur de la propriété horodatageReponse.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorodatageReponse() {
        return horodatageReponse;
    }

    /**
     * Définit la valeur de la propriété horodatageReponse.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorodatageReponse(XMLGregorianCalendar value) {
        this.horodatageReponse = value;
    }

    /**
     * Obtient la valeur de la propriété sirenOC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSirenOC() {
        return sirenOC;
    }

    /**
     * Définit la valeur de la propriété sirenOC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSirenOC(String value) {
        this.sirenOC = value;
    }

    /**
     * Obtient la valeur de la propriété sirenOI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSirenOI() {
        return sirenOI;
    }

    /**
     * Définit la valeur de la propriété sirenOI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSirenOI(String value) {
        this.sirenOI = value;
    }

}
