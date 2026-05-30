// OTRA NUEVA EXTENSIÓN - WhatsApp Business API
public class CanalWhatsApp implements CanalMensaje {
    private String numeroNegocio;
    private String apiToken;
    
    public CanalWhatsApp(String numeroNegocio, String apiToken) {
        this.numeroNegocio = numeroNegocio;
        this.apiToken = apiToken;
    }
    
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("\n💬 ENVIANDO MENSAJE DE WHATSAPP");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Número negocio: " + numeroNegocio);
        System.out.println("Número destino: " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("[Enviando a través de WhatsApp Business API...]");
        System.out.println("✓ Mensaje de WhatsApp enviado exitosamente");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
    
    @Override
    public String getNombreCanal() {
        return "WhatsApp Business";
    }
    
    @Override
    public boolean validarDestino(String destino) {
        return destino != null && destino.matches("^\\+?[0-9]{10,15}$");
    }
    
    @Override
    public int getLimiteCaracteres() {
        return 4096; // Límite de WhatsApp
    }
}