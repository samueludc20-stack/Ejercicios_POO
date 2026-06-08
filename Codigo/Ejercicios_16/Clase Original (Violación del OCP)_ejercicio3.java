// VIOLACIÓN DEL OCP - Solo maneja emails, cada nuevo canal requiere modificación
public class MensajeroOriginal {
    private String servidorSMTP;
    private String usuarioEmail;
    
    public void enviarEmail(String destinatario, String asunto, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
    }
    
    // Para agregar SMS habría que modificar esta clase
    public void enviarSMS(String numero, String mensaje) {
        // Esto viola OCP porque modificamos la clase existente
        System.out.println("Enviando SMS a: " + numero);
    }
}