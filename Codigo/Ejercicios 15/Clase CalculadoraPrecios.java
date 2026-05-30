// Clase CalculadoraPrecios - Responsabilidad Única: Calcular precios y descuentos
public class CalculadoraPrecios {
    
    // Calcular precio final con impuesto
    public double calcularPrecioFinal(Producto producto) {
        double impuesto = producto.getPrecioBase() * producto.getPorcentajeImpuesto() / 100;
        return producto.getPrecioBase() + impuesto;
    }
    
    // Calcular impuesto total
    public double calcularImpuestoTotal(Producto producto) {
        return producto.getPrecioBase() * producto.getPorcentajeImpuesto() / 100;
    }
    
    // Calcular precio con descuento
    public double calcularPrecioConDescuento(Producto producto, double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 100");
        }
        double precioFinal = calcularPrecioFinal(producto);
        return precioFinal - (precioFinal * porcentajeDescuento / 100);
    }
    
    // Calcular precio final con descuento por volumen
    public double calcularPrecioPorVolumen(Producto producto, int cantidad, double descuentoPorVolumen) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        double precioUnitario = calcularPrecioFinal(producto);
        double precioTotal = precioUnitario * cantidad;
        return precioTotal - (precioTotal * descuentoPorVolumen / 100);
    }
    
    // Comparar precios entre productos
    public String compararPrecios(Producto p1, Producto p2) {
        double precio1 = calcularPrecioFinal(p1);
        double precio2 = calcularPrecioFinal(p2);
        
        if (precio1 < precio2) {
            return p1.getNombre() + " es más económico que " + p2.getNombre();
        } else if (precio1 > precio2) {
            return p2.getNombre() + " es más económico que " + p1.getNombre();
        } else {
            return "Ambos productos tienen el mismo precio";
        }
    }
}