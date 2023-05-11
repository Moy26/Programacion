package integrador;

public class Alumno {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private int semestre;
    private int pos2;
    private Alumno[] a;
    private int tamaño2;
    private Materia[] materi;
    private int pos = 0;

    public Alumno() {
        id = 0;
        nombre = "";
        apellido = "";
        edad = 0;
        sexo = "";
        semestre = 0;
        tamaño2=2;
        a = new Alumno[tamaño2];
        pos2 = 0;
        
    }

    public Alumno(int id, String nombre, String apellido, int edad, String sexo, int semestre, Materia[] materis) throws Exception {
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSexo(sexo);
        setSemestre(semestre);
        setMaterias(materis);
    }
    
    public void setMaterias(Materia[] materi) {
        this.materi = materi;
    }
    
    public void Materias() {
       
         for (int i = 0; i < pos+1; i++) { 
             System.out.println(pos+materi[i].toString());
        }
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if (id >= 0) {
            this.id = id;
        } else {
            throw new Exception("Matricula invalida");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("Nombre invalido");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (!apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            throw new Exception("Apellido invalido");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new Exception("Edad invalida");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) throws Exception {
        if (!sexo.isEmpty()) {
            this.sexo = sexo;
        } else {
            throw new Exception("Sexo invalido");
        }
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) throws Exception {
        if (semestre > 0) {
            this.semestre = semestre;
        } else {
            throw new Exception("Semestre invalido");
        }

    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Alumno)) {
            Alumno tmp = (Alumno) obj;
            if (this.id == tmp.id && this.nombre.equalsIgnoreCase(tmp.nombre)
                    && this.apellido.equalsIgnoreCase(tmp.apellido)
                    && this.edad == tmp.edad && this.sexo.equalsIgnoreCase(tmp.sexo) && this.semestre == tmp.semestre) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        String s = String.format("%d\t%s\t%s\t\t%d\t%s\t%d", id, nombre, apellido, edad, sexo, semestre);
        return s;
    }

    
    
     public boolean agregarAlumno(Alumno a1) {
        if (pos2 < tamaño2) {
            a[pos2] = a1;
            pos2++;
            return true;
        } else {
            return false;
        }
    }

    public boolean llenoAlumno() {
        return pos2 == tamaño2;
    }

    public Alumno consultaAlumno(int clave) {
        Alumno p = null;
        if (pos2 > 0) {
            for (int i = 0; i < pos2; i++) {
                if (clave == a[i].getId()) {
                    p = a[i];
                    break;
                }
            }
        }
        return p;
    }

    public Materia[] getMateri() {
        return materi;
    }
    
    
}
