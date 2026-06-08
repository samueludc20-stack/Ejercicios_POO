// VIOLACIÓN DEL OCP - Cada nuevo formato requiere modificar esta clase
public class DocumentoOriginal {
    private String titulo;
    private String contenido;
    private String autor;
    
    public void exportarPDF() {
        System.out.println("Exportando a PDF: " + titulo);
        // Lógica de exportación a PDF
    }
    
    public void exportarWord() {  // Se modifica la clase para agregar Word
        System.out.println("Exportando a Word: " + titulo);
    }
    
    public void exportarExcel() {  // Se modifica la clase para agregar Excel
        System.out.println("Exportando a Excel: " + titulo);
    }
}