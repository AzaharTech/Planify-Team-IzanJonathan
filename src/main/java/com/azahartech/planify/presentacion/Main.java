package com.azahartech.planify.presentacion;

import com.azahartech.planify.modelo.Categoria;
import com.azahartech.planify.modelo.Prioridad;
import com.azahartech.planify.servicio.GestorTareas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("==========================================");
        System.out.println(" BIENVENIDO A Planify - Tu gestor de tareas");
        System.out.println("==========================================");

        while (!salir) {
            System.out.println("\nMENU PRINCIPAL:");
            System.out.println("  1. Añadir nueva tarea");
            System.out.println("  2. Listar todas las tareas");
            System.out.println("  3. Marcar tarea como completada");
            System.out.println("  4. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consume el salto de línea pendiente de nextInt()

                switch (opcion) {
                    case 1:
                        System.out.print("Escribe la descripción de la nueva tarea: ");
                        String descripcion = scanner.nextLine();
                        gestor.anadirTarea(descripcion, "Pau", Prioridad.ALTA, Categoria.FEATURE);
                        break;
                    case 2:
                        gestor.listarTareas();
                        break;
                    case 3:
                        System.out.print("Introduce el ID de la tarea a marcar como completada: ");
                        int id = scanner.nextInt();
                        gestor.marcarTareaComoCompletada(id);
                        break;
                    case 4:
                        salir = true;
                        System.out.println("¡Gracias por usar Planify! ¡Hasta la próxima!");
                        break;
                    default:
                        System.out.println("-> Opción no válida. Introduce un número entre 1 y 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("-> Error: Debes introducir un número. Inténtalo de nuevo.");
                scanner.next(); // Limpia el buffer del scanner para evitar un bucle infinito
            }
        }
        scanner.close();
    }
}