public class Persona {
    protected String nombre;
    protected int edad;
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método que será sobrescrito
    public void presentarse() {
        System.out.println("Hola, soy una persona. Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
}