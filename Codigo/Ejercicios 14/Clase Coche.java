public class Coche extends Vehiculo {
    private int numeroPuertas;
    private String tipoCombustible;
    
    // Constructor
    public Coche(String marca, String modelo, int numeroPuertas, String tipoCombustible) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    
    // Sobrescritura del método mover
    @Override
    public void mover() {
        System.out.println("El coche " + marca + " " + modelo + " está circulando por la carretera.");
        System.out.println("  - Acelerando el motor de " + tipoCombustible);
        System.out.println("  - Cambiando de marchas");
        System.out.println("  - Velocidad: 80 km/h");
    }
    
    // Método específico de Coche
    public void tocarBocina() {
        System.out.println("¡Piiiiiiii piiiiiiii! (Bocina del coche " + modelo + ")");
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}