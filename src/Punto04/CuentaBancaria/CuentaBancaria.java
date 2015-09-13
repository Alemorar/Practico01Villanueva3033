/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto04.CuentaBancaria;

/**
 *
 * @author nahuel
 */
public class CuentaBancaria {
    private double monto;

    public CuentaBancaria() {
    }
    
    public void depositar(double cantidad){
        monto += cantidad;
        System.out.println("se ha depositado en la cuenta");
    }
    
    public void girar(double cantidad){
        monto -= cantidad;
        System.out.println("se ha girado de la cuenta");
    }

    public double getMonto() {//obtener el saldo
        System.out.println("se ha consultado el saldo");
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
