/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto04.Circunferencia;

/**
 *
 * @author nahuel
 */
public class Circunferencia {
    private double radio;
    public Circunferencia() {
    }
    
    public void calcularArea(){
        System.out.println("se calculo el area");
    }
    
    public void calcularPerimetro(){
        System.out.println("se calculo el perimetro");
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
