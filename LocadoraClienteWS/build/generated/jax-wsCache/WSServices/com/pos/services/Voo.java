
package com.pos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de voo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="voo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencia" type="{http://webservices.wsprovider.br.com/}agencia" minOccurs="0"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dataVoo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://webservices.wsprovider.br.com/}cidade" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="limiteVagas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="origem" type="{http://webservices.wsprovider.br.com/}cidade" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="qtdePassageiros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voo", propOrder = {
    "agencia",
    "ativo",
    "dataVoo",
    "destino",
    "id",
    "limiteVagas",
    "origem",
    "preco",
    "qtdePassageiros"
})
public class Voo {

    protected Agencia agencia;
    protected boolean ativo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVoo;
    protected Cidade destino;
    protected Long id;
    protected Integer limiteVagas;
    protected Cidade origem;
    protected Double preco;
    protected Integer qtdePassageiros;

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link Agencia }
     *     
     */
    public Agencia getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Agencia }
     *     
     */
    public void setAgencia(Agencia value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade dataVoo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVoo() {
        return dataVoo;
    }

    /**
     * Define o valor da propriedade dataVoo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVoo(XMLGregorianCalendar value) {
        this.dataVoo = value;
    }

    /**
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link Cidade }
     *     
     */
    public Cidade getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidade }
     *     
     */
    public void setDestino(Cidade value) {
        this.destino = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade limiteVagas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimiteVagas() {
        return limiteVagas;
    }

    /**
     * Define o valor da propriedade limiteVagas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimiteVagas(Integer value) {
        this.limiteVagas = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link Cidade }
     *     
     */
    public Cidade getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidade }
     *     
     */
    public void setOrigem(Cidade value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreco(Double value) {
        this.preco = value;
    }

    /**
     * Obtém o valor da propriedade qtdePassageiros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtdePassageiros() {
        return qtdePassageiros;
    }

    /**
     * Define o valor da propriedade qtdePassageiros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtdePassageiros(Integer value) {
        this.qtdePassageiros = value;
    }

}
