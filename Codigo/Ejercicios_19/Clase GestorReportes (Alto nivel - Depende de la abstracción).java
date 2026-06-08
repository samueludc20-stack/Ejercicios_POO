// Clase de alto nivel que depende de la abstracción GeneradorReporte
// DIP: NO depende de implementaciones concretas (ReportePDF o ReporteExcel)
public class GestorReportes {
    private GeneradorReporte generador;
    private List<String> historialReportes;
    
    // Inyección de dependencia por constructor
    // El gestor recibe la abstracción, no crea las dependencias internamente
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
        this.historialReportes = new ArrayList<>();
        System.out.println("[GestorReportes] Inicializado con generador de formato: " + generador.getFormato());
    }
    
    // Método para cambiar el generador en tiempo de ejecución
    public void cambiarGenerador(GeneradorReporte nuevoGenerador) {
        this.generador = nuevoGenerador;
        System.out.println("[GestorReportes] Generador cambiado a formato: " + generador.getFormato());
    }
    
    public String generarReporte(DatosReporte datos) {
        System.out.println("\n[GestorReportes] Solicitando generación de reporte");
        
        // Validar datos
        if (!generador.validarDatos(datos)) {
            System.out.println("[GestorReportes] Error: Datos inválidos para generar reporte");
            return null;
        }
        
        // Delegar la generación al generador concreto
        String archivoGenerado = generador.generar(datos);
        
        if (archivoGenerado != null) {
            historialReportes.add(archivoGenerado);
            System.out.println("[GestorReportes] Reporte generado exitosamente: " + archivoGenerado);
        }
        
        return archivoGenerado;
    }
    
    public void generarReporteConResumen(DatosReporte datos) {
        String archivo = generarReporte(datos);
        if (archivo != null) {
            System.out.println("\n[GestorReportes] Resumen del reporte:");
            System.out.println("  - Formato: " + generador.getFormato());
            System.out.println("  - Título: " + datos.getTitulo());
            System.out.println("  - Filas: " + datos.getFilas().size());
            System.out.println("  - Columnas: " + datos.getEncabezados().size());
            System.out.println("  - Ubicación: " + archivo);
        }
    }
    
    public void mostrarHistorial() {
        System.out.println("\n[GestorReportes] Historial de reportes generados:");
        if (historialReportes.isEmpty()) {
            System.out.println("  No hay reportes generados aún");
        } else {
            for (int i = 0; i < historialReportes.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + historialReportes.get(i));
            }
        }
    }
    
    public String getFormatoActual() {
        return generador.getFormato();
    }
}