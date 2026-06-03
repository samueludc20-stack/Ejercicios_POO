// Interfaz que define el contrato para todos los sistemas de almacenamiento
// DIP: Los módulos de alto nivel (GestorArchivos) dependen de esta abstracción
public interface Almacenamiento {
    
    /**
     * Guarda un archivo en el sistema de almacenamiento
     * @param archivo Archivo a guardar
     * @throws AlmacenamientoException Si ocurre un error durante el guardado
     */
    void guardarArchivo(Archivo archivo) throws AlmacenamientoException;
    
    /**
     * Recupera un archivo por su nombre
     * @param nombre Nombre del archivo a buscar
     * @return Optional con el archivo si existe, vacío si no
     * @throws AlmacenamientoException Si ocurre un error durante la recuperación
     */
    Optional<Archivo> recuperarArchivo(String nombre) throws AlmacenamientoException;
    
    /**
     * Elimina un archivo del sistema de almacenamiento
     * @param nombre Nombre del archivo a eliminar
     * @return true si el archivo fue eliminado, false si no existía
     * @throws AlmacenamientoException Si ocurre un error durante la eliminación
     */
    boolean eliminarArchivo(String nombre) throws AlmacenamientoException;
    
    /**
     * Lista todos los archivos disponibles
     * @return Lista de nombres de archivos
     * @throws AlmacenamientoException Si ocurre un error al listar
     */
    List<String> listarArchivos() throws AlmacenamientoException;
    
    /**
     * Verifica si un archivo existe
     * @param nombre Nombre del archivo
     * @return true si el archivo existe
     * @throws AlmacenamientoException Si ocurre un error en la verificación
     */
    boolean existeArchivo(String nombre) throws AlmacenamientoException;
}