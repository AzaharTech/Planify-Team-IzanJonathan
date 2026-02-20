package com.azahartech.planify.presentacion;

import com.azahartech.planify.modelo.Categoria;
import com.azahartech.planify.modelo.Prioridad;
import com.azahartech.planify.modelo.Usuario;
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
            System.out.println("  1. Crear nuevo Usuario");
            System.out.println("  2. Añadir nueva tarea");
            System.out.println("  3. Listar todas las tareas");
            System.out.println("  4. Listar todas las tareas de un usuario");
            System.out.println("  5. Listar todas las tareas con una prioridad especifica");
            System.out.println("  6. Marcar tarea como completada");
            System.out.println("  7. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consume el salto de línea pendiente de nextInt()

                switch (opcion) {
                    case 1:
                        System.out.println("Escribe el nombre del Usuario: ");
                        String nombreU = scanner.nextLine();
                        System.out.println("Escribe el rol del Usuario: ");
                        String rolU = scanner.nextLine();
                        Usuario usuario1 = new Usuario(nombreU, rolU);
                        gestor.registrarUsuario(usuario1);
                    case 2:
                        System.out.print("Escribe la descripción de la nueva tarea: ");
                        String descripcion = scanner.nextLine();
                        gestor.anadirTarea(descripcion, "Pau", Prioridad.ALTA, Categoria.FEATURE);
                        break;
                    case 3:
                        gestor.listarTareas();
                        break;
                    case 4:
                        System.out.print("Introduce el nombre del usuario: ");
                        String nombreUsuario = scanner.nextLine();
                        if (nombreUsuario != null) {
                            gestor.listarPorUsuario(gestor.buscarUsuario(nombreUsuario));
                        } else {
                            System.out.println("Usuario no encontrado");
                        }
                        break;
                    case 5:
                        System.out.print("Introduce la prioridad de la tarea: ");
                        String prioridadPrueba = scanner.nextLine();
                        if (prioridadPrueba != null) {
                            gestor.listarPorPrioridad(gestor.buscarPrioridad(prioridadPrueba));
                        }
                        break;
                    case 6:
                        System.out.print("Introduce el ID de la tarea a marcar como completada: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        gestor.marcarTareaComoCompletada(id);
                        break;
                    case 7:
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