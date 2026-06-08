// Esta clase NO necesita cambiar cuando se agregan nuevos tipos de descuento
public class CalculadoraPrecios {
    private Producto producto;
    
    public CalculadoraPrecios(Producto producto) {
        this.producto = producto;
    }
    
    public double calcularPrecioFinal(Descuento descuento) {
        double precioOriginal = producto.getPrecio();
        double precioFinal = descuento.aplicar(precioOriginal);
        
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println(descuento.getDescripcion());
        System.out.println("Precio final: $" + String.format("%.2f", precioFinal));
        
        return precioFinal;
    }
}