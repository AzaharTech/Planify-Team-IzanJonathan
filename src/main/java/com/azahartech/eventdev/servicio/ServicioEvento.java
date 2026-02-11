package com.azahartech.eventdev.servicio;

import com.azahartech.eventdev.modelo.*;
import java.util.ArrayList;
import java.time.LocalDate;

public class ServicioEvento {
    private Evento eventoDePrueba;
    private Usuario usuarioDePrueba;
    //private Evento[] carteleraDestacados;
    private ArrayList<Evento> listaEventos;

    public ServicioEvento() {
        this.listaEventos = new ArrayList<>();
        // carteleraDestacados = new Evento[5];
        Recinto Cdf = new Recinto("Casal de Festes", "Calle Colón nº5", 550);
        eventoDePrueba = new Evento("Feria de Mayo", LocalDate.of(2025, 12, 27), Cdf, 20);
        DetallePago factura = new DetallePago("Mastercard", "7512348951");
        usuarioDePrueba = new Usuario("Pedro", "Pedro@mail.com");
        usuarioDePrueba.añadirDetallePago(factura);


    }

    public Ticket realizarCompra(int cantidad) {
        usuarioDePrueba.consultarDetallePago().realizarPago(eventoDePrueba.consultarPrecio() * cantidad);
        eventoDePrueba.registrarVenta(cantidad);
        return new Ticket(eventoDePrueba, usuarioDePrueba);
    }

    public void añadirDestacado(Evento evento) {
       listaEventos.add(evento);
    }

    public void mostrarCartelera() {
        for (Evento listaEvento : listaEventos){

                listaEvento.mostrarInformacion();
            }
        }


    /* public Evento buscarDestacadoMasCaro() {
        Evento eventoMasCaro = null;
        double precio = 0;
        for (int i = 0; i < carteleraDestacados.length; i++) {
            if (carteleraDestacados[i] != null) {
                if (carteleraDestacados[i].consultarPrecio() > precio) {
                    eventoMasCaro = carteleraDestacados[i];
                    precio = carteleraDestacados[i].consultarPrecio();

                }

            }
        }
        return eventoMasCaro;

    } */




}
