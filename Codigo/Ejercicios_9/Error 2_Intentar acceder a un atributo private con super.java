/**
 * Clase base con atributo PRIVADO.
 * Los atributos private NO son accesibles desde subclases, ni siquiera con super.
 */
class VehiculoBase {
    private String marca;  // Atributo privado
    
    public VehiculoBase(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
}

/**
 * Clase derivada que INTENTA acceder al atributo private usando super.
 * Esto NO funciona porque super respeta los modificadores de acceso.
 */
class CocheDerivado extends VehiculoBase {
    
    public CocheDerivado(String marca) {
        super(marca);
    }
    
    public void mostrarMarcaIncorrecto() {
        // ERROR: marca es private en VehiculoBase
        // System.out.println(super.marca);  // Descomentar = Error de compilación
    }
    
    public void mostrarMarcaCorrecto() {
        // Forma correcta: usar el getter público
        System.out.println("Marca (vía getter): " + super.getMarca());
    }
}