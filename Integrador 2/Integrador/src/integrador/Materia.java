package integrador;

public class Materia {

    private int id;
    private String nombre;
    private int creditos;
    private Materia[] m;
    private int tamaño1;
    private int pos1;
    private Profesor profe;

    public Materia() {

        id = 0;
        nombre = "";
        creditos = 0;
        tamaño1 = 3;
        m = new Materia[tamaño1];
        pos1 = 0;

    }

    public Materia(int id, String nombre, int creditos, Profesor profe) throws Exception {
        setId(id);
        setNombre(nombre);
        setCreditos(creditos);
        setProfe(profe);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if (id >= 0) {
            this.id = id;
        } else {
            throw new Exception("ID invalida");
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) throws Exception {
        if (creditos > 0) {
            this.creditos = creditos;
        } else {
            throw new Exception("Creditos invalidos");
        }
    }

    @Override
    public String toString() {

        String s = String.format("%d\t%s\t%d", id, nombre, creditos);
        return s;
    }

   

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }
    
    
   public boolean agregarMateria(Materia p1) {
        if (pos1 < tamaño1) {
            m[pos1] = p1;
            pos1++;
            return true;
        } else {
            return false;
        }
    }

    public boolean llenoMateria() {
        return pos1 == tamaño1;
    }

    public Materia consultaMateria(int clave) {
        Materia p = null;
        if (pos1 > 0) {
            for (int i = 0; i < pos1; i++) {
                if (clave == m[i].getId()) {
                    p = m[i];
                    break;
                }
            }
        }
        return p;
    }
}
