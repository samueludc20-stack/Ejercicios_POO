// Esta clase NO necesita cambiar cuando se agregan nuevos formatos de exportación
public class GestorDocumentos {
    private List<Documento> documentos;
    
    public GestorDocumentos() {
        this.documentos = new ArrayList<>();
    }
    
    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
        System.out.println("Documento agregado: " + documento.getTitulo());
    }
    
    // Método polimórfico - acepta cualquier Exportador
    public void exportarDocumento(Documento documento, Exportador exportador, String rutaBase) {
        System.out.println("\n📄 Exportando: " + documento.getTitulo());
        System.out.println("Formato seleccionado: " + exportador.getNombreFormato());
        exportador.exportar(documento, rutaBase + "_" + documento.getId());
    }
    
    // Exportar todos los documentos a un formato
    public void exportarTodos(Exportador exportador, String directorio) {
        System.out.println("\n📁 Exportando " + documentos.size() + " documentos a " + exportador.getNombreFormato());
        for (Documento doc : documentos) {
            exportarDocumento(doc, exportador, directorio + "/" + doc.getTitulo().replace(" ", "_"));
        }
    }
    
    public List<Documento> getDocumentos() {
        return documentos;
    }
}