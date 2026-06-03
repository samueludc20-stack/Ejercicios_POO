// Implementación concreta de almacenamiento en la nube (simulado)
// DIP: Los detalles dependen de la abstracción
public class AlmacenamientoNube implements Almacenamiento {
    private String proveedor; // AWS, Google Cloud, Azure
    private String bucketName;
    private Map<String, Archivo> archivosNube;
    
    public AlmacenamientoNube(String proveedor, String bucketName) {
        this.proveedor = proveedor;
        this.bucketName = bucketName;
        this.archivosNube = new HashMap<>();
        System.out.println("[AlmacenamientoNube] Conectado a " + proveedor + " - Bucket: " + bucketName);
        
        // Simular conexión a la nube y algunos archivos
        inicializarArchivosEjemplo();
    }
    
    private void inicializarArchivosEjemplo() {
        archivosNube.put("reporte_mensual.pdf", new Archivo("reporte_mensual.pdf", "Contenido del reporte mensual...", "pdf"));
        archivosNube.put("backup_datos.zip", new Archivo("backup_datos.zip", "Datos comprimidos del backup...", "zip"));
        archivosNube.put("imagen_producto.jpg", new Archivo("imagen_producto.jpg", "[DATOS_BINARIOS_IMAGEN]", "jpg"));
    }
    
    @Override
    public void guardarArchivo(Archivo archivo) throws AlmacenamientoException {
        if (archivo == null || archivo.getNombre() == null || archivo.getNombre().isEmpty()) {
            throw new AlmacenamientoException("Archivo inválido para guardar en la nube");
        }
        
        System.out.println("[AlmacenamientoNube] Subiendo archivo a la nube");
        System.out.println("  Proveedor: " + proveedor);
        System.out.println("  Bucket: " + bucketName);
        System.out.println("  Archivo: " + archivo.getNombre());
        
        // Simular latencia de red
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        archivosNube.put(archivo.getNombre(), archivo);
        System.out.println("  ✓ Archivo subido exitosamente a la nube");
    }
    
    @Override
    public Optional<Archivo> recuperarArchivo(String nombre) throws AlmacenamientoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new AlmacenamientoException("Nombre de archivo inválido");
        }
        
        System.out.println("[AlmacenamientoNube] Descargando archivo desde la nube");
        System.out.println("  Archivo solicitado: " + nombre);
        
        // Simular latencia de red
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        if (archivosNube.containsKey(nombre)) {
            Archivo archivo = archivosNube.get(nombre);
            System.out.println("  ✓ Archivo descargado: " + archivo);
            return Optional.of(archivo);
        } else {
            System.out.println("  ✗ Archivo no encontrado en la nube: " + nombre);
            return Optional.empty();
        }
    }
    
    @Override
    public boolean eliminarArchivo(String nombre) throws AlmacenamientoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new AlmacenamientoException("Nombre de archivo inválido");
        }
        
        System.out.println("[AlmacenamientoNube] Eliminando archivo de la nube: " + nombre);
        
        if (archivosNube.containsKey(nombre)) {
            archivosNube.remove(nombre);
            System.out.println("  ✓ Archivo eliminado de la nube");
            return true;
        } else {
            System.out.println("  ✗ Archivo no encontrado en la nube");
            return false;
        }
    }
    
    @Override
    public List<String> listarArchivos() throws AlmacenamientoException {
        System.out.println("[AlmacenamientoNube] Listando archivos desde la nube");
        List<String> lista = new ArrayList<>(archivosNube.keySet());
        System.out.println("  Archivos en la nube: " + lista.size());
        return lista;
    }
    
    @Override
    public boolean existeArchivo(String nombre) throws AlmacenamientoException {
        return archivosNube.containsKey(nombre);
    }
    
    public String getProveedor() {
        return proveedor;
    }
    
    public String getBucketName() {
        return bucketName;
    }
}