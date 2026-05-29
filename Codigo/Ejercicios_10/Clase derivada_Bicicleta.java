/**
 * Clase Bicicleta que hereda de Vehiculo.
 * Una bicicleta ES UN vehículo.
 * 
 * SOBRESCRITURA: Proporciona una implementación específica del método moverse().
 */
public class Bicicleta extends Vehiculo {
    private int numeroDeMarchas;
    private boolean tieneCesto;
    
    /**
     * Constructor de Bicicleta.
     * @param tipo Tipo de vehículo (debería ser "terrestre" o similar)
     * @param numeroDeMarchas Número de marchas de la bicicleta
     * @param tieneCesto Indica si la bicicleta tiene cesto
     */
    public Bicicleta(String tipo, int numeroDeMarchas, boolean tieneCesto) {
        super(tipo);
        this.numeroDeMarchas = numeroDeMarchas;
        this.tieneCesto = tieneCesto;
    }
    
    // Getters y setters específicos
    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }
    
    public void setNumeroDeMarchas(int numeroDeMarchas) {
        if (numeroDeMarchas >= 0) {
            this.numeroDeMarchas = numeroDeMarchas;
        }
    }
    
    public boolean isTieneCesto() {
        return tieneCesto;
    }
    
    public void setTieneCesto(boolean tieneCesto) {
        this.tieneCesto = tieneCesto;
    }
    
    /**
     * SOBRESCRITURA del método moverse().
     * Proporciona una descripción específica para una bicicleta.
     */
    @Override
    public void moverse() {
        System.out.println("La bicicleta se mueve impulsada por pedales.");
        System.out.println("Tipo de vehículo: " + tipo);
        System.out.println("Número de marchas: " + numeroDeMarchas);
        if (tieneCesto) {
            System.out.println("Tiene cesto para llevar objetos.");
        }
        System.out.println("(Método sobrescrito en la clase Bicicleta)");
    }
    
    /**
     * Método adicional propio de Bicicleta (no existe en Vehiculo).
     */
    public void sonarCampanita() {
        System.out.println("¡Ring, ring! La bicicleta hace sonar su campanita.");
    }
}