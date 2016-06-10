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
public class Arbitro extends Usuario{
    
    private String nombre;

    public Arbitro() {
    }

    public Arbitro(String nombre) {
        this.nombre = nombre;
    }

    public Arbitro(String nombre, int idUsuario, String nivelPrivilegio) {
        super(idUsuario, nivelPrivilegio);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarArbitro(){
        
    }
    
    public void modificarArbitro(){
        
    }
    
    public void consultarArbitro(){
        
    }
    
    public void eliminarArbitro(){
        
    }

    @Override
    public String toString() {
        return "Arbitro{" + "nombre=" + nombre + '}';
    }
    
    
}
