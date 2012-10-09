/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import vistas.Agregar_Profesor;

/**
 *
 * @author Amaury Gomez
 */
public class Profesor extends IModel{
    
    
    public Profesor() {
    
        
}
    
      

    Agregar_Profesor ap = new Agregar_Profesor();
         private String nombre = ap.getNm1().getText();
         private  String apellido = ap.getAp1().getText();
         private String numero = ap.getTf1().getText();
         private String cedula = ap.getCd1().getText();
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
      
}
