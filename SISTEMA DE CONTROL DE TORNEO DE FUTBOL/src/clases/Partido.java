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
public class Partido {
    
    private int idPartido;
    private String fechaPartido;
    private Arbitro arbitro;
    private Torneo torneo;

    public Partido() {
    }

    public Partido(int idPartido, String fechaPartido, Arbitro arbitro, Torneo torneo) {
        this.idPartido = idPartido;
        this.fechaPartido = fechaPartido;
        this.arbitro = arbitro;
        this.torneo = torneo;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }
    
    public void agregarPartido(){
        
    }
    
    public void modificarPartido(){
        
    }
    
    public void consultarPartido(){
        
    }
    
    public void eliminarPartido(){
        
    }

    @Override
    public String toString() {
        return "Partido{" + "idPartido=" + idPartido + ", fechaPartido=" + fechaPartido + "\n arbitro=" + arbitro + ", torneo=" + torneo + '}';
    }
    
    
       
    
}
