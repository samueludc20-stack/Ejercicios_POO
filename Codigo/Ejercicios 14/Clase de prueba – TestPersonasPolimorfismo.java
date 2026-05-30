public class TestPersonasPolimorfismo {
    public static void main(String[] args) {
        System.out.println("=== Demostración de Polimorfismo con Personas ===\n");
        
        // Instanciando objetos directamente
        Persona persona1 = new Persona("Carlos", 30);
        Estudiante estudiante1 = new Estudiante("Ana", 20, "Ingeniería de Sistemas", 5);
        Profesor profesor1 = new Profesor("Dra. Martha", 45, "Programación Orientada a Objetos", 12);
        
        System.out.println("--- Invocación directa ---");
        persona1.presentarse();
        estudiante1.presentarse();
        profesor1.presentarse();
        
        // Demostración de polimorfismo: referencias de tipo Persona
        System.out.println("\n--- Demostración de Polimorfismo (Referencias Persona) ---");
        
        Persona refPersona;
        
        refPersona = persona1;
        refPersona.presentarse();  // Versión de Persona
        
        refPersona = estudiante1;
        refPersona.presentarse();  // Versión de Estudiante (polimorfismo)
        
        refPersona = profesor1;
        refPersona.presentarse();  // Versión de Profesor (polimorfismo)
        
        // Usando un arreglo polimórfico
        System.out.println("\n--- Arreglo Polimórfico de Personas ---");
        Persona[] personas = {
            new Persona("Luis", 25),
            new Estudiante("María", 19, "Medicina", 2),
            new Profesor("Dr. Javier", 50, "Matemáticas", 20),
            new Estudiante("Pedro", 22, "Derecho", 7),
            new Profesor("Lic. Elena", 38, "Historia", 8)
        };
        
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            personas[i].presentarse();
        }
        
        // Demostrando que no se pueden invocar métodos específicos desde referencia Persona
        System.out.println("\n--- Limitaciones del Polimorfismo ---");
        Persona ref = estudiante1;
        ref.presentarse();  // Esto funciona
        // ref.estudiar();  // ERROR de compilación: estudiar() no está en Persona
        
        // Para invocar métodos específicos, necesitamos hacer casting
        System.out.println("\n--- Casting para métodos específicos ---");
        if (ref instanceof Estudiante) {
            Estudiante est = (Estudiante) ref;
            est.estudiar();
        }
    }
}