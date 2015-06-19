
package com.pos.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pos.services package. 
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

    private final static QName _ListarReservasPorData_QNAME = new QName("http://ws/", "listarReservasPorData");
    private final static QName _ReservasHospedeResponse_QNAME = new QName("http://ws/", "reservasHospedeResponse");
    private final static QName _BuscarHoteisPorCidade_QNAME = new QName("http://ws/", "buscarHoteisPorCidade");
    private final static QName _QuartosDisponiveisResponse_QNAME = new QName("http://ws/", "quartosDisponiveisResponse");
    private final static QName _ReservasHospede_QNAME = new QName("http://ws/", "reservasHospede");
    private final static QName _BuscarReservaPorCodigo_QNAME = new QName("http://ws/", "buscarReservaPorCodigo");
    private final static QName _BuscarHoteisPorCidadeResponse_QNAME = new QName("http://ws/", "buscarHoteisPorCidadeResponse");
    private final static QName _SalvarResevarResponse_QNAME = new QName("http://ws/", "salvarResevarResponse");
    private final static QName _QuartosDisponiveis_QNAME = new QName("http://ws/", "quartosDisponiveis");
    private final static QName _SalvarResevar_QNAME = new QName("http://ws/", "salvarResevar");
    private final static QName _ListarReservasPorDataResponse_QNAME = new QName("http://ws/", "listarReservasPorDataResponse");
    private final static QName _BuscarReservaPorCodigoResponse_QNAME = new QName("http://ws/", "buscarReservaPorCodigoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pos.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarReservasPorData }
     * 
     */
    public ListarReservasPorData createListarReservasPorData() {
        return new ListarReservasPorData();
    }

    /**
     * Create an instance of {@link ReservasHospedeResponse }
     * 
     */
    public ReservasHospedeResponse createReservasHospedeResponse() {
        return new ReservasHospedeResponse();
    }

    /**
     * Create an instance of {@link BuscarHoteisPorCidade }
     * 
     */
    public BuscarHoteisPorCidade createBuscarHoteisPorCidade() {
        return new BuscarHoteisPorCidade();
    }

    /**
     * Create an instance of {@link QuartosDisponiveisResponse }
     * 
     */
    public QuartosDisponiveisResponse createQuartosDisponiveisResponse() {
        return new QuartosDisponiveisResponse();
    }

    /**
     * Create an instance of {@link ReservasHospede }
     * 
     */
    public ReservasHospede createReservasHospede() {
        return new ReservasHospede();
    }

    /**
     * Create an instance of {@link BuscarReservaPorCodigo }
     * 
     */
    public BuscarReservaPorCodigo createBuscarReservaPorCodigo() {
        return new BuscarReservaPorCodigo();
    }

    /**
     * Create an instance of {@link BuscarHoteisPorCidadeResponse }
     * 
     */
    public BuscarHoteisPorCidadeResponse createBuscarHoteisPorCidadeResponse() {
        return new BuscarHoteisPorCidadeResponse();
    }

    /**
     * Create an instance of {@link SalvarResevarResponse }
     * 
     */
    public SalvarResevarResponse createSalvarResevarResponse() {
        return new SalvarResevarResponse();
    }

    /**
     * Create an instance of {@link QuartosDisponiveis }
     * 
     */
    public QuartosDisponiveis createQuartosDisponiveis() {
        return new QuartosDisponiveis();
    }

    /**
     * Create an instance of {@link SalvarResevar }
     * 
     */
    public SalvarResevar createSalvarResevar() {
        return new SalvarResevar();
    }

    /**
     * Create an instance of {@link ListarReservasPorDataResponse }
     * 
     */
    public ListarReservasPorDataResponse createListarReservasPorDataResponse() {
        return new ListarReservasPorDataResponse();
    }

    /**
     * Create an instance of {@link BuscarReservaPorCodigoResponse }
     * 
     */
    public BuscarReservaPorCodigoResponse createBuscarReservaPorCodigoResponse() {
        return new BuscarReservaPorCodigoResponse();
    }

    /**
     * Create an instance of {@link Quarto }
     * 
     */
    public Quarto createQuarto() {
        return new Quarto();
    }

    /**
     * Create an instance of {@link EnderecoHotel }
     * 
     */
    public EnderecoHotel createEnderecoHotel() {
        return new EnderecoHotel();
    }

    /**
     * Create an instance of {@link ReservaHotel }
     * 
     */
    public ReservaHotel createReservaHotel() {
        return new ReservaHotel();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Gerente }
     * 
     */
    public Gerente createGerente() {
        return new Gerente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasPorData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarReservasPorData")
    public JAXBElement<ListarReservasPorData> createListarReservasPorData(ListarReservasPorData value) {
        return new JAXBElement<ListarReservasPorData>(_ListarReservasPorData_QNAME, ListarReservasPorData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservasHospedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reservasHospedeResponse")
    public JAXBElement<ReservasHospedeResponse> createReservasHospedeResponse(ReservasHospedeResponse value) {
        return new JAXBElement<ReservasHospedeResponse>(_ReservasHospedeResponse_QNAME, ReservasHospedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarHoteisPorCidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarHoteisPorCidade")
    public JAXBElement<BuscarHoteisPorCidade> createBuscarHoteisPorCidade(BuscarHoteisPorCidade value) {
        return new JAXBElement<BuscarHoteisPorCidade>(_BuscarHoteisPorCidade_QNAME, BuscarHoteisPorCidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuartosDisponiveisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "quartosDisponiveisResponse")
    public JAXBElement<QuartosDisponiveisResponse> createQuartosDisponiveisResponse(QuartosDisponiveisResponse value) {
        return new JAXBElement<QuartosDisponiveisResponse>(_QuartosDisponiveisResponse_QNAME, QuartosDisponiveisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservasHospede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reservasHospede")
    public JAXBElement<ReservasHospede> createReservasHospede(ReservasHospede value) {
        return new JAXBElement<ReservasHospede>(_ReservasHospede_QNAME, ReservasHospede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarReservaPorCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarReservaPorCodigo")
    public JAXBElement<BuscarReservaPorCodigo> createBuscarReservaPorCodigo(BuscarReservaPorCodigo value) {
        return new JAXBElement<BuscarReservaPorCodigo>(_BuscarReservaPorCodigo_QNAME, BuscarReservaPorCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarHoteisPorCidadeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarHoteisPorCidadeResponse")
    public JAXBElement<BuscarHoteisPorCidadeResponse> createBuscarHoteisPorCidadeResponse(BuscarHoteisPorCidadeResponse value) {
        return new JAXBElement<BuscarHoteisPorCidadeResponse>(_BuscarHoteisPorCidadeResponse_QNAME, BuscarHoteisPorCidadeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResevarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "salvarResevarResponse")
    public JAXBElement<SalvarResevarResponse> createSalvarResevarResponse(SalvarResevarResponse value) {
        return new JAXBElement<SalvarResevarResponse>(_SalvarResevarResponse_QNAME, SalvarResevarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuartosDisponiveis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "quartosDisponiveis")
    public JAXBElement<QuartosDisponiveis> createQuartosDisponiveis(QuartosDisponiveis value) {
        return new JAXBElement<QuartosDisponiveis>(_QuartosDisponiveis_QNAME, QuartosDisponiveis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResevar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "salvarResevar")
    public JAXBElement<SalvarResevar> createSalvarResevar(SalvarResevar value) {
        return new JAXBElement<SalvarResevar>(_SalvarResevar_QNAME, SalvarResevar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasPorDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarReservasPorDataResponse")
    public JAXBElement<ListarReservasPorDataResponse> createListarReservasPorDataResponse(ListarReservasPorDataResponse value) {
        return new JAXBElement<ListarReservasPorDataResponse>(_ListarReservasPorDataResponse_QNAME, ListarReservasPorDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarReservaPorCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarReservaPorCodigoResponse")
    public JAXBElement<BuscarReservaPorCodigoResponse> createBuscarReservaPorCodigoResponse(BuscarReservaPorCodigoResponse value) {
        return new JAXBElement<BuscarReservaPorCodigoResponse>(_BuscarReservaPorCodigoResponse_QNAME, BuscarReservaPorCodigoResponse.class, null, value);
    }

}
