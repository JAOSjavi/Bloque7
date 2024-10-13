package Simulador;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la matrícula del coche: ");
        String matriculaCoche = scanner.nextLine();
        System.out.print("Ingrese el número de puertas del coche: ");
        int numeroPuertas = scanner.nextInt();

        Coche coche = new Coche(matriculaCoche, numeroPuertas);
        coche.acelerar(50);
        System.out.println(coche.toString());

        System.out.print("\nIngrese la matrícula del camión: ");
        scanner.nextLine(); 
        String matriculaCamion = scanner.nextLine();
        
        Camion camion = new Camion(matriculaCamion);
        camion.acelerar(60);
        System.out.println(camion.toString());


        System.out.print("Ingrese el peso del remolque: ");
        int pesoRemolque = scanner.nextInt();
        Remolque remolque = new Remolque(pesoRemolque);
        camion.ponRemolque(remolque);

        camion.acelerar(50);
        System.out.println(camion.toString());
    }
}