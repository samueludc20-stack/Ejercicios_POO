// OTRA NUEVA EXTENSIÓN - Descuento por cantidad de productos
public class DescuentoPorVolumen extends Descuento {
    private int cantidadMinima;
    private double porcentajeDescuento;
    
    public DescuentoPorVolumen(String nombre, int cantidadMinima, double porcentajeDescuento) {
        super(nombre);
        this.cantidadMinima = cantidadMinima;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    @Override
    public double aplicar(double precio) {
        // Nota: Este método normalmente recibiría también la cantidad
        // Para este ejemplo, asumimos que se cumple la condición
        double descuento = precio * (porcentajeDescuento / 100);
        return precio - descuento;
    }
    
    public double calcularDescuentoPorCantidad(double precio, int cantidad) {
        if (cantidad >= cantidadMinima) {
            return precio * cantidad * (porcentajeDescuento / 100);
        }
        return 0;
    }
    
    @Override
    public String getDescripcion() {
        return String.format("Descuento del %.1f%% para compras de %d o más unidades", 
                porcentajeDescuento, cantidadMinima);
    }
}