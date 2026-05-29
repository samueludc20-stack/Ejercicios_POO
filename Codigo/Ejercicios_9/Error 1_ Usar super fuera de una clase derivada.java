/**
 * CLASE SIN HERENCIA (NO es una clase derivada)
 * Error: super solo puede usarse dentro de una clase que extiende de otra.
 */
public class Main {
    public static void main(String[] args) {
        
        // ERROR DE COMPILACIÓN: super usado fuera de contexto de herencia
        // super no se refiere a ninguna clase base porque Main no extiende de nadie (excepto Object implícitamente)
        
        // Esto NO compila:
        // super.toString();  // Error
        
        System.out.println("Este código NO compilaría si descomentamos la línea con super.");
    }
}