package InfoPersonas;

public class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String identificacion, String estadoCivil, int anioIncorporacion, int despacho, String departamento) {
        super(nombre, apellidos, identificacion, estadoCivil, anioIncorporacion, despacho);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
}
