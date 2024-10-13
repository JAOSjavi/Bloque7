package InfoPersonas;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellidos, String identificacion, String estadoCivil, String curso) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.curso = curso;
    }

    public void matricularEnNuevoCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso;
    }
}
