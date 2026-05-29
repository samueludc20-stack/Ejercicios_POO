/**
 * Clase de prueba para Utilidades.
 * Demuestra cómo invocar métodos estáticos sin crear objetos.
 */
public class TestUtilidades {
    public static void main(String[] args) {
        
        System.out.println("=== DEMOSTRACIÓN DE UTILIDADES MATEMÁTICAS ===\n");
        
        // OPERACIONES BÁSICAS
        System.out.println("--- Operaciones básicas ---");
        System.out.println("Suma: 15 + 27 = " + Utilidades.suma(15, 27));
        System.out.println("Resta: 100 - 35 = " + Utilidades.resta(100, 35));
        System.out.println("Multiplicación: 12 x 8 = " + Utilidades.multiplicacion(12, 8));
        System.out.println("División: 45 / 6 = " + Utilidades.division(45, 6));
        
        // NÚMEROS NEGATIVOS
        System.out.println("\n--- Operaciones con números negativos ---");
        System.out.println("Suma: -10 + 5 = " + Utilidades.suma(-10, 5));
        System.out.println("Resta: 7 - (-3) = " + Utilidades.resta(7, -3));
        System.out.println("Multiplicación: -4 x 6 = " + Utilidades.multiplicacion(-4, 6));
        System.out.println("División: -20 / -4 = " + Utilidades.division(-20, -4));
        
        // CASOS ESPECIALES
        System.out.println("\n--- Casos especiales ---");
        System.out.println("División por cero: " + Utilidades.division(100, 0));
        System.out.println("Módulo: 17 % 5 = " + Utilidades.modulo(17, 5));
        System.out.println("Módulo con divisor cero: " + Utilidades.modulo(10, 0));
        
        // VALIDACIÓN DE PRECISIÓN EN DIVISIÓN
        System.out.println("\n--- Precisión en división (tipo double) ---");
        System.out.println("7 / 3 = " + Utilidades.division(7, 3));
        System.out.println("1 / 3 = " + Utilidades.division(1, 3));
        
        // NOTA DIDÁCTICA
        System.out.println("\n*** NOTA ***");
        System.out.println("Todos los métodos se invocan con 'Utilidades.nombreMetodo()'");
        System.out.println("No es necesario crear un objeto: 'new Utilidades()'");
        System.out.println("Eso es porque los métodos son estáticos (static).");
    }
}