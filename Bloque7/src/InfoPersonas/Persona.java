package InfoPersonas;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String identificacion;
    protected String estadoCivil;

    public Persona(String nombre, String apellidos, String identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellidos + ", ID: " + identificacion + ", Estado Civil: " + estadoCivil;
    }
}
