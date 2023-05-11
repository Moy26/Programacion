
package pintegrador3;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    
    public Persona(){     
    }

    public Persona(String nombre, String apellido, int edad, String sexo) {
        super();
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {

        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (!apellido.isEmpty()) {
            this.apellido = apellido;
        } else {

        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {

        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!sexo.isEmpty()) {
            this.sexo = sexo;
        } else {

        }
    }

    @Override
    public String toString() {
        return nombre + ", " + apellido + ", " + edad + ", " + sexo + ", ";
    }

    
}
