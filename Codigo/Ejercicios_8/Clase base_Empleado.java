/**
 * Clase base Empleado.
 * Representa a un empleado genérico con nombre y salario.
 */
public class Empleado {
    private String nombre;
    private double salario;
    
    /**
     * Constructor de Empleado.
     * @param nombre Nombre del empleado
     * @param salario Salario mensual del empleado
     */
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getSalario() {
        return salario;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
    
    /**
     * Muestra los detalles del empleado.
     * Este método será sobrescrito por Gerente.
     */
    public void mostrarDetalles() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}