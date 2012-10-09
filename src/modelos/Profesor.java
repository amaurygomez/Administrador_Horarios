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
    
    
    
    public static void agregar(){
         Cr_Profesor crp = new Cr_Profesor();
         Agregar_Profesor agp = new Agregar_Profesor();
        String nombre = agp.getNm1().getText();
    String nombre2 = nombre;
    
   System.out.println(nombre2);
   
    }
    
   
   
   
      
}
