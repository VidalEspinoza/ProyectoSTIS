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
public class Usuario {
    
    private int idUsuario;
    private String nivelPrivilegio;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nivelPrivilegio) {
        this.idUsuario = idUsuario;
        this.nivelPrivilegio = nivelPrivilegio;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNivelPrivilegio() {
        return nivelPrivilegio;
    }

    public void setNivelPrivilegio(String nivelPrivilegio) {
        this.nivelPrivilegio = nivelPrivilegio;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nivelPrivilegio=" + nivelPrivilegio + '}';
    }
    
    
    
}
