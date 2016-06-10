/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Vidal Espinoza
 */
public class Torneo {
    
    private int idTorneo;
    private String liga;
    private String fechaInicio;
    private String fechaFinal;
    private String duracion;

    public Torneo() {
    }

    public Torneo(int idTorneo, String liga, String fechaInicio, String fechaFinal, String duracion) {
        this.idTorneo = idTorneo;
        this.liga = liga;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.duracion = duracion;
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

      public void agregarTorneo(){
        
    }
    
    public void modificarTorneo(){
        
    }
    
    public void consultarTorneo(){
        
    }
    
    public void eliminarTorneo(){
        
    }
    
    @Override
    public String toString() {
        return "Torneo{" + "idTorneo=" + idTorneo + ", liga=" + liga + "\n fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + "\n duracion=" + duracion + '}';
    }
    
    
    
}
