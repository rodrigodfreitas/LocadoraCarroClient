/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.main;

import com.pos.services.*;
import java.util.List;
import webservicesexternos.*;

/**
 *
 * @author lightyear
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(buscarLocadorasPorCidade("Salvador"));
        
        
        Carro c = new Carro();
        Locadora l = new Locadora();
        
        System.out.println(l.getNome());
    }

    private static List<Locadora> buscarLocadorasPorCidade(String cidade) {
        LocadoraProviderWS_Service service = new LocadoraProviderWS_Service();
        LocadoraProviderWS port = service.getLocadoraProviderWSPort();
        return port.buscarLocadorasPorCidade(cidade);
    }

    

    private static List<ReservaRestaurante> listarReservas() {
        WSReservaRestaurante_Service service = new WSReservaRestaurante_Service();
        WSReservaRestaurante port = service.getWSReservaRestaurantePort();
        return port.listarReservas();
    }

    private static boolean criarReserva(ReservaRestaurante reserva) {
        WSReservaRestaurante_Service service = new WSReservaRestaurante_Service();
        WSReservaRestaurante port = service.getWSReservaRestaurantePort();
        return port.criarReserva(reserva);
    }

    private static List<Carro> listarCarrosPorLocadora(String locadoraId) {
        LocadoraProviderWS_Service service = new LocadoraProviderWS_Service();
        LocadoraProviderWS port = service.getLocadoraProviderWSPort();
        return port.listarCarrosPorLocadora(locadoraId);
    }
    
}
