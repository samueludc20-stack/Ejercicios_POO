public class TestDescuentoOCP {
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio OCP con Descuentos ===\n");
        
        // Crear un producto
        Producto producto = new Producto("P001", "Laptop Gaming X", 1200.00, "Electrónica");
        CalculadoraPrecios calculadora = new CalculadoraPrecios(producto);
        
        System.out.println("--- 1. Descuento por Porcentaje ---");
        Descuento descuentoPorcentaje = new DescuentoPorcentaje("CyberMonday", 15.0);
        calculadora.calcularPrecioFinal(descuentoPorcentaje);
        
        System.out.println("\n--- 2. Descuento Fijo (NUEVO TIPO) ---");
        Descuento descuentoFijo = new DescuentoFijo("Cupón VIP", 150.00);
        calculadora.calcularPrecioFinal(descuentoFijo);
        
        System.out.println("\n--- 3. Descuento por Volumen (OTRO NUEVO TIPO) ---");
        Descuento descuentoVolumen = new DescuentoPorVolumen("Oferta Mayorista", 3, 10.0);
        System.out.println(descuentoVolumen.getDescripcion());
        
        System.out.println("\n--- 4. Descuento Compuesto (Múltiples descuentos) ---");
        DescuentoCompuesto descuentoCompuesto = new DescuentoCompuesto("Súper Oferta");
        descuentoCompuesto.agregarDescuento(new DescuentoPorcentaje("Descuento Base", 10.0));
        descuentoCompuesto.agregarDescuento(new DescuentoFijo("Cupón Adicional", 50.00));
        calculadora.calcularPrecioFinal(descuentoCompuesto);
        
        System.out.println("\n--- 5. Demostración de Extensibilidad ---");
        System.out.println("Para agregar un nuevo tipo de descuento (ej: DescuentoBlackFriday):");
        System.out.println("1. Crear una nueva clase que extienda Descuento");
        System.out.println("2. Implementar el método aplicar()");
        System.out.println("3. ¡La CalculadoraPrecios no necesita cambios!");
        
        // Simulación de cómo se usaría un nuevo descuento
        System.out.println("\n--- 6. Lista de Descuentos Disponibles ---");
        List<Descuento> descuentos = new ArrayList<>();
        descuentos.add(new DescuentoPorcentaje("Rebaja Normal", 5.0));
        descuentos.add(new DescuentoFijo("Liquidación", 100.00));
        descuentos.add(new DescuentoPorcentaje("Oferta Especial", 20.0));
        descuentos.add(new DescuentoFijo("Cupón Bienvenida", 30.00));
        
        for (Descuento d : descuentos) {
            System.out.println("• " + d.getNombre() + ": " + d.getDescripcion());
        }
    }
}