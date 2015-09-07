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
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {//se corrige int val por int dia
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {//se corrige int val por int mes
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {//se corrige int val por int anio
        this.anio = anio;
    }
    
}
