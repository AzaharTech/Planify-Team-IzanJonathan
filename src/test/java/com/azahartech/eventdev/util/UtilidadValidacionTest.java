package com.azahartech.eventdev.util;

import com.azahartech.eventdev.util.UtilidadValidacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilidadValidacionTest {
        @Test
        void esEmailValido_DebeDevolverTrue_ParaUnEmailCorrecto() {

            // 1. Arrange (Preparar)
            // Definimos el dato de entrada para nuestro caso de prueba.
            String emailValido = "pau.ferrer@azahartech.com";
            // 2. Act (Actuar)
            // Llamamos al método estático que estamos poniendo a prueba.
            boolean resultado =
                    UtilidadValidacion.esEmailValido(emailValido);
            // 3. Assert (Verificar)
            // Verificamos que, para esta entrada, el resultado es el que esperamos (true).
                    assertTrue(resultado, "El email válido fue incorrectamente marcado como inválido");
                            // El mensaje final es opcional, pero ayuda a entender el fallo.
        }
        @Test
        void esEmailValido_DebeDevolverFalse_ParaUnEmailSinArroba() {

            // 1. Arrange
            String emailInvalido = "email.incorrecto.com";
            // 2. Act
            boolean resultado =
                    UtilidadValidacion.esEmailValido(emailInvalido);
            // 3. Assert
            assertFalse(resultado, "El email sin arroba fue incorrectamente marcado como válido");
        }

        @Test
        void esEmailValido_DebeDevolverFalse_ParaUnEmailSinDominio() {

        // 1. Arrange
        String emailInvalido = "email.incorrecto.com";
        // 2. Act
        boolean resultado =
                UtilidadValidacion.esEmailValido(emailInvalido);
        // 3. Assert
        assertFalse(resultado, "El email sin arroba fue incorrectamente marcado como válido");
        }

        @Test
        void esEmailValido_DebeDevolverFalse_ParaUnInputNuloOVacio() {
        assertFalse(UtilidadValidacion.esEmailValido(null), "El valor null  debería ser inválido");
                assertFalse(UtilidadValidacion.esEmailValido(""), "Un string vacío  debería ser inválido");
        }

}
