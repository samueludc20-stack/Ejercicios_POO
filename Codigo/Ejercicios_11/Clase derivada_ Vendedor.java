/**
 * Clase Vendedor que hereda de Empleado.
 * Un vendedor ES UN empleado que recibe comisión por ventas.
 * 
 * IMPLEMENTACIÓN OBLIGATORIA: debe implementar el método abstracto calcularSalario().
 */
public class Vendedor extends Empleado {
    private double ventasRealizadas;
    private double porcentajeComision;
    
    /**
     * Constructor de Vendedor.
     * @param nombre Nombre del vendedor
     * @param salarioBase Salario base del vendedor
     * @param ventasRealizadas Total de ventas realizadas
     * @param porcentajeComision Porcentaje de comisión sobre ventas
     */
    public Vendedor(String nombre, double salarioBase, double ventasRealizadas, double porcentajeComision) {
        super(nombre, salarioBase);
        setVentasRealizadas(ventasRealizadas);
        setPorcentajeComision(porcentajeComision);
    }
    
    // Getters y setters específicos
    public double getVentasRealizadas() {
        return ventasRealizadas;
    }
    
    public void setVentasRealizadas(double ventasRealizadas) {
        if (ventasRealizadas >= 0) {
            this.ventasRealizadas = ventasRealizadas;
        } else {
            System.out.println("Error: Las ventas no pueden ser negativas. Se establecerán en 0.");
            this.ventasRealizadas = 0;
        }
    }
    
    public double getPorcentajeComision() {
        return porcentajeComision;
    }
    
    public void setPorcentajeComision(double porcentajeComision) {
        if (porcentajeComision >= 0 && porcentajeComision <= 100) {
            this.porcentajeComision = porcentajeComision;
        } else {
            System.out.println("Error: El porcentaje de comisión debe estar entre 0 y 100. Se establecerá en 0.");
            this.porcentajeComision = 0;
        }
    }
    
    /**
     * IMPLEMENTACIÓN del método abstracto calcularSalario().
     * Salario del vendedor = salario base + (ventas * comisión / 100)
     */
    @Override
    public double calcularSalario() {
        double comision = ventasRealizadas * (porcentajeComision / 100);
        return salarioBase + comision;
    }
    
    /**
     * Método adicional propio de Vendedor.
     * @return Monto de la comisión ganada
     */
    public double calcularComision() {
        return ventasRealizadas * (porcentajeComision / 100);
    }
    
    /**
     * Sobrescritura opcional para mostrar información específica del vendedor.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("=== VENDEDOR ===");
        super.mostrarDetalles();  // Reutiliza el método de Empleado
        System.out.println("Ventas realizadas: $" + String.format("%.2f", ventasRealizadas));
        System.out.println("Porcentaje de comisión: " + porcentajeComision + "%");
        System.out.println("Comisión ganada: $" + String.format("%.2f", calcularComision()));
    }
}