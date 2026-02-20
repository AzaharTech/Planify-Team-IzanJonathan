package com.azahartech.planify.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.azahartech.planify.modelo.*;

class TareaTest {

    @Test
    void testIdAutoincremental() {
        Usuario u = new Usuario("Admin", "Boss");
        Tarea t1 = new Tarea("Primera tarea", u, Prioridad.ALTA, Categoria.FEATURE);
        Tarea t2 = new Tarea("Segunda tarea", u, Prioridad.BAJA, Categoria.BUG);

        assertEquals(t1.getId() + 1, t2.getId());
    }

    @Test
    void testEstadoInicialYCambio() {
        Usuario u = new Usuario("Admin", "Boss");
        Tarea t = new Tarea("Prueba", u, Prioridad.MEDIA, Categoria.REFACTOR);

        assertFalse(t.isCompletada());

        t.setCompletada(true);
        assertTrue(t.isCompletada());
    }

    @Test
    void testSetters() {
        Usuario u1 = new Usuario("Juan", "Dev");
        Usuario u2 = new Usuario("Marta", "QA");
        Tarea t = new Tarea("Tarea 1", u1, Prioridad.MEDIA, Categoria.BUG);

        t.setResponsable(u2);
        assertEquals(u2, t.getResponsable());
    }
}