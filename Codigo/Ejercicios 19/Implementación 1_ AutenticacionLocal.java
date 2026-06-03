// Implementación concreta de autenticación local (base de datos local)
// DIP: Los detalles dependen de la abstracción
public class AutenticacionLocal implements ServicioAutenticacion {
    private Map<String, Usuario> usuariosRegistrados;
    private Set<String> sesionesActivas;
    
    public AutenticacionLocal() {
        this.usuariosRegistrados = new HashMap<>();
        this.sesionesActivas = new HashSet<>();
        // Datos de ejemplo
        usuariosRegistrados.put("admin@empresa.com", new Usuario("U001", "Admin", "admin@empresa.com", "ADMIN"));
        usuariosRegistrados.put("juan.perez@empresa.com", new Usuario("U002", "Juan Pérez", "juan.perez@empresa.com", "USER"));
        usuariosRegistrados.put("maria.gomez@empresa.com", new Usuario("U003", "María Gómez", "maria.gomez@empresa.com", "USER"));
        
        // Almacenar contraseñas (en un sistema real estarían hasheadas)
        // En este ejemplo usamos un mapa separado para simplificar
    }
    
    private Map<String, String> obtenerContrasenas() {
        Map<String, String> contrasenas = new HashMap<>();
        contrasenas.put("admin@empresa.com", "admin123");
        contrasenas.put("juan.perez@empresa.com", "juan123");
        contrasenas.put("maria.gomez@empresa.com", "maria123");
        return contrasenas;
    }
    
    @Override
    public Usuario autenticar(String credenciales, String password) throws AutenticacionException {
        System.out.println("[AutenticacionLocal] Verificando credenciales para: " + credenciales);
        
        // Verificar si el usuario existe
        if (!usuariosRegistrados.containsKey(credenciales)) {
            throw new AutenticacionException("Usuario no encontrado: " + credenciales);
        }
        
        // Verificar contraseña
        Map<String, String> contrasenas = obtenerContrasenas();
        if (!contrasenas.containsKey(credenciales) || !contrasenas.get(credenciales).equals(password)) {
            throw new AutenticacionException("Contraseña incorrecta para: " + credenciales);
        }
        
        // Autenticación exitosa
        Usuario usuario = usuariosRegistrados.get(credenciales);
        sesionesActivas.add(usuario.getId());
        System.out.println("[AutenticacionLocal] Autenticación exitosa para: " + usuario.getNombre());
        
        return usuario;
    }
    
    @Override
    public boolean tieneSesionActiva(String idUsuario) {
        return sesionesActivas.contains(idUsuario);
    }
    
    @Override
    public void cerrarSesion(String idUsuario) {
        sesionesActivas.remove(idUsuario);
        System.out.println("[AutenticacionLocal] Sesión cerrada para usuario: " + idUsuario);
    }
}