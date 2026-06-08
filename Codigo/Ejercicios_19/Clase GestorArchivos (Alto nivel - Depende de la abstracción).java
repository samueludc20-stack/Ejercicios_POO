// Clase de alto nivel que depende de la abstracción Almacenamiento
// DIP: NO depende de implementaciones concretas (AlmacenamientoLocal o AlmacenamientoNube)
public class GestorArchivos {
    private Almacenamiento almacenamiento;
    
    // Inyección de dependencia por constructor
    // El gestor recibe la abstracción, no crea las dependencias internamente
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
        System.out.println("[GestorArchivos] Inicializado con sistema de almacenamiento");
    }
    
    // Método para cambiar la estrategia de almacenamiento en tiempo de ejecución
    public void cambiarAlmacenamiento(Almacenamiento nuevoAlmacenamiento) {
        this.almacenamiento = nuevoAlmacenamiento;
        System.out.println("[GestorArchivos] Sistema de almacenamiento cambiado");
    }
    
    public void guardarArchivo(Archivo archivo) throws AlmacenamientoException {
        System.out.println("\n[GestorArchivos] Solicitando guardado de archivo: " + archivo.getNombre());
        almacenamiento.guardarArchivo(archivo);
        System.out.println("[GestorArchivos] Archivo guardado exitosamente");
    }
    
    public Optional<Archivo> recuperarArchivo(String nombre) throws AlmacenamientoException {
        System.out.println("\n[GestorArchivos] Solicitando recuperación de archivo: " + nombre);
        Optional<Archivo> resultado = almacenamiento.recuperarArchivo(nombre);
        
        if (resultado.isPresent()) {
            System.out.println("[GestorArchivos] Archivo recuperado: " + resultado.get().getNombre());
        } else {
            System.out.println("[GestorArchivos] Archivo no encontrado: " + nombre);
        }
        
        return resultado;
    }
    
    public boolean eliminarArchivo(String nombre) throws AlmacenamientoException {
        System.out.println("\n[GestorArchivos] Solicitando eliminación de archivo: " + nombre);
        boolean eliminado = almacenamiento.eliminarArchivo(nombre);
        
        if (eliminado) {
            System.out.println("[GestorArchivos] Archivo eliminado: " + nombre);
        } else {
            System.out.println("[GestorArchivos] No se pudo eliminar el archivo: " + nombre);
        }
        
        return eliminado;
    }
    
    public void listarTodosLosArchivos() throws AlmacenamientoException {
        System.out.println("\n[GestorArchivos] Solicitando lista de archivos");
        List<String> archivos = almacenamiento.listarArchivos();
        
        System.out.println("[GestorArchivos] Archivos disponibles (" + archivos.size() + "):");
        for (String nombre : archivos) {
            System.out.println("  - " + nombre);
        }
    }
    
    public void mostrarInfoArchivo(String nombre) throws AlmacenamientoException {
        System.out.println("\n[GestorArchivos] Mostrando información del archivo: " + nombre);
        
        Optional<Archivo> archivoOpt = almacenamiento.recuperarArchivo(nombre);
        
        if (archivoOpt.isPresent()) {
            Archivo archivo = archivoOpt.get();
            System.out.println("  Nombre: " + archivo.getNombre());
            System.out.println("  Tipo: " + archivo.getTipo());
            System.out.println("  Tamaño: " + archivo.getTamanio() + " bytes");
            System.out.println("  Última modificación: " + archivo.getFechaModificacion());
            System.out.println("  Contenido: " + archivo.getContenido().substring(0, Math.min(50, archivo.getContenido().length())) + "...");
        } else {
            System.out.println("  Archivo no encontrado: " + nombre);
        }
    }
}