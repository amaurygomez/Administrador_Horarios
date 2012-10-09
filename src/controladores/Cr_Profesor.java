/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Profesor;
import vistas.Agregar_Profesor;

/**
 *
 * @author Amaury Gomez
 */
public class Cr_Profesor {
    
    
    
    
    
    public static void agregar(){
         Agregar_Profesor ap = new Agregar_Profesor();
         String nombre = ap.getNm1().getText();
          String apellido = ap.getAp1().getText();
        String numero = ap.getTf1().getText();
          String cedula = ap.getCd1().getText();
 
      
       System.out.println(nombre);
    
    
    }
    
    
    
    
    
    
    
}
