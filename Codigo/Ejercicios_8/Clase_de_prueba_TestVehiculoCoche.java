/**
 * Clase de prueba para demostrar la herencia entre Vehiculo y Coche.
 */
public class TestVehiculoCoche {
    public static void main(String[] args) {
        
        System.out.println("=== DEMOSTRACIÓN DE HERENCIA ===");
        System.out.println();
        
        // Crear un objeto de la clase base (Vehiculo)
        System.out.println("--- Objeto de tipo Vehiculo ---");
        Vehiculo vehiculo = new Vehiculo("Genérica", 180);
        vehiculo.mostrarInformacion();
        
        System.out.println();
        
        // Crear un objeto de la clase derivada (Coche)
        System.out.println("--- Objeto de tipo Coche ---");
        Coche coche = new Coche("Toyota", 220, 4);
        
        // El coche TIENE los métodos de Vehiculo
        System.out.println("Usando método heredado mostrarInformacion():");
        coche.mostrarInformacion();
        
        System.out.println();
        
        // Usando método propio de Coche
        System.out.println("Usando método propio de Coche:");
        coche.mostrarInformacionCoche();
        
        System.out.println();
        
        // Acceso a getters heredados
        System.out.println("Acceso mediante getters heredados:");
        System.out.println("Marca (vía getter): " + coche.getMarca());
        System.out.println("Velocidad máxima (vía getter): " + coche.getVelocidadMaxima());
        System.out.println("Puertas (vía getter propio): " + coche.getNumeroDePuertas());
        
        System.out.println();
        System.out.println("*** CONCLUSIÓN ***");
        System.out.println("Coche hereda todos los atributos y métodos públicos/protegidos de Vehiculo.");
        System.out.println("Además, puede agregar sus propios atributos y métodos.");
    }
}