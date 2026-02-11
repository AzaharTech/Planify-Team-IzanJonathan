package com.azahartech.eventdev.modelo;

public class Comentario {
    //ATRIBUTOS
    private Evento evento;
    private Usuario autor;
    private int puntuacion;
    private String comentario;

    //METODOS
    public Comentario(Evento nuevoEvento, Usuario nuevoAutor, int nuevaPuntuacion, String nuevoComentario){
            evento = nuevoEvento;
            autor = nuevoAutor;
            puntuacion = nuevaPuntuacion;
            comentario = nuevoComentario;

            if(puntuacion > 5){
                puntuacion=5;
            }
            if(puntuacion < 1){
                puntuacion=1;
            }
    }
    public String consultarEvento() {
        return evento.consultarNombre();
    }

    public String consultarAutor(){
        return autor.consultarNombre();

    }
    public int consultarPuntuacion(){
        return puntuacion;
    }
    public String consultarComentario(){
        return comentario;
    }
    public void mostrarInformacion(){
        System.out.printf("---COMENTARIO---%nEvento: %s%nAutor: %s%nPuntuacion: %d%nComentario%s%n----%n", evento.consultarNombre(), autor.consultarNombre(), puntuacion, comentario);

    }

}
