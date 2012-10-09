/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.IModel;
import vistas.Agregar_Materias;
import controladores.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import modelos.Materia;

/**
 *
 * @author Amaury Gomez
 */
public class Cr_Materia extends IModel{

    
    
    
    
    public static void test(){
    Materia mt = new Materia();
    
    ArrayList<String> materias = new ArrayList<String>();
    materias.add(mt.getNombre());
    
    System.out.println(materias);
    }

   
    
   
    
    
    
}
