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
public class Contrato {
    
    private int idContrato;
    private String fechaInicio;
    private String fechaFinal;
    
    private Reportes reportes;
    private Jugador jugador;
    private DirectorTecnico directorTecnico;

    public Contrato() {
    }

    public Contrato(int idContrato, String fechaInicio, String fechaFinal, Reportes reportes, Jugador jugador, DirectorTecnico directorTecnico) {
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.reportes = reportes;
        this.jugador = jugador;
        this.directorTecnico = directorTecnico;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Reportes getReportes() {
        return reportes;
    }

    public void setReportes(Reportes reportes) {
        this.reportes = reportes;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }
    
      public void agregarContrato(){
        
    }
    
    public void modificarContrato(){
        
    }
    
    public void consultarContrato(){
        
    }
    
    public void eliminarContrato(){
        
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", fechaInicio=" + fechaInicio + "\n fechaFinal=" + fechaFinal + ", reportes=" + reportes + "\n jugador=" + jugador + ", directorTecnico=" + directorTecnico + '}';
    }
    
    
    
}
