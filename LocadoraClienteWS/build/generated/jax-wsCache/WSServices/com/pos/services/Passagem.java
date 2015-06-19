
package com.pos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de passagem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="passagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="loginUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passageiro" type="{http://webservices.wsprovider.br.com/}passageiro" minOccurs="0"/>
 *         &lt;element name="voo" type="{http://webservices.wsprovider.br.com/}voo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passagem", propOrder = {
    "id",
    "loginUser",
    "passageiro",
    "voo"
})
public class Passagem {

    protected Long id;
    protected String loginUser;
    protected Passageiro passageiro;
    protected Voo voo;

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
     * Obtém o valor da propriedade loginUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUser() {
        return loginUser;
    }

    /**
     * Define o valor da propriedade loginUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUser(String value) {
        this.loginUser = value;
    }

    /**
     * Obtém o valor da propriedade passageiro.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getPassageiro() {
        return passageiro;
    }

    /**
     * Define o valor da propriedade passageiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setPassageiro(Passageiro value) {
        this.passageiro = value;
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

}
