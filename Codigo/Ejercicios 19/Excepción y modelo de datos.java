// Excepción personalizada para errores de almacenamiento
public class AlmacenamientoException extends Exception {
    public AlmacenamientoException(String mensaje) {
        super(mensaje);
    }
    
    public AlmacenamientoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}

// Clase que representa un archivo almacenado
public class Archivo {
    private String nombre;
    private String contenido;
    private String tipo;
    private long tamanio;
    private Date fechaModificacion;
    
    public Archivo(String nombre, String contenido, String tipo) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.tamanio = contenido != null ? contenido.length() : 0;
        this.fechaModificacion = new Date();
    }
    
    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { 
        this.contenido = contenido; 
        this.tamanio = contenido != null ? contenido.length() : 0;
        this.fechaModificacion = new Date();
    }
    public String getTipo() { return tipo; }
    public long getTamanio() { return tamanio; }
    public Date getFechaModificacion() { return fechaModificacion; }
    
    @Override
    public String toString() {
        return "Archivo{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamanio=" + tamanio +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }
}