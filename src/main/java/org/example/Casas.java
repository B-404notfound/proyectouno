package org.example;

public class Casas {
    private String habitaciones;
    private String ventanas;
    private Integer puertas;

    public Casas(String habitaciones, String ventanas, Integer puertas) {
        this.habitaciones = habitaciones;
        this.ventanas = ventanas;
        this.puertas = puertas;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getVentanas() {
        return ventanas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }
}
