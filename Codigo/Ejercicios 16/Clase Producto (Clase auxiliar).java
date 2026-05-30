public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private String categoria;
    
    public Producto(String id, String nombre, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getCategoria() { return categoria; }
}