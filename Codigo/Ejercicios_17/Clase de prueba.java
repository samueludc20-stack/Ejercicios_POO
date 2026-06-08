// Clase de prueba - Demuestra el cumplimiento del LSP
public class TestFiguraLSP {
    
    // Este método acepta CUALQUIER Figura (base o derivada)
    // Demuestra que Circulo y Rectangulo pueden sustituir a Figura
    public static void imprimirArea(Figura figura) {
        System.out.println("Calculando área...");
        double area = figura.area();
        System.out.println("Área: " + area);
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Crear figuras
        Figura rectangulo = new Rectangulo(5, 3);
        Figura circulo = new Circulo(4);
        
        // Demostración de LSP: ambas son tratadas como Figura
        System.out.println("=== Demostración del Principio LSP ===");
        System.out.println("Tratando un Rectángulo como Figura:");
        imprimirArea(rectangulo);
        
        System.out.println("Tratando un Círculo como Figura:");
        imprimirArea(circulo);
        
        // También podemos crear un arreglo de figuras
        System.out.println("=== Arreglo de Figuras (Polimorfismo) ===");
        Figura[] figuras = {
            new Rectangulo(10, 5),
            new Circulo(3),
            new Rectangulo(2, 8),
            new Circulo(7)
        };
        
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura " + (i+1) + " - Área: " + figuras[i].area());
        }
    }
}