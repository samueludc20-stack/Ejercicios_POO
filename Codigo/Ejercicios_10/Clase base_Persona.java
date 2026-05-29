/**
 * Clase base Persona.
 * Representa a cualquier persona con un método presentarse().
 * Este método será sobrescrito por las subclases.
 */
public class Persona {
    protected String nombre;
    protected int edad;
    
    /**
     * Constructor de Persona.
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Método que será sobrescrito por las subclases.
     * Muestra una presentación genérica.
     */
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Tengo " + edad + " años.");
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
}