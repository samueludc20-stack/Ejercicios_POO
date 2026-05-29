/**
 * Clase Gerente que hereda de Empleado.
 * Un gerente ES UN empleado con un bono adicional.
 * 
 * IMPLEMENTACIÓN OBLIGATORIA: debe implementar el método abstracto calcularSalario().
 */
public class Gerente extends Empleado {
    private double bono;
    
    /**
     * Constructor de Gerente.
     * @param nombre Nombre del gerente
     * @param salarioBase Salario base del gerente
     * @param bono Bono adicional del gerente
     */
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        setBono(bono);
    }
    
    // Getter y setter específico
    public double getBono() {
        return bono;
    }
    
    public void setBono(double bono) {
        if (bono >= 0) {
            this.bono = bono;
        } else {
            System.out.println("Error: El bono no puede ser negativo. Se establecerá en 0.");
            this.bono = 0;
        }
    }
    
    /**
     * IMPLEMENTACIÓN del método abstracto calcularSalario().
     * Salario del gerente = salario base + bono
     */
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
    
    /**
     * Sobrescritura opcional para mostrar información específica del gerente.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("=== GERENTE ===");
        super.mostrarDetalles();  // Reutiliza el método de Empleado
        System.out.println("Bono: $" + String.format("%.2f", bono));
    }
}