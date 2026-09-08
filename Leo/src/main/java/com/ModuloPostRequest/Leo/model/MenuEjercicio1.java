package com.ModuloPostRequest.Leo.model;

public class MenuEjercicio1 {
    private int numeroPlato;
    private String nombre;
    private float precio;
    private String descripcion;

    public MenuEjercicio1() {
    }

    public MenuEjercicio1(int numeroPlato, String nombre, float precio, String descripcion) {
        this.numeroPlato = numeroPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getNumeroPlato() {
        return numeroPlato;
    }

    public void setNumeroPlato(int numeroPlato) {
        this.numeroPlato = numeroPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
