// Clase derivada Bicicleta - Cumple LSP
public class Bicicleta extends Transporte {
    private int numeroCambios;
    private boolean tieneCasco;
    
    public Bicicleta(String nombre, int numeroCambios, boolean tieneCasco) {
        super(nombre);
        if (numeroCambios < 0) {
            throw new IllegalArgumentException("El número de cambios no puede ser negativo");
        }
        this.numeroCambios = numeroCambios;
        this.tieneCasco = tieneCasco;
    }
    
    @Override
    public void mover() {
        System.out.println(nombre + " (Bicicleta) está siendo pedalada");
        velocidadActual = 20;
        System.out.println(nombre + " se mueve por la ciclovía a " + velocidadActual + " km/h");
        
        if (!tieneCasco) {
            System.out.println("ADVERTENCIA: Se recomienda usar casco por seguridad");
        }
    }
    
    @Override
    public void frenar() {
        System.out.println(nombre + " (Bicicleta) usa frenos de mano");
        super.frenar();
    }
    
    public void saltar(charco) {
        System.out.println(nombre + " saltó un charco en la vía");
    }
    
    public void mostrarInformacion() {
        System.out.println("Bicicleta: " + nombre);
        System.out.println("  Cambios: " + numeroCambios);
        System.out.println("  Casco: " + (tieneCasco ? "Sí" : "No"));
        System.out.println("  Velocidad: " + velocidadActual + " km/h");
    }
}