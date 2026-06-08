// OTRA NUEVA EXTENSIÓN - Exportador a HTML
public class ExportadorHTML implements Exportador {
    private boolean incluirCSS;
    
    public ExportadorHTML(boolean incluirCSS) {
        this.incluirCSS = incluirCSS;
    }
    
    @Override
    public void exportar(Documento documento, String rutaArchivo) {
        System.out.println("\n=== EXPORTANDO A HTML ===");
        System.out.println("Archivo: " + rutaArchivo + ".html");
        
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html>\n<head>\n");
        html.append("<title>").append(documento.getTitulo()).append("</title>\n");
        
        if (incluirCSS) {
            html.append("<style>\n");
            html.append("body { font-family: Arial; margin: 40px; }\n");
            html.append("h1 { color: #333; }\n");
            html.append(".metadata { color: #666; font-size: 0.9em; }\n");
            html.append("</style>\n");
        }
        
        html.append("</head>\n<body>\n");
        html.append("<h1>").append(documento.getTitulo()).append("</h1>\n");
        html.append("<div class='metadata'>Autor: ").append(documento.getAutor()).append("</div>\n");
        html.append("<div class='metadata'>Fecha: ").append(documento.getFechaCreacion()).append("</div>\n");
        html.append("<p>").append(documento.getContenido()).append("</p>\n");
        html.append("</body>\n</html>");
        
        System.out.println("Contenido HTML generado:");
        System.out.println(html.substring(0, Math.min(html.length(), 300)) + "...");
        System.out.println("✓ Archivo HTML exportado exitosamente");
    }
    
    @Override
    public String getExtension() {
        return ".html";
    }
    
    @Override
    public String getNombreFormato() {
        return "HTML Web Page";
    }
    
    @Override
    public boolean soportaMetadatos() {
        return true;
    }
}