/**
 * Clase de prueba para demostrar herencia entre Empleado y Gerente.
 */
public class TestEmpleadoGerente {
    public static void main(String[] args) {
        
        System.out.println("=== HERENCIA: EMPLEADO → GERENTE ===\n");
        
        // Crear un Empleado normal
        System.out.println("--- Empleado normal ---");
        Empleado emp1 = new Empleado("Roberto Fernández", 2500);
        emp1.mostrarDetalles();
        
        System.out.println();
        
        // Crear un Gerente (versión básica)
        System.out.println("--- Gerente (sin bono) ---");
        Gerente gerente1 = new Gerente("Marta Ríos", 3500, "Ventas");
        gerente1.mostrarDetalles();
        
        System.out.println();
        
        // Crear un Gerente con bono
        System.out.println("--- Gerente (con bono) ---");
        Gerente gerente2 = new Gerente("Luis Torres", 4000, "Tecnología", 1200);
        gerente2.mostrarDetalles();
        
        System.out.println();
        
        // Demostración de polimorfismo
        System.out.println("--- Polimorfismo: variable de tipo Empleado apuntando a Gerente ---");
        Empleado empPolimorfico = new Gerente("Claudia Vega", 3800, "Recursos Humanos", 800);
        empPolimorfico.mostrarDetalles();  // Llama al método sobrescrito de Gerente
        
        System.out.println();
        
        // Mostrar diferencia entre salario base y salario total
        System.out.println("--- Comparativa salarios ---");
        System.out.println("Salario base de " + gerente2.getNombre() + ": $" + gerente2.getSalario());
        System.out.println("Bono: $" + gerente2.getBono());
        System.out.println("Salario total: $" + gerente2.getSalarioTotal());
        
        System.out.println();
        System.out.println("*** CONCLUSIÓN ***");
        System.out.println("Gerente hereda todo de Empleado y agrega departamento y bono.");
        System.out.println("El método mostrarDetalles() se sobrescribe para mostrar información adicional.");
        System.out.println("Se puede agregar lógica de negocio nueva (como calcular salario total).");
    }
}