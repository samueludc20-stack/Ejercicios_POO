/**
 * Clase de prueba para demostrar la sobrescritura del método moverse()
 * en la relación Vehiculo → Bicicleta.
 */
public class TestVehiculoBicicleta {
    public static void main(String[] args) {
        
        System.out.println("=== TALLER 10: SOBRESCRITURA DE MÉTODOS ===\n");
        System.out.println("--- EJERCICIO 2: Vehiculo → Bicicleta ---\n");
        
        // ============================================================
        // 1. OBJETOS DIRECTOS
        // ============================================================
        
        System.out.println(">>> 1. OBJETOS DIRECTOS (tipo específico):\n");
        
        System.out.println("--- Objeto Vehiculo (clase base) ---");
        Vehiculo vehiculo = new Vehiculo("Terrestre");
        vehiculo.moverse();
        
        System.out.println("\n--- Objeto Bicicleta (clase derivada - sobrescritura) ---");
        Bicicleta bicicleta = new Bicicleta("Terrestre", 21, true);
        bicicleta.moverse();
        
        System.out.println("\n--- Método adicional de Bicicleta ---");
        bicicleta.sonarCampanita();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 2. POLIMORFISMO
        // ============================================================
        
        System.out.println("\n>>> 2. POLIMORFISMO (variable Vehiculo, objeto Bicicleta):\n");
        
        // Variable de tipo Vehiculo apuntando a un objeto Bicicleta
        Vehiculo vehiculoPolimorfico = new Bicicleta("Terrestre", 18, false);
        
        System.out.println("Variable de tipo Vehiculo apuntando a una Bicicleta:");
        vehiculoPolimorfico.moverse();  // ¡Se ejecuta la versión de Bicicleta!
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 3. DEMOSTRACIÓN DE QUE EL MÉTODO SE EJECUTA SEGÚN EL OBJETO REAL
        // ============================================================
        
        System.out.println("\n>>> 3. DEMOSTRACIÓN DEL ENLACE DINÁMICO:\n");
        
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Vehiculo("Acuático");
        vehiculos[1] = new Bicicleta("Terrestre", 7, true);
        vehiculos[2] = new Bicicleta("Terrestre", 24, false);
        
        System.out.println("Recorriendo arreglo de Vehiculos:\n");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("--- Vehículo " + (i+1) + " ---");
            vehiculos[i].moverse();  // Cada uno ejecuta su propia versión
            System.out.println();
        }
        
        System.out.println("=".repeat(60));
        System.out.println("\n*** CONCLUSIÓN DEL EJERCICIO 2 ***");
        System.out.println("✓ Bicicleta sobrescribe el método moverse() de Vehiculo.");
        System.out.println("✓ La anotación @Override ayuda a verificar la sobrescritura correcta.");
        System.out.println("✓ El polimorfismo permite tratar una Bicicleta como si fuera un Vehiculo.");
        System.out.println("✓ Al ejecutar moverse(), se llama a la versión de Bicicleta (enlace dinámico).");
    }
}