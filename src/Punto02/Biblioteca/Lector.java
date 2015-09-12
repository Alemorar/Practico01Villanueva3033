/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.Biblioteca;

/**
 *
 * @author nahuel
 */
public class Lector {
    private String nombre;
    private int telefono;
    private boolean habilitado;
    private boolean conSancion;
    private double multa;

    public Lector() {
        this.conSancion = false;
        this.habilitado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isSancion() {
        return conSancion;
    }

    public void setSancion(boolean sancion) {
        this.conSancion = sancion;
    }
}
