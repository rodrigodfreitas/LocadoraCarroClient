
package com.pos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de quarto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="quarto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disponivel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="qtdHospede" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quarto", propOrder = {
    "disponivel",
    "numero",
    "preco",
    "qtdHospede",
    "tipo"
})
public class Quarto {

    protected boolean disponivel;
    protected int numero;
    protected double preco;
    protected int qtdHospede;
    protected String tipo;

    /**
     * Obtém o valor da propriedade disponivel.
     * 
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * Define o valor da propriedade disponivel.
     * 
     */
    public void setDisponivel(boolean value) {
        this.disponivel = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     */
    public void setPreco(double value) {
        this.preco = value;
    }

    /**
     * Obtém o valor da propriedade qtdHospede.
     * 
     */
    public int getQtdHospede() {
        return qtdHospede;
    }

    /**
     * Define o valor da propriedade qtdHospede.
     * 
     */
    public void setQtdHospede(int value) {
        this.qtdHospede = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
