// INTERFAZ VIOLADORA DEL ISP
public interface VehiculoViolacion {
    void conducir();
    void cargarMercancia(double peso);
    void descargarMercancia();
    double getCapacidadCarga();
}

// Auto - No necesita métodos de carga, pero obligado a implementarlos
public class AutoViolacion implements VehiculoViolacion {
    private String modelo;
    
    public AutoViolacion(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void conducir() {
        System.out.println("Conduciendo auto " + modelo);
    }
    
    @Override
    public void cargarMercancia(double peso) {
        // Violación: un auto no debería cargar mercancía
        System.out.println("ADVERTENCIA: Este vehículo no está diseñado para carga");
    }
    
    @Override
    public void descargarMercancia() {
        System.out.println("ADVERTENCIA: Este vehículo no tiene mercancía para descargar");
    }
    
    @Override
    public double getCapacidadCarga() {
        return 0; // Un auto no tiene capacidad de carga
    }
}