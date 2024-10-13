package InfoPersonas;

public abstract class Empleado extends Persona {
    protected int anioIncorporacion;
    protected int despacho;

    public Empleado(String nombre, String apellidos, String identificacion, String estadoCivil, int anioIncorporacion, int despacho) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
    }

    public void reasignarDespacho(int nuevoDespacho) {
        this.despacho = nuevoDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + ", Año de Incorporación: " + anioIncorporacion + ", Despacho: " + despacho;
    }
}
