/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.Cr_Aula;

/**
 *
 * @author Amaury Gomez
 */
public class Aula extends IModel{
    

   private String ubicacion;


  Aula(String ubicacion){
  
        this.ubicacion = ubicacion;
 }



    @Override
    public int hashCode() {
        return getUbicacion().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aula){
           Cr_Aula aula =(Cr_Aula) obj;
           if (aula.getUbicacion().equalsIgnoreCase(ubicacion)){
               return true;
           }
        }
        return false;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
