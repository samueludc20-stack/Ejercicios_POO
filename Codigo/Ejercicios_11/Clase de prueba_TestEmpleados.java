/**
 * Clase de prueba para demostrar el uso de CLASES ABSTRACTAS con empleados.
 * 
 * Se demuestra:
 * 1. Diferentes implementaciones del método abstracto calcularSalario().
 * 2. Polimorfismo con clases abstractas.
 * 3. Validaciones en constructores y setters.
 */
public class TestEmpleados {
    public static void main(String[] args) {
        
        System.out.println("=== TALLER 11: CLASES ABSTRACTAS EN JAVA ===\n");
        System.out.println("--- EJERCICIO 2: Empleado → Gerente y Vendedor ---\n");
        
        // ============================================================
        // 1. DEMOSTRACIÓN: NO SE PUEDE INSTANCIAR EMPLEADO DIRECTAMENTE
        // ============================================================
        
        System.out.println(">>> 1. ¿SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA?\n");
        System.out.println("La siguiente línea estaría comentada porque genera ERROR:");
        System.out.println("// Empleado emp = new Empleado();  // ERROR: Empleado es abstracta");
        System.out.println();
        
        // ============================================================
        // 2. CREACIÓN DE OBJETOS DE LAS SUBCLASES
        // ============================================================
        
        System.out.println(">>> 2. CREACIÓN DE OBJETOS DE LAS SUBCLASES:\n");
        
        System.out.println("--- Creando un Gerente ---");
        Gerente gerente = new Gerente("Carlos Rodríguez", 3000, 800);
        gerente.mostrarDetalles();
        
        System.out.println();
        
        System.out.println("--- Creando un Vendedor ---");
        Vendedor vendedor = new Vendedor("Ana Pérez", 1500, 10000, 5);  // 5% de comisión
        vendedor.mostrarDetalles();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 3. POLIMORFISMO CON CLASES ABSTRACTAS
        // ============================================================
        
        System.out.println("\n>>> 3. POLIMORFISMO (variable de tipo Empleado):\n");
        
        System.out.println("--- Variable Empleado apuntando a un Gerente ---");
        Empleado emp1 = new Gerente("Laura Méndez", 3500, 1200);
        emp1.mostrarDetalles();  // Ejecuta la versión de Gerente
        
        System.out.println();
        
        System.out.println("--- Variable Empleado apuntando a un Vendedor ---");
        Empleado emp2 = new Vendedor("Jorge Torres", 1600, 20000, 4);
        emp2.mostrarDetalles();  // Ejecuta la versión de Vendedor
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 4. ARREGLO POLIMÓRFICO DE EMPLEADOS
        // ============================================================
        
        System.out.println("\n>>> 4. ARREGLO POLIMÓRFICO DE EMPLEADOS:\n");
        
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Gerente("Roberto Díaz", 4000, 1500);
        empleados[1] = new Vendedor("Sofía Luna", 1400, 15000, 3);
        empleados[2] = new Gerente("Martín Ríos", 3800, 1000);
        empleados[3] = new Vendedor("Lucía Gil", 1600, 25000, 6);
        
        System.out.println("Recorriendo el arreglo de Empleados:\n");
        double sumaSalarios = 0;
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("--- Empleado " + (i+1) + " ---");
            empleados[i].mostrarDetalles();
            sumaSalarios += empleados[i].calcularSalario();
            System.out.println();
        }
        
        System.out.println("Total de salarios de todos los empleados: $" + String.format("%.2f", sumaSalarios));
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 5. DEMOSTRACIÓN DE VALIDACIONES
        // ============================================================
        
        System.out.println("\n>>> 5. DEMOSTRACIÓN DE VALIDACIONES EN CONSTRUCTORES:\n");
        
        System.out.println("Intentando crear un gerente con bono negativo:");
        Gerente gerenteInvalido = new Gerente("Prueba", 2000, -500);
        gerenteInvalido.mostrarDetalles();
        
        System.out.println();
        
        System.out.println("Intentando crear un vendedor con comisión mayor a 100%:");
        Vendedor vendedorInvalido = new Vendedor("Prueba", 1000, 5000, 150);
        vendedorInvalido.mostrarDetalles();
        
        System.out.println("\n" + "=".repeat(60));
        
        // ============================================================
        // 6. CONCLUSIÓN
        // ============================================================
        
        System.out.println("\n*** CONCLUSIÓN DEL EJERCICIO 2 ***");
        System.out.println("✓ La clase abstracta Empleado define el método abstracto calcularSalario().");
        System.out.println("✓ Gerente y Vendedor implementan calcularSalario() de forma diferente.");
        System.out.println("✓ El método concreto mostrarDetalles() se reutiliza en todas las subclases.");
        System.out.println("✓ El polimorfismo permite tratar diferentes empleados de manera uniforme.");
        System.out.println("✓ Las validaciones protegen la integridad de los datos (salarios, bonos, comisiones).");
    }
}