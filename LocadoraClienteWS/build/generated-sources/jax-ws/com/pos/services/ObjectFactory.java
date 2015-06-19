
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

    private final static QName _ListarPassagensResponse_QNAME = new QName("http://webservices.wsprovider.br.com/", "listarPassagensResponse");
    private final static QName _ComprarPassagemIdaVolta_QNAME = new QName("http://webservices.wsprovider.br.com/", "comprarPassagemIdaVolta");
    private final static QName _ComprarPassagemIdaVoltaResponse_QNAME = new QName("http://webservices.wsprovider.br.com/", "comprarPassagemIdaVoltaResponse");
    private final static QName _CancelarPassagemResponse_QNAME = new QName("http://webservices.wsprovider.br.com/", "cancelarPassagemResponse");
    private final static QName _BucarVoos_QNAME = new QName("http://webservices.wsprovider.br.com/", "bucarVoos");
    private final static QName _CancelarPassagem_QNAME = new QName("http://webservices.wsprovider.br.com/", "cancelarPassagem");
    private final static QName _ComprarPassagemIdaResponse_QNAME = new QName("http://webservices.wsprovider.br.com/", "comprarPassagemIdaResponse");
    private final static QName _ComprarPassagemIda_QNAME = new QName("http://webservices.wsprovider.br.com/", "comprarPassagemIda");
    private final static QName _ListarPassagens_QNAME = new QName("http://webservices.wsprovider.br.com/", "listarPassagens");
    private final static QName _BucarVoosResponse_QNAME = new QName("http://webservices.wsprovider.br.com/", "bucarVoosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pos.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComprarPassagemIda }
     * 
     */
    public ComprarPassagemIda createComprarPassagemIda() {
        return new ComprarPassagemIda();
    }

    /**
     * Create an instance of {@link ListarPassagens }
     * 
     */
    public ListarPassagens createListarPassagens() {
        return new ListarPassagens();
    }

    /**
     * Create an instance of {@link BucarVoosResponse }
     * 
     */
    public BucarVoosResponse createBucarVoosResponse() {
        return new BucarVoosResponse();
    }

    /**
     * Create an instance of {@link BucarVoos }
     * 
     */
    public BucarVoos createBucarVoos() {
        return new BucarVoos();
    }

    /**
     * Create an instance of {@link ComprarPassagemIdaResponse }
     * 
     */
    public ComprarPassagemIdaResponse createComprarPassagemIdaResponse() {
        return new ComprarPassagemIdaResponse();
    }

    /**
     * Create an instance of {@link CancelarPassagem }
     * 
     */
    public CancelarPassagem createCancelarPassagem() {
        return new CancelarPassagem();
    }

    /**
     * Create an instance of {@link ComprarPassagemIdaVolta }
     * 
     */
    public ComprarPassagemIdaVolta createComprarPassagemIdaVolta() {
        return new ComprarPassagemIdaVolta();
    }

    /**
     * Create an instance of {@link ComprarPassagemIdaVoltaResponse }
     * 
     */
    public ComprarPassagemIdaVoltaResponse createComprarPassagemIdaVoltaResponse() {
        return new ComprarPassagemIdaVoltaResponse();
    }

    /**
     * Create an instance of {@link CancelarPassagemResponse }
     * 
     */
    public CancelarPassagemResponse createCancelarPassagemResponse() {
        return new CancelarPassagemResponse();
    }

    /**
     * Create an instance of {@link ListarPassagensResponse }
     * 
     */
    public ListarPassagensResponse createListarPassagensResponse() {
        return new ListarPassagensResponse();
    }

    /**
     * Create an instance of {@link Passagem }
     * 
     */
    public Passagem createPassagem() {
        return new Passagem();
    }

    /**
     * Create an instance of {@link Cidade }
     * 
     */
    public Cidade createCidade() {
        return new Cidade();
    }

    /**
     * Create an instance of {@link Agencia }
     * 
     */
    public Agencia createAgencia() {
        return new Agencia();
    }

    /**
     * Create an instance of {@link Voo }
     * 
     */
    public Voo createVoo() {
        return new Voo();
    }

    /**
     * Create an instance of {@link Passageiro }
     * 
     */
    public Passageiro createPassageiro() {
        return new Passageiro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPassagensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "listarPassagensResponse")
    public JAXBElement<ListarPassagensResponse> createListarPassagensResponse(ListarPassagensResponse value) {
        return new JAXBElement<ListarPassagensResponse>(_ListarPassagensResponse_QNAME, ListarPassagensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarPassagemIdaVolta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "comprarPassagemIdaVolta")
    public JAXBElement<ComprarPassagemIdaVolta> createComprarPassagemIdaVolta(ComprarPassagemIdaVolta value) {
        return new JAXBElement<ComprarPassagemIdaVolta>(_ComprarPassagemIdaVolta_QNAME, ComprarPassagemIdaVolta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarPassagemIdaVoltaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "comprarPassagemIdaVoltaResponse")
    public JAXBElement<ComprarPassagemIdaVoltaResponse> createComprarPassagemIdaVoltaResponse(ComprarPassagemIdaVoltaResponse value) {
        return new JAXBElement<ComprarPassagemIdaVoltaResponse>(_ComprarPassagemIdaVoltaResponse_QNAME, ComprarPassagemIdaVoltaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "cancelarPassagemResponse")
    public JAXBElement<CancelarPassagemResponse> createCancelarPassagemResponse(CancelarPassagemResponse value) {
        return new JAXBElement<CancelarPassagemResponse>(_CancelarPassagemResponse_QNAME, CancelarPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BucarVoos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "bucarVoos")
    public JAXBElement<BucarVoos> createBucarVoos(BucarVoos value) {
        return new JAXBElement<BucarVoos>(_BucarVoos_QNAME, BucarVoos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "cancelarPassagem")
    public JAXBElement<CancelarPassagem> createCancelarPassagem(CancelarPassagem value) {
        return new JAXBElement<CancelarPassagem>(_CancelarPassagem_QNAME, CancelarPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarPassagemIdaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "comprarPassagemIdaResponse")
    public JAXBElement<ComprarPassagemIdaResponse> createComprarPassagemIdaResponse(ComprarPassagemIdaResponse value) {
        return new JAXBElement<ComprarPassagemIdaResponse>(_ComprarPassagemIdaResponse_QNAME, ComprarPassagemIdaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarPassagemIda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "comprarPassagemIda")
    public JAXBElement<ComprarPassagemIda> createComprarPassagemIda(ComprarPassagemIda value) {
        return new JAXBElement<ComprarPassagemIda>(_ComprarPassagemIda_QNAME, ComprarPassagemIda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPassagens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "listarPassagens")
    public JAXBElement<ListarPassagens> createListarPassagens(ListarPassagens value) {
        return new JAXBElement<ListarPassagens>(_ListarPassagens_QNAME, ListarPassagens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BucarVoosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wsprovider.br.com/", name = "bucarVoosResponse")
    public JAXBElement<BucarVoosResponse> createBucarVoosResponse(BucarVoosResponse value) {
        return new JAXBElement<BucarVoosResponse>(_BucarVoosResponse_QNAME, BucarVoosResponse.class, null, value);
    }

}
