/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01.GestionDePedidos;

import java.util.ArrayList;

/**
 *
 * @author nahuel
 */
public class Factura extends Comprobante{
    private float total;
    private Cliente cliente;//se establece el atributo cliente agregado de la clase cliente
    private ArrayList<Producto> producto;//se agrega atributo producto 

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public Factura() {
    }
    
            
}
