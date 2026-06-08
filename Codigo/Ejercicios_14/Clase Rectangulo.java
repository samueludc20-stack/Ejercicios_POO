public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Sobrescritura del método calcularArea
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del rectángulo (base = " + base + ", altura = " + altura + "): " + area);
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
}