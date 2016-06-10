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
public class Entrenador extends Usuario{
    
    private String nombre;

    public Entrenador() {
    }

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador(String nombre, int idUsuario, String nivelPrivilegio) {
        super(idUsuario, nivelPrivilegio);
        this.nombre = nombre;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarEntrenador(){
        
    }
    
    public void modificarEntrenador(){
        
    }
    
    public void consultarEntrenador(){
        
    }
    
    public void eliminarEntrenador(){
        
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + '}';
    }
    
}
