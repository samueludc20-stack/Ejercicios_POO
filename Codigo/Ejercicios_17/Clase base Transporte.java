// Clase base abstracta - Define el contrato para todos los transportes
public abstract class Transporte {
    protected double velocidadActual;
    protected String nombre;
    
    public Transporte(String nombre) {
        this.nombre = nombre;
        this.velocidadActual = 0;
    }
    
    // Método abstracto - Cada transporte define su forma de moverse
    public abstract void mover();
    
    // Método concreto con implementación por defecto
    public void frenar() {
        if (velocidadActual > 0) {
            velocidadActual = 0;
            System.out.println(nombre + " ha frenado completamente.");
        } else {
            System.out.println(nombre + " ya está detenido.");
        }
    }
    
    public double getVelocidadActual() {
        return velocidadActual;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void mostrarEstado() {
        System.out.println(nombre + " - Velocidad actual: " + velocidadActual + " km/h");
    }
}