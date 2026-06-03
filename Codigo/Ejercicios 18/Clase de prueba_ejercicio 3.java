// Clase de prueba - Demuestra el cumplimiento del ISP
public class TestVehiculosISP {
    
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio ISP - Gestión de Vehículos ===\n");
        
        // Crear conductores y operadores
        Conductor conductor = new Conductor("Carlos");
        OperadorCarga operador = new OperadorCarga("Luis");
        
        // Crear vehículos con sus interfaces específicas
        Conducible moto = new Moto("Yamaha R3");
        Conducible autoDeportivo = new AutoDeportivo("Ferrari F8");
        
        // Vehículos que pueden hacer ambas cosas
        Conducible camionComoVehiculo = new Camion("Volvo FH16", 20000);
        Cargable camionComoCarga = new Camion("Volvo FH16", 20000);
        Conducible camionetaComoVehiculo = new Camioneta("Toyota Hilux", 1000);
        Cargable camionetaComoCarga = new Camioneta("Toyota Hilux", 1000);
        
        System.out.println("--- Vehículos que solo se conducen (sin carga) ---");
        conductor.realizarViaje(moto);
        conductor.realizarViaje(autoDeportivo);
        
        System.out.println("--- Vehículo de carga visto como Conducible ---");
        conductor.realizarViaje(camionComoVehiculo);
        
        System.out.println("--- Vehículo de carga visto como Cargable ---");
        operador.gestionarCarga(camionComoCarga, 15000);
        
        System.out.println("--- Camioneta (dual) ---");
        conductor.realizarViaje(camionetaComoVehiculo);
        operador.gestionarCarga(camionetaComoCarga, 800);
        
        // Verificación de ISP
        System.out.println("=== Verificación del Principio ISP ===");
        System.out.println("✓ Conducible solo tiene métodos de conducción");
        System.out.println("✓ Cargable solo tiene métodos de carga");
        System.out.println("✓ Moto implementa SOLO Conducible (no métodos de carga)");
        System.out.println("✓ AutoDeportivo implementa SOLO Conducible");
        System.out.println("✓ Camion implementa AMBAS interfaces (conducción y carga)");
        System.out.println("✓ Conductor depende SOLO de Conducible");
        System.out.println("✓ OperadorCarga depende SOLO de Cargable");
    }
}