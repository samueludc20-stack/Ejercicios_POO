// Clase derivada Rectangulo - Cumple LSP
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto) {
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("El ancho y alto deben ser mayores a cero");
        }
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double getAncho() {
        return ancho;
    }
    
    public double getAlto() {
        return alto;
    }
    
    public void setAncho(double ancho) {
        if (ancho <= 0) {
            throw new IllegalArgumentException("El ancho debe ser mayor a cero");
        }
        this.ancho = ancho;
    }
    
    public void setAlto(double alto) {
        if (alto <= 0) {
            throw new IllegalArgumentException("El alto debe ser mayor a cero");
        }
        this.alto = alto;
    }
    
    @Override
    public double area() {
        return ancho * alto;
    }
}