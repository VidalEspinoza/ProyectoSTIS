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
public class DirectorTecnico extends Usuario{
    private String nombreDirTec;

    public DirectorTecnico() {
    }

    public DirectorTecnico(String nombreDirTec) {
        this.nombreDirTec = nombreDirTec;
    }

    public DirectorTecnico(String nombreDirTec, int idUsuario, String nivelPrivilegio) {
        super(idUsuario, nivelPrivilegio);
        this.nombreDirTec = nombreDirTec;
    }

    public String getNombreDirTec() {
        return nombreDirTec;
    }

    public void setNombreDirTec(String nombreDirTec) {
        this.nombreDirTec = nombreDirTec;
    }
    
      public void agregarDirTec(){
        
    }
    
    public void modificarDirTec(){
        
    }

    public void consultarDirTec(){
        
    }

    public void eliminarDirTec(){
        
    }
    
    @Override
    public String toString() {
        return "DirectorTecnico{" + "nombreDirTec=" + nombreDirTec + '}';
    }

    
  
    
}
