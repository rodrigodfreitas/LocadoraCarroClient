
package com.pos.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LocadoraProviderWS", targetNamespace = "http://service.pos.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocadoraProviderWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.pos.services.Carro>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCarros", targetNamespace = "http://service.pos.com/", className = "com.pos.services.ListarCarros")
    @ResponseWrapper(localName = "listarCarrosResponse", targetNamespace = "http://service.pos.com/", className = "com.pos.services.ListarCarrosResponse")
    @Action(input = "http://service.pos.com/LocadoraProviderWS/listarCarrosRequest", output = "http://service.pos.com/LocadoraProviderWS/listarCarrosResponse")
    public List<Carro> listarCarros();

    /**
     * 
     * @param reserva
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "criarReserva", targetNamespace = "http://service.pos.com/", className = "com.pos.services.CriarReserva")
    @ResponseWrapper(localName = "criarReservaResponse", targetNamespace = "http://service.pos.com/", className = "com.pos.services.CriarReservaResponse")
    @Action(input = "http://service.pos.com/LocadoraProviderWS/criarReservaRequest", output = "http://service.pos.com/LocadoraProviderWS/criarReservaResponse")
    public boolean criarReserva(
        @WebParam(name = "reserva", targetNamespace = "")
        Reserva reserva);

    /**
     * 
     * @return
     *     returns java.util.List<com.pos.services.Reserva>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarReservas", targetNamespace = "http://service.pos.com/", className = "com.pos.services.ListarReservas")
    @ResponseWrapper(localName = "listarReservasResponse", targetNamespace = "http://service.pos.com/", className = "com.pos.services.ListarReservasResponse")
    @Action(input = "http://service.pos.com/LocadoraProviderWS/listarReservasRequest", output = "http://service.pos.com/LocadoraProviderWS/listarReservasResponse")
    public List<Reserva> listarReservas();

    /**
     * 
     * @param locadoraId
     * @return
     *     returns java.util.List<com.pos.services.Carro>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCarrosPorLocadora", targetNamespace = "http://service.pos.com/", className = "com.pos.services.ListarCarrosPorLocadora")
    @ResponseWrapper(localName = "listarCarrosPorLocadoraResponse", targetNamespace = "http://service.pos.com/", className = "com.pos.services.ListarCarrosPorLocadoraResponse")
    @Action(input = "http://service.pos.com/LocadoraProviderWS/listarCarrosPorLocadoraRequest", output = "http://service.pos.com/LocadoraProviderWS/listarCarrosPorLocadoraResponse")
    public List<Carro> listarCarrosPorLocadora(
        @WebParam(name = "locadoraId", targetNamespace = "")
        String locadoraId);

    /**
     * 
     * @param cidade
     * @return
     *     returns java.util.List<com.pos.services.Locadora>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarLocadorasPorCidade", targetNamespace = "http://service.pos.com/", className = "com.pos.services.BuscarLocadorasPorCidade")
    @ResponseWrapper(localName = "buscarLocadorasPorCidadeResponse", targetNamespace = "http://service.pos.com/", className = "com.pos.services.BuscarLocadorasPorCidadeResponse")
    @Action(input = "http://service.pos.com/LocadoraProviderWS/buscarLocadorasPorCidadeRequest", output = "http://service.pos.com/LocadoraProviderWS/buscarLocadorasPorCidadeResponse")
    public List<Locadora> buscarLocadorasPorCidade(
        @WebParam(name = "cidade", targetNamespace = "")
        String cidade);

    /**
     * 
     * @param data
     * @return
     *     returns java.util.List<com.pos.services.Reserva>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pesquisarReserva", targetNamespace = "http://service.pos.com/", className = "com.pos.services.PesquisarReserva")
    @ResponseWrapper(localName = "pesquisarReservaResponse", targetNamespace = "http://service.pos.com/", className = "com.pos.services.PesquisarReservaResponse")
    @Action(input = "http://service.pos.com/LocadoraProviderWS/pesquisarReservaRequest", output = "http://service.pos.com/LocadoraProviderWS/pesquisarReservaResponse")
    public List<Reserva> pesquisarReserva(
        @WebParam(name = "data", targetNamespace = "")
        XMLGregorianCalendar data);

}
