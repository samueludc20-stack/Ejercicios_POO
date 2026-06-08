// Clase que encapsula los datos de un mensaje
public class Mensaje {
    private String id;
    private String destino;
    private String contenido;
    private String asunto;
    private LocalDateTime fechaEnvio;
    private Map<String, String> metadatos;
    
    public Mensaje(String id, String destino, String contenido) {
        this.id = id;
        this.destino = destino;
        this.contenido = contenido;
        this.fechaEnvio = LocalDateTime.now();
        this.metadatos = new HashMap<>();
    }
    
    public Mensaje(String id, String destino, String asunto, String contenido) {
        this(id, destino, contenido);
        this.asunto = asunto;
    }
    
    // Getters
    public String getId() { return id; }
    public String getDestino() { return destino; }
    public String getContenido() { return contenido; }
    public String getAsunto() { return asunto; }
    public LocalDateTime getFechaEnvio() { return fechaEnvio; }
    public Map<String, String> getMetadatos() { return metadatos; }
    
    public void agregarMetadato(String clave, String valor) {
        metadatos.put(clave, valor);
    }
    
    public String getResumen(int longitud) {
        if (contenido.length() <= longitud) return contenido;
        return contenido.substring(0, longitud) + "...";
    }
}