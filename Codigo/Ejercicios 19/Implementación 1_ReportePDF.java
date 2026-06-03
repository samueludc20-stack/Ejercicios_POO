// Implementación concreta de generación de reportes PDF
// DIP: Los detalles dependen de la abstracción
public class ReportePDF implements GeneradorReporte {
    private String rutaSalida;
    private boolean incluirMarcaAgua;
    private String colorTema;
    
    public ReportePDF(String rutaSalida) {
        this.rutaSalida = rutaSalida;
        this.incluirMarcaAgua = false;
        this.colorTema = "Azul";
    }
    
    public ReportePDF(String rutaSalida, boolean incluirMarcaAgua, String colorTema) {
        this.rutaSalida = rutaSalida;
        this.incluirMarcaAgua = incluirMarcaAgua;
        this.colorTema = colorTema;
    }
    
    @Override
    public String generar(DatosReporte datos) {
        System.out.println("[ReportePDF] Generando reporte en formato PDF");
        System.out.println("  Configuración:");
        System.out.println("    - Ruta salida: " + rutaSalida);
        System.out.println("    - Marca de agua: " + (incluirMarcaAgua ? "Sí" : "No"));
        System.out.println("    - Color tema: " + colorTema);
        
        // Simular generación del PDF
        System.out.println("\n  --- Contenido del PDF ---");
        System.out.println("  Título: " + datos.getTitulo());
        System.out.println("  Autor: " + datos.getAutor());
        System.out.println("  Fecha: " + datos.getFechaGeneracion());
        System.out.println("  Metadatos: " + datos.getMetadatos());
        
        if (!datos.getEncabezados().isEmpty()) {
            System.out.println("  Encabezados: " + String.join(" | ", datos.getEncabezados()));
        }
        
        for (List<Object> fila : datos.getFilas()) {
            System.out.print("  Fila: ");
            for (Object valor : fila) {
                System.out.print(valor + " | ");
            }
            System.out.println();
        }
        
        String nombreArchivo = rutaSalida + "/" + datos.getTitulo().replace(" ", "_") + ".pdf";
        System.out.println("\n  ✓ PDF generado exitosamente: " + nombreArchivo);
        
        return nombreArchivo;
    }
    
    @Override
    public String getFormato() {
        return "pdf";
    }
    
    @Override
    public boolean validarDatos(DatosReporte datos) {
        if (datos == null) {
            System.out.println("[ReportePDF] Error: Datos nulos");
            return false;
        }
        if (datos.getTitulo() == null || datos.getTitulo().isEmpty()) {
            System.out.println("[ReportePDF] Error: El título es requerido");
            return false;
        }
        return true;
    }
    
    // Métodos específicos de PDF (NO violan DIP porque son adicionales)
    public void agregarMarcaAgua(String texto) {
        this.incluirMarcaAgua = true;
        System.out.println("[ReportePDF] Marca de agua agregada: " + texto);
    }
    
    public void protegerConContrasena(String contrasena) {
        System.out.println("[ReportePDF] PDF protegido con contraseña");
    }
}