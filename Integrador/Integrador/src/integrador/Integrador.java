/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrador;

import java.util.Scanner;

/**
 *
 * @author Luisf
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int op, opa;
        
        System.out.println("-----------MENU-----------");
        System.out.println("0. Salir");
        System.out.println("1. Alumno");
        System.out.println("2. Profesor");
        System.out.println("3. Materia");
        System.out.println("--------------------------");
        System.out.print("Selecciona una opcion: ");
        op=leer.nextInt();
        
        
        switch(op){
            case 1:
                System.out.println("-----------MENU-----------");
                System.out.println("1. Agregar alumno");
                System.out.println("2. Eliminar");
                System.out.println("3. Imprimir base de datos");
                System.out.println("--------------------------");
                System.out.print("Selecciona una opcion: ");
                opa= leer.nextInt();
                //Aquí se pondrá el funcionamiento con los metodos dependiendo de la opcion que elijan//
                break;
                
            case 2:
                System.out.println("-----------MENU-----------");
                System.out.println("1. Agregar profesor");
                System.out.println("2. Eliminar");
                System.out.println("3. Imprimir base de datos");
                System.out.println("--------------------------");
                System.out.print("Selecciona una opcion: ");
                opa= leer.nextInt();
                //Aquí se pondrá el funcionamiento con los metodos dependiendo de la opcion que elijan//
                break;
                
            case 3:
                System.out.println("-----------MENU-----------");
                System.out.println("1. Agregar profesor");
                System.out.println("2. Eliminar");
                System.out.println("3. Imprimir base de datos");
                System.out.println("--------------------------");
                System.out.print("Selecciona una opcion: ");
                opa= leer.nextInt();
                //Aquí se pondrá el funcionamiento con los metodos dependiendo de la opcion que elijan//
                break;
                
            default:
                System.out.println("Opcion invalida");
                
        }
    }
   
}
