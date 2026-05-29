/**
 * Clase Profesor que hereda de Persona.
 * Un profesor ES UNA persona.
 * 
 * SOBRESCRITURA: Extiende el comportamiento de Persona
 * usando super.presentarse() para reutilizar el código base.
 */
public class Profesor extends Persona {
    private String departamento;
    private String materiaPrincipal;
    
    /**
     * Constructor de Profesor.
     * @param nombre Nombre del profesor
     * @param edad Edad del profesor
     * @param departamento Departamento al que pertenece
     * @param materiaPrincipal Materia que dicta
     */
    public Profesor(String nombre, int edad, String departamento, String materiaPrincipal) {
        super(nombre, edad);
        this.departamento = departamento;
        this.materiaPrincipal = materiaPrincipal;
    }
    
    // Getters y setters específicos
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getMateriaPrincipal() {
        return materiaPrincipal;
    }
    
    public void setMateriaPrincipal(String materiaPrincipal) {
        this.materiaPrincipal = materiaPrincipal;
    }
    
    /**
     * SOBRESCRITURA del método presentarse().
     * Esta versión EXTEND el mensaje de Persona.
     * Se usa super.presentarse() para reutilizar el código base.
     */
    @Override
    public void presentarse() {
        // Reutilizamos el código de Persona
        super.presentarse();
        // Agregamos información específica de Profesor
        System.out.println("Soy profesor del departamento de: " + departamento);
        System.out.println("Dicto la materia: " + materiaPrincipal);
    }
}