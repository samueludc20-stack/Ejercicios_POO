public class TestFigurasPolimorfismo {
    public static void main(String[] args) {
        System.out.println("=== Demostración de Polimorfismo con Figuras ===\n");
        
        // Usando referencia de clase base para apuntar a objetos derivados
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 6.0);
        Figura figura3 = new Circulo(3.5);
        Figura figura4 = new Rectangulo(2.0, 8.0);
        
        // Invocación polimórfica - el método que se ejecuta depende del objeto real
        System.out.println("--- Invocación polimórfica ---");
        figura1.calcularArea();  // Ejecuta el método de Circulo
        figura2.calcularArea();  // Ejecuta el método de Rectangulo
        figura3.calcularArea();  // Ejecuta el método de Circulo
        figura4.calcularArea();  // Ejecuta el método de Rectangulo
        
        // También podemos usar un arreglo polimórfico
        System.out.println("\n--- Usando un arreglo de Figuras ---");
        Figura[] figuras = {
            new Circulo(2.0),
            new Rectangulo(3.0, 4.0),
            new Circulo(4.0),
            new Rectangulo(5.0, 2.0)
        };
        
        for (int i = 0; i < figuras.length; i++) {
            System.out.print("Figura " + (i + 1) + ": ");
            figuras[i].calcularArea();
        }
    }
}