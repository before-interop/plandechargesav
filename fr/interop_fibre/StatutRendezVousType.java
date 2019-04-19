
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour statutRendezVousType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statutRendezVousType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREE"/>
 *     &lt;enumeration value="CONFIRME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statutRendezVousType")
@XmlEnum
public enum StatutRendezVousType {

    CREE,
    CONFIRME;

    public String value() {
        return name();
    }

    public static StatutRendezVousType fromValue(String v) {
        return valueOf(v);
    }

}
