package integrador;

public class Profesor {

    private int id;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private String titulo;
    private int cedula;
    private Profesor[] p;
    private int tamaño3;
    private int pos3;

    public Profesor() {
        id = 0;
        nombre = "";
        apellido = "";
        sexo = "";
        edad = 0;
        titulo = "";
        cedula = 0;
        tamaño3 = 5;
        p = new Profesor[tamaño3];
        pos3 = 0;
        
    }

    public Profesor(int id, String nombre, String apellido, String sexo, int edad, String titulo, int cedula) throws Exception {
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setSexo(sexo);
        setEdad(edad);
        setTitulo(titulo);
        setCedula(cedula);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new Exception("edad invalidad");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new Exception("Titulo invalido");
        }
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) throws Exception {
        if (cedula > 0) {
            this.cedula = cedula;
        } else {
            throw new Exception("Celuda invaluda");
        }
    }

    @Override
    public String toString() {

        String s = String.format("%d\t%s\t%s\t\t%d\t%s\t%s\t%d", id, nombre, apellido, edad, sexo, titulo, cedula);
        return s;
    }
public boolean agregarProfesor(Profesor p1) {
        if (pos3 < tamaño3) {
            p[pos3] = p1;
            pos3++;
            return true;
        } else {
            return false;
        }
    }

    public boolean llenoProfe() {
        return pos3 == tamaño3;
    }

    public Profesor consultaProfesor(int clave) {
        Profesor profe = null;
        if (pos3 > 0) {
            for (int i = 0; i < pos3; i++) {
                if (clave == p[i].getId()) {
                    profe = p[i];
                    break;
                }
            }
        }
        return profe;
    }

}
