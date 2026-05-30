// Interfaz base - Abierta para extensión, cerrada para modificación
public interface Exportador {
    void exportar(Documento documento, String rutaArchivo);
    String getExtension();
    String getNombreFormato();
    boolean soportaMetadatos();
}