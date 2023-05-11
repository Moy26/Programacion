package integrador;

import java.util.Scanner;

public class Escuela {

    private Profesor[] p;
    private int tamaño3;
    private int pos3;

    public Escuela() {
        tamaño3 = 2;
        p = new Profesor[tamaño3];
        pos3 = 0;
    }

    

    
    public void menu() throws Exception{
        
        Scanner leer = new Scanner(System.in);
        int op, op1, op2, materias;

        
        Alumno alu = new Alumno();
        Alumno alum = new Alumno();
        Profesor profe = new Profesor();
        Profesor prof = new Profesor();
        Escuela escu = new Escuela();
        Materia mat = new Materia();
        Materia mate = new Materia();
        Materia[] materiass = new Materia[3];
        
       
        
        

        do {
            do {
                System.out.println("");
                System.out.println("Elige la opcion que quieras hacer: ");
                System.out.println("0. Atras");
                System.out.println("1. Agregar");
                System.out.println("2. Imprimir");
                System.out.print("Opcion: ");
                op = leer.nextInt();

            } while (op < 0 && op > 3);

            switch (op) {
                case 0:
                    System.out.println("Hasta luego...");
                    break;

                case 1:
                    do {
                        System.out.println("");
                        System.out.println("Elige la opcion a agregar: ");
                        System.out.println("0. Salir");
                        System.out.println("1. Profesor");
                        System.out.println("2. Materia");
                        System.out.println("3. Alumno");
                        System.out.print("Opcion: ");
                        op1 = leer.nextInt();

                        switch (op1) {
                            case 3:
                                if (alum.llenoAlumno()) {
                                    System.out.println("Grupo lleno");
                                } else {
                                    System.out.println("");
                                    System.out.print("Ingresa matricula: ");
                                    int matricula = leer.nextInt();
                                    System.out.print("Ingresa su nombre: ");
                                    String nombre = leer.next();
                                    System.out.print("Ingresa su apellido: ");
                                    String apellido = leer.next();
                                    System.out.print("Ingresa su edad: ");
                                    int edad = leer.nextInt();
                                    System.out.print("Ingrese su sexo: ");
                                    String sexo = leer.next();
                                    System.out.print("Ingrese su semestre: ");
                                    int semestre = leer.nextInt();
                                    System.out.println("Ingrese las materias, cuando termine ingrese 0");
                                     Materia maaa;
                                    do{
                                       
                                        int n=0;
                                        materias = leer.nextInt();
                                        maaa = mat.consultaMateria(materias);
                                        if(maaa!=null){
                                            materiass[n]=maaa;
                                            n++;
                                            System.out.println("Esta materia fue agregada");
                                        }else{
                                            if(materias!=0){
                                            System.out.println("Materia no encontrada");
                                        }
                                        }
                                    }while(materias!=0);
                                    alum.setMaterias(materiass);
                                    alu = new Alumno(matricula, nombre, apellido, edad, sexo, semestre, materiass);
                                    if (alum.agregarAlumno(alu)) {
                                        System.out.println("Alumno agregado!");
                                    }
                                }

                                break;

                            case 1:
                                if (prof.llenoProfe()) {
                                    System.out.println("Grupo lleno");
                                } else {
                                    System.out.println("");
                                    System.out.print("Ingresa la matricula: ");
                                    int matricula = leer.nextInt();
                                    System.out.print("Ingresa el nombre: ");
                                    String nombre = leer.next();
                                    System.out.print("Ingresa el apellido: ");
                                    String apellido = leer.next();
                                    System.out.print("Ingresa el sexo: ");
                                    String sexo = leer.next();
                                    System.out.print("Ingresa la edad: ");
                                    int edad = leer.nextInt();
                                    System.out.print("Ingresa el titulo: ");
                                    String titulo = leer.next();
                                    System.out.print("Ingrese la cedula: ");
                                    int cedula = leer.nextInt();
                                    profe = new Profesor(matricula, nombre, apellido, sexo, edad, titulo, cedula);
                                    if (prof.agregarProfesor(profe)) {
                                        System.out.println("Profesor agregado!");
                                    } else {
                                        System.out.println("Profesor no agregado :c");
                                    }
                                }
                                
                               

                                break;

                            case 2:
                                if (mat.llenoMateria()) {
                                    System.out.println("Grupo lleno");
                                } else {
                                    System.out.println("");
                                    System.out.print("Ingrese la ID de la materia: ");
                                    int id = leer.nextInt();
                                    System.out.print("Ingrese su nombre: ");
                                    String nombre = leer.next();
                                    System.out.print("Ingrese el numero de creditos: ");
                                    int creditos = leer.nextInt(); 
                                    System.out.print("Ingresa la matricula del profesor que la imparira: ");
                                    int matri1 = leer.nextInt();
                                    profe = prof.consultaProfesor(matri1);
                                    mate = new Materia(id, nombre, creditos, profe);
                                    if(mat.agregarMateria(mate)){
                                        System.out.println("Materia agregada!");
                                    }else{
                                        System.out.println("La materia no se agrego");
                                    }
                                
                                     
                                    
                                }
                                break;
                        }
                    } while (op1 != 0);
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Elige la opcion a imprimir:  ");
                    System.out.println("1. Alumno");
                    System.out.println("2. Profesor");
                    System.out.println("3. Materia");
                    System.out.print("Opcion: ");
                    op2 = leer.nextInt();

                    switch (op2) {
                        case 1:
                            System.out.println("");
                            System.out.print("Ingrese la matricula del alumno: ");
                            int matricula = leer.nextInt();
                            alu = alum.consultaAlumno(matricula);
                            if (alu != null) {
                                System.out.println("ID\tNombre\tApellido\tEdad\tSexo\tSemestre");
                                System.out.println(alu);
                                System.out.println("Materias:");
                                System.out.println("ID\tNombre\tCreditos");
                                alu.Materias();
                                System.out.println("");
                            } else {
                                System.out.println("Alumno no encontrado!");
                            }
                            break;

                        case 2:
                            System.out.println("");
                            System.out.print("Ingrese la matricula: ");
                            matricula = leer.nextInt();
                            profe = prof.consultaProfesor(matricula);
                            if (profe != null) {
                                System.out.println("ID\tNombre\tApellido\tEdad\tSexo\tTitulo\tCedula");
                                System.out.println(profe);
                            }
                            break;

                        case 3:
                            System.out.println("");
                            System.out.print("Ingrese la ID: ");
                            matricula = leer.nextInt();
                            mat = mate.consultaMateria(matricula);
                            if (mate != null) {
                                System.out.println("ID\tNombre\tCreditos");
                                System.out.println(mate);
                                 System.out.println("ID\tNombre\tApellido\tEdad\tSexo\tTitulo\tCedula");
                                System.out.println(mate.getProfe());
                                }else{
                                System.out.println("Materia no encontrada");
                            }
                            break;
                    }
            }
        } while (op != 0);
    }
}
