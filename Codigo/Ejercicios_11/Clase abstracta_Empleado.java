/**
 * Clase abstracta Empleado.
 * Representa cualquier empleado de una empresa.
 * No se puede instanciar directamente.
 * 
 * DEMOSTRACIÓN DE CLASE ABSTRACTA:
 * - Método abstracto: calcularSalario() - cada tipo de empleado lo calcula diferente.
 * - Método concreto: mostrarDetalles() - común para todos los empleados.
 */
public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    /**
     * Constructor de Empleado.
     * @param nombre Nombre del empleado
     * @param salarioBase Salario base del empleado (debe ser >= 0)
     */
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        setSalarioBase(salarioBase);
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Error: El salario base no puede ser negativo. Se establecerá en 0.");
            this.salarioBase = 0;
        }
    }
    
    /**
     * Método abstracto para calcular el salario total del empleado.
     * Cada tipo de empleado (Gerente, Vendedor) implementa su propia lógica.
     * @return Salario total del empleado
     */
    public abstract double calcularSalario();
    
    /**
     * Método concreto que muestra los detalles del empleado.
     * Reutiliza el método abstracto calcularSalario().
     */
    public void mostrarDetalles() {
        System.out.println("=== DATOS DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + String.format("%.2f", salarioBase));
        System.out.println("Salario total: $" + String.format("%.2f", calcularSalario()));
    }
}