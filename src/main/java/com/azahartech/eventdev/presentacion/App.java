package com.azahartech.eventdev.presentacion;
import com.azahartech.eventdev.modelo.*;
import com.azahartech.eventdev.servicio.ServicioEvento;

import java.time.LocalDate;

/**
 * Aplicación de gestión de eventos
 * @author Jonathan Rosa Aledón
 * @version 1.0
 */
public class App {

    public static void main(String[] args) {
      /**  Scanner teclado = new Scanner(System.in);
        int opcion;
        String nombreEvento;
        int dia;
        int mes;
        int año;
        LocalDate fecha;
        String nombreRecinto;
        String direccionRecinto;
        int aforoMaximo;
        double precio;
        String bandaPrincipal;
        String equipoLocal;
        String equipoVisitante;

        do {
            System.out.printf("Bienvenido%n¿Que desea crear?%n1.Concierto%n2.Partido");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    teclado.nextLine();
                    System.out.println("Introduce el nombre del evento");
                    nombreEvento = teclado.nextLine();
                    System.out.println("Introduce el año del evento");
                    año = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Mes del evento");
                    mes = teclado.nextInt();
                    System.out.println("Dia del evento");
                    dia = teclado.nextInt();
                    fecha = LocalDate.of(año ,mes, dia);
                    System.out.println("Introduce el precio del evento");
                    precio = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Introduce el nombre del Recinto");
                    nombreRecinto = teclado.nextLine();
                    System.out.println("Introduce el direccion del Recinto");
                    direccionRecinto = teclado.nextLine();
                    System.out.println("Introduce el aforoMaximo del Recinto");
                    aforoMaximo = teclado.nextInt();
                    teclado.nextLine();
                    Recinto recinto1 = new Recinto(nombreRecinto, direccionRecinto, aforoMaximo);
                    Evento evento1 = new Evento(nombreEvento, fecha, recinto1, precio);
                    System.out.println("Datos Especificos del Concierto");
                    System.out.println("Banda Principal");
                    bandaPrincipal = teclado.nextLine();
                    Concierto concierto1 = new Concierto(nombreEvento, fecha, recinto1, precio, bandaPrincipal);
                    System.out.println(concierto1.consultarBandaPrincipal());
                    concierto1.mostrarInformacion();

                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Introduce el nombre del evento");
                    nombreEvento = teclado.nextLine();
                    System.out.println("Introduce el año del evento");
                    año = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Mes del evento");
                    mes = teclado.nextInt();
                    System.out.println("Dia del evento");
                    dia = teclado.nextInt();
                    fecha = LocalDate.of(año ,mes, dia);
                    System.out.println("Introduce el precio del evento");
                    precio = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Introduce el nombre del Recinto");
                    nombreRecinto = teclado.nextLine();
                    System.out.println("Introduce el direccion del Recinto");
                    direccionRecinto = teclado.nextLine();
                    System.out.println("Introduce el aforoMaximo del Recinto");
                    aforoMaximo = teclado.nextInt();
                    teclado.nextLine();
                    Recinto recinto2 = new Recinto(nombreRecinto, direccionRecinto, aforoMaximo);
                    Evento evento2 = new Evento(nombreEvento, fecha, recinto2, precio);
                    System.out.println("Datos Especificos del Partido");
                    System.out.println("Equipo Local");
                    equipoLocal = teclado.nextLine();
                    System.out.println("Equipo Visitante");
                    equipoVisitante = teclado.nextLine();
                    Partido partido1 = new Partido(nombreEvento, fecha, recinto2, precio, equipoLocal, equipoVisitante);
                    System.out.println(partido1.consultarEquipoLocal());
                    System.out.println(partido1.consultarEquipoVisitante());
                    partido1.mostrarInformacion();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }while(opcion!= 1|| opcion!=2); **/


        /**USUARIO
    Usuario Pau = new Usuario("Pau", "paupasalo@gmail.com");
    DetallePago pago = new DetallePago("VISA", "123457");
        System.out.println(Pau.consultarNombre());
        System.out.println(Pau.consultarEmail());
        System.out.println(Pau.consultarId());
        Pau.mostrarInforamcion();
        Pau.cambiarEmail("papupasa@gmail.com");
        System.out.println(Pau.consultarEmail());
        Pau.añadirDetallePago(pago);
        Pau.mostrarInforamcion();
//RECINTO
    Recinto pdf = new Recinto("Palau de la Festa", "C/Fernando Cortes 13",
            570);
        System.out.println(pdf.consultarNombreRecinto());
        System.out.println(pdf.consultarDireccion());
        System.out.println(pdf.consultarNombreRecinto());
        pdf.mostrarInformacion();
**/
//EVENTO

/**
        System.out.println(fdl.consultarNombre());
        System.out.println(fdl.consultarFecha());
        System.out.println(fdl.consultarRecinto().consultarNombreRecinto());
        fdl.mostrarInformacion();
//PAGO

        System.out.println(pago.consultarTipoTarjeta());
        System.out.println(pago.consultarNumeroTarjeta());
        pago.mostrarInformacion();
        pago.cambiarTipoTarjeta("MasterCard");
        pago.cambiarNumeroTarjeta("1234568");
        System.out.println(pago.consultarTipoTarjeta());
        System.out.println(pago.consultarNumeroTarjeta());
        pago.mostrarInformacion();
//TICKET
       Ticket ticket = new Ticket(fdl, Pau);
       Ticket ticket2 = new Ticket(fdl, Pau);

       System.out.println(Ticket.obtenerTotalTickets());
       ticket.mostrarInformacion();
       ticket2.mostrarInformacion();
//COMENTARIO
        Comentario nota = new Comentario(fdl, Pau, 5, "Me ha gustado mucho");

        System.out.println(nota.consultarEvento());
        System.out.println(nota.consultarAutor());
        System.out.println(nota.consultarComentario());
        System.out.println(nota.consultarPuntuacion());
        nota.mostrarInformacion();
//SERVICIO EVENTO
         **/
        ServicioEvento servicioEvento = new ServicioEvento();
       /** servicioEvento.realizarCompra(20); **/

        //CONCIERTO
        Recinto recintoPrueba = new Recinto("recintoPrueba", "Calle Lavanda 5", 1000);
        Evento fdl = new Evento("Feria del Libro", LocalDate.of(2025,12,27), recintoPrueba, 20);
        Evento evento2 = new Evento("Feria Castellon", LocalDate.of(2026,5,25), recintoPrueba, 90);
        Evento evento3 = new Evento("Feria Valencia", LocalDate.of(2026,10,25), recintoPrueba, 70);

        /**     Concierto conciertoPrueba = new Concierto("conciertoPrueba", LocalDate.of(2025,12,05), recintoPrueba,20, "My Chemical Romance" );
             conciertoPrueba.consultarNombre();
             conciertoPrueba.consultarBandaPrincipal();
             conciertoPrueba.mostrarInformacion();

             //PARTIDO
             Partido partidoPrueba = new Partido("Villareal/Betis", LocalDate.now(), recintoPrueba, 20, "Villareal FC", "Real Betis FC");
             partidoPrueba.consultarNombre();
             partidoPrueba.consultarEquipoLocal();
             partidoPrueba.consultarEquipoVisitante();
             partidoPrueba.mostrarInformacion();**/
        recintoPrueba.reservarAsientoVip(1);
        recintoPrueba.reservarAsientoVip(5);
        recintoPrueba.reservarAsientoVip(10);
        recintoPrueba.consultarAsientosVip();
        System.out.println(recintoPrueba.contarAsientosVipLibres());
        servicioEvento.añadirDestacado(fdl);
        servicioEvento.añadirDestacado(evento2);
        servicioEvento.añadirDestacado(evento3);
        servicioEvento.mostrarCartelera();
        recintoPrueba.mostrarInformacion();
        //servicioEvento.buscarDestacadoMasCaro().mostrarInformacion();
        }




}
