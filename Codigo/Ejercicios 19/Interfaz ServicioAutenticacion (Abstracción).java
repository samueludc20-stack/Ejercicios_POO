// Interfaz que define el contrato para todos los servicios de autenticación
// DIP: Los módulos de alto nivel (GestorAutenticacion) dependen de esta abstracción
public interface ServicioAutenticacion {
    
    /**
     * Autentica un usuario con credenciales proporcionadas
     * @param credenciales Identificador del usuario (email, username, etc.)
     * @param password Contraseña del usuario
     * @return Objeto Usuario si la autenticación es exitosa
     * @throws AutenticacionException Si las credenciales son inválidas
     */
    Usuario autenticar(String credenciales, String password) throws AutenticacionException;
    
    /**
     * Verifica si el usuario tiene una sesión activa
     * @param idUsuario Identificador del usuario
     * @return true si tiene sesión activa
     */
    boolean tieneSesionActiva(String idUsuario);
    
    /**
     * Cierra la sesión del usuario
     * @param idUsuario Identificador del usuario
     */
    void cerrarSesion(String idUsuario);
}