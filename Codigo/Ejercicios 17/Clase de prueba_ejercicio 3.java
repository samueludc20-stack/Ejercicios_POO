// Clase de prueba - Demuestra que Bicicleta y Coche pueden sustituir a Transporte
public class TestTransporteLSP {
    
    // Este método acepta CUALQUIER Transporte (base o derivado)
    // Demuestra LSP: Coche y Bicicleta pueden sustituir a Transporte
    public static void realizarViaje(Transporte transporte) {
        System.out.println("\n=== Iniciando viaje con " + transporte.getNombre() + " ===");
        
        // El transporte se mueve (comportamiento polimórfico)
        transporte.mover();
        
        // Mostrar estado después de moverse
        transporte.mostrarEstado();
        
        // Simular un tiempo de viaje
        System.out.println("Viajando...");
        
        // Frenar al final del viaje
        transporte.frenar();
        transporte.mostrarEstado();
        
        System.out.println("=== Viaje completado con " + transporte.getNombre() + " ===\n");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio LSP con Transportes ===\n");
        
        // Crear diferentes transportes
        Transporte miCoche = new Coche("Sedán", 4, "Gasolina");
        Transporte miBicicleta = new Bicicleta("Mountain Bike", 21, true);
        Transporte miBicicletaSinCasco = new Bicicleta("Urbana", 7, false);
        
        // Demostración de LSP: todos pueden ser usados como Transporte
        realizarViaje(miCoche);
        realizarViaje(miBicicleta);
        realizarViaje(miBicicletaSinCasco);
        
        // Demostración de funcionalidad específica (NO viola LSP)
        System.out.println("=== Funcionalidades específicas (casting seguro) ===\n");
        
        if (miCoche instanceof Coche) {
            Coche coche = (Coche) miCoche;
            coche.cambiarMarcha(3);
            coche.mostrarInformacion();
        }
        
        System.out.println();
        
        if (miBicicleta instanceof Bicicleta) {
            Bicicleta bici = (Bicicleta) miBicicleta;
            bici.saltar('💧');
            bici.mostrarInformacion();
        }
        
        // Demostración con un arreglo polimórfico
        System.out.println("\n=== Arreglo de Transportes (Comportamiento polimórfico) ===");
        Transporte[] transportes = {
            new Coche("Familiar", 5, "Diésel"),
            new Bicicleta("Ruta", 18, true),
            new Coche("Deportivo", 2, "Gasolina Premium"),
            new Bicicleta("Paseo", 3, false)
        };
        
        for (Transporte t : transportes) {
            System.out.println("- " + t.getNombre() + " (" + t.getClass().getSimpleName() + ")");
            t.mover();
            System.out.println();
        }
    }
}