// Clase AutenticacionService - Responsabilidad Única: Manejar autenticación de usuarios
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Base64;

public class AutenticacionService {
    private ValidadorUsuario validador;
    
    public AutenticacionService() {
        this.validador = new ValidadorUsuario();
    }
    
    // Autenticar usuario
    public boolean autenticar(Usuario usuario, String passwordIngresada) {
        if (usuario == null || !usuario.isActivo()) {
            System.out.println("Autenticación fallida: Usuario no existe o está inactivo");
            return false;
        }
        
        String hashIngresado = generarHash(passwordIngresada);
        boolean autenticado = usuario.getPasswordHash().equals(hashIngresado);
        
        if (autenticado) {
            usuario.setUltimoAcceso(LocalDateTime.now());
            System.out.println("✓ Usuario '" + usuario.getUsername() + "' autenticado exitosamente");
        } else {
            System.out.println("✗ Autenticación fallida para usuario: " + usuario.getUsername());
        }
        
        return autenticado;
    }
    
    // Verificar permisos por rol
    public boolean tienePermiso(Usuario usuario, String permisoRequerido) {
        if (usuario == null || !usuario.isActivo()) {
            return false;
        }
        
        String rol = usuario.getRol();
        
        switch (rol) {
            case "ADMIN":
                return true;  // Admin tiene todos los permisos
            case "USER":
                return permisoRequerido.equals("LECTURA") || 
                       permisoRequerido.equals("ESCRITURA") ||
                       permisoRequerido.equals("PERFIL");
            case "GUEST":
                return permisoRequerido.equals("LECTURA");
            default:
                return false;
        }
    }
    
    // Generar hash de contraseña (simulado)
    public String generarHash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            return password;  // Fallback (no usar en producción)
        }
    }
    
    // Cambiar contraseña
    public boolean cambiarPassword(Usuario usuario, String oldPassword, String newPassword) {
        if (!autenticar(usuario, oldPassword)) {
            System.out.println("Error: Contraseña actual incorrecta");
            return false;
        }
        
        if (!validador.validarPassword(newPassword)) {
            System.out.println("Error: La nueva contraseña no cumple con los requisitos de seguridad");
            return false;
        }
        
        usuario.setPasswordHash(generarHash(newPassword));
        System.out.println("✓ Contraseña cambiada exitosamente para: " + usuario.getUsername());
        return true;
    }
}