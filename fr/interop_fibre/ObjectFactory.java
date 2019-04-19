
package fr.interop_fibre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.interop_fibre package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RechercheCreneauxLibresReponse_QNAME = new QName("http://interop-fibre.fr", "RechercheCreneauxLibresReponse");
    private final static QName _ConsultationRdvReponse_QNAME = new QName("http://interop-fibre.fr", "ConsultationRdvReponse");
    private final static QName _ReportRDVReponse_QNAME = new QName("http://interop-fibre.fr", "ReportRDVReponse");
    private final static QName _ReservationCreneauReponse_QNAME = new QName("http://interop-fibre.fr", "ReservationCreneauReponse");
    private final static QName _RechercheCreneauxLibresReponseListeCreneau_QNAME = new QName("", "listeCreneau");
    private final static QName _ReservationCreneauReponseIdRendezvous_QNAME = new QName("", "idRendezvous");
    private final static QName _RechercheCreneauxLibresRequeteCommercialId_QNAME = new QName("", "commercialId");
    private final static QName _RechercheCreneauxLibresRequeteTechnicalId_QNAME = new QName("", "technicalId");
    private final static QName _InfoErreurTypeDetailErreur_QNAME = new QName("", "detailErreur");
    private final static QName _ConsultationRdvReponseSegmentMarche_QNAME = new QName("", "segmentMarche");
    private final static QName _ConsultationRdvReponseNatureProduit_QNAME = new QName("", "natureProduit");
    private final static QName _ConsultationRdvReponseReferencePrestationPrise_QNAME = new QName("", "referencePrestationPrise");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.interop_fibre
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultationRdvRequete }
     * 
     */
    public ConsultationRdvRequete createConsultationRdvRequete() {
        return new ConsultationRdvRequete();
    }

    /**
     * Create an instance of {@link ConsultationRdvReponse }
     * 
     */
    public ConsultationRdvReponse createConsultationRdvReponse() {
        return new ConsultationRdvReponse();
    }

    /**
     * Create an instance of {@link ReportRDVReponse }
     * 
     */
    public ReportRDVReponse createReportRDVReponse() {
        return new ReportRDVReponse();
    }

    /**
     * Create an instance of {@link ReportRDVRequete }
     * 
     */
    public ReportRDVRequete createReportRDVRequete() {
        return new ReportRDVRequete();
    }

    /**
     * Create an instance of {@link ReservationCreneauRequete }
     * 
     */
    public ReservationCreneauRequete createReservationCreneauRequete() {
        return new ReservationCreneauRequete();
    }

    /**
     * Create an instance of {@link ReservationCreneauReponse }
     * 
     */
    public ReservationCreneauReponse createReservationCreneauReponse() {
        return new ReservationCreneauReponse();
    }

    /**
     * Create an instance of {@link RechercheCreneauxLibresRequete }
     * 
     */
    public RechercheCreneauxLibresRequete createRechercheCreneauxLibresRequete() {
        return new RechercheCreneauxLibresRequete();
    }

    /**
     * Create an instance of {@link InfoErreurType }
     * 
     */
    public InfoErreurType createInfoErreurType() {
        return new InfoErreurType();
    }

    /**
     * Create an instance of {@link DetailErreurType }
     * 
     */
    public DetailErreurType createDetailErreurType() {
        return new DetailErreurType();
    }

    /**
     * Create an instance of {@link RechercheCreneauxLibresReponse }
     * 
     */
    public RechercheCreneauxLibresReponse createRechercheCreneauxLibresReponse() {
        return new RechercheCreneauxLibresReponse();
    }

    /**
     * Create an instance of {@link EnteteType }
     * 
     */
    public EnteteType createEnteteType() {
        return new EnteteType();
    }

    /**
     * Create an instance of {@link ListeCreneauType }
     * 
     */
    public ListeCreneauType createListeCreneauType() {
        return new ListeCreneauType();
    }

    /**
     * Create an instance of {@link CreneauType }
     * 
     */
    public CreneauType createCreneauType() {
        return new CreneauType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheCreneauxLibresReponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interop-fibre.fr", name = "RechercheCreneauxLibresReponse")
    public JAXBElement<RechercheCreneauxLibresReponse> createRechercheCreneauxLibresReponse(RechercheCreneauxLibresReponse value) {
        return new JAXBElement<RechercheCreneauxLibresReponse>(_RechercheCreneauxLibresReponse_QNAME, RechercheCreneauxLibresReponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultationRdvReponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interop-fibre.fr", name = "ConsultationRdvReponse")
    public JAXBElement<ConsultationRdvReponse> createConsultationRdvReponse(ConsultationRdvReponse value) {
        return new JAXBElement<ConsultationRdvReponse>(_ConsultationRdvReponse_QNAME, ConsultationRdvReponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRDVReponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interop-fibre.fr", name = "ReportRDVReponse")
    public JAXBElement<ReportRDVReponse> createReportRDVReponse(ReportRDVReponse value) {
        return new JAXBElement<ReportRDVReponse>(_ReportRDVReponse_QNAME, ReportRDVReponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationCreneauReponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interop-fibre.fr", name = "ReservationCreneauReponse")
    public JAXBElement<ReservationCreneauReponse> createReservationCreneauReponse(ReservationCreneauReponse value) {
        return new JAXBElement<ReservationCreneauReponse>(_ReservationCreneauReponse_QNAME, ReservationCreneauReponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeCreneauType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "listeCreneau", scope = RechercheCreneauxLibresReponse.class)
    public JAXBElement<ListeCreneauType> createRechercheCreneauxLibresReponseListeCreneau(ListeCreneauType value) {
        return new JAXBElement<ListeCreneauType>(_RechercheCreneauxLibresReponseListeCreneau_QNAME, ListeCreneauType.class, RechercheCreneauxLibresReponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "idRendezvous", scope = ReservationCreneauReponse.class)
    public JAXBElement<String> createReservationCreneauReponseIdRendezvous(String value) {
        return new JAXBElement<String>(_ReservationCreneauReponseIdRendezvous_QNAME, String.class, ReservationCreneauReponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "commercialId", scope = RechercheCreneauxLibresRequete.class)
    public JAXBElement<String> createRechercheCreneauxLibresRequeteCommercialId(String value) {
        return new JAXBElement<String>(_RechercheCreneauxLibresRequeteCommercialId_QNAME, String.class, RechercheCreneauxLibresRequete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "technicalId", scope = RechercheCreneauxLibresRequete.class)
    public JAXBElement<String> createRechercheCreneauxLibresRequeteTechnicalId(String value) {
        return new JAXBElement<String>(_RechercheCreneauxLibresRequeteTechnicalId_QNAME, String.class, RechercheCreneauxLibresRequete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailErreurType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "detailErreur", scope = InfoErreurType.class)
    public JAXBElement<DetailErreurType> createInfoErreurTypeDetailErreur(DetailErreurType value) {
        return new JAXBElement<DetailErreurType>(_InfoErreurTypeDetailErreur_QNAME, DetailErreurType.class, InfoErreurType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentMarcheType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "segmentMarche", scope = ConsultationRdvReponse.class)
    public JAXBElement<SegmentMarcheType> createConsultationRdvReponseSegmentMarche(SegmentMarcheType value) {
        return new JAXBElement<SegmentMarcheType>(_ConsultationRdvReponseSegmentMarche_QNAME, SegmentMarcheType.class, ConsultationRdvReponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NatureProduitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "natureProduit", scope = ConsultationRdvReponse.class)
    public JAXBElement<NatureProduitType> createConsultationRdvReponseNatureProduit(NatureProduitType value) {
        return new JAXBElement<NatureProduitType>(_ConsultationRdvReponseNatureProduit_QNAME, NatureProduitType.class, ConsultationRdvReponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "referencePrestationPrise", scope = ConsultationRdvReponse.class)
    public JAXBElement<String> createConsultationRdvReponseReferencePrestationPrise(String value) {
        return new JAXBElement<String>(_ConsultationRdvReponseReferencePrestationPrise_QNAME, String.class, ConsultationRdvReponse.class, value);
    }

}
