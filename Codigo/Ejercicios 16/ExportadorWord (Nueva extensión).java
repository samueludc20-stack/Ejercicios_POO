// NUEVO FORMATO - Exportador a Word (se agrega sin modificar código existente)
public class ExportadorWord implements Exportador {
    private boolean incluirMarcasRevision;
    
    public ExportadorWord() {
        this.incluirMarcasRevision = false;
    }
    
    public ExportadorWord(boolean incluirMarcasRevision) {
        this.incluirMarcasRevision = incluirMarcasRevision;
    }
    
    @Override
    public void exportar(Documento documento, String rutaArchivo) {
        System.out.println("\n=== EXPORTANDO A MICROSOFT WORD ===");
        System.out.println("Archivo: " + rutaArchivo + ".docx");
        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Autor: " + documento.getAutor());
        System.out.println("Etiquetas: " + String.join(", ", documento.getEtiquetas()));
        System.out.println("Contenido: " + documento.getContenido());
        
        if (incluirMarcasRevision) {
            System.out.println("[Incluyendo marcas de revisión y comentarios...]");
        }
        
        System.out.println("[Formateando con estilos de Word...]");
        System.out.println("✓ Documento Word exportado exitosamente");
    }
    
    @Override
    public String getExtension() {
        return ".docx";
    }
    
    @Override
    public String getNombreFormato() {
        return "Microsoft Word Document";
    }
    
    @Override
    public boolean soportaMetadatos() {
        return true;
    }
}