package org.iesvi.ws;

import javax.xml.ws.Endpoint;

public class CalculadoraPusblish {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:1516/WS/Calculadora", new CalculadoraImpl());
        System.out.println("Servicio activo, esperando peticiones");
    }
}
