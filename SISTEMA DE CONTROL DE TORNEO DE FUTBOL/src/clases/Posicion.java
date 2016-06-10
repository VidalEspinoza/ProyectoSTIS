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
public class Posicion {
    private int idPosicion;
    private String nomProsicion;

    public Posicion() {
    }

    public Posicion(int idPosicion, String nomProsicion) {
        this.idPosicion = idPosicion;
        this.nomProsicion = nomProsicion;
    }

    public int getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(int idPosicion) {
        this.idPosicion = idPosicion;
    }

    public String getNomProsicion() {
        return nomProsicion;
    }

    public void setNomProsicion(String nomProsicion) {
        this.nomProsicion = nomProsicion;
    }
    
    public void agregarPosicion(){
        
    }
    
     public void modificarPosicion(){
        
    }
     
      public void consultarPosicion(){
        
    }
      
      public void eliminarPosicion(){
        
    }

    @Override
    public String toString() {
        return "Posicion{" + "idPosicion=" + idPosicion + ", nomProsicion=" + nomProsicion + '}';
    }
    
}
