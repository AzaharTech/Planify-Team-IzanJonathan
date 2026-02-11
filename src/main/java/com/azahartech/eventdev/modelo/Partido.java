package com.azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Partido extends Evento {

    //ATRIBUTOS
    private String equipoLocal;
    private String equipoVisitante;

    //METODO CONSTRUCTOR PADRE
    public Partido(String nuevoNombre, LocalDate nuevaFecha, Recinto nuevoRecinto, double nuevoPrecio, String nuevoEquipoLocal, String nuevoEquipoVisitante) {
        super(nuevoNombre, nuevaFecha, nuevoRecinto, nuevoPrecio);
        equipoLocal=nuevoEquipoLocal;
        equipoVisitante=nuevoEquipoVisitante;
    }
    //METODOS PROPIOS
    public String consultarEquipoLocal(){
        return equipoLocal;
    }
    public String consultarEquipoVisitante(){
        return equipoVisitante;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.printf("---PARTIDO----%n%s vs %s%n----%n", equipoLocal, equipoVisitante);
    }
}
