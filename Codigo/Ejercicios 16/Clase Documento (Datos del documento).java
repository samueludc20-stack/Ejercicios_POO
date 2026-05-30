// Clase Documento - Contiene solo los datos del documento
public class Documento {
    private String id;
    private String titulo;
    private String contenido;
    private String autor;
    private LocalDateTime fechaCreacion;
    private List<String> etiquetas;
    
    public Documento(String id, String titulo, String contenido, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.fechaCreacion = LocalDateTime.now();
        this.etiquetas = new ArrayList<>();
    }
    
    // Getters
    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public String getAutor() { return autor; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public List<String> getEtiquetas() { return etiquetas; }
    
    public void agregarEtiqueta(String etiqueta) {
        etiquetas.add(etiqueta);
    }
    
    // Resumen del contenido (para exportaciones)
    public String getResumen(int longitud) {
        if (contenido.length() <= longitud) return contenido;
        return contenido.substring(0, longitud) + "...";
    }
    
    @Override
    public String toString() {
        return String.format("Documento{id='%s', titulo='%s', autor='%s'}", id, titulo, autor);
    }
}