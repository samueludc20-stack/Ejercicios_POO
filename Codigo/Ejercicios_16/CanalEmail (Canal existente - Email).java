// Canal de Email - Extensión existente
public class CanalEmail implements CanalMensaje {
    private String servidorSMTP;
    private int puerto;
    private String usuario;
    private boolean usarSSL;
    
    public CanalEmail(String servidorSMTP, int puerto, String usuario, boolean usarSSL) {
        this.servidorSMTP = servidorSMTP;
        this.puerto = puerto;
        this.usuario = usuario;
        this.usarSSL = usarSSL;
    }
    
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("\n📧 ENVIANDO EMAIL");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Servidor SMTP: " + servidorSMTP + ":" + puerto);
        System.out.println("Usuario: " + usuario);
        System.out.println("SSL: " + (usarSSL ? "Activado" : "Desactivado"));
        System.out.println("Destinatario: " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("[Conectando al servidor de correo...]");
        System.out.println("✓ Email enviado exitosamente");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
    
    public void enviarConAsunto(String destino, String asunto, String mensaje) {
        System.out.println("\n📧 ENVIANDO EMAIL CON ASUNTO");
        System.out.println("Para: " + destino);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("✓ Email enviado");
    }
    
    @Override
    public String getNombreCanal() {
        return "Correo Electrónico (Email)";
    }
    
    @Override
    public boolean validarDestino(String destino) {
        return destino != null && destino.contains("@") && destino.contains(".");
    }
    
    @Override
    public int getLimiteCaracteres() {
        return Integer.MAX_VALUE; // Sin límite práctico
    }
}