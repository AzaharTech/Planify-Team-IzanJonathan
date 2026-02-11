package com.azahartech.eventdev.modelo;
import com.azahartech.eventdev.modelo.CalculadoraPrecios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraPreciosTest {
    @Test
    void verificaCalculosCorrectos() {
        CalculadoraPrecios cal = new CalculadoraPrecios();

        // 100€, 2 entradas, Estudiante (1) -> 200€ total. >100 aplica 10%.
        // 200 - 20 = 180. + 21% IVA = 217.8
        assertEquals(217.8, cal.calcularPrecioTotal(100, 2, 1), 0.01);

        // 100€, 1 entrada, VIP (2) -> 100€.
        // 100 + 50 (VIP) = 150. + 21% IVA = 181.5
        assertEquals(181.5, cal.calcularPrecioTotal(100, 1, 2), 0.01);
    }
}

