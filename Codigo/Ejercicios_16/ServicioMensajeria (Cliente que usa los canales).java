// Esta clase NO necesita cambiar cuando se agregan nuevos canales de mensajería
public class ServicioMensajeria {
    private String nombreServicio;
    private List<CanalMensaje> canalesConfigurados;
    private List<Mensaje> historial;
    
    public ServicioMensajeria(String nombreServicio) {
        this.nombreServicio = nombreServicio;
        this.canalesConfigurados = new ArrayList<>();
        this.historial = new ArrayList<>();
    }
    
    public void agregarCanal(CanalMensaje canal) {
        canalesConfigurados.add(canal);
        System.out.println("✓ Canal configurado: " + canal.getNombreCanal());
    }
    
    // Enviar mensaje por un canal específico
    public void enviarPorCanal(CanalMensaje canal, String destino, String mensaje) {
        if (!canal.validarDestino(destino)) {
            System.out.println("✗ Error: Destino inválido para " + canal.getNombreCanal());
            return;
        }
        
        Mensaje msg = new Mensaje(generarId(), destino, mensaje);
        msg.agregarMetadato("canal", canal.getNombreCanal());
        msg.agregarMetadato("fecha", LocalDateTime.now().toString());
        
        System.out.println("\n🔔 Servicio: " + nombreServicio);
        canal.enviar(destino, mensaje);
        
        historial.add(msg);
    }
    
    // Enviar mensaje por múltiples canales
    public void enviarMultiCanal(List<CanalMensaje> canales, String destino, String mensaje) {
        System.out.println("\n📢 Enviando mensaje por " + canales.size() + " canales");
        for (CanalMensaje canal : canales) {
            enviarPorCanal(canal, destino, mensaje);
        }
    }
    
    // Enviar a todos los canales configurados
    public void enviarATodos(String destino, String mensaje) {
        enviarMultiCanal(canalesConfigurados, destino, mensaje);
    }
    
    public void mostrarHistorial() {
        System.out.println("\n=== HISTORIAL DE MENSAJES ===");
        for (Mensaje m : historial) {
            System.out.println("• [" + m.getFechaEnvio() + "] " + m.getDestino() + ": " + m.getResumen(50));
        }
    }
    
    public void mostrarCanalesDisponibles() {
        System.out.println("\n📡 Canales configurados en " + nombreServicio + ":");
        for (CanalMensaje c : canalesConfigurados) {
            System.out.println("  • " + c.getNombreCanal() + " (límite: " + c.getLimiteCaracteres() + " chars)");
        }
    }
    
    private String generarId() {
        return "MSG-" + System.currentTimeMillis();
    }
}