// Clase de prueba - Demuestra el cumplimiento del DIP
public class TestAutenticacionDIP {
    
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio DIP - Sistema de Autenticación ===\n");
        
        // DIP: El GestorAutenticacion puede trabajar con CUALQUIER servicio que implemente la interfaz
        // PRIMERA CONFIGURACIÓN: Autenticación Local
        System.out.println("--- Configuración 1: Usando Autenticación Local ---");
        ServicioAutenticacion servicioLocal = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(servicioLocal);
        
        try {
            Usuario usuario = gestor.iniciarSesion("juan.perez@empresa.com", "juan123");
            System.out.println("Usuario autenticado: " + usuario);
            System.out.println("¿Sesión activa? " + gestor.haySesionActiva());
            
            // Verificar permisos
            System.out.println("¿Tiene permiso USER? " + gestor.verificarPermiso("USER"));
            System.out.println("¿Tiene permiso ADMIN? " + gestor.verificarPermiso("ADMIN"));
            
            gestor.cerrarSesion();
            
        } catch (AutenticacionException e) {
            System.out.println("Error de autenticación: " + e.getMessage());
        }
        
        // SEGUNDA CONFIGURACIÓN: Autenticación OAuth
        System.out.println("\n--- Configuración 2: Usando Autenticación OAuth ---");
        ServicioAutenticacion servicioOAuth = new AutenticacionOAuth("google");
        
        // El mismo gestor puede cambiar de servicio sin modificar su código
        gestor.setServicioAutenticacion(servicioOAuth);
        
        try {
            Usuario usuario = gestor.iniciarSesion("google-12345", "google");
            System.out.println("Usuario autenticado vía OAuth: " + usuario);
            System.out.println("¿Sesión activa? " + gestor.haySesionActiva());
            
            gestor.cerrarSesion();
            
        } catch (AutenticacionException e) {
            System.out.println("Error de autenticación OAuth: " + e.getMessage());
        }
        
        // TERCERA CONFIGURACIÓN: Intentar autenticación con credenciales incorrectas
        System.out.println("\n--- Configuración 3: Prueba de credenciales inválidas ---");
        gestor.setServicioAutenticacion(servicioLocal);
        
        try {
            gestor.iniciarSesion("usuario.inexistente@empresa.com", "password123");
        } catch (AutenticacionException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
        
        // Verificación de DIP
        System.out.println("\n=== Verificación del Principio DIP ===");
        System.out.println("✓ GestorAutenticacion depende de ServicioAutenticacion (abstracción)");
        System.out.println("✓ AutenticacionLocal implementa ServicioAutenticacion");
        System.out.println("✓ AutenticacionOAuth implementa ServicioAutenticacion");
        System.out.println("✓ Se puede cambiar el servicio de autenticación sin modificar GestorAutenticacion");
        System.out.println("✓ Las dependencias se inyectan desde el exterior (constructor)");
    }
}