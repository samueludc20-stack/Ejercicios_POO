// Clase que contiene los datos del reporte
public class DatosReporte {
    private String titulo;
    private String autor;
    private Date fechaGeneracion;
    private List<String> encabezados;
    private List<List<Object>> filas;
    private Map<String, Object> metadatos;
    
    public DatosReporte(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaGeneracion = new Date();
        this.encabezados = new ArrayList<>();
        this.filas = new ArrayList<>();
        this.metadatos = new HashMap<>();
    }
    
    // Métodos para construir el reporte
    public void agregarEncabezado(String encabezado) {
        encabezados.add(encabezado);
    }
    
    public void agregarEncabezados(String... encabezados) {
        for (String enc : encabezados) {
            this.encabezados.add(enc);
        }
    }
    
    public void agregarFila(Object... valores) {
        List<Object> fila = new ArrayList<>();
        for (Object valor : valores) {
            fila.add(valor);
        }
        filas.add(fila);
    }
    
    public void agregarMetadato(String clave, Object valor) {
        metadatos.put(clave, valor);
    }
    
    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public Date getFechaGeneracion() { return fechaGeneracion; }
    public List<String> getEncabezados() { return encabezados; }
    public List<List<Object>> getFilas() { return filas; }
    public Map<String, Object> getMetadatos() { return metadatos; }
}