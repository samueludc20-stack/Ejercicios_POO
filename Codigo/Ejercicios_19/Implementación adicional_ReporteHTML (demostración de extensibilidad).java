// Implementación adicional - Demuestra que se puede agregar un nuevo formato sin modificar GestorReportes
public class ReporteHTML implements GeneradorReporte {
    private String rutaSalida;
    private boolean incluirCSS;
    
    public ReporteHTML(String rutaSalida, boolean incluirCSS) {
        this.rutaSalida = rutaSalida;
        this.incluirCSS = incluirCSS;
    }
    
    @Override
    public String generar(DatosReporte datos) {
        System.out.println("[ReporteHTML] Generando reporte en formato HTML");
        
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html>\n<head>\n");
        html.append("  <title>").append(datos.getTitulo()).append("</title>\n");
        
        if (incluirCSS) {
            html.append("  <style>\n");
            html.append("    table { border-collapse: collapse; width: 100%; }\n");
            html.append("    th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }\n");
            html.append("    th { background-color: #4CAF50; color: white; }\n");
            html.append("    tr:nth-child(even) { background-color: #f2f2f2; }\n");
            html.append("  </style>\n");
        }
        
        html.append("</head>\n<body>\n");
        html.append("  <h1>").append(datos.getTitulo()).append("</h1>\n");
        html.append("  <p>Autor: ").append(datos.getAutor()).append("</p>\n");
        html.append("  <p>Fecha: ").append(datos.getFechaGeneracion()).append("</p>\n");
        html.append("  <table>\n");
        
        if (!datos.getEncabezados().isEmpty()) {
            html.append("    <tr>\n");
            for (String enc : datos.getEncabezados()) {
                html.append("      <th>").append(enc).append("</th>\n");
            }
            html.append("    </tr>\n");
        }
        
        for (List<Object> fila : datos.getFilas()) {
            html.append("    <tr>\n");
            for (Object valor : fila) {
                html.append("      <td>").append(valor).append("</td>\n");
            }
            html.append("    </tr>\n");
        }
        
        html.append("  </table>\n");
        html.append("</body>\n</html>");
        
        String nombreArchivo = rutaSalida + "/" + datos.getTitulo().replace(" ", "_") + ".html";
        System.out.println("  ✓ HTML generado: " + nombreArchivo);
        System.out.println("  Contenido:\n" + html.substring(0, Math.min(500, html.length())) + "...");
        
        return nombreArchivo;
    }
    
    @Override
    public String getFormato() {
        return "html";
    }
    
    @Override
    public boolean validarDatos(DatosReporte datos) {
        return datos != null && datos.getTitulo() != null && !datos.getTitulo().isEmpty();
    }
}