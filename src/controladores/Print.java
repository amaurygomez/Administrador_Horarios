/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author Amaury Gomez
 */
public class Print implements Impresora{

FileOutputStream archivo;
PdfWriter pdf;
Document calendar = new Document();
    
    @Override
    public boolean print (String data) {
        try {
            archivo = new FileOutputStream(data);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Impresora.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pdf = PdfWriter.getInstance(calendar, archivo);
        } catch (DocumentException ex) {
            Logger.getLogger(Impresora.class.getName()).log(Level.SEVERE, null, ex);
        }
        calendar.open();
        try {
         calendar.add(new Paragraph(data));
         calendar.close();
        } catch (Exception e) {
        }
        
        try {
          archivo.close();   
        } catch (Exception e) {
        }
        return true;
    }
    
}

