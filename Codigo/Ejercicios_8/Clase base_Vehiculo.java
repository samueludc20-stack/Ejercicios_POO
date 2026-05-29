/**
 * Clase base Vehiculo.
 * Representa cualquier vehículo con marca y velocidad máxima.
 */
public class Vehiculo {
    // Atributos privados (buena práctica: encapsulamiento)
    private String marca;
    private double velocidadMaxima;
    
    /**
     * Constructor de la clase base.
     * @param marca Marca del vehículo
     * @param velocidadMaxima Velocidad máxima en km/h
     */
    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    // Getters públicos (para que la subclase pueda acceder si es necesario)
    public String getMarca() {
        return marca;
    }
    
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    /**
     * Muestra la información básica del vehículo.
     */
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}