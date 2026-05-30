// Descuento de tipo porcentaje
public class DescuentoPorcentaje extends Descuento {
    private double porcentaje;
    
    public DescuentoPorcentaje(String nombre, double porcentaje) {
        super(nombre);
        this.porcentaje = porcentaje;
    }
    
    @Override
    public double aplicar(double precio) {
        double descuento = precio * (porcentaje / 100);
        return precio - descuento;
    }
    
    @Override
    public String getDescripcion() {
        return String.format("Descuento del %.1f%% sobre el precio original", porcentaje);
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }
}