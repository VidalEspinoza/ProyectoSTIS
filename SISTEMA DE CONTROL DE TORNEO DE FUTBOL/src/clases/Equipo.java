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
public class Equipo {
    
    private int idEquipo;
    private String nombre;
    
    private Entrenador entrenador;
    private Estadistica estadistica;
    private Contrato contrato;

    public Equipo() {
    }

    public Equipo(int idEquipo, String nombre, Entrenador entrenador, Estadistica estadistica, Contrato contrato) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.estadistica = estadistica;
        this.contrato = contrato;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Estadistica getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(Estadistica estadistica) {
        this.estadistica = estadistica;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Equipo{" + "idEquipo=" + idEquipo + ", nombre=" + nombre + "\n entrenador=" + entrenador + ", estadistica=" + estadistica + "\n contrato=" + contrato + '}';
    }
    
    
    
    
    
    
}
