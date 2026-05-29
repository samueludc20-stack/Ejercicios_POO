/**
 * Clase de prueba para demostrar el uso de super en herencia.
 * 
 * Se demuestra:
 * 1. Cómo super() invoca al constructor de la clase base.
 * 2. Cómo super.metodo() llama al método de la clase base desde un override.
 */
public class TestPersonaEmpleado {
    public static void main(String[] args) {
        
        System.out.println("=== TALLER 9: USO DE super ===\n");
        System.out.println("--- EJERCICIO 1: Persona → Empleado ---\n");
        
        // Crear un objeto Persona (sin usar super explícitamente)
        System.out.println(">>> Objeto de tipo Persona (clase base):");
        Persona persona = new Persona("Ana Martínez", 45);
        persona.mostrarDetalles();
        
        System.out.println();
        
        // Crear un objeto Empleado (usa super en constructor)
        System.out.println(">>> Objeto de tipo Empleado (clase derivada):");
        Empleado empleado = new Empleado("Carlos López", 30, "Ventas");
        
        System.out.println("Llamando a mostrarDetalles() - versión sobrescrita:");
        empleado.mostrarDetalles();
        
        System.out.println();
        
        // Demostración de que el método sobrescrito reutiliza el código de Persona
        System.out.println(">>> Explicación del flujo:");
        System.out.println("1. new Empleado(...) llama a super(nombre, edad) → inicializa nombre y edad.");
        System.out.println("2. Luego inicializa departamento.");
        System.out.println("3. Al llamar a mostrarDetalles(), se ejecuta @Override.");
        System.out.println("4. Dentro del override, super.mostrarDetalles() muestra nombre y edad.");
        System.out.println("5. Luego se agrega la línea que muestra departamento.");
        
        System.out.println();
        
        // Acceso a métodos heredados y propios
        System.out.println(">>> Acceso combinado (getters heredados + propio):");
        System.out.println("Nombre (heredado): " + empleado.getNombre());
        System.out.println("Edad (heredada): " + empleado.getEdad());
        System.out.println("Departamento (propio): " + empleado.getDepartamento());
        
        System.out.println();
        System.out.println("*** CONCLUSIÓN DEL EJERCICIO 1 ***");
        System.out.println("✓ super(parámetros) invoca al constructor de Persona.");
        System.out.println("✓ super.mostrarDetalles() reutiliza el código de Persona.");
        System.out.println("✓ Sin super, el código sería duplicado o no compilaría.");
    }
}