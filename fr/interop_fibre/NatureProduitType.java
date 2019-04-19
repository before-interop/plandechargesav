
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour natureProduitType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="natureProduitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FTTH_ACCES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "natureProduitType")
@XmlEnum
public enum NatureProduitType {

    FTTH_ACCES;

    public String value() {
        return name();
    }

    public static NatureProduitType fromValue(String v) {
        return valueOf(v);
    }

}
