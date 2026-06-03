// Clase base abstracta - Define el contrato para todas las figuras
public abstract class Figura {
    // Método abstracto que todas las figuras deben implementar
    public abstract double area();
    
    // Método concreto que pueden usar todas las figuras (opcional)
    public void mostrarArea() {
        System.out.println("El área es: " + area());
    }
}