package planify.modelo;

public class Tarea {
    private static int contadorIds = 1; // Variable estática para generar IDs únicos
    private int id;
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        this.id = contadorIds++;
        this.descripcion = descripcion;
        this.completada = false; // Por defecto, una nueva tarea no está completada
    }

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

    // --- Método para imprimir la tarea de forma legible ---
    @Override
    public String toString() {
        String estado = isCompletada() ? "[X]" : "[ ]";
        return estado + " Tarea #" + id + ": " + descripcion;
    }
}