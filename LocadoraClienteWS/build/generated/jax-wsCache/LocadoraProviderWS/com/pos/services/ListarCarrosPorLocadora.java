
package com.pos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listarCarrosPorLocadora complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listarCarrosPorLocadora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locadoraId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarCarrosPorLocadora", propOrder = {
    "locadoraId"
})
public class ListarCarrosPorLocadora {

    protected String locadoraId;

    /**
     * Obtém o valor da propriedade locadoraId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocadoraId() {
        return locadoraId;
    }

    /**
     * Define o valor da propriedade locadoraId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocadoraId(String value) {
        this.locadoraId = value;
    }

}
