/**
 * Clase de prueba para demostrar la SOBRESCRITURA de métodos y el POLIMORFISMO.
 * 
 * Se demuestra:
 * 1. Una variable de tipo Persona puede referirse a objetos de Persona, Estudiante o Profesor.
 * 2. Al llamar a presentarse(), se ejecuta la versión del objeto REAL, no del tipo de variable.
 * 3. Diferencia entre reemplazo total (Estudiante) y extensión con super (Profesor).
 */
public class TestSobrescritura {
    public static void main(String[] args) {
        
        System.out.println("=== TALLER 10: SOBRESCRITURA DE MÉTODOS ===\n");
        System.out.println("--- EJERCICIO 1: Persona → Estudiante y Profesor ---\n");
        
        // ============================================================
        // 1. OBJETOS DIRECTOS (sin polimorfismo)
        // ============================================================
        
        System.out.println(">>> 1. OBJETOS DIRECTOS (tipo específico):\n");
        
        System.out.println("--- Objeto Persona (clase base) ---");
        Persona persona = new Persona("Ana López", 45);
        persona.presentarse();
        
        System.out.println("\n--- Objeto Estudiante (clase derivada - REEMPLAZO TOTAL) ---");
        Estudiante estudiante = new Estudiante("Carlos Méndez", 20, "2024001", "Ingeniería de Sistemas");
        estudiante.presentarse();
        
        System.out.println("\n--- Objeto Profesor (clase derivada - EXTENSIÓN con super) ---");
        Profesor profesor = new Profesor("Luz Rodríguez", 38, "Ciencias", "Matemáticas");
        profesor.presentarse();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 2. POLIMORFISMO (variable de tipo Persona apuntando a diferentes objetos)
        // ============================================================
        
        System.out.println("\n>>> 2. POLIMORFISMO (variable Persona, objetos reales diferentes):\n");
        
        System.out.println("--- Variable Persona apuntando a un objeto Persona ---");
        Persona ref1 = new Persona("María García", 50);
        ref1.presentarse();
        
        System.out.println("\n--- Variable Persona apuntando a un objeto Estudiante ---");
        Persona ref2 = new Estudiante("Jorge Pérez", 22, "2024002", "Derecho");
        ref2.presentarse();  // AQUÍ SE EJECUTA LA VERSIÓN DE ESTUDIANTE
        
        System.out.println("\n--- Variable Persona apuntando a un objeto Profesor ---");
        Persona ref3 = new Profesor("Andrés Martínez", 42, "Ingeniería", "Física");
        ref3.presentarse();  // AQUÍ SE EJECUTA LA VERSIÓN DE PROFESOR
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 3. ARREGLO POLIMÓRFICO (demostración avanzada)
        // ============================================================
        
        System.out.println("\n>>> 3. ARREGLO POLIMÓRFICO (todas las referencias son Persona):\n");
        
        // Un arreglo de tipo Persona puede contener objetos de Persona, Estudiante y Profesor
        Persona[] personas = new Persona[4];
        personas[0] = new Persona("Roberto Díaz", 55);
        personas[1] = new Estudiante("Laura Sánchez", 19, "2024003", "Medicina");
        personas[2] = new Profesor("Claudia Ríos", 47, "Artes", "Literatura");
        personas[3] = new Estudiante("Andrés Torres", 21, "2024004", "Administración");
        
        System.out.println("Recorriendo el arreglo de Personas:\n");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("--- Elemento " + (i+1) + " ---");
            personas[i].presentarse();
            System.out.println();
        }
        
        System.out.println("=".repeat(60));
        System.out.println("\n*** CONCLUSIÓN DEL EJERCICIO 1 ***");
        System.out.println("✓ La sobrescritura permite que cada subclase tenga su propia versión de presentarse().");
        System.out.println("✓ El polimorfismo permite tratar objetos de diferentes tipos de manera uniforme.");
        System.out.println("✓ Al llamar a presentarse(), se ejecuta la versión del objeto REAL, no del tipo de variable.");
        System.out.println("✓ Estudiante: reemplazo total (no usa super).");
        System.out.println("✓ Profesor: extensión con super.presentarse() + información adicional.");
    }
}