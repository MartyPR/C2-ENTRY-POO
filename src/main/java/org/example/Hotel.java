package org.example;

import java.util.List;

public class Hotel extends Alojamiento {
    public boolean isBuffet() {
        return buffet;
    }

    public void setBuffet(boolean buffet) {
        this.buffet = buffet;
    }

    boolean buffet;

    public Hotel(String nombre, String ciudad, String tipo, double calificacion, List<Habitacion> habitaciones) {
        super(nombre, ciudad, tipo, calificacion, habitaciones);
    }

    public Hotel(String nombre, String ciudad, String tipo, double calificacion, List<Habitacion> habitaciones, boolean buffet) {
        super(nombre, ciudad, tipo, calificacion, habitaciones);
        this.buffet = buffet;
    }

}