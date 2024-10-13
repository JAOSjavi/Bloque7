package Simulador;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null; 
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int cantidad) {
        if (remolque != null && (velocidad + cantidad) > 100) {
            System.out.println("Muy rapido!!!");
        } else {
            super.acelerar(cantidad);
        }
    }

    @Override
    public String toString() {
        String infoCamion = super.toString();
        if (remolque != null) {
            infoCamion += ", " + remolque.toString();
        }
        return infoCamion;
    }
}
