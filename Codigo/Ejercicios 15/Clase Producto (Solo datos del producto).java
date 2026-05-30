// Clase Producto - Responsabilidad Única: Representar los datos de un producto
public class Producto {
    private String id;
    private String nombre;
    private double precioBase;
    private double porcentajeImpuesto;
    private String categoria;
    private String proveedor;
    
    // Constructor
    public Producto(String id, String nombre, double precioBase, 
                    double porcentajeImpuesto, String categoria, String proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.porcentajeImpuesto = porcentajeImpuesto;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }
    
    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    
    public double getPorcentajeImpuesto() { return porcentajeImpuesto; }
    public void setPorcentajeImpuesto(double porcentajeImpuesto) { this.porcentajeImpuesto = porcentajeImpuesto; }
    
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }
    
    @Override
    public String toString() {
        return String.format("Producto{id='%s', nombre='%s', precioBase=%.2f, impuesto=%.1f%%}",
                id, nombre, precioBase, porcentajeImpuesto);
    }
}