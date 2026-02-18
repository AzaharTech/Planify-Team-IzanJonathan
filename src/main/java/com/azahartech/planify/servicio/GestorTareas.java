package com.azahartech.planify.servicio;

import com.azahartech.planify.modelo.Prioridad;
import com.azahartech.planify.modelo.Categoria; // Requisito MVP v2
import com.azahartech.planify.modelo.Tarea;
import com.azahartech.planify.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorTareas {
    private List<Tarea> listaDeTareas;
    private List<Usuario> listaDeUsuarios; // Nuevo campo para gestión de usuarios [cite: 13, 78]

    public GestorTareas() {
        this.listaDeTareas = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>(); // Inicialización para el Estudiante A
    }

    /**
     * Registra un nuevo usuario asegurando que el nombre sea único.
     * [Requisito Estudiante A - Gestión de usuarios]
     */
    public void registrarUsuario(Usuario usuario) {
        for (Usuario u : listaDeUsuarios) {
            if (u.getNombre().equalsIgnoreCase(usuario.getNombre())) {
                System.out.println("-> Error: El usuario '" + usuario.getNombre() + "' ya existe.");
                return;
            }
        }
        listaDeUsuarios.add(usuario);
        System.out.println("-> Usuario registrado con éxito.");
    }

    /**
     * Añade una nueva tarea a la lista con responsable, prioridad y categoría.
     * [Requisito Estudiante A - Lógica de asignación]
     */
    public void anadirTarea(String descripcion, String nombreResp, Prioridad p, Categoria c) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            System.out.println("-> Error: La descripción de la tarea no puede estar vacía.");
            return;
        }

        Usuario responsable = null;
        for (Usuario u : listaDeUsuarios) {
            if (u.getNombre().equalsIgnoreCase(nombreResp)) {
                responsable = u;
                break;
            }
        }

        if (responsable == null) {
            System.out.println("-> Error: No se encontró el usuario responsable.");
            return;
        }

        Tarea nuevaTarea = new Tarea(descripcion, responsable, p, c);
        listaDeTareas.add(nuevaTarea);
        System.out.println("-> Tarea añadida con éxito.");
    }

    /**
     * Muestra todas las tareas pendientes y completadas en la consola.
     */
    public void listarTareas() {
        if (listaDeTareas.isEmpty()) {
            System.out.println("-> No tienes ninguna tarea pendiente. ¡Añade una!");
            return;
        }
        System.out.println("\n--- TUS TAREAS ---");
        for (Tarea tarea : listaDeTareas) {
            System.out.println(tarea);
        }
        System.out.println("------------------");
    }

    /**
     * * Busca una tarea por su ID y la marca como completada.
     * * @param id El número de la tarea a marcar.
     *
     */
    public void marcarTareaComoCompletada(int id) {
        for (Tarea tarea : listaDeTareas) {
            if (tarea.getId() == id) {
                if (tarea.isCompletada()) {
                    System.out.println("-> La tarea #" + id + " ya estaba completada.");
                } else {
                    tarea.setCompletada(true);
                    System.out.println("-> ¡Bien hecho! Tarea #" + id + " marcada como completada.");
                }
                return; // Salimos del método una vez encontrada la tarea
            }
        }
        // Si el bucle termina, la tarea no fue encontrada
        System.out.println("-> Error: No se encontró ninguna tarea con el ID " + id + ".");
    }

    public List<Tarea> listarPorUsuario(Usuario u) {
        return listaDeTareas.stream().filter(tarea -> tarea.getResponsable().equals(u)).collect(Collectors.toList());
    }

    public List<Tarea> listarPorPrioridad(Prioridad p) {
        return listaDeTareas.stream().filter(tarea -> tarea.getPrioridad().equals(p)).collect(Collectors.toList());
    }
}