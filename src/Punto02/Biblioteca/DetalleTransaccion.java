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
    private int cantidad = 1;
    private Lector lector;

    public DetalleTransaccion() {
    }
    
    public void calcularDevolucion(){
        
    }
    
    public void calcularSancion(){
        
    }

    public CopiaDeLibro getUnaCopia() {
        return unaCopia;
    }

    public void setUnaCopia(CopiaDeLibro unaCopia) {
        this.unaCopia = unaCopia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
}

