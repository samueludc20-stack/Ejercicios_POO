public abstract class Figura {
    // Método abstracto - las clases hijas deben implementarlo
    public abstract double calcularArea();
    
    // Método concreto - puede ser heredado y usado por todas las figuras
    public void mostrarTipo() {
        System.out.println("Esta es una figura geométrica.");
    }
}