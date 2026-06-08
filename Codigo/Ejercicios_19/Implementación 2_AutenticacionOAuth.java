// Implementación concreta de autenticación OAuth (Google, Facebook, etc.)
// DIP: Los detalles dependen de la abstracción
public class AutenticacionOAuth implements ServicioAutenticacion {
    private Map<String, Usuario> usuariosOAuth;
    private Set<String> sesionesActivas;
    private String proveedor; // Google, Facebook, GitHub
    
    public AutenticacionOAuth(String proveedor) {
        this.proveedor = proveedor;
        this.usuariosOAuth = new HashMap<>();
        this.sesionesActivas = new HashSet<>();
        
        // Datos de ejemplo (simulando usuarios de OAuth)
        usuariosOAuth.put("google-12345", new Usuario("O001", "Carlos López", "carlos@gmail.com", "USER"));
        usuariosOAuth.put("google-67890", new Usuario("O002", "Ana Rodríguez", "ana@gmail.com", "USER"));
        usuariosOAuth.put("fb-11111", new Usuario("O003", "Pedro Sánchez", "pedro@facebook.com", "USER"));
    }
    
    // Simula la autenticación con OAuth (recibe un token)
    @Override
    public Usuario autenticar(String tokenAcceso, String proveedorEsperado) throws AutenticacionException {
        System.out.println("[AutenticacionOAuth] Verificando token con proveedor: " + proveedor);
        
        // Simular validación de token OAuth
        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            throw new AutenticacionException("Token de acceso no proporcionado");
        }
        
        if (!proveedor.equals(proveedorEsperado)) {
            throw new AutenticacionException("Proveedor no coincide. Esperado: " + proveedor);
        }
        
        // En un sistema real, aquí se validaría el token con el proveedor OAuth
        // Para el ejemplo, verificamos si el token está en nuestro mapa
        if (!usuariosOAuth.containsKey(tokenAcceso)) {
            throw new AutenticacionException("Token OAuth inválido o expirado");
        }
        
        Usuario usuario = usuariosOAuth.get(tokenAcceso);
        sesionesActivas.add(usuario.getId());
        System.out.println("[AutenticacionOAuth] Autenticación OAuth exitosa para: " + usuario.getNombre());
        System.out.println("  Proveedor utilizado: " + proveedor);
        
        return usuario;
    }
    
    // Método específico para autenticación con código de autorización
    public Usuario autenticarConCodigo(String codigoAutorizacion, String redirectUri) throws AutenticacionException {
        System.out.println("[AutenticacionOAuth] Intercambiando código por token...");
        // Simular intercambio de código por token
        String tokenSimulado = "google-12345";
        return autenticar(tokenSimulado, proveedor);
    }
    
    @Override
    public boolean tieneSesionActiva(String idUsuario) {
        return sesionesActivas.contains(idUsuario);
    }
    
    @Override
    public void cerrarSesion(String idUsuario) {
        sesionesActivas.remove(idUsuario);
        System.out.println("[AutenticacionOAuth] Sesión OAuth cerrada para usuario: " + idUsuario);
    }
    
    public String getProveedor() {
        return proveedor;
    }
}