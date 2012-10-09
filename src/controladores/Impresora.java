/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;
  import java.io.FileOutputStream;
/**
 *
 * @author Amaury Gomez
 */
interface Impresora {

    String ruta = "horarios.pdf";
  boolean print(String data);
}  

