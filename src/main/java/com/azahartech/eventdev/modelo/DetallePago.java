package com.azahartech.eventdev.modelo;

public class DetallePago {

    //ATRIBUTOS
    private String tipoTarjeta;
    private String numeroTarjeta;
    private double total;

    //METODOS
    public DetallePago(String nuevoTipoTarjeta, String nuevoNumeroTarjeta){
        tipoTarjeta=nuevoTipoTarjeta;
        numeroTarjeta=nuevoNumeroTarjeta;
    }
    //REALIZAR PAGO
    public void realizarPago(double costeTotal) {
        System.out.println(costeTotal);
    }
    public void realizarPago(double costeTotal, String tipoTarjeta){
        this.realizarPago(costeTotal);
    }

    public void cambiarTipoTarjeta(String nuevoTipoTarjeta){
        tipoTarjeta = nuevoTipoTarjeta;
    };
    public void cambiarNumeroTarjeta(String nuevoNumeroTarjeta){
        numeroTarjeta=nuevoNumeroTarjeta;
    };
    public String consultarTipoTarjeta(){
        return tipoTarjeta;
    };
    public String consultarNumeroTarjeta() {
        return numeroTarjeta;
    };
    public void mostrarInformacion(){
        System.out.printf("---TARJETA---%nTipo: %s%nNumero: %s%n----%n", tipoTarjeta, numeroTarjeta);

    };

}

