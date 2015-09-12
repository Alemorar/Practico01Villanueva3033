/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01.GestionDeMaterias;

/**
 *
 * @author alejandro
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {//se corrige paramaetro String val por String nombre
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {//se corrige parametro int val por int edad.
        this.edad = edad;
    }
    
    
}
