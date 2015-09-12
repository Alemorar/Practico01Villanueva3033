/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.Biblioteca;

import java.util.Date;

/**
 *
 * @author nahuel
 */
public class DetalleTransaccion {
    private CopiaDeLibro unaCopia;
    private int cantidadCopia;
    private Lector lector;
    private String estado; //biblioteca, prestada, c/retraso, e/reparacion
    private Date devolucion;

    public DetalleTransaccion() {
        this.cantidadCopia = 1;
    }
    
    public void actualizarStock(){
        unaCopia.setStock(unaCopia.getStock() - cantidadCopia);
    }

    public CopiaDeLibro getUnaCopia() {
        return unaCopia;
    }

    public void setUnaCopia(CopiaDeLibro unaCopia) {
        this.unaCopia = unaCopia;
    }

    public int getCantidadCopia() {
        return cantidadCopia;
    }

    public void setCantidadCopia(int cantidadCopia) {
        this.cantidadCopia = cantidadCopia;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "DetalleTransaccion{" + "unaCopia=" + unaCopia + ", cantidadCopia=" + cantidadCopia + ", lector=" + lector + '}';
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }
}

