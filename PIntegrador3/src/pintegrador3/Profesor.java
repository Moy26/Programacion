
package pintegrador3;

public class Profesor extends Persona{
    
    private int id;
    private String titulo;
    private int cedula;
    

    public Profesor() {

    }

    public Profesor(String nombre, String apellido, int edad, String sexo, int id, String titulo, int cedula) {
        super(nombre, apellido, edad, sexo);
        setId(id);
        setTitulo(titulo);
        setCedula(cedula);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {

        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
        } else {

        }
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        if (cedula > 0) {
            this.cedula = cedula;
        } else {

        }
    }

    @Override
    public String toString() {
        return super.toString() + id + ", " + titulo + ", " + cedula + ".";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Profesor) {
            Profesor tmp = (Profesor) obj;
            if (this.id == tmp.id) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    
}
