package planify.servicio;

import com.azahartech.planify.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> listaDeTareas;

    public GestorTareas() {
        this.listaDeTareas = new ArrayList<>();
    }

    /**
     * Añade una nueva tarea a la lista.
     * @param descripcion El texto de la nueva tarea.
     */
    public void anadirTarea(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            System.out.println("-> Error: La descripción de la tarea no puede estar vacía.");
            return;
        }
        Tarea nuevaTarea = new Tarea(descripcion);
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

}
