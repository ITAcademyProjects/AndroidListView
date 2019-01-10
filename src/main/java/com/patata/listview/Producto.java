package com.patata.listview;

public class Producto {
    String nombre;
    int unidades;
    boolean comprado;

    public Producto(String nombre, int unidades, boolean comprado) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.comprado = comprado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
}

