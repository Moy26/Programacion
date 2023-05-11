
package a8ejercicio;

import java.util.Scanner;

/** En la función principal de tu programa main () solicita la captura de un cliente y un
empleado y después imprime en pantalla los datos registrados.*/

public class A8Ejercicio {

    public static void main(String[] args)throws Exception {
        
        Scanner leer = new Scanner(System.in);

        int op, noCuenta, noCuentaE;
        String nombre, nacionalidad;

        Cliente c = new Cliente();
        Empleado e = new Empleado();
        Persona p = new Persona();

        do {
            op = menu();

            switch (op) {
                case 0:
                    System.out.println("Vuelva Pronto!!!");
                    break;

                case 1:
                    System.out.print("Ingresa El Nombre Del Cliente: ");
                    nombre = leer.nextLine();
                    
                    System.out.print("Ingresa El Numero De Cuenta De Cliente: ");
                    noCuenta = leer.nextInt();
                    
                    System.out.print("Ingresa La Nacionalidad Del Cliente: ");
                    nacionalidad = leer.next();
                    
                    c = new Cliente(nombre, nacionalidad, noCuenta);
                    break;

                case 2:
                    System.out.print("Ingresa El Nombre Del Empleado: ");
                    nombre = leer.nextLine();
                    
                    System.out.print("Ingresa El Numero De Cuenta De Empleado: ");
                    noCuentaE = leer.nextInt();
                    
                    System.out.print("Ingresa La Nacionalidad: ");
                    nacionalidad = leer.next();
                    
                    e = new Empleado(nombre, nacionalidad, noCuentaE);
                    break;

                case 3:
                    
                    System.out.println("Nombre: " + c.nombre());
                    
                    System.out.println("Nacionalidad : " + c.nacionalidad());
                    
                    System.out.println("Numero De Cuenta: " + c.noCuenta());
                    break;

                case 4:
                    
                    System.out.println("Nombre: " + e.nombre());
                    
                    System.out.println("Nacionalidad: " + e.nacionalidad());
                    
                    System.out.println("Numero De Cuenta: " + e.noCuenta());
            }

        } while (op != 0);
    }

    public static int menu() {

        Scanner leer = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("0. Adios");
            System.out.println("1. Nuevo Cliente");
            System.out.println("2. Nuevo empleado");
            System.out.println("3. Registro De Clientes");
            System.out.println("4. Registro De Empleados");
            System.out.print("Que Vamos A Hacer Hoy?: ");
            op = leer.nextInt();
            if (op < 0 && op > 5) {
                System.out.println("Su Selección Se Encuentra Fuera De Los Parámetros Establecidos...");
            }
        } while (op < 0 && op > 5);
        
        return op;
    }
        
    }
