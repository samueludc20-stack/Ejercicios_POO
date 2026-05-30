public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Implementación del método abstracto
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    // Getters
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
}