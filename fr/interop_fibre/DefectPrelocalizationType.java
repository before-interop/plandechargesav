
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour defectPrelocalizationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="defectPrelocalizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PTO"/>
 *     &lt;enumeration value="RACCO PALIER"/>
 *     &lt;enumeration value="PBO"/>
 *     &lt;enumeration value="PM-PBO"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="HORIZONTALE RESEAU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "defectPrelocalizationType")
@XmlEnum
public enum DefectPrelocalizationType {

    PTO("PTO"),
    @XmlEnumValue("RACCO PALIER")
    RACCO_PALIER("RACCO PALIER"),
    PBO("PBO"),
    @XmlEnumValue("PM-PBO")
    PM_PBO("PM-PBO"),
    PM("PM"),
    @XmlEnumValue("HORIZONTALE RESEAU")
    HORIZONTALE_RESEAU("HORIZONTALE RESEAU");
    private final String value;

    DefectPrelocalizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefectPrelocalizationType fromValue(String v) {
        for (DefectPrelocalizationType c: DefectPrelocalizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
