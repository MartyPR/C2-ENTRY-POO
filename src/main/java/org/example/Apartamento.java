package org.example;

import java.util.List;

public class Apartamento extends Alojamiento {
    public boolean isPerro() {
        return perro;
    }

    public void setPerro(boolean perro) {
        this.perro = perro;
    }

    protected boolean perro;

    public boolean isParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(boolean parqueadero) {
        this.parqueadero = parqueadero;
    }

    protected  boolean parqueadero;

    public Apartamento(String nombre, String ciudad, String tipo, double calificacion, List<Habitacion> habitaciones) {
        super(nombre, ciudad, tipo, calificacion, habitaciones);
    }

    public Apartamento(String nombre, String ciudad, String tipo, double calificacion, List<Habitacion> habitaciones, boolean perro) {
        super(nombre, ciudad, tipo, calificacion, habitaciones);
        this.perro = perro;
    }
}
