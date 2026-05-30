// NUEVO CANAL - SMS (se agrega sin modificar código existente)
public class CanalSMS implements CanalMensaje {
    private String proveedor;
    private String apiKey;
    private double costoPorMensaje;
    
    public CanalSMS(String proveedor, String apiKey, double costoPorMensaje) {
        this.proveedor = proveedor;
        this.apiKey = apiKey;
        this.costoPorMensaje = costoPorMensaje;
    }
    
    @Override
    public void enviar(String destino, String mensaje) {
        // Validar longitud del mensaje
        if (mensaje.length() > getLimiteCaracteres()) {
            System.out.println("⚠ El mensaje excede el límite de " + getLimiteCaracteres() + " caracteres");
            mensaje = mensaje.substring(0, getLimiteCaracteres());
            System.out.println("Mensaje truncado: " + mensaje);
        }
        
        System.out.println("\n📱 ENVIANDO SMS");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Número destino: " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Longitud: " + mensaje.length() + "/" + getLimiteCaracteres() + " caracteres");
        System.out.println("Costo estimado: $" + costoPorMensaje);
        System.out.println("[Enviando a través de API...]");
        System.out.println("✓ SMS enviado exitosamente");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
    
    @Override
    public String getNombreCanal() {
        return "SMS (Short Message Service)";
    }
    
    @Override
    public boolean validarDestino(String destino) {
        // Validación simple de número telefónico
        return destino != null && destino.matches("^\\+?[0-9]{10,15}$");
    }
    
    @Override
    public int getLimiteCaracteres() {
        return 160; // Límite estándar de SMS
    }
}