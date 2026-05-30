// NUEVO TIPO DE DESCUENTO - Se agrega sin modificar la clase base ni las existentes
public class DescuentoFijo extends Descuento {
    private double montoDescuento;
    
    public DescuentoFijo(String nombre, double montoDescuento) {
        super(nombre);
        if (montoDescuento < 0) {
            throw new IllegalArgumentException("El descuento no puede ser negativo");
        }
        this.montoDescuento = montoDescuento;
    }
    
    @Override
    public double aplicar(double precio) {
        double precioFinal = precio - montoDescuento;
        return Math.max(precioFinal, 0); // El precio no puede ser negativo
    }
    
    @Override
    public String getDescripcion() {
        return String.format("Descuento fijo de $%.2f sobre el precio original", montoDescuento);
    }
    
    public double getMontoDescuento() {
        return montoDescuento;
    }
}