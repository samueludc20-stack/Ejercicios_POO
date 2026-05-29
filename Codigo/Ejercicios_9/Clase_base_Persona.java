/**
 * Clase base Persona.
 * Representa a cualquier persona con nombre y edad.
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
     * Muestra los detalles de la persona.
     * Este método será sobrescrito por Empleado.
     */
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
    
    // Getters y setters (opcionales, para mayor encapsulamiento)
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