/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mañanas
 */
public class EntradaSalida {
   static Scanner sc=new Scanner(System.in);
    public static int mostrarMenu(){
        System.out.println("Elija una opcion(1-4):");
        System.out.println("1.Insertar Contacto \n"
                + "2.listar contactos \n3.Salir");
        
        int i= sc.nextInt();
        sc.nextLine();//este se pone para ke no salte dos veces de linea y lea bn
        return i;  
    }
    public static Contacto pedirContacto(){
        Contacto c = new Contacto();
        System.out.println(" introduce nombre:");
        c.setNombre(sc.nextLine());
         System.out.println(" introduce Telefono:");
         c.setTelefono(sc.nextLine());
         return c;
    }
    public static void mostrarContactos(ArrayList<Contacto> a){
        for (int i = 0; i < a.size(); i++) {
            Contacto aux= a.get(i);
            System.out.println( aux.toString());
        }
    
    }
    
}
