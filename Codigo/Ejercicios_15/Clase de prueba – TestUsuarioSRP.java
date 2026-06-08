import java.time.LocalDateTime;

public class TestUsuarioSRP {
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio SRP con Autenticación ===\n");
        
        // Servicios
        ValidadorUsuario validador = new ValidadorUsuario();
        AutenticacionService authService = new AutenticacionService();
        
        // 1. Validación de datos
        System.out.println("--- 1. Validación de Datos de Usuario ---");
        
        String username = "juan_perez";
        String email = "juan@example.com";
        String password = "SecurePass123";
        String rol = "USER";
        
        System.out.println("Validando username '" + username + "': " + 
                (validador.validarUsername(username) ? "✓ Válido" : "✗ Inválido"));
        System.out.println("Validando email '" + email + "': " + 
                (validador.validarEmail(email) ? "✓ Válido" : "✗ Inválido"));
        System.out.println("Validando contraseña: " + 
                (validador.validarPassword(password) ? "✓ Válida" : "✗ Inválida"));
        
        // 2. Crear usuario (con hash de contraseña)
        System.out.println("\n--- 2. Creación de Usuario ---");
        String passwordHash = authService.generarHash(password);
        Usuario usuario = new Usuario("U001", username, email, passwordHash, rol);
        System.out.println("Usuario creado: " + usuario);
        
        // 3. Validación completa
        System.out.println("\n--- 3. Validación Completa ---");
        ValidadorUsuario.ResultadoValidacion resultado = 
                validador.validarUsuario(usuario, password);
        resultado.mostrarErrores();
        
        // 4. Autenticación
        System.out.println("\n--- 4. Autenticación ---");
        System.out.println("Intentando autenticar con contraseña correcta:");
        authService.autenticar(usuario, password);
        
        System.out.println("\nIntentando autenticar con contraseña incorrecta:");
        authService.autenticar(usuario, "WrongPassword");
        
        // 5. Verificación de permisos
        System.out.println("\n--- 5. Verificación de Permisos ---");
        System.out.println("Permiso LECTURA: " + 
                (authService.tienePermiso(usuario, "LECTURA") ? "✓ Permitido" : "✗ Denegado"));
        System.out.println("Permiso ESCRITURA: " + 
                (authService.tienePermiso(usuario, "ESCRITURA") ? "✓ Permitido" : "✗ Denegado"));
        System.out.println("Permiso ADMIN: " + 
                (authService.tienePermiso(usuario, "ADMIN") ? "✓ Permitido" : "✗ Denegado"));
        
        // 6. Cambio de contraseña
        System.out.println("\n--- 6. Cambio de Contraseña ---");
        authService.cambiarPassword(usuario, password, "NewSecurePass456");
        
        // 7. Verificar nuevo login
        System.out.println("\n--- 7. Verificación con Nueva Contraseña ---");
        authService.autenticar(usuario, "NewSecurePass456");
        
        // 8. Usuario ADMIN (demostración adicional)
        System.out.println("\n--- 8. Usuario Admin (Demostración) ---");
        Usuario admin = new Usuario("U002", "admin", "admin@system.com", 
                authService.generarHash("AdminPass123"), "ADMIN");
        
        System.out.println("Permisos del ADMIN:");
        System.out.println("  LECTURA: " + (authService.tienePermiso(admin, "LECTURA") ? "✓" : "✗"));
        System.out.println("  ESCRITURA: " + (authService.tienePermiso(admin, "ESCRITURA") ? "✓" : "✗"));
        System.out.println("  ELIMINAR: " + (authService.tienePermiso(admin, "ELIMINAR") ? "✓" : "✗"));
        System.out.println("  ADMIN: " + (authService.tienePermiso(admin, "ADMIN") ? "✓" : "✗"));
    }
}