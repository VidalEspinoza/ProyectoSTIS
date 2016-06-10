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
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Posicion posicion = new Posicion(1, "Portero");
        
        Jugador jugador = new Jugador("Casillar", posicion, 7, "Cuidar la meta");
        
        DirectorTecnico directorTecnico = new DirectorTecnico("El Cholo", 5, "Del Real Madrid");
        
        Reportes reportes = new Reportes(5, "20/12/2015", "10:30 AM");
        
        Contrato contrato = new Contrato(8, "02/02/2016", "20/12/2016", reportes, jugador, directorTecnico);
        
        Arbitro arbitro = new Arbitro("Julio", 45, "Guiar al Equipo");
        
        Torneo torneo = new Torneo(7, "Liga Brava", "10/10/2016", "25/12/2016", "11 Meses");
        
        Partido partido = new Partido(21, "05/05/2016", arbitro, torneo);
        
        Estadistica estadistica = new Estadistica(7, 8, 9, 10, 11, partido);
        
        Entrenador entrenador = new Entrenador("Charle", 001, "Que mejore el equipo");
        
        Equipo equipo = new Equipo(4, "Real Madrid", entrenador, estadistica, contrato);
        
        
        
          System.out.println("Resultado");
        System.out.println(equipo);
        
        
        
        
        
        
    }
    
}
