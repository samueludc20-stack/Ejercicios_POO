// Esto es INCORRECTO - No existe "default" en clases abstractas
public abstract class Animal {
    
    // ERROR: La palabra clave 'default' solo se permite en interfaces
    default void dormir() {
        System.out.println("El animal está durmiendo.");
    }
    
    public abstract void hacerSonido();
}