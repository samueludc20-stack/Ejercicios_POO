// Implementación concreta de generación de reportes Excel
// DIP: Los detalles dependen de la abstracción
public class ReporteExcel implements GeneradorReporte {
    private String rutaSalida;
    private boolean autoAjustarColumnas;
    private String hojaNombre;
    
    public ReporteExcel(String rutaSalida) {
        this.rutaSalida = rutaSalida;
        this.autoAjustarColumnas = true;
        this.hojaNombre = "Reporte";
    }
    
    public ReporteExcel(String rutaSalida, boolean autoAjustarColumnas, String hojaNombre) {
        this.rutaSalida = rutaSalida;
        this.autoAjustarColumnas = autoAjustarColumnas;
        this.hojaNombre = hojaNombre;
    }
    
    @Override
    public String generar(DatosReporte datos) {
        System.out.println("[ReporteExcel] Generando reporte en formato Excel");
        System.out.println("  Configuración:");
        System.out.println("    - Ruta salida: " + rutaSalida);
        System.out.println("    - Auto ajustar columnas: " + (autoAjustarColumnas ? "Sí" : "No"));
        System.out.println("    - Nombre hoja: " + hojaNombre);
        
        // Simular generación del Excel
        System.out.println("\n  --- Contenido del Excel ---");
        System.out.println("  Libro: " + datos.getTitulo());
        System.out.println("  Creado por: " + datos.getAutor());
        System.out.println("  Fecha: " + datos.getFechaGeneracion());
        
        // Crear la hoja
        System.out.println("  Hoja: " + hojaNombre);
        
        // Agregar encabezados
        if (!datos.getEncabezados().isEmpty()) {
            System.out.print("  Fila1 (Encabezados): ");
            for (String enc : datos.getEncabezados()) {
                System.out.print("[" + enc + "] ");
            }
            System.out.println();
        }
        
        // Agregar datos
        int rowNum = 2;
        for (List<Object> fila : datos.getFilas()) {
            System.out.print("  Fila" + rowNum + ": ");
            for (Object valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
            rowNum++;
        }
        
        // Información de resumen
        System.out.println("\n  Resumen:");
        System.out.println("    - Total filas de datos: " + datos.getFilas().size());
        System.out.println("    - Total columnas: " + datos.getEncabezados().size());
        
        if (autoAjustarColumnas) {
            System.out.println("    - Columnas autoajustadas al contenido");
        }
        
        String nombreArchivo = rutaSalida + "/" + datos.getTitulo().replace(" ", "_") + ".xlsx";
        System.out.println("\n  ✓ Excel generado exitosamente: " + nombreArchivo);
        
        return nombreArchivo;
    }
    
    @Override
    public String getFormato() {
        return "xlsx";
    }
    
    @Override
    public boolean validarDatos(DatosReporte datos) {
        if (datos == null) {
            System.out.println("[ReporteExcel] Error: Datos nulos");
            return false;
        }
        if (datos.getTitulo() == null || datos.getTitulo().isEmpty()) {
            System.out.println("[ReporteExcel] Error: El título es requerido");
            return false;
        }
        return true;
    }
    
    // Métodos específicos de Excel (NO violan DIP)
    public void agregarGrafico(String tipo, String rangoDatos) {
        System.out.println("[ReporteExcel] Agregando gráfico " + tipo + " con datos: " + rangoDatos);
    }
    
    public void aplicarFormatoCondicional(String rango, String condicion) {
        System.out.println("[ReporteExcel] Aplicando formato condicional a " + rango);
    }
}