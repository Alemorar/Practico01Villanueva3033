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
    private Date devolucion;
    private boolean sancion = false;
    private ArrayList<DetalleTransaccion> detalle;
    
}
