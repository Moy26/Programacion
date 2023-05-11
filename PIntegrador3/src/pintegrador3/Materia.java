
package pintegrador3;

public class Materia {
    
    private int id;
    private String nombre;
    private int creditos;
    private Profesor profe;

    public Materia() {

        id = 0;
        nombre = "";
        creditos = 0;
    }

    public Materia(int id, String nombre, int creditos, Profesor profe) {
        setId(id);
        setNombre(nombre);
        setCreditos(creditos);
        setProfe(profe);
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id){
        if (id >= 0) {
            this.id = id;
        } else {
           
        }
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos)  {
        if (creditos > 0) {
            this.creditos = creditos;
        } else {
            
        }
    }

    @Override
    public String toString() {
        return "["+id + ", " + nombre + ", " + creditos + "]";
    }
    
    public String toString2(){
        return profe.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Materia) {
            Materia tmp = (Materia) obj;
            if (this.id == tmp.id) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }
    
}
