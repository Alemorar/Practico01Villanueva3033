/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01.Lavarropa;

/**
 *
 * @author alejandro
 */
public class Lavadora {
    private int serie;
    private String fabricante;

    public Lavadora() {
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {//se corrige parametro int val por int serie
        this.serie = serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {//se corrige parametro String val por String fabricante
        this.fabricante = fabricante;
    }
    
    
}
