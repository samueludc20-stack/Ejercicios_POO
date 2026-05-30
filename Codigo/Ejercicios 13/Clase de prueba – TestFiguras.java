public class TestFiguras {
    public static void main(String[] args) {
        // Crear objetos de Rectangulo y Triangulo
        Rectangulo rect = new Rectangulo(5.0, 3.0);
        Triangulo tri = new Triangulo(4.0, 6.0);
        
        // Mostrar áreas
        System.out.println("=== Cálculo de Áreas ===");
        System.out.println("Rectángulo:");
        System.out.println("  Base: " + rect.getBase());
        System.out.println("  Altura: " + rect.getAltura());
        System.out.println("  Área: " + rect.calcularArea());
        
        System.out.println("\nTriángulo:");
        System.out.println("  Base: " + tri.getBase());
        System.out.println("  Altura: " + tri.getAltura());
        System.out.println("  Área: " + tri.calcularArea());
        
        // Demostrando polimorfismo
        System.out.println("\n=== Demostración de Polimorfismo ===");
        Figura figura1 = rect;
        Figura figura2 = tri;
        
        System.out.println("Área desde referencia Figura: " + figura1.calcularArea());
        System.out.println("Área desde referencia Figura: " + figura2.calcularArea());
    }
}