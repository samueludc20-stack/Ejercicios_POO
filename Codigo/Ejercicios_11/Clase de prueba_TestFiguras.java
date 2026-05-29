/**
 * Clase de prueba para demostrar el uso de CLASES ABSTRACTAS.
 * 
 * Se demuestra:
 * 1. Una clase abstracta NO puede ser instanciada directamente.
 * 2. Las subclases DEBEN implementar los métodos abstractos.
 * 3. Polimorfismo con clases abstractas.
 */
public class TestFiguras {
    public static void main(String[] args) {
        
        System.out.println("=== TALLER 11: CLASES ABSTRACTAS EN JAVA ===\n");
        System.out.println("--- EJERCICIO 1: Figura → Círculo y Rectángulo ---\n");
        
        // ============================================================
        // 1. DEMOSTRACIÓN: NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
        // ============================================================
        
        System.out.println(">>> 1. ¿SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA?\n");
        System.out.println("La siguiente línea estaría comentada porque genera ERROR DE COMPILACIÓN:");
        System.out.println("// Figura figura = new Figura();  // ERROR: Figura es abstracta, no se puede instanciar");
        System.out.println();
        
        // ============================================================
        // 2. CREACIÓN DE OBJETOS DE LAS SUBCLASES
        // ============================================================
        
        System.out.println(">>> 2. CREACIÓN DE OBJETOS DE LAS SUBCLASES:\n");
        
        System.out.println("--- Creando un Círculo (radio = 5) ---");
        Circulo circulo = new Circulo(5);
        circulo.mostrarInformacion();
        
        System.out.println();
        
        System.out.println("--- Creando un Rectángulo (base = 4, altura = 6) ---");
        Rectangulo rectangulo = new Rectangulo(4, 6);
        rectangulo.mostrarInformacion();
        
        System.out.println();
        
        // ============================================================
        // 3. POLIMORFISMO CON CLASES ABSTRACTAS
        // ============================================================
        
        System.out.println(">>> 3. POLIMORFISMO (variable de tipo Figura):\n");
        
        // Variable de tipo Figura (abstracta) puede apuntar a objetos de subclases
        System.out.println("--- Variable Figura apuntando a un Círculo ---");
        Figura fig1 = new Circulo(3);
        fig1.mostrarInformacion();  // Ejecuta la versión de Círculo
        
        System.out.println();
        
        System.out.println("--- Variable Figura apuntando a un Rectángulo ---");
        Figura fig2 = new Rectangulo(5, 8);
        fig2.mostrarInformacion();  // Ejecuta la versión de Rectángulo
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 4. ARREGLO POLIMÓRFICO DE FIGURAS
        // ============================================================
        
        System.out.println("\n>>> 4. ARREGLO POLIMÓRFICO DE FIGURAS:\n");
        
        // Un arreglo de tipo Figura puede contener círculos y rectángulos
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo(2.5);
        figuras[1] = new Rectangulo(3, 4);
        figuras[2] = new Circulo(7);
        figuras[3] = new Rectangulo(10, 2);
        
        System.out.println("Recorriendo el arreglo de Figuras:\n");
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("--- Figura " + (i+1) + " ---");
            figuras[i].mostrarInformacion();
            System.out.println();
        }
        
        System.out.println("=".repeat(60));
        
        // ============================================================
        // 5. DEMOSTRACIÓN DE VALIDACIONES
        // ============================================================
        
        System.out.println("\n>>> 5. DEMOSTRACIÓN DE VALIDACIONES EN CONSTRUCTORES:\n");
        
        System.out.println("Intentando crear un círculo con radio negativo:");
        Circulo circuloInvalido = new Circulo(-3);
        circuloInvalido.mostrarInformacion();  // Se usará radio = 1.0 por defecto
        
        System.out.println();
        
        System.out.println("Intentando crear un rectángulo con base negativa:");
        Rectangulo rectanguloInvalido = new Rectangulo(-2, 5);
        rectanguloInvalido.mostrarInformacion();  // Se usará base = 1.0 por defecto
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 6. CONCLUSIÓN
        // ============================================================
        
        System.out.println("\n*** CONCLUSIÓN DEL EJERCICIO 1 ***");
        System.out.println("✓ Una clase abstracta NO se puede instanciar directamente.");
        System.out.println("✓ Las subclases DEBEN implementar todos los métodos abstractos.");
        System.out.println("✓ Una clase abstracta puede tener métodos concretos (como mostrarArea()).");
        System.out.println("✓ El polimorfismo funciona con clases abstractas.");
        System.out.println("✓ Los métodos concretos heredados pueden ser sobrescritos opcionalmente.");
    }
}