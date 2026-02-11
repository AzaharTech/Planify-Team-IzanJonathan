package com.azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Concierto extends Evento{

//ATRIBUTOS
    private String bandaPrincipal;

//METODO CONSTRUCTOR PADRE
    public Concierto(String nuevoNombre, LocalDate nuevaFecha, Recinto nuevoRecinto, double nuevoPrecio, String nuevoBandaPrincipal) {
        super(nuevoNombre, nuevaFecha, nuevoRecinto, nuevoPrecio);
    bandaPrincipal = nuevoBandaPrincipal;
    }

//METODOS PROPIOS
    public String consultarBandaPrincipal(){
        return bandaPrincipal;
    }
    @Override
    public void mostrarInformacion(){
    super.mostrarInformacion();
        System.out.printf("%nBanda Principal: %s%n ", bandaPrincipal);
    }


}
