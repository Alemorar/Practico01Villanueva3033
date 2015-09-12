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
public class CopiaDeLibro {
    private int idCopia;
    private String nombre;//nombre del libro
    private String tipo;//novela, teatro, poesía, ensayo
    private String editorial;
    private String nombreAutor;
    private String nacionalidadAutor;//nacionalidad autor
    private Date fechaNacAutor;//nacimiento autor
    private int stock;

    public CopiaDeLibro() {
    }

    public int getIdCopia() {
        return idCopia;
    }

    public void setIdCopia(int idCopia) {
        this.idCopia = idCopia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNacionalidadAutor() {
        return nacionalidadAutor;
    }

    public void setNacionalidadAutor(String nacionalidadAutor) {
        this.nacionalidadAutor = nacionalidadAutor;
    }

    public Date getFechaNacAutor() {
        return fechaNacAutor;
    }

    public void setFechaNacAutor(Date fechaNacAutor) {
        this.fechaNacAutor = fechaNacAutor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
