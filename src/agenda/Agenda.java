/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author Mañanas
 */
public class Agenda {

    /**
     * @paraminsertar contact, listar, salir.
     */
    public static void main(String[] args) {
        int opcion=EntradaSalida.mostrarMenu();
        while(opcion!=3)
        {
            switch(opcion)
            {
                case 1://Insertar contacto
                    Contacto c=EntradaSalida.pedirContacto();
                    AccesoFichero.grabarContacto(c);
                    break;
                case 2:
                
                   ArrayList<Contacto> lista_contactos=AccesoFichero.obtenerContactos();//Los lee de fichero
                    EntradaSalida.mostrarContactos(lista_contactos);
                       
                    break;
                default:System.out.println(" bye bye");break;
            }
           opcion=EntradaSalida.mostrarMenu();
        }
    }
    
}
