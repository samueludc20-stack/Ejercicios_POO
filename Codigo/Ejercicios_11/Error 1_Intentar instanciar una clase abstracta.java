/**
 * CLASE ABSTRACTA
 */
abstract class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();
}

/**
 * INTENTO DE INSTANCIACIÓN DIRECTA (ERROR)
 */
public class TestError1 {
    public static void main(String[] args) {
        // ERROR: No se puede instanciar una clase abstracta
        // Animal animal = new Animal("Firulais");  // <-- DESCOMENTAR = ERROR
        
        System.out.println("La línea anterior generaría error de compilación.");
    }
}