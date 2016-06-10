/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Vidal Espinoza
 */
public class Estadistica {
    
    private int idEstadistica;
    private int numGoles;
    private int numTarjetasAmarillas;
    private int numTarjetasRojas;
    private int marcador;
    private Partido partido;

    public Estadistica() {
    }

    public Estadistica(int idEstadistica, int numGoles, int numTarjetasAmarillas, int numTarjetasRojas, int marcador, Partido partido) {
        this.idEstadistica = idEstadistica;
        this.numGoles = numGoles;
        this.numTarjetasAmarillas = numTarjetasAmarillas;
        this.numTarjetasRojas = numTarjetasRojas;
        this.marcador = marcador;
        this.partido = partido;
    }

    public int getIdEstadistica() {
        return idEstadistica;
    }

    public void setIdEstadistica(int idEstadistica) {
        this.idEstadistica = idEstadistica;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public int getNumTarjetasAmarillas() {
        return numTarjetasAmarillas;
    }

    public void setNumTarjetasAmarillas(int numTarjetasAmarillas) {
        this.numTarjetasAmarillas = numTarjetasAmarillas;
    }

    public int getNumTarjetasRojas() {
        return numTarjetasRojas;
    }

    public void setNumTarjetasRojas(int numTarjetasRojas) {
        this.numTarjetasRojas = numTarjetasRojas;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    
      public void agregarEstadistica(){
        
    }
    
    public void modificarEstadistica(){
        
    }
    
    public void consultarEstadistica(){
        
    }
    
    public void eliminarEstadistica(){
        
    }

    @Override
    public String toString() {
        return "Estadistica{" + "idEstadistica=" + idEstadistica + ", numGoles=" + numGoles + "\n numTarjetasAmarillas=" + numTarjetasAmarillas + ", numTarjetasRojas=" + numTarjetasRojas + "\n marcador=" + marcador + ", partido=" + partido + '}';
    }
    
    
   
    
    
}
