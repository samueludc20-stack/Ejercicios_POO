/**
 * Clase Estudiante que hereda de Persona.
 * Un estudiante ES UNA persona, con atributo adicional: matrícula.
 */
public class Estudiante extends Persona {
    private String matricula;
    
    /**
     * Constructor de Estudiante.
     * @param nombre Nombre del estudiante
     * @param edad Edad del estudiante
     * @param matricula Número de matrícula
     */
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);  // Llama al constructor de Persona
        this.matricula = matricula;
    }
    
    // Getter específico
    public String getMatricula() {
        return matricula;
    }
    
    // Setter específico
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    /**
     * SOBRESCRITURA del método mostrarDetalles.
     * Incluye la información de Persona más la matrícula.
     */
    @Override
    public void mostrarDetalles() {
        // Reutilizamos el método de la clase base
        super.mostrarDetalles();
        System.out.println("Matrícula: " + matricula);
    }
    
    /**
     * Método adicional: muestra solo la información académica.
     */
    public void mostrarInformacionAcademica() {
        System.out.println("Estudiante: " + getNombre());
        System.out.println("Matrícula: " + matricula);
    }
}