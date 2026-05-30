// VIOLACIÓN DEL SRP: Esta clase tiene 3 responsabilidades diferentes
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int añoPublicacion;
    
    // Constructor
    public Libro(String titulo, String autor, String isbn, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
    }
    
    // === RESPONSABILIDAD 1: Manejo de información del libro ===
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public int getAñoPublicacion() { return añoPublicacion; }
    
    // === RESPONSABILIDAD 2: Generación de reportes ===
    public void generarReporte() {
        System.out.println("=== REPORTE DEL LIBRO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año: " + añoPublicacion);
    }
    
    public String generarReporteHTML() {
        return "<html><body>" +
               "<h1>" + titulo + "</h1>" +
               "<p>Autor: " + autor + "</p>" +
               "<p>ISBN: " + isbn + "</p>" +
               "</body></html>";
    }
    
    // === RESPONSABILIDAD 3: Persistencia en base de datos ===
    public void guardarEnBaseDatos() {
        System.out.println("Conectando a la base de datos...");
        System.out.println("INSERT INTO libros (titulo, autor, isbn, año) VALUES ('" 
                           + titulo + "', '" + autor + "', '" + isbn + "', " + añoPublicacion + ")");
        System.out.println("Libro guardado exitosamente.");
    }
    
    public void eliminarDeBaseDatos() {
        System.out.println("DELETE FROM libros WHERE isbn = '" + isbn + "'");
        System.out.println("Libro eliminado de la base de datos.");
    }
    
    public void actualizarEnBaseDatos() {
        System.out.println("UPDATE libros SET titulo = '" + titulo + "', autor = '" 
                           + autor + "' WHERE isbn = '" + isbn + "'");
        System.out.println("Libro actualizado en la base de datos.");
    }
}