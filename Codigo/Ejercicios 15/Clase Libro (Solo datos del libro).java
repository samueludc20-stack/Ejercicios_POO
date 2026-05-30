// Clase Libro - Responsabilidad Única: Representar los datos de un libro
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int añoPublicacion;
    private double precio;
    
    // Constructor
    public Libro(String titulo, String autor, String isbn, int añoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
        this.precio = precio;
    }
    
    // Getters y Setters (solo manejo de datos)
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    public int getAñoPublicacion() { return añoPublicacion; }
    public void setAñoPublicacion(int añoPublicacion) { this.añoPublicacion = añoPublicacion; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    @Override
    public String toString() {
        return "Libro{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", isbn='" + isbn + '\'' +
               ", año=" + añoPublicacion +
               ", precio=$" + precio +
               '}';
    }
}