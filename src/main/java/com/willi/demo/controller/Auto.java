package com.willi.demo.controller;

public class Auto {

    private String patente;
    private float cantidadDeKilos;

    public Auto(String patente, float cantidadDeKilos) {
        this.patente = patente;
        this.cantidadDeKilos = cantidadDeKilos;
    }

    public String getPatente() {
        return patente;
    }

    public float getCantidadDeKilos() {
        return cantidadDeKilos;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCantidadDeKilos(float cantidadDeKilos) {
        this.cantidadDeKilos = cantidadDeKilos;
    }
}
