
package pintegrador3;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona{
    
    private int id;
    private int semestre;
    
    private List<Materia> lista = new ArrayList<>();
    
    public Alumno(){
        
    }

    public Alumno(int id, String nombre, String apellido, int edad, String sexo, int semestre) {
        super(nombre, apellido, edad, sexo);
        setId(id);
        setSemestre(semestre);
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre > 0) {
            this.semestre = semestre;
        } else {
            
        }

    }
    
    

    @Override
    public String toString() {
        return super.toString() + id + ", " + semestre + ".";
    }


    public void setM(Materia m) {
        lista.add(m);
    }

    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumno) {
            Alumno tmp = (Alumno) obj;
            if (this.id == tmp.id) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public List<Materia> getLista() {
        return lista;
    }

    
}
