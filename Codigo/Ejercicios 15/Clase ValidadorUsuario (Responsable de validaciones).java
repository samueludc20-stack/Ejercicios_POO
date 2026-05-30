// Clase ValidadorUsuario - Responsabilidad Única: Validar datos de usuarios
import java.util.regex.Pattern;

public class ValidadorUsuario {
    
    // Patrones de validación
    private static final Pattern EMAIL_PATTERN = 
            Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private static final Pattern USERNAME_PATTERN = 
            Pattern.compile("^[a-zA-Z0-9_]{3,20}$");
    private static final Pattern PASSWORD_PATTERN = 
            Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{6,}$");
    
    // Validar email
    public boolean validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
    
    // Validar username
    public boolean validarUsername(String username) {
        if (username == null) {
            return false;
        }
        return USERNAME_PATTERN.matcher(username).matches();
    }
    
    // Validar contraseña (fortaleza)
    public boolean validarPassword(String password) {
        if (password == null) {
            return false;
        }
        return PASSWORD_PATTERN.matcher(password).matches();
    }
    
    // Validar usuario completo
    public ResultadoValidacion validarUsuario(Usuario usuario, String passwordPlano) {
        ResultadoValidacion resultado = new ResultadoValidacion();
        
        if (!validarUsername(usuario.getUsername())) {
            resultado.addError("El username debe tener entre 3 y 20 caracteres alfanuméricos o guión bajo");
        }
        
        if (!validarEmail(usuario.getEmail())) {
            resultado.addError("El email no es válido");
        }
        
        if (!validarPassword(passwordPlano)) {
            resultado.addError("La contraseña debe tener al menos 6 caracteres, incluyendo mayúscula, minúscula y número");
        }
        
        if (usuario.getRol() == null || 
            (!usuario.getRol().equals("ADMIN") && 
             !usuario.getRol().equals("USER") && 
             !usuario.getRol().equals("GUEST"))) {
            resultado.addError("El rol debe ser ADMIN, USER o GUEST");
        }
        
        resultado.setValido(resultado.getErrores().isEmpty());
        return resultado;
    }
    
    // Clase auxiliar para resultados de validación
    public static class ResultadoValidacion {
        private boolean valido;
        private List<String> errores;
        
        public ResultadoValidacion() {
            this.valido = true;
            this.errores = new ArrayList<>();
        }
        
        public void addError(String error) {
            errores.add(error);
            valido = false;
        }
        
        public boolean isValid() { return valido; }
        public void setValido(boolean valido) { this.valido = valido; }
        public List<String> getErrores() { return errores; }
        
        public void mostrarErrores() {
            if (!valido) {
                System.out.println("Errores de validación:");
                for (String error : errores) {
                    System.out.println("  ✗ " + error);
                }
            } else {
                System.out.println("  ✓ Todos los datos son válidos");
            }
        }
    }
}