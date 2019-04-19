
package fr.interop_fibre;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listeCreneauType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="listeCreneauType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="occCreneau" type="{http://interop-fibre.fr}CreneauType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listeCreneauType", propOrder = {
    "occCreneau"
})
public class ListeCreneauType {

    @XmlElement(nillable = true)
    protected List<CreneauType> occCreneau;

    /**
     * Gets the value of the occCreneau property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occCreneau property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccCreneau().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreneauType }
     * 
     * 
     */
    public List<CreneauType> getOccCreneau() {
        if (occCreneau == null) {
            occCreneau = new ArrayList<CreneauType>();
        }
        return this.occCreneau;
    }

}
