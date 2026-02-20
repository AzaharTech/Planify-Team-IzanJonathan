package com.azahartech.planify.servicio;

import com.azahartech.planify.modelo.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class GestorTareasTest {

    @Test
    void testRegistrarUsuarioNuevo() {
        GestorTareas gestor = new GestorTareas();
        Usuario pau = new Usuario("Pau", "Dev");

        gestor.registrarUsuario(pau);

        gestor.anadirTarea("Tarea Test", "Pau", Prioridad.MEDIA, Categoria.FEATURE);
        assertFalse(gestor.listarPorPrioridad(Prioridad.MEDIA).isEmpty(), "La tarea debería haberse creado si el usuario se registró bien");
    }

    @Test
    void testAnadirTareaExitoso() {
        GestorTareas gestor = new GestorTareas();
        gestor.registrarUsuario(new Usuario("Pau", "Dev"));

        gestor.anadirTarea("Nueva Tarea", "Pau", Prioridad.ALTA, Categoria.BUG);
        List<Tarea> resultado = gestor.listarPorPrioridad(Prioridad.ALTA);

        assertEquals(1, resultado.size(), "Debería haber 1 tarea en la lista");
        assertEquals("Nueva Tarea", resultado.get(0).getDescripcion());
    }

    @Test
    void testAnadirTareaSinUsuarioRegistrado() {
        GestorTareas gestor = new GestorTareas();

        gestor.anadirTarea("Tarea Fantasma", "Inexistente", Prioridad.ALTA, Categoria.BUG);

        List<Tarea> resultado = gestor.listarPorPrioridad(Prioridad.ALTA);
        assertTrue(resultado.isEmpty(), "La lista debería estar vacía porque el usuario no existe");
    }

    @Test
    void testMarcarTareaComoCompletada() {
        GestorTareas gestor = new GestorTareas();
        gestor.registrarUsuario(new Usuario("Pau", "Dev"));
        gestor.anadirTarea("Hacer tests", "Pau", Prioridad.MEDIA, Categoria.FEATURE);


        int id = gestor.listarPorPrioridad(Prioridad.MEDIA).get(0).getId();
        gestor.marcarTareaComoCompletada(id);

        boolean estado = gestor.listarPorPrioridad(Prioridad.MEDIA).get(0).isCompletada();
        assertTrue(estado, "La tarea debería estar marcada como completada");
    }

    }
