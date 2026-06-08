public class TestProductoSRP {
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio SRP con Productos ===\n");
        
        // Crear producto (solo datos)
        Producto producto = new Producto("P001", "Laptop Gaming GamerX", 1200.00, 19.0, "Electrónica", "TechCorp");
        
        // Servicio de cálculos
        CalculadoraPrecios calculadora = new CalculadoraPrecios();
        
        // Servicio de etiquetas
        EtiquetaService etiquetaService = new EtiquetaService();
        
        System.out.println("--- 1. Datos del Producto ---");
        System.out.println(producto);
        
        System.out.println("\n--- 2. Cálculos de Precios ---");
        System.out.printf("Precio Base: $%.2f%n", producto.getPrecioBase());
        System.out.printf("Impuesto (%.1f%%): $%.2f%n", 
                producto.getPorcentajeImpuesto(), 
                calculadora.calcularImpuestoTotal(producto));
        System.out.printf("Precio Final: $%.2f%n", calculadora.calcularPrecioFinal(producto));
        System.out.printf("Precio con 15%% descuento: $%.2f%n", 
                calculadora.calcularPrecioConDescuento(producto, 15));
        
        System.out.println("\n--- 3. Comparación de Precios ---");
        Producto producto2 = new Producto("P002", "Tablet SmartTab", 350.00, 19.0, "Electrónica", "TechCorp");
        System.out.println(calculadora.compararPrecios(producto, producto2));
        
        System.out.println("\n--- 4. Generación de Etiquetas ---");
        etiquetaService.imprimirEtiqueta(producto);
        
        System.out.println("\n--- 5. Etiqueta con Descuento ---");
        etiquetaService.imprimirEtiquetaConDescuento(producto, 20);
        
        System.out.println("\n--- 6. Código de Barras ---");
        System.out.println("Código: " + etiquetaService.generarCodigoBarras(producto));
        
        System.out.println("\n--- 7. Cálculo por Volumen ---");
        System.out.printf("Precio para 5 unidades con 5%% descuento: $%.2f%n",
                calculadora.calcularPrecioPorVolumen(producto, 5, 5));
    }
}