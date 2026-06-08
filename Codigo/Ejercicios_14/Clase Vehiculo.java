public class Vehiculo {
    protected String marca;
    protected String modelo;
    
    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Método que será sobrescrito
    public void mover() {
        System.out.println("El vehículo " + marca + " " + modelo + " se está moviendo.");
    }
    
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
}