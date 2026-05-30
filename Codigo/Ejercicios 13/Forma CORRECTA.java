// Forma CORRECTA en clase abstracta
public abstract class Animal {
    
    // Método concreto - NO se usa la palabra 'default'
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
    
    // Método abstracto - sin implementación
    public abstract void hacerSonido();
}

// Clase concreta que hereda
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
    
    // El método dormir() es heredado automáticamente
}