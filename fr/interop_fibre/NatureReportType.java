
package fr.interop_fibre;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour natureReportType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="natureReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REPORT_RDV_RESERVE"/>
 *     &lt;enumeration value="REPORT_RDV_CONFIRME"/>
 *     &lt;enumeration value="NOUVEAU_RDV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "natureReportType")
@XmlEnum
public enum NatureReportType {

    REPORT_RDV_RESERVE,
    REPORT_RDV_CONFIRME,
    NOUVEAU_RDV;

    public String value() {
        return name();
    }

    public static NatureReportType fromValue(String v) {
        return valueOf(v);
    }

}
