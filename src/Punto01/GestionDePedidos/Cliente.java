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
public class Cliente {
    private int codigo;
    private String razonSocial;

    public Cliente() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {//val por codigo
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {//val por razonSocial
        this.razonSocial = razonSocial;
    }
    
}
