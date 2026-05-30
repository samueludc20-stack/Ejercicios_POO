public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Implementación del método abstracto
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    // Getters
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
}