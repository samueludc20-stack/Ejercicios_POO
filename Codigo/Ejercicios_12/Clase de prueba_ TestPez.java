/**
 * Clase de prueba para demostrar HERENCIA MÚLTIPLE CON INTERFACES.
 * 
 * Se demuestra:
 * 1. Un pez implementa Nadador y Respirador.
 * 2. Cada interfaz aporta una capacidad diferente.
 * 3. Polimorfismo con múltiples interfaces.
 */
public class TestPez {
    public static void main(String[] args) {
        
        System.out.println("=== TALLER 12: HERENCIA MÚLTIPLE CON INTERFACES ===\n");
        System.out.println("--- EJERCICIO 2: Pez implements Nadador y Respirador ---\n");
        
        // ============================================================
        // 1. CREACIÓN DE UN OBJETO PEZ
        // ============================================================
        
        System.out.println(">>> 1. CREACIÓN DEL OBJETO PEZ:\n");
        
        Pez nemo = new Pez("Nemo", "Pez Payaso", "salada");
        nemo.mostrarInformacion();
        
        System.out.println();
        
        // ============================================================
        // 2. USO DE LOS MÉTODOS IMPLEMENTADOS
        // ============================================================
        
        System.out.println(">>> 2. USO DE LOS MÉTODOS IMPLEMENTADOS:\n");
        
        System.out.println("--- Método nadar() (de interfaz Nadador) ---");
        nemo.nadar();
        
        System.out.println();
        
        System.out.println("--- Método respirar() (de interfaz Respirador) ---");
        nemo.respirar();
        
        System.out.println();
        
        System.out.println("--- Método tomarAire() (default sobrescrito) ---");
        nemo.tomarAire();
        
        System.out.println();
        
        System.out.println("--- Método flotar() (default sobrescrito) ---");
        nemo.flotar();
        
        System.out.println();
        
        System.out.println("--- Método propio de Pez ---");
        nemo.saltarDelAgua();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 3. POLIMORFISMO CON INTERFACES
        // ============================================================
        
        System.out.println("\n>>> 3. POLIMORFISMO CON INTERFACES:\n");
        
        System.out.println("--- Variable de tipo Nadador apuntando a un Pez ---");
        Nadador nadador = new Pez("Dory", "Cirujano Azul", "salada");
        nadador.nadar();
        nadador.flotar();
        
        System.out.println();
        
        System.out.println("--- Variable de tipo Respirador apuntando a un Pez ---");
        Respirador respirador = new Pez("Guppy", "Guppy", "dulce");
        respirador.respirar();
        respirador.tomarAire();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 4. ARREGLO POLIMÓRFICO CON NADADORES
        // ============================================================
        
        System.out.println("\n>>> 4. ARREGLO DE NADADORES (polimorfismo):\n");
        
        // Un arreglo de Nadador puede contener cualquier objeto que implemente Nadador
        Nadador[] nadadores = new Nadador[3];
        nadadores[0] = new Pez("Tiburón", "Blanco", "salada");
        nadadores[1] = new Pez("Carpa", "Koi", "dulce");
        nadadores[2] = new Pez("Pez Dorado", "Goldfish", "dulce");
        
        System.out.println("Recorriendo el arreglo de Nadadores:\n");
        for (int i = 0; i < nadadores.length; i++) {
            System.out.println("--- Nadador " + (i+1) + " ---");
            nadadores[i].nadar();
            System.out.println();
        }
        
        System.out.println("=".repeat(60));
        
        // ============================================================
        // 5. MÉTODOS ESTÁTICOS DE INTERFACES
        // ============================================================
        
        System.out.println("\n>>> 5. MÉTODOS ESTÁTICOS DE INTERFACES:\n");
        
        Nadador.mostrarMensaje();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 6. CONCLUSIÓN
        // ============================================================
        
        System.out.println("\n*** CONCLUSIÓN DEL EJERCICIO 2 ***");
        System.out.println("✓ Un pez puede NADAR y RESPIRAR (dos capacidades diferentes).");
        System.out.println("✓ Cada interfaz define un CONTRATO que la clase debe cumplir.");
        System.out.println("✓ Las interfaces permiten que una clase tenga múltiples COMPORTAMIENTOS.");
        System.out.println("✓ Los métodos default pueden ser sobrescritos para personalizar el comportamiento.");
        System.out.println("✓ El polimorfismo funciona con interfaces: una variable Nadador puede contener cualquier nadador.");
    }
}