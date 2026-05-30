// Clase LibroReporteService - Responsabilidad Única: Generar reportes de libros
public class LibroReporteService {
    
    // Generar reporte en formato texto
    public void generarReporteTexto(Libro libro) {
        System.out.println("=== REPORTE DEL LIBRO (TEXTO) ===");
        System.out.println("┌─────────────────────────────────┐");
        System.out.println("│ Título: " + libro.getTitulo());
        System.out.println("│ Autor: " + libro.getAutor());
        System.out.println("│ ISBN: " + libro.getIsbn());
        System.out.println("│ Año: " + libro.getAñoPublicacion());
        System.out.println("│ Precio: $" + libro.getPrecio());
        System.out.println("└─────────────────────────────────┘");
    }
    
    // Generar reporte en formato HTML
    public String generarReporteHTML(Libro libro) {
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html>\n");
        html.append("<head><title>Reporte del Libro</title></head>\n");
        html.append("<body>\n");
        html.append("  <div class='libro'>\n");
        html.append("    <h1>").append(libro.getTitulo()).append("</h1>\n");
        html.append("    <p><strong>Autor:</strong> ").append(libro.getAutor()).append("</p>\n");
        html.append("    <p><strong>ISBN:</strong> ").append(libro.getIsbn()).append("</p>\n");
        html.append("    <p><strong>Año:</strong> ").append(libro.getAñoPublicacion()).append("</p>\n");
        html.append("    <p><strong>Precio:</strong> $").append(libro.getPrecio()).append("</p>\n");
        html.append("  </div>\n");
        html.append("</body>\n");
        html.append("</html>");
        return html.toString();
    }
    
    // Generar reporte en formato CSV
    public String generarReporteCSV(Libro libro) {
        return String.format("%s;%s;%s;%d;%.2f",
                libro.getTitulo(),
                libro.getAutor(),
                libro.getIsbn(),
                libro.getAñoPublicacion(),
                libro.getPrecio());
    }
}