// VIOLACIÓN DEL SRP: Esta clase tiene múltiples responsabilidades
public class Producto {
    private String nombre;
    private double precioBase;
    private double impuesto;
    private String categoria;
    
    // Constructor
    public Producto(String nombre, double precioBase, double impuesto, String categoria) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
        this.categoria = categoria;
    }
    
    // === RESPONSABILIDAD 1: Datos del producto ===
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
    public double getImpuesto() { return impuesto; }
    public String getCategoria() { return categoria; }
    
    // === RESPONSABILIDAD 2: Cálculo de precios ===
    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto / 100);
    }
    
    public double calcularDescuento(double porcentajeDescuento) {
        double precioFinal = calcularPrecioFinal();
        return precioFinal - (precioFinal * porcentajeDescuento / 100);
    }
    
    public double calcularImpuestoTotal() {
        return precioBase * impuesto / 100;
    }
    
    // === RESPONSABILIDAD 3: Generación de etiquetas ===
    public void imprimirEtiqueta() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║        ETIQUETA            ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║ Producto: " + nombre);
        System.out.println("║ Categoría: " + categoria);
        System.out.println("║ Precio: $" + calcularPrecioFinal());
        System.out.println("╚════════════════════════════╝");
    }
    
    public String generarCodigoBarras() {
        return "PROD-" + nombre.toUpperCase().substring(0, Math.min(3, nombre.length())) + "-" + categoria.substring(0, 2);
    }
}