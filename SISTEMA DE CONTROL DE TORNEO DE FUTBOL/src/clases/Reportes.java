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
public class Reportes {
    
    private int idReportes;
    private String fecha;
    private String hora;

    public Reportes() {
    }

    public Reportes(int idReportes, String fecha, String hora) {
        this.idReportes = idReportes;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdReportes() {
        return idReportes;
    }

    public void setIdReportes(int idReportes) {
        this.idReportes = idReportes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
       
    
    @Override
    public String toString() {
        return "Reportes{" + "idReportes=" + idReportes + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
}
