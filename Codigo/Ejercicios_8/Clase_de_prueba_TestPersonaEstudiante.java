/**
 * Clase de prueba para demostrar herencia y sobrescritura.
 */
public class TestPersonaEstudiante {
    public static void main(String[] args) {
        
        System.out.println("=== HERENCIA: PERSONA → ESTUDIANTE ===\n");
        
        // Crear un objeto Persona
        System.out.println("--- Objeto Persona ---");
        Persona persona = new Persona("Ana López", 45);
        persona.mostrarDetalles();
        
        System.out.println();
        
        // Crear un objeto Estudiante
        System.out.println("--- Objeto Estudiante ---");
        Estudiante estudiante = new Estudiante("Carlos Méndez", 20, "2024001");
        
        // Llamada al método sobrescrito (versión de Estudiante)
        System.out.println("Llamando a mostrarDetalles() (sobrescrito):");
        estudiante.mostrarDetalles();
        
        System.out.println();
        
        // Acceso a métodos heredados y propios
        System.out.println("--- Acceso combinado ---");
        System.out.println("Nombre (heredado): " + estudiante.getNombre());
        System.out.println("Edad (heredado): " + estudiante.getEdad());
        System.out.println("Matrícula (propio): " + estudiante.getMatricula());
        
        System.out.println();
        
        // Demostración de polimorfismo (concepto avanzado, pero se introduce aquí)
        System.out.println("--- Demostración de polimorfismo ---");
        Persona personaPolimorfica = new Estudiante("Laura Pérez", 22, "2024002");
        // Aunque es de tipo Persona, al llamar a mostrarDetalles() se ejecuta la versión de Estudiante
        personaPolimorfica.mostrarDetalles();
        
        System.out.println();
        System.out.println("*** CONCLUSIÓN ***");
        System.out.println("Estudiante hereda nombre y edad de Persona.");
        System.out.println("El método mostrarDetalles() fue SOBRESCRITO para incluir matrícula.");
        System.out.println("La anotación @Override ayuda a detectar errores en tiempo de compilación.");
    }
}