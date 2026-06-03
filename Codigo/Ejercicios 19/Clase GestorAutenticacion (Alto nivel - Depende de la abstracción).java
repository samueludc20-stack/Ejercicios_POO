// Clase de alto nivel que depende de la abstracción ServicioAutenticacion
// DIP: NO depende de implementaciones concretas (AutenticacionLocal o AutenticacionOAuth)
public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;
    private Usuario usuarioActual;
    
    // Inyección de dependencia por constructor
    // El gestor recibe la abstracción, no crea las dependencias internamente
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
        this.usuarioActual = null;
    }
    
    // Método para cambiar el servicio de autenticación en tiempo de ejecución
    public void setServicioAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
        System.out.println("[GestorAutenticacion] Servicio de autenticación cambiado");
    }
    
    public Usuario iniciarSesion(String credenciales, String password) throws AutenticacionException {
        System.out.println("\n[GestorAutenticacion] Intentando iniciar sesión para: " + credenciales);
        
        usuarioActual = servicioAutenticacion.autenticar(credenciales, password);
        
        System.out.println("[GestorAutenticacion] Sesión iniciada exitosamente");
        return usuarioActual;
    }
    
    public void cerrarSesion() {
        if (usuarioActual != null) {
            servicioAutenticacion.cerrarSesion(usuarioActual.getId());
            usuarioActual = null;
            System.out.println("[GestorAutenticacion] Sesión cerrada");
        } else {
            System.out.println("[GestorAutenticacion] No hay sesión activa para cerrar");
        }
    }
    
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
    
    public boolean haySesionActiva() {
        if (usuarioActual == null) {
            return false;
        }
        return servicioAutenticacion.tieneSesionActiva(usuarioActual.getId());
    }
    
    public boolean verificarPermiso(String rolRequerido) {
        if (usuarioActual == null) {
            System.out.println("No hay usuario autenticado");
            return false;
        }
        
        if (usuarioActual.getRol().equals("ADMIN") || usuarioActual.getRol().equals(rolRequerido)) {
            return true;
        }
        
        System.out.println("Usuario " + usuarioActual.getNombre() + " no tiene permiso " + rolRequerido);
        return false;
    }
}