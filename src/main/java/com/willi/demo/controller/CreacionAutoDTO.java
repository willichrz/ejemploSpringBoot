package com.willi.demo.controller;

public class CreacionAutoDTO {
    private String patente;
    private Long cantidadDeKilos;

    public Long getCantidadDeKilos() {
        return cantidadDeKilos;
    }

    public void setCantidadDeKilos(Long cantidadDeKilos) {
        this.cantidadDeKilos = cantidadDeKilos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
