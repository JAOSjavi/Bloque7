package InfoPersonas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        Estudiante estudiante = new Estudiante("Luis", "Lopez", "12345", "Soltero", "2do semestre");
        System.out.println(estudiante);
        estudiante.matricularEnNuevoCurso("3er semestre");
        System.out.println("Despues de matricular en nuevo curso: " + estudiante);

  
        Profesor profesor = new Profesor("River", "Bonilla", "54321", "Casado", 2015, 101, "Lenguajes");
        System.out.println(profesor);
        profesor.cambiarDepartamento("Matematicas");
        System.out.println("Despues de cambiar departamento: " + profesor);

        PersonalDeServicio personal = new PersonalDeServicio("Luis", "Prez", "98765", "Soltero", 2010, 205, "Biblioteca");
        System.out.println(personal);
        personal.cambiarSeccion("Decanato");
        System.out.println("Después de cambiar sección: " + personal);

        System.out.print("\nIngrese el nuevo estado civil del profesor: ");
        String nuevoEstadoCivil = scanner.nextLine();
        profesor.cambiarEstadoCivil(nuevoEstadoCivil);
        System.out.println("Después de cambiar el estado civil: " + profesor);
    }
}
