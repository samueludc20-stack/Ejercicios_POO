public class Profesor extends Persona {
    private String asignatura;
    private int añosExperiencia;
    
    // Constructor
    public Profesor(String nombre, int edad, String asignatura, int añosExperiencia) {
        super(nombre, edad);  // Llamada al constructor de Persona
        this.asignatura = asignatura;
        this.añosExperiencia = añosExperiencia;
    }
    
    // Sobrescritura del método presentarse
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + ". Enseño " + asignatura + 
                           " y tengo " + añosExperiencia + " años de experiencia. Edad: " + edad + " años.");
    }
    
    // Método específico de Profesor
    public void enseñar() {
        System.out.println("El profesor " + nombre + " está dando clase de " + asignatura);
    }
    
    public String getAsignatura() {
        return asignatura;
    }
    
    public int getAñosExperiencia() {
        return añosExperiencia;
    }
}