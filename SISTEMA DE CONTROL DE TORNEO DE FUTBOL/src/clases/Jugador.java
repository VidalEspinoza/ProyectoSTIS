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
public class Jugador extends Usuario{
    
    private String nombre;
    private Posicion posicion;

    public Jugador() {
    }

    public Jugador(String nombre, Posicion posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public Jugador(String nombre, Posicion posicion, int idUsuario, String nivelPrivilegio) {
        super(idUsuario, nivelPrivilegio);
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
    public void agregarJugador(){
        
    }
    
    public void modificarJugador(){
        
    }
    
    public void consultarJugador(){
        
    }
    
    public void eliminarJugador(){
        
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + '}';
    }

  
    
    
}
