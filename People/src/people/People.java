/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package people;

import java.util.Scanner;

/**
 *
 * @author Luisf
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        Persona persona_imp = new Persona();
        
        String nombre;
        int edad;
        String sexo;
        
        System.out.print("Ingrese el nombre: ");
        nombre = leer.next();
        persona_imp.setNombre(nombre);
        System.out.print("Ingrese la edad: ");
        edad = leer.nextInt();
        persona_imp.setEdad(edad);
        System.out.print("Ingrese el sexo: ");
        sexo = leer.next();
        persona_imp.setSexo(sexo);
        
        persona_imp.imprimir(persona_imp);
        
    }
    }
   
