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
public class Profesor extends Persona{
    private String materia;
    private String cargo;

    public Profesor() {
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {//se corrige tipo de dato String val por String materia
        this.materia = materia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {//se corrige riop de dato String val por String cargo
        this.cargo = cargo;
    }
    
    
}
