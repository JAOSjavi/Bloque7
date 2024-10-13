package InfoPersonas;

public class PersonalDeServicio extends Empleado {
    private String seccion;

    public PersonalDeServicio(String nombre, String apellidos, String identificacion, String estadoCivil, int anioIncorporacion, int despacho, String seccion) {
        super(nombre, apellidos, identificacion, estadoCivil, anioIncorporacion, despacho);
        this.seccion = seccion;
    }

    public void cambiarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sección: " + seccion;
    }
}
