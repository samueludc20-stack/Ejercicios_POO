/**
 * Solución 1: Cambiar private a protected.
 */
class VehiculoBaseCorregido {
    protected String marca;  // Ahora accesible desde subclases
    
    public VehiculoBaseCorregido(String marca) {
        this.marca = marca;
    }
}

class CocheDerivadoCorregido extends VehiculoBaseCorregido {
    
    public CocheDerivadoCorregido(String marca) {
        super(marca);
    }
    
    public void mostrarMarca() {
        // AHORA SÍ FUNCIONA porque marca es protected
        System.out.println("Marca: " + super.marca);
    }
}