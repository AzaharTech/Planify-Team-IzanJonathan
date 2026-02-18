package com.azahartech.planify.modelo;

public class Tarea {
    private static int contadorIds = 1; // Variable estática para generar IDs únicos
    private int id;
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        this.id = contadorIds++;
        this.descripcion = descripcion;
        this.completada = false; // Por defecto, una nueva tarea no está completada
        this.responsable = responsable;
        this.prioridad = prioridad;
        this.categoria = categoria;
    }

    private Usuario responsable;
    private Prioridad prioridad;
    private Categoria categoria;

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // --- Método para imprimir la tarea de forma legible ---

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", completada=" + completada +
                ", responsable=" + responsable +
                ", prioridad=" + prioridad +
                ", categoria=" + categoria +
                '}';
    }
}