/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mañanas
 */
public class AccesoFichero {
   static  File archivo=new File("C:\\IFCT0609\\agenda.txt");//archivo puede ser .csv
   
    public static void grabarContacto(Contacto c){
       
        try {
            //en el try toda la ejecucion
            FileWriter fr=new FileWriter(archivo, true);
            /*true se pone para ke escriba siempre al final.. appendiendo*/
            fr.write(c.getNombre()+","+c.getTelefono());
            fr.write("\n");
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static ArrayList<Contacto> obtenerContactos(){
        
        ArrayList<Contacto> a =new ArrayList<>();
        FileReader fr;
         try {
             fr = new FileReader(archivo);
             BufferedReader br=new BufferedReader(fr);
             String linea=br.readLine();
             while (linea!=null) {      
                 /***muy importante declarar  el objeto contato en cada pasada pork sino siempre lee el ultimo***/
                 Contacto c=new Contacto();
                 //tiene ke haber un objeto nuevo siempre pork 
                 //sino se le asigna el ultimo valor al mismo objeto y entonces todos valen lo mismo en el array list;
                 //referencia al mismo objeto
                 
                 String[] aux=linea.split(",");
                 c.setNombre(aux[0]);
                 c.setTelefono(aux[1]);
                 a.add(c);
                 linea=br.readLine();
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
           Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        return a;
    }
    
}
