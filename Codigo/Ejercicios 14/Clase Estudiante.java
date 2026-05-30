public class Estudiante extends Persona {
    private String carrera;
    private int semestre;
    
    // Constructor
    public Estudiante(String nombre, int edad, String carrera, int semestre) {
        super(nombre, edad);  // Llamada al constructor de Persona
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    // Sobrescritura del método presentarse
    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", un estudiante de " + carrera + 
                           ". Estoy en el " + semestre + "° semestre y tengo " + edad + " años.");
    }
    
    // Método específico de Estudiante
    public void estudiar() {
        System.out.println(nombre + " está estudiando para los exámenes.");
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public int getSemestre() {
        return semestre;
    }
}