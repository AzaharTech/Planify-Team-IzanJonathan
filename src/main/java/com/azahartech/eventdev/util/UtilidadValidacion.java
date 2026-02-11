package com.azahartech.eventdev.util;

import java.time.LocalDate;

public class UtilidadValidacion {
    public static boolean esEmailValido(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        // Lógica simple: debe contener '@' y después un '.'
        int indiceArroba = email.indexOf('@');
        int indicePunto = email.lastIndexOf('.');
        return indiceArroba > 0 && indicePunto > indiceArroba;
    }


    public static boolean esPuntuacionValida(int puntuacion) {
        if (puntuacion > 5 || puntuacion < 0) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean esFechaFutura(LocalDate fecha){
            if(fecha.isAfter(LocalDate.now())){
                return true;
            }else{
                return false;
            }

    }
}

