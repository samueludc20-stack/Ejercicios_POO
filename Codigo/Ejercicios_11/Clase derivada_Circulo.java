/**
 * Clase Circulo que hereda de Figura.
 * Un círculo ES UNA figura geométrica.
 * 
 * IMPLEMENTACIÓN OBLIGATORIA: debe implementar el método abstracto calcularArea().
 */
public class Circulo extends Figura {
    private double radio;
    
    /**
     * Constructor de Circulo.
     * @param radio Radio del círculo (debe ser mayor a 0)
     */
    public Circulo(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("Error: El radio debe ser positivo. Se establecerá en 1.0");
            this.radio = 1.0;
        }
    }
    
    // Getter y setter
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("Error: El radio debe ser positivo.");
        }
    }
    
    /**
     * IMPLEMENTACIÓN del método abstracto calcularArea().
     * Fórmula: π * radio²
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    /**
     * Sobrescritura opcional del método mostrarInformacion()
     * para incluir información específica del círculo.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("=== CÍRCULO ===");
        System.out.println("Radio: " + radio);
        super.mostrarInformacion();  // Reutiliza el método de Figura
    }
}