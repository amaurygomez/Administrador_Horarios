/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import vistas.Agregar_Materias;

/**
 *
 * @author Amaury Gomez
 */
public class Materia extends IModel{
    
    
      Agregar_Materias agm = new Agregar_Materias();
    private String nombre = agm.getNm2().getText();
    private int creditos = Integer.parseInt(agm.getCd2().getText()); 

    /**
     * @return the id
     */


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
  
     
      
      
    
    
}
