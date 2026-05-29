/**
 * Clase Empleado que hereda de Persona.
 * Un empleado ES UNA persona, con atributo adicional: departamento.
 * 
 * DEMOSTRACIÓN DEL USO DE super:
 * 1. super(nombre, edad) -> llama al constructor de Persona
 * 2. super.mostrarDetalles() -> llama al método de Persona desde el override
 */
public class Empleado extends Persona {
    private String departamento;
    
    /**
     * Constructor de Empleado.
     * @param nombre Nombre del empleado
     * @param edad Edad del empleado
     * @param departamento Departamento donde trabaja
     */
    public Empleado(String nombre, int edad, String departamento) {
        // USO DE super (1): Invocar constructor de la clase base
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    // Getter y setter específico
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    /**
     * SOBRESCRITURA del método mostrarDetalles.
     * USO DE super (2): Llamar al método de la clase base para reutilizar su código.
     */
    @Override
    public void mostrarDetalles() {
        // Llamamos al método de Persona usando super
        super.mostrarDetalles();
        // Agregamos la información específica de Empleado
        System.out.println("Departamento: " + departamento);
    }
}