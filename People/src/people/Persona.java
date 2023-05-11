/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

/**
 *
 * @author Luisf
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

 
    public void setNombre(String nombre) throws Exception {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("No puede estar vacio!");
        }
    }

   
    public void setEdad(int edad) throws Exception {
        if (edad != 0) {
            this.edad = edad;
        } else {
            throw new Exception("No puede valer 0!");
        }
    }

  
    public void setSexo(String sexo) throws Exception {
        if (!sexo.isEmpty()) {
            this.sexo = sexo;
        } else {
            throw new Exception("No puede estar vacio!");
        }
    }
    
    
    public void imprimir(Persona persona_imp){
        System.out.println(this.nombre+", "+this.edad+", "+this.sexo+"."); 
        //utilice lo que me dijo el programa, el void 
          //System.out.println(persona_imp);
          // con este np funcionó porque es el tostring sin modificar
          // se pudo haber hecho con ese pero no es lo que pedia el programa
    }
}
