// Clase EtiquetaService - Responsabilidad Única: Generar etiquetas de productos
public class EtiquetaService {
    private CalculadoraPrecios calculadoraPrecios;
    
    public EtiquetaService() {
        this.calculadoraPrecios = new CalculadoraPrecios();
    }
    
    // Generar etiqueta de precio básica
    public void imprimirEtiqueta(Producto producto) {
        double precioFinal = calculadoraPrecios.calcularPrecioFinal(producto);
        
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║           ETIQUETA DE PRECIO        ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf("║ Producto: %-30s║\n", truncar(producto.getNombre(), 30));
        System.out.printf("║ Categoría: %-29s║\n", truncar(producto.getCategoria(), 29));
        System.out.printf("║ Proveedor: %-29s║\n", truncar(producto.getProveedor(), 29));
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf("║ Precio Base: $%-24.2f║\n", producto.getPrecioBase());
        System.out.printf("║ Impuesto (%s%%): $%-20.2f║\n", 
                producto.getPorcentajeImpuesto(), 
                calculadoraPrecios.calcularImpuestoTotal(producto));
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf("║ PRECIO FINAL: $%-22.2f║\n", precioFinal);
        System.out.println("╚════════════════════════════════════╝");
    }
    
    // Generar etiqueta con descuento
    public void imprimirEtiquetaConDescuento(Producto producto, double descuento) {
        double precioConDescuento = calculadoraPrecios.calcularPrecioConDescuento(producto, descuento);
        double ahorro = calculadoraPrecios.calcularPrecioFinal(producto) - precioConDescuento;
        
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║        ETIQUETA DE OFERTA          ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf("║ %-33s║\n", producto.getNombre());
        System.out.printf("║ PRECIO NORMAL: $%-21.2f║\n", calculadoraPrecios.calcularPrecioFinal(producto));
        System.out.printf("║ DESCUENTO: %-26.0f%%║\n", descuento);
        System.out.printf("║ AHORRO: $%-27.2f║\n", ahorro);
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf("║ ¡OFERTA! $%-26.2f║\n", precioConDescuento);
        System.out.println("╚════════════════════════════════════╝");
    }
    
    // Generar código de barras simple
    public String generarCodigoBarras(Producto producto) {
        String codigo = producto.getId() + "-" + 
                        producto.getCategoria().substring(0, Math.min(2, producto.getCategoria().length())) +
                        producto.getNombre().substring(0, Math.min(3, producto.getNombre().length()));
        return codigo.toUpperCase();
    }
    
    // Método auxiliar para truncar strings
    private String truncar(String texto, int longitud) {
        if (texto == null) return "";
        if (texto.length() <= longitud) return texto;
        return texto.substring(0, longitud - 3) + "...";
    }
}