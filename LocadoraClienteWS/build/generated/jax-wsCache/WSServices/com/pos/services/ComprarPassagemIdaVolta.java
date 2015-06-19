
package com.pos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de comprarPassagemIdaVolta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="comprarPassagemIdaVolta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vooIda" type="{http://webservices.wsprovider.br.com/}voo" minOccurs="0"/>
 *         &lt;element name="vooIdaVolta" type="{http://webservices.wsprovider.br.com/}voo" minOccurs="0"/>
 *         &lt;element name="nomePassageiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sobreNomePassageiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprarPassagemIdaVolta", propOrder = {
    "loginUsuario",
    "vooIda",
    "vooIdaVolta",
    "nomePassageiro",
    "sobreNomePassageiro"
})
public class ComprarPassagemIdaVolta {

    protected String loginUsuario;
    protected Voo vooIda;
    protected Voo vooIdaVolta;
    protected String nomePassageiro;
    protected String sobreNomePassageiro;

    /**
     * Obtém o valor da propriedade loginUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * Define o valor da propriedade loginUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUsuario(String value) {
        this.loginUsuario = value;
    }

    /**
     * Obtém o valor da propriedade vooIda.
     * 
     * @return
     *     possible object is
     *     {@link Voo }
     *     
     */
    public Voo getVooIda() {
        return vooIda;
    }

    /**
     * Define o valor da propriedade vooIda.
     * 
     * @param value
     *     allowed object is
     *     {@link Voo }
     *     
     */
    public void setVooIda(Voo value) {
        this.vooIda = value;
    }

    /**
     * Obtém o valor da propriedade vooIdaVolta.
     * 
     * @return
     *     possible object is
     *     {@link Voo }
     *     
     */
    public Voo getVooIdaVolta() {
        return vooIdaVolta;
    }

    /**
     * Define o valor da propriedade vooIdaVolta.
     * 
     * @param value
     *     allowed object is
     *     {@link Voo }
     *     
     */
    public void setVooIdaVolta(Voo value) {
        this.vooIdaVolta = value;
    }

    /**
     * Obtém o valor da propriedade nomePassageiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    /**
     * Define o valor da propriedade nomePassageiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePassageiro(String value) {
        this.nomePassageiro = value;
    }

    /**
     * Obtém o valor da propriedade sobreNomePassageiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobreNomePassageiro() {
        return sobreNomePassageiro;
    }

    /**
     * Define o valor da propriedade sobreNomePassageiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobreNomePassageiro(String value) {
        this.sobreNomePassageiro = value;
    }

}
