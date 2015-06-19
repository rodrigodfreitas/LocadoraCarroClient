
package com.pos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de reservaHotel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reservaHotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="emailHospede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotel" type="{http://ws/}hotel" minOccurs="0"/>
 *         &lt;element name="quarto" type="{http://ws/}quarto" minOccurs="0"/>
 *         &lt;element name="valorReserva" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservaHotel", propOrder = {
    "codigo",
    "dataReserva",
    "dataSaida",
    "emailHospede",
    "hotel",
    "quarto",
    "valorReserva"
})
public class ReservaHotel {

    protected int codigo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReserva;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaida;
    protected String emailHospede;
    protected Hotel hotel;
    protected Quarto quarto;
    protected float valorReserva;

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
     * Obtém o valor da propriedade dataReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReserva() {
        return dataReserva;
    }

    /**
     * Define o valor da propriedade dataReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReserva(XMLGregorianCalendar value) {
        this.dataReserva = value;
    }

    /**
     * Obtém o valor da propriedade dataSaida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaida() {
        return dataSaida;
    }

    /**
     * Define o valor da propriedade dataSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaida(XMLGregorianCalendar value) {
        this.dataSaida = value;
    }

    /**
     * Obtém o valor da propriedade emailHospede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailHospede() {
        return emailHospede;
    }

    /**
     * Define o valor da propriedade emailHospede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailHospede(String value) {
        this.emailHospede = value;
    }

    /**
     * Obtém o valor da propriedade hotel.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Define o valor da propriedade hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * Obtém o valor da propriedade quarto.
     * 
     * @return
     *     possible object is
     *     {@link Quarto }
     *     
     */
    public Quarto getQuarto() {
        return quarto;
    }

    /**
     * Define o valor da propriedade quarto.
     * 
     * @param value
     *     allowed object is
     *     {@link Quarto }
     *     
     */
    public void setQuarto(Quarto value) {
        this.quarto = value;
    }

    /**
     * Obtém o valor da propriedade valorReserva.
     * 
     */
    public float getValorReserva() {
        return valorReserva;
    }

    /**
     * Define o valor da propriedade valorReserva.
     * 
     */
    public void setValorReserva(float value) {
        this.valorReserva = value;
    }

}
