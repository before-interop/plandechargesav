
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour segmentMarcheType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="segmentMarcheType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENTREPRISE"/>
 *     &lt;enumeration value="GP"/>
 *     &lt;enumeration value="OPERATEUR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "segmentMarcheType")
@XmlEnum
public enum SegmentMarcheType {

    ENTREPRISE,
    GP,
    OPERATEUR;

    public String value() {
        return name();
    }

    public static SegmentMarcheType fromValue(String v) {
        return valueOf(v);
    }

}
