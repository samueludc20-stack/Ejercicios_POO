/**
 * Clase abstracta Figura.
 * Representa cualquier figura geométrica que pueda calcular su área.
 * No se puede instanciar directamente.
 * 
 * DEMOSTRACIÓN DE CLASE ABSTRACTA:
 * - Método abstracto: calcularArea() - sin implementación, obligatorio en subclases.
 * - Método concreto: mostrarArea() - con implementación, heredado por todas.
 */
public abstract class Figura {
    
    /**
     * Método abstracto para calcular el área de la figura.
     * Las subclases DEBEN proporcionar su propia implementación.
     * @return Área de la figura
     */
    public abstract double calcularArea();
    
    /**
     * Método concreto que muestra el área calculada.
     * Reutiliza el método abstracto calcularArea().
     * Todas las subclases heredan este método sin necesidad de reescribirlo.
     */
    public void mostrarArea() {
        double area = calcularArea();  // Llama a la implementación de la subclase
        System.out.println("El área de la figura es: " + String.format("%.2f", area) + " unidades cuadradas.");
    }
    
    /**
     * Método concreto que muestra información general de la figura.
     * Puede ser sobrescrito opcionalmente por las subclases.
     */
    public void mostrarInformacion() {
        System.out.println("--- Información de la figura ---");
        mostrarArea();
    }
}