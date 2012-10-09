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
    String apellido = agp.getAp1().getText();
    String cedula = agp.getCd1().getText();
    String telefono = agp.getTf1().getText();
    
    
    
    String nombre2 = nombre;
    String apellido2 = apellido;
    String cedula2 = cedula;
    String telefono2 = telefono;
   System.out.println(nombre2);
   System.out.println(apellido2);
   System.out.println(cedula2);
   System.out.println(telefono2);
   
    }
    
   
   
   
      
}
