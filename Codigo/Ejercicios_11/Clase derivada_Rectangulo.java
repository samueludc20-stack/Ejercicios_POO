/**
 * Clase Rectangulo que hereda de Figura.
 * Un rectángulo ES UNA figura geométrica.
 * 
 * IMPLEMENTACIÓN OBLIGATORIA: debe implementar el método abstracto calcularArea().
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    /**
     * Constructor de Rectangulo.
     * @param base Base del rectángulo (debe ser mayor a 0)
     * @param altura Altura del rectángulo (debe ser mayor a 0)
     */
    public Rectangulo(double base, double altura) {
        if (base > 0 && altura > 0) {
            this.base = base;
            this.altura = altura;
        } else {
            System.out.println("Error: Base y altura deben ser positivas. Se establecerán en 1.0");
            this.base = 1.0;
            this.altura = 1.0;
        }
    }
    
    // Getters y setters
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Error: La base debe ser positiva.");
        }
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Error: La altura debe ser positiva.");
        }
    }
    
    /**
     * IMPLEMENTACIÓN del método abstracto calcularArea().
     * Fórmula: base * altura
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    /**
     * Sobrescritura opcional del método mostrarInformacion()
     * para incluir información específica del rectángulo.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("=== RECTÁNGULO ===");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        super.mostrarInformacion();  // Reutiliza el método de Figura
    }
}