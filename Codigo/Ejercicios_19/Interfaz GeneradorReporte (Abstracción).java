// Interfaz que define el contrato para todos los generadores de reportes
// DIP: Los módulos de alto nivel (GestorReportes) dependen de esta abstracción
public interface GeneradorReporte {
    
    /**
     * Genera un reporte a partir de los datos proporcionados
     * @param datos Datos del reporte
     * @return Ruta o nombre del archivo generado
     */
    String generar(DatosReporte datos);
    
    /**
     * Obtiene el formato del reporte generado
     * @return Extensión/formato del reporte (ej: "pdf", "xlsx")
     */
    String getFormato();
    
    /**
     * Valida si los datos son válidos para generar el reporte
     * @param datos Datos a validar
     * @return true si los datos son válidos
     */
    boolean validarDatos(DatosReporte datos);
}