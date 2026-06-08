// NUEVO FORMATO - Exportador a Excel (se agrega sin modificar código existente)
public class ExportadorExcel implements Exportador {
    private boolean incluirGraficos;
    
    public ExportadorExcel() {
        this.incluirGraficos = false;
    }
    
    public ExportadorExcel(boolean incluirGraficos) {
        this.incluirGraficos = incluirGraficos;
    }
    
    @Override
    public void exportar(Documento documento, String rutaArchivo) {
        System.out.println("\n=== EXPORTANDO A MICROSOFT EXCEL ===");
        System.out.println("Archivo: " + rutaArchivo + ".xlsx");
        System.out.println("Documento: " + documento.getTitulo());
        
        // Excel suele estructurar datos en tablas
        System.out.println("\n[Estructura de datos exportada:]");
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ID          │ " + documento.getId());
        System.out.println("│ Título      │ " + documento.getTitulo());
        System.out.println("│ Autor       │ " + documento.getAutor());
        System.out.println("│ Fecha       │ " + documento.getFechaCreacion());
        System.out.println("│ Contenido   │ " + documento.getResumen(50));
        System.out.println("└─────────────────────────────────────────────┘");
        
        if (incluirGraficos) {
            System.out.println("[Generando gráficos a partir de los datos...]");
        }
        
        System.out.println("✓ Archivo Excel exportado exitosamente");
    }
    
    @Override
    public String getExtension() {
        return ".xlsx";
    }
    
    @Override
    public String getNombreFormato() {
        return "Microsoft Excel Spreadsheet";
    }
    
    @Override
    public boolean soportaMetadatos() {
        return false;
    }
}