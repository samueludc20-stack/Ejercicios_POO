// Clase derivada Coche - Cumple LSP
public class Coche extends Transporte {
    private int numeroPuertas;
    private String tipoCombustible;
    
    public Coche(String nombre, int numeroPuertas, String tipoCombustible) {
        super(nombre);
        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException("El número de puertas debe ser positivo");
        }
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public void mover() {
        System.out.println(nombre + " (Coche) está arrancando el motor de " + tipoCombustible);
        velocidadActual = 60;
        System.out.println(nombre + " se mueve por la carretera a " + velocidadActual + " km/h");
    }
    
    @Override
    public void frenar() {
        System.out.println(nombre + " (Coche) aplica los frenos de disco");
        super.frenar();
    }
    
    public void cambiarMarcha(int marcha) {
        System.out.println(nombre + " cambió a la marcha " + marcha);
    }
    
    public void mostrarInformacion() {
        System.out.println("Coche: " + nombre);
        System.out.println("  Puertas: " + numeroPuertas);
        System.out.println("  Combustible: " + tipoCombustible);
        System.out.println("  Velocidad: " + velocidadActual + " km/h");
    }
}