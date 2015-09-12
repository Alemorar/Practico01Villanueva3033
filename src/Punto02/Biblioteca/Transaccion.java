/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.Biblioteca;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nahuel
 */
public class Transaccion {
    private int idOperacion;
    private Date fecha;
    private boolean sancion = false;
    private ArrayList<DetalleTransaccion> detalle;
    private String estado; //biblioteca, prestada, c/retraso, e/reparacion

    public Transaccion() {
        detalle = new ArrayList<>();
    }
    
    public void agregarDetalle(DetalleTransaccion dt){
        detalle.add(dt);
    }
    
    public Date fechaDevolucion(){
        
        
        return null;
    }
    
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
