package Simulador;

public abstract class Vehiculo {
    protected String matricula;
    protected int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0; 
    }

    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }

    @Override
    public String toString() {
        return "matricula: " + matricula + ", velocidad: " + velocidad + " km/h";
    }
}
