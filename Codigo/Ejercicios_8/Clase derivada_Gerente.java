/**
 * Clase Gerente que hereda de Empleado.
 * Un gerente ES UN empleado, con atributo adicional: departamento.
 */
public class Gerente extends Empleado {
    private String departamento;
    private double bono;  // Atributo extra opcional para enriquecer el ejemplo
    
    /**
     * Constructor de Gerente (versión básica).
     * @param nombre Nombre del gerente
     * @param salario Salario del gerente
     * @param departamento Departamento que dirige
     */
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
        this.bono = 0;  // Bono inicial en 0
    }
    
    /**
     * Constructor de Gerente (versión completa con bono).
     * @param nombre Nombre del gerente
     * @param salario Salario del gerente
     * @param departamento Departamento que dirige
     * @param bono Bono adicional del gerente
     */
    public Gerente(String nombre, double salario, String departamento, double bono) {
        super(nombre, salario);
        this.departamento = departamento;
        this.bono = bono;
    }
    
    // Getters y setters específicos
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public double getBono() {
        return bono;
    }
    
    public void setBono(double bono) {
        if (bono >= 0) {
            this.bono = bono;
        }
    }
    
    /**
     * Método para calcular el salario total (incluye bono).
     * @return Salario base + bono
     */
    public double getSalarioTotal() {
        return getSalario() + bono;
    }
    
    /**
     * SOBRESCRITURA del método mostrarDetalles.
     * Muestra toda la información del empleado más la de gerente.
     */
    @Override
    public void mostrarDetalles() {
        // Reutilizamos el método de Empleado
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bono: $" + bono);
        System.out.println("Salario total: $" + getSalarioTotal());
    }
}