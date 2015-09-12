/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.Biblioteca;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nahuel
 */
public class Transaccion {
    private int idTransaccion;
    private Date fecha;
    private ArrayList<DetalleTransaccion> detalle;

    public Transaccion() {
        detalle = new ArrayList<>();
        fecha = new Date();
    }
    
    public void agregarDetalle(DetalleTransaccion dt){
        detalle.add(dt);
    }
    
    public Date fechaRetorno(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        return calendar.getTime();
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<DetalleTransaccion> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<DetalleTransaccion> detalle) {
        this.detalle = detalle;
    }

    
}
