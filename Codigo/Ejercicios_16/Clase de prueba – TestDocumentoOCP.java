import java.time.LocalDateTime;

public class TestDocumentoOCP {
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio OCP con Documentos ===\n");
        
        // Crear documentos
        Documento doc1 = new Documento("DOC001", "Informe Anual 2024", 
                "Este es el informe anual de la empresa con todos los resultados financieros...", 
                "Juan Pérez");
        doc1.agregarEtiqueta("finanzas");
        doc1.agregarEtiqueta("anual");
        
        Documento doc2 = new Documento("DOC002", "Manual de Usuario", 
                "Instrucciones detalladas para el uso del software...", 
                "María García");
        doc2.agregarEtiqueta("manual");
        doc2.agregarEtiqueta("usuario");
        
        Documento doc3 = new Documento("DOC003", "Propuesta Comercial", 
                "Propuesta de servicios para el cliente XYZ...", 
                "Carlos López");
        doc3.agregarEtiqueta("comercial");
        doc3.agregarEtiqueta("propuesta");
        
        // Gestor de documentos
        GestorDocumentos gestor = new GestorDocumentos();
        gestor.agregarDocumento(doc1);
        gestor.agregarDocumento(doc2);
        gestor.agregarDocumento(doc3);
        
        // Diferentes exportadores (todos implementan Exportador)
        Exportador exportadorPDF = new ExportadorPDF();
        Exportador exportadorWord = new ExportadorWord(true);
        Exportador exportadorExcel = new ExportadorExcel(false);
        Exportador exportadorHTML = new ExportadorHTML(true);
        
        System.out.println("\n=== EXPORTACIONES INDIVIDUALES ===");
        
        System.out.println("\n--- Exportación a PDF ---");
        gestor.exportarDocumento(doc1, exportadorPDF, "export/reporte");
        
        System.out.println("\n--- Exportación a Word ---");
        gestor.exportarDocumento(doc2, exportadorWord, "export/manual");
        
        System.out.println("\n--- Exportación a Excel ---");
        gestor.exportarDocumento(doc3, exportadorExcel, "export/propuesta");
        
        System.out.println("\n--- Exportación a HTML ---");
        gestor.exportarDocumento(doc1, exportadorHTML, "web/informe");
        
        System.out.println("\n=== EXPORTACIÓN MÚLTIPLE ===");
        System.out.println("\n--- Exportando todos a PDF ---");
        gestor.exportarTodos(exportadorPDF, "export/pdf");
        
        System.out.println("\n--- Exportando todos a Word ---");
        gestor.exportarTodos(exportadorWord, "export/word");
        
        System.out.println("\n=== DEMOSTRACIÓN DE EXTENSIBILIDAD ===");
        System.out.println("Para agregar un nuevo formato de exportación (ej: JSON, XML, CSV):");
        System.out.println("1. Crear una nueva clase que implemente Exportador");
        System.out.println("2. Implementar el método exportar()");
        System.out.println("3. ¡GestorDocumentos no necesita ninguna modificación!");
        
        // Mostrar todos los formatos disponibles
        System.out.println("\n=== FORMATOS DISPONIBLES ===");
        List<Exportador> formatosDisponibles = new ArrayList<>();
        formatosDisponibles.add(exportadorPDF);
        formatosDisponibles.add(exportadorWord);
        formatosDisponibles.add(exportadorExcel);
        formatosDisponibles.add(exportadorHTML);
        
        for (Exportador f : formatosDisponibles) {
            System.out.println("• " + f.getNombreFormato() + " (" + f.getExtension() + ")" +
                    (f.soportaMetadatos() ? " - Con soporte de metadatos" : ""));
        }
    }
}