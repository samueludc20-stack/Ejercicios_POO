public class Bicicleta extends Vehiculo {
    private int numeroMarchas;
    private String tipo;  // Montaña, Ruta, Urbana
    
    // Constructor
    public Bicicleta(String marca, String modelo, int numeroMarchas, String tipo) {
        super(marca, modelo);
        this.numeroMarchas = numeroMarchas;
        this.tipo = tipo;
    }
    
    // Sobrescritura del método mover
    @Override
    public void mover() {
        System.out.println("La bicicleta " + marca + " " + modelo + " está rodando.");
        System.out.println("  - Pedaleando suavemente");
        System.out.println("  - Tipo: " + tipo);
        System.out.println("  - Marcha actual: " + numeroMarchas);
        System.out.println("  - Velocidad: 15 km/h");
    }
    
    // Método específico de Bicicleta
    public void tocarCampana() {
        System.out.println("¡Din din din! (Campana de la bicicleta " + modelo + ")");
    }
    
    public int getNumeroMarchas() {
        return numeroMarchas;
    }
}