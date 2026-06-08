public class Circulo extends Figura {
    private double radio;
    
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    // Sobrescritura del método calcularArea
    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo (radio = " + radio + "): " + String.format("%.2f", area));
    }
    
    public double getRadio() {
        return radio;
    }
}