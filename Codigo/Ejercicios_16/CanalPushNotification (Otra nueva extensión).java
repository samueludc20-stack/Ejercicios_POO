// NUEVO CANAL - Notificaciones Push (se agrega sin modificar código existente)
public class CanalPushNotification implements CanalMensaje {
    private String appId;
    private String apiKey;
    private String plataforma; // iOS, Android, Web
    
    public CanalPushNotification(String appId, String apiKey, String plataforma) {
        this.appId = appId;
        this.apiKey = apiKey;
        this.plataforma = plataforma;
    }
    
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("\n📲 ENVIANDO NOTIFICACIÓN PUSH");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("App ID: " + appId);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Device Token: " + destino.substring(0, Math.min(15, destino.length())) + "...");
        System.out.println("Título: Notificación");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("[Conectando al servicio de push notifications...]");
        System.out.println("✓ Notificación push enviada exitosamente");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
    
    public void enviarConTitulo(String destino, String titulo, String mensaje) {
        System.out.println("\n📲 NOTIFICACIÓN PUSH CON TÍTULO");
        System.out.println("Título: " + titulo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("✓ Notificación enviada");
    }
    
    @Override
    public String getNombreCanal() {
        return "Notificaciones Push (" + plataforma + ")";
    }
    
    @Override
    public boolean validarDestino(String destino) {
        // Validación básica de token de dispositivo
        return destino != null && destino.length() >= 32;
    }
    
    @Override
    public int getLimiteCaracteres() {
        return 200; // Límite típico para push notifications
    }
}