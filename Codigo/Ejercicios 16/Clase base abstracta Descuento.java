// Clase base abstracta - Abierta para extensión, cerrada para modificación
public abstract class Descuento {
    protected String nombre;
    
    public Descuento(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto que será implementado por cada tipo de descuento
    public abstract double aplicar(double precio);
    
    public abstract String getDescripcion();
    
    public String getNombre() {
        return nombre;
    }
}