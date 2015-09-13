/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto04.ControlDeVuelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nahuel
 */
public class ControlDeVuelo {
    private int numeroVuelo;
    private Date partida;
    private Date llegada;

    public ControlDeVuelo() {
    }
    
    public long fijarDemora(){
        long demora = llegada.getTime() - partida.getTime();;
        return demora;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Date getPartida() {
        return partida;
    }

    public void setPartida(Date partida) {
        this.partida = partida;
    }

    public Date getLlegada() {
        return llegada;
    }

    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }

    @Override
    public String toString() {
        String salida = "";
        
        
        return "ControlDeVuelo{" + "numeroVuelo=" + numeroVuelo + ", partida=" + partida + ", llegada=" + llegada + '}';
    }
    
    
}
