/**
 * Clase base Vehiculo.
 * Representa cualquier vehículo con un método moverse().
 * Este método será sobrescrito por Bicicleta.
 */
public class Vehiculo {
    protected String tipo;
    
    /**
     * Constructor de Vehiculo.
     * @param tipo Tipo de vehículo (terrestre, acuático, aéreo, etc.)
     */
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Método que será sobrescrito por Bicicleta.
     * Describe cómo se mueve el vehículo.
     */
    public void moverse() {
        System.out.println("El vehículo de tipo '" + tipo + "' se está moviendo.");
        System.out.println("(Método genérico de la clase Vehiculo)");
    }
    
    // Getter
    public String getTipo() {
        return tipo;
    }
    
    // Setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}