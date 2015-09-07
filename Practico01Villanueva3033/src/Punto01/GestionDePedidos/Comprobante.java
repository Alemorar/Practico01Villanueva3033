/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01.GestionDePedidos;

/**
 *
 * @author nahuel
 */
public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante() {
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {//val por tipo
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {//val por numero
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {//val por fecha
        this.fecha = fecha;
    }
    
}
