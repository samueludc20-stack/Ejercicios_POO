// VIOLACIÓN DEL SRP: Esta clase tiene múltiples responsabilidades
public class Usuario {
    private String username;
    private String email;
    private String password;
    private String rol;
    private boolean activo;
    
    // Constructor
    public Usuario(String username, String email, String password, String rol) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.activo = true;
    }
    
    // === RESPONSABILIDAD 1: Datos del usuario ===
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRol() { return rol; }
    public boolean isActivo() { return activo; }
    
    // === RESPONSABILIDAD 2: Autenticación ===
    public boolean autenticar(String passwordIngresada) {
        return this.password.equals(passwordIngresada) && this.activo;
    }
    
    public boolean tienePermiso(String permisoRequerido) {
        if (rol.equals("ADMIN")) return true;
        if (rol.equals("USER") && permisoRequerido.equals("LECTURA")) return true;
        return false;
    }
    
    // === RESPONSABILIDAD 3: Validación ===
    public boolean validarEmail() {
        return email != null && email.contains("@") && email.contains(".");
    }
    
    public boolean validarPassword() {
        return password != null && password.length() >= 6 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*[0-9].*");
    }
    
    public boolean validarUsername() {
        return username != null && username.length() >= 3 && username.length() <= 20 &&
               username.matches("^[a-zA-Z0-9_]+$");
    }
}