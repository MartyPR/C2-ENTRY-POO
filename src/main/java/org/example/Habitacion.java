package org.example;

public class Habitacion implements Reservable {
    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public int getCapacidad() {
        return capacidad;
    }

    private String tipo;
    private String descripcion;
    private double precio;

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    private int disponibles;
    private int capacidad;

    public Habitacion(String tipo, String descripcion, double precio, int disponibles, int capacidad) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponibles = disponibles;
        this.capacidad = capacidad;
    }

    @Override
    public boolean reservar() {
        if (disponibles > 0) {
            disponibles--;
            return true;
        }
        return false;
    }

    public void cancelar() {
        disponibles++;
    }
}
