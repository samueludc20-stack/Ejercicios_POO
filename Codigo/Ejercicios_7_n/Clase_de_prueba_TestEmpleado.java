/**
 * Clase de prueba para demostrar el acceso a atributos public y private
 * de la clase Empleado.
 */
public class TestEmpleado {
    public static void main(String[] args) {
        
        System.out.println("=== CREACIÓN DEL EMPLEADO ===");
        Empleado emp = new Empleado("Carlos Mendoza", 2500.0);
        emp.mostrarInformacion();
        
        // ACCESO DIRECTO A ATRIBUTO PÚBLICO (permitido)
        System.out.println("Acceso directo al nombre: " + emp.nombre);
        
        // MODIFICACIÓN DIRECTA DE ATRIBUTO PÚBLICO (permitido)
        emp.nombre = "Ana Lucía Gómez";
        System.out.println("Nombre modificado directamente: " + emp.nombre);
        
        // ACCESO CORRECTO AL SALARIO (usando getter)
        System.out.println("Salario actual (vía getter): $" + emp.getSalario());
        
        // MODIFICACIÓN CORRECTA DEL SALARIO (usando setter con validación)
        System.out.println("\n=== INTENTANDO MODIFICAR SALARIO ===");
        emp.setSalario(3200.0);
        System.out.println("Nuevo salario: $" + emp.getSalario());
        
        // INTENTO DE ASIGNAR SALARIO NEGATIVO (validación evita el cambio)
        System.out.println("\n=== PRUEBA DE VALIDACIÓN ===");
        emp.setSalario(-500.0);
        System.out.println("Salario después de intento negativo: $" + emp.getSalario());
        
        emp.mostrarInformacion();
        
        // OBSERVACIÓN DIDÁCTICA:
        System.out.println("\n*** NOTA ***");
        System.out.println("Si intentáramos acceder a 'emp.salario' directamente,");
        System.out.println("el compilador mostraría un error porque es private.");
        // La siguiente línea causaría error de compilación:
        // System.out.println(emp.salario);
    }
}