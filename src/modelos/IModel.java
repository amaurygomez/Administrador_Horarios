/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Amaury Gomez
 */
public abstract class IModel {
    
    
   protected  int id;
   
   public void setId(int id ){
       this.id = id;
   }
   public int getId(){
   
   return id;
   }
   
}
