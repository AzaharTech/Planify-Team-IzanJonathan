package com.azahartech.eventdev.modelo;

public class Recinto {

    //ATRIBUTOS
    boolean[] asientosVip = new boolean[10];
    private String nombre;
    private String direccion;
    private int aforoMaximo;


    //METODOS
    //CONSTRUCTOR
    public Recinto(String nuevoNombre, String nuevaDireccion, int nuevoAforoMaximo){
        for(int i = 0; i <asientosVip.length; i++){
            asientosVip[i]=false;
        }
        nombre = nuevoNombre;
        direccion = nuevaDireccion;
        aforoMaximo = nuevoAforoMaximo;
    }
    //CONSULTAS
    public String consultarNombreRecinto(){
        return nombre;
    }
    public String consultarDireccion(){
        return direccion;
    }
    public int consultarAforoMaximo(){
        return aforoMaximo;
    }
    public void mostrarInformacion(){
        System.out.printf("---Recinto---%nNombre del recinto: %s%nDirección: %s%nAforo Maximo: %d%nAsientos Vips libres: %d%n---%n", nombre, direccion, aforoMaximo, contarAsientosVipLibres());

    }
    //RESERVAS
     public void reservarAsientoVip(int numeroAsiento){
        if(numeroAsiento >0 && numeroAsiento <= 10){
            numeroAsiento = numeroAsiento-1;
            asientosVip[numeroAsiento]=true;
        } else {
            System.out.println("Asiento erroneo");
        }
     }
     public void consultarAsientosVip(){
        for(int i = 0; i<asientosVip.length; i++){
            int asiento =i+1;
            System.out.println("Asiento " + asiento + " " + asientosVip[i]);
        }
     }
     public int contarAsientosVipLibres(){
        int libre = 0;
        for(int i = 0; i<asientosVip.length; i++){
            if(!asientosVip[i]){
                libre++;
            }
        }
         return libre;
     }

}
