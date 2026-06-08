// Exportador a PDF - Formato existente
public class ExportadorPDF implements Exportador {
    
    @Override
    public void exportar(Documento documento, String rutaArchivo) {
        System.out.println("\n=== EXPORTANDO A PDF ===");
        System.out.println("Archivo: " + rutaArchivo + ".pdf");
        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Autor: " + documento.getAutor());
        System.out.println("Fecha: " + documento.getFechaCreacion());
        System.out.println("Contenido: " + documento.getResumen(100));
        System.out.println("[Generando PDF con formato profesional...]");
        System.out.println("✓ PDF exportado exitosamente");
    }
    
    @Override
    public String getExtension() {
        return ".pdf";
    }
    
    @Override
    public String getNombreFormato() {
        return "PDF (Portable Document Format)";
    }
    
    @Override
    public boolean soportaMetadatos() {
        return true;
    }
}