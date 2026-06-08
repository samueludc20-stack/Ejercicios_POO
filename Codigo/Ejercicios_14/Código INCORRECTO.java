// Clase base
public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clase derivada con método adicional
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
    
    // Método específico de Perro (NO existe en Animal)
    public void correr() {
        System.out.println("El perro está corriendo muy rápido.");
    }
}

// Clase de prueba INCORRECTA
public class TestPolimorfismoIncorrecto {
    public static void main(String[] args) {
        // Referencia de clase base apuntando a objeto derivado
        Animal miAnimal = new Perro();
        
        // Esto funciona porque hacerSonido() existe en Animal
        miAnimal.hacerSonido();
        
        // ERROR DE COMPILACIÓN: correr() no existe en Animal
        miAnimal.correr();  // <-- Línea que genera error
    }
}