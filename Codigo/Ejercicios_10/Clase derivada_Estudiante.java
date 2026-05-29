/**
 * Clase Estudiante que hereda de Persona.
 * Un estudiante ES UNA persona.
 * 
 * SOBRESCRITURA: Reemplaza completamente el método presentarse()
 * sin usar super.presentarse().
 */
public class Estudiante extends Persona {
    private String matricula;
    private String carrera;
    
    /**
     * Constructor de Estudiante.
     * @param nombre Nombre del estudiante
     * @param edad Edad del estudiante
     * @param matricula Número de matrícula
     * @param carrera Carrera que estudia
     */
    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        super(nombre, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    // Getters y setters específicos
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    /**
     * SOBRESCRITURA del método presentarse().
     * Esta versión REEMPLAZA completamente el mensaje de Persona.
     * No se usa super.presentarse().
     */
    @Override
    public void presentarse() {
        System.out.println("¡Hola! Soy estudiante.");
        System.out.println("Me llamo: " + nombre);
        System.out.println("Tengo " + edad + " años.");
        System.out.println("Mi matrícula es: " + matricula);
        System.out.println("Estudio la carrera de: " + carrera);
    }
}