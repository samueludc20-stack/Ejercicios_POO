// Implementación concreta de almacenamiento en disco local
// DIP: Los detalles dependen de la abstracción
public class AlmacenamientoLocal implements Almacenamiento {
    private String directorioBase;
    private Map<String, Archivo> archivosLocales;
    
    public AlmacenamientoLocal(String directorioBase) {
        this.directorioBase = directorioBase;
        this.archivosLocales = new HashMap<>();
        System.out.println("[AlmacenamientoLocal] Inicializado en directorio: " + directorioBase);
        
        // Crear algunos archivos de ejemplo
        inicializarArchivosEjemplo();
    }
    
    private void inicializarArchivosEjemplo() {
        archivosLocales.put("documento.txt", new Archivo("documento.txt", "Este es el contenido del documento", "texto"));
        archivosLocales.put("datos.csv", new Archivo("datos.csv", "nombre,edad,cargo\nJuan,30,Analista\nMaria,25,Desarrollador", "csv"));
        archivosLocales.put("config.json", new Archivo("config.json", "{\"version\": \"1.0\", \"ambiente\": \"desarrollo\"}", "json"));
    }
    
    @Override
    public void guardarArchivo(Archivo archivo) throws AlmacenamientoException {
        if (archivo == null || archivo.getNombre() == null || archivo.getNombre().isEmpty()) {
            throw new AlmacenamientoException("Archivo inválido para guardar");
        }
        
        System.out.println("[AlmacenamientoLocal] Guardando archivo: " + archivo.getNombre());
        archivosLocales.put(archivo.getNombre(), archivo);
        System.out.println("  ✓ Archivo guardado exitosamente en disco local");
    }
    
    @Override
    public Optional<Archivo> recuperarArchivo(String nombre) throws AlmacenamientoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new AlmacenamientoException("Nombre de archivo inválido");
        }
        
        System.out.println("[AlmacenamientoLocal] Recuperando archivo: " + nombre);
        
        if (archivosLocales.containsKey(nombre)) {
            Archivo archivo = archivosLocales.get(nombre);
            System.out.println("  ✓ Archivo encontrado: " + archivo);
            return Optional.of(archivo);
        } else {
            System.out.println("  ✗ Archivo no encontrado: " + nombre);
            return Optional.empty();
        }
    }
    
    @Override
    public boolean eliminarArchivo(String nombre) throws AlmacenamientoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new AlmacenamientoException("Nombre de archivo inválido");
        }
        
        System.out.println("[AlmacenamientoLocal] Eliminando archivo: " + nombre);
        
        if (archivosLocales.containsKey(nombre)) {
            archivosLocales.remove(nombre);
            System.out.println("  ✓ Archivo eliminado");
            return true;
        } else {
            System.out.println("  ✗ Archivo no encontrado, no se eliminó nada");
            return false;
        }
    }
    
    @Override
    public List<String> listarArchivos() throws AlmacenamientoException {
        System.out.println("[AlmacenamientoLocal] Listando archivos");
        List<String> lista = new ArrayList<>(archivosLocales.keySet());
        System.out.println("  Archivos encontrados: " + lista.size());
        return lista;
    }
    
    @Override
    public boolean existeArchivo(String nombre) throws AlmacenamientoException {
        return archivosLocales.containsKey(nombre);
    }
    
    public String getDirectorioBase() {
        return directorioBase;
    }
}