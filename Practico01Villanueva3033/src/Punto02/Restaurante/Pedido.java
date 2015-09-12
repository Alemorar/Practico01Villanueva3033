/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.Restaurante;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nahuel
 */
public class Pedido {
    private int idPedido;
    private int numeroMesa;
    private int comensales;
    private String mozo;
    private Date fecha;
    private ArrayList<DetallePedido> detalle;
    private double propina;
    

    public Pedido() {
        detalle = new ArrayList<>();
    }
    
    public void agregarDetalle(DetallePedido dp){
        detalle.add(dp);
    }
    
    public double calcularTotal(){
        double total = 0.0;
        for (DetallePedido dp: detalle){
            total = total + dp.calcularSubtotal();
        }
        return total;
    }
    
    public double calcularImpuesto(){
        double impuesto;
        impuesto = calcularTotal() * 0.21;
        return impuesto;
    }
    
    public double calcularPago(){
        double pago;
        pago = calcularTotal() * 1.21 + propina;
        return pago;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<DetallePedido> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<DetallePedido> detalle) {
        this.detalle = detalle;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }
    
    @Override
    public String toString() {
        String salida = "";
        salida = "--------------------------------------------------------";
        salida = salida + "\nNumero Pedido: " + idPedido;
        salida = salida + "\nNº de Mesa: " + numeroMesa;
        salida = salida + "\nMozo: " + mozo;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy h:mm:ss");
        salida = salida + "\nFecha: " + sdf.format(fecha) + "\n";
        salida = salida + "--------------------------------------------------------";
        salida = salida + "\nidItem" + "\tNombre" + "\tDescripcion" + "\tPrecio" + "\tCant." + "\tSubTotal";
        for (DetallePedido dp:detalle){
            salida = salida + dp.toString();
        }
        salida = salida + "\n\t\t\t\t------------------------";
        salida = salida + "\n\t\t\t\tTotal:\t\t" + calcularTotal();
        salida = salida + "\n\t\t\t\tImpuesto IVA:\t" + calcularImpuesto();
        salida = salida + "\n\t\t\t\tPropina:\t" + propina;
//        DecimalFormat df = new DecimalFormat("#.##");
//        salida = salida + "\n\t\t\t\tA Pagar:\t" + df.format(calcularPago());
        BigDecimal unBigDecimal = new BigDecimal(calcularPago());
        salida = salida + "\n\t\t\t\tA Pagar:\t" + unBigDecimal.setScale(2, RoundingMode.UP);
        salida = salida + "\n\t\t\t\t------------------------";
        return salida;
    }
}
