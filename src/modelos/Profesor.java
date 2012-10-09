/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.Cr_Profesor;
import javax.swing.JOptionPane;
import sun.tools.jar.resources.jar;
import vistas.Agregar_Profesor;

/**
 *
 * @author Amaury Gomez
 */
public class Profesor extends IModel{
    
    
     
   private String nombre;
   private String apellido;
   private String cedula;
   private String telefono;
    
    

  Profesor(String nombre,String cedula,String telefono){
  this.nombre = nombre;
  this.apellido = apellido;
  this.cedula = cedula;
  this.telefono = telefono;
 }

    public Profesor() {
        
    }

    
  

    @Override
    public int hashCode() {
        return getNombre().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cr_Profesor){
            Profesor teach = ( Profesor) obj;
            if (nombre.equalsIgnoreCase(teach.getNombre())){
                return true;
            }
        }
        return false;
    }
    
    

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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
  
    
   
   
   
      
}
