
package com.pos.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de hotel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enderecoHotel" type="{http://ws/}enderecoHotel" minOccurs="0"/>
 *         &lt;element name="gerente" type="{http://ws/}gerente" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quartos" type="{http://ws/}quarto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotel", propOrder = {
    "codigo",
    "enderecoHotel",
    "gerente",
    "nome",
    "quartos"
})
public class Hotel {

    protected int codigo;
    protected EnderecoHotel enderecoHotel;
    protected Gerente gerente;
    protected String nome;
    @XmlElement(nillable = true)
    protected List<Quarto> quartos;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade enderecoHotel.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoHotel }
     *     
     */
    public EnderecoHotel getEnderecoHotel() {
        return enderecoHotel;
    }

    /**
     * Define o valor da propriedade enderecoHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoHotel }
     *     
     */
    public void setEnderecoHotel(EnderecoHotel value) {
        this.enderecoHotel = value;
    }

    /**
     * Obtém o valor da propriedade gerente.
     * 
     * @return
     *     possible object is
     *     {@link Gerente }
     *     
     */
    public Gerente getGerente() {
        return gerente;
    }

    /**
     * Define o valor da propriedade gerente.
     * 
     * @param value
     *     allowed object is
     *     {@link Gerente }
     *     
     */
    public void setGerente(Gerente value) {
        this.gerente = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the quartos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quartos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuartos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quarto }
     * 
     * 
     */
    public List<Quarto> getQuartos() {
        if (quartos == null) {
            quartos = new ArrayList<Quarto>();
        }
        return this.quartos;
    }

}
