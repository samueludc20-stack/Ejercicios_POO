/**
 * Clase Coche que hereda de Vehiculo.
 * Un coche ES UN vehículo, con atributo adicional: número de puertas.
 */
public class Coche extends Vehiculo {
    // Atributo específico de la subclase
    private int numeroDePuertas;
    
    /**
     * Constructor de Coche.
     * @param marca Marca del coche
     * @param velocidadMaxima Velocidad máxima del coche
     * @param numeroDePuertas Número de puertas del coche
     */
    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        // Llamada al constructor de la clase base (DEBE ser la primera línea)
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    
    // Getter específico
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
    
    /**
     * Método propio de Coche que muestra información completa.
     * Reutiliza el método mostrarInformacion() de Vehiculo.
     */
    public void mostrarInformacionCoche() {
        // Reutilizamos el método de la clase base
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
    
    /**
     * Sobrescritura (override) opcional del método mostrarInformacion.
     * Esto permite que al llamar al método desde un objeto Coche,
     * se muestre también el número de puertas.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}