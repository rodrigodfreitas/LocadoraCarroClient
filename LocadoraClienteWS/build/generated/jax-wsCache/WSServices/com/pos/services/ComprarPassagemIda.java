
package com.pos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de comprarPassagemIda complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="comprarPassagemIda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voo" type="{http://webservices.wsprovider.br.com/}voo" minOccurs="0"/>
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
@XmlType(name = "comprarPassagemIda", propOrder = {
    "loginUsuario",
    "voo",
    "nomePassageiro",
    "sobreNomePassageiro"
})
public class ComprarPassagemIda {

    protected String loginUsuario;
    protected Voo voo;
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
     * Obtém o valor da propriedade voo.
     * 
     * @return
     *     possible object is
     *     {@link Voo }
     *     
     */
    public Voo getVoo() {
        return voo;
    }

    /**
     * Define o valor da propriedade voo.
     * 
     * @param value
     *     allowed object is
     *     {@link Voo }
     *     
     */
    public void setVoo(Voo value) {
        this.voo = value;
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
