/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga.area;

import java.util.Scanner;

/**
 *
 * @author Luisf
 */
public class SobrecargaArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        Figuras fir = new Figuras();
        
        int op;
        double base;
        double altura;
        double longitud;
        float radio;
        double base2;
        
        do {
            op = menu();

            switch (op) {
                case 0:
                    System.out.println("Hasta luego...");
                    break;

                case 1:
                    System.out.print("Ingresa la altura: ");
                    altura = leer.nextDouble();
                    System.out.print("Ingresa la base: ");
                    base = leer.nextDouble();

                    fir.area(base, altura);
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Ingrese la longitud: ");
                    longitud = leer.nextDouble();
                    
                    fir.area(longitud);
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Ingrese el radio: ");
                    radio = leer.nextFloat();
                    
                    fir.area(radio);
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Ingresa la base 1: ");
                    base = leer.nextDouble();
                    System.out.print("Ingresa la base 2: ");
                    base2 = leer.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    altura = leer.nextDouble();
                    
                    fir.area(base, base2, altura);
                    System.out.println("");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    System.out.println("");
                    break;

            }
        } while (op != 0);
    }
    
    public static int menu(){
        Scanner leer = new Scanner(System.in);

        int op;

        do {
            System.out.println("----------------MENU----------------");
            System.out.println("0. Salir");
            System.out.println("1. Area de un triangulo");
            System.out.println("2. Area de un cuadrado");
            System.out.println("3. Area de un circulo");
            System.out.println("4. Area de un trapecio");
            System.out.print("Seleccion: ");
            op = leer.nextInt();
            System.out.println("");
        } while (op < 0 && op > 4);

        return op;
    }
}
