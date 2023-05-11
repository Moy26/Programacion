package a8ejercicio;

/** Establece 2 clases derivadas que hereden de tu clase Persona. Estas clases
    son Cliente y Empleado. */

public class Cliente extends Persona{
    
    private String nombre;
    private String nacionalidad;
    private int noCuenta;

    public Cliente() {
    }

    public Cliente(String nombre, String nacionalidad, int noCuenta) throws Exception {
        this.setNombre(nombre);
        this.setNacionalidad(nacionalidad);
        this.setNoCuenta(noCuenta);
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("Por Favor, Recuerde Llenar Todos Los Campos(Nombre)...");
        }
    }

    public void setNacionalidad(String nacionalidad) throws Exception {
        if (!nombre.isEmpty()) {
            this.nacionalidad = nacionalidad;
        } else {
            throw new Exception("Por Favor, Recuerde Llenar Todos Los Campos(Nacionalidad)...");
        }
    }

    public void setNoCuenta(int noCuenta) throws Exception {
        if (noCuenta > 0) {
            this.noCuenta = noCuenta;
        } else {
            throw new Exception("Su Numero De Cuenta No Puede Ser Menor A 1...");
        }
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public String nacionalidad() {
        return nacionalidad;
    }

    @Override
    public int noCuenta() {
        return noCuenta;
    }
    
}
