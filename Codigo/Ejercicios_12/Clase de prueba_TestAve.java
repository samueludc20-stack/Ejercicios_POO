/**
 * Clase de prueba para demostrar HERENCIA MÚLTIPLE CON INTERFACES.
 * 
 * Se demuestra:
 * 1. Una clase puede implementar múltiples interfaces.
 * 2. Las interfaces pueden usarse como tipos (polimorfismo).
 * 3. Métodos default y estáticos en interfaces.
 */
public class TestAve {
    public static void main(String[] args) {
        
        System.out.println("=== TALLER 12: HERENCIA MÚLTIPLE CON INTERFACES ===\n");
        System.out.println("--- EJERCICIO 1: Ave implements Volador y Cantante ---\n");
        
        // ============================================================
        // 1. CREACIÓN DE UN OBJETO AVE
        // ============================================================
        
        System.out.println(">>> 1. CREACIÓN DEL OBJETO AVE:\n");
        
        Ave canario = new Ave("Piolín", "Canario");
        canario.mostrarInformacion();
        
        System.out.println();
        
        // ============================================================
        // 2. USO DE LOS MÉTODOS IMPLEMENTADOS
        // ============================================================
        
        System.out.println(">>> 2. USO DE LOS MÉTODOS IMPLEMENTADOS:\n");
        
        System.out.println("--- Método volar() (de interfaz Volador) ---");
        canario.volar();
        
        System.out.println();
        
        System.out.println("--- Método cantar() (de interfaz Cantante) ---");
        canario.cantar();
        
        System.out.println();
        
        System.out.println("--- Método despegar() (default sobrescrito) ---");
        canario.despegar();
        
        System.out.println();
        
        System.out.println("--- Método propio de Ave ---");
        canario.construirNido();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 3. POLIMORFISMO CON INTERFACES
        // ============================================================
        
        System.out.println("\n>>> 3. POLIMORFISMO CON INTERFACES:\n");
        
        System.out.println("--- Variable de tipo Volador apuntando a un Ave ---");
        Volador volador = new Ave("Águila", "Real");
        volador.volar();
        volador.despegar();
        // Nota: No se puede llamar a cantar() porque Volador no tiene ese método
        
        System.out.println();
        
        System.out.println("--- Variable de tipo Cantante apuntando a un Ave ---");
        Cantante cantante = new Ave("Ruiseñor", "Común");
        cantante.cantar();
        cantante.afinar();
        // Nota: No se puede llamar a volar() porque Cantante no tiene ese método
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 4. ARREGLO POLIMÓRFICO CON INTERFACES
        // ============================================================
        
        System.out.println("\n>>> 4. ARREGLO DE VOLADORES (polimorfismo):\n");
        
        // Un arreglo de Volador puede contener cualquier objeto que implemente Volador
        Volador[] voladores = new Volador[3];
        voladores[0] = new Ave("Golondrina", "Migratoria");
        voladores[1] = new Ave("Halcon", "Peregrino");
        voladores[2] = new Ave("Colibrí", "Tamaulipas");
        
        System.out.println("Recorriendo el arreglo de Voladores:\n");
        for (int i = 0; i < voladores.length; i++) {
            System.out.println("--- Volador " + (i+1) + " ---");
            voladores[i].volar();
            System.out.println();
        }
        
        System.out.println("=".repeat(60));
        
        // ============================================================
        // 5. MÉTODOS ESTÁTICOS DE INTERFACES
        // ============================================================
        
        System.out.println("\n>>> 5. MÉTODOS ESTÁTICOS DE INTERFACES:\n");
        
        // Los métodos estáticos se llaman a través de la interfaz, no de la instancia
        Volador.mostrarMensaje();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 6. CONCLUSIÓN
        // ============================================================
        
        System.out.println("\n*** CONCLUSIÓN DEL EJERCICIO 1 ***");
        System.out.println("✓ Una clase puede implementar MÚLTIPLES interfaces (herencia múltiple).");
        System.out.println("✓ La clase debe implementar TODOS los métodos abstractos de las interfaces.");
        System.out.println("✓ Las interfaces pueden usarse como tipos (polimorfismo).");
        System.out.println("✓ Relación: Ave ES-UN Animal (herencia de clases) PERO ");
        System.out.println("            Ave PUEDE volar y PUEDE cantar (interfaces).");
        System.out.println("✓ Los métodos default proporcionan implementaciones opcionales.");
        System.out.println("✓ Los métodos estáticos pertenecen a la interfaz, no a las instancias.");
    }
}