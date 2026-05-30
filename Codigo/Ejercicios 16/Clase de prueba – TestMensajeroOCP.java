public class TestMensajeroOCP {
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio OCP con Sistema de Mensajería ===\n");
        
        // Crear servicio de mensajería
        ServicioMensajeria servicio = new ServicioMensajeria("Sistema de Notificaciones Central");
        
        // Configurar diferentes canales (todos implementan CanalMensaje)
        CanalMensaje email = new CanalEmail("smtp.gmail.com", 587, "notificaciones@empresa.com", true);
        CanalMensaje sms = new CanalSMS("Twilio", "API_KEY_12345", 0.05);
        CanalMensaje push = new CanalPushNotification("app-123", "PUSH_KEY", "Android");
        CanalMensaje whatsapp = new CanalWhatsApp("+1234567890", "WA_TOKEN");
        
        // Agregar canales al servicio
        System.out.println("--- Configuración de Canales ---");
        servicio.agregarCanal(email);
        servicio.agregarCanal(sms);
        servicio.agregarCanal(push);
        servicio.agregarCanal(whatsapp);
        
        servicio.mostrarCanalesDisponibles();
        
        // Envío de mensajes por diferentes canales
        System.out.println("\n=== ENVÍO DE MENSAJES INDIVIDUALES ===");
        
        System.out.println("\n--- Envío por Email ---");
        servicio.enviarPorCanal(email, "cliente@ejemplo.com", 
                "Su pedido ha sido enviado. Número de seguimiento: 12345");
        
        System.out.println("\n--- Envío por SMS ---");
        servicio.enviarPorCanal(sms, "+573001234567", 
                "Código de verificación: 482039. Válido por 10 minutos.");
        
        System.out.println("\n--- Envío por Push Notification ---");
        servicio.enviarPorCanal(push, "device_token_abc123xyz789", 
                "¡Tienes un nuevo mensaje!");
        
        System.out.println("\n--- Envío por WhatsApp ---");
        servicio.enviarPorCanal(whatsapp, "+573009876543", 
                "Hola, tu cita para mañana ha sido confirmada.");
        
        // Envío multicanal
        System.out.println("\n=== ENVÍO MULTICANAL ===");
        List<CanalMensaje> canalesNotificacion = Arrays.asList(email, sms);
        servicio.enviarMultiCanal(canalesNotificacion, "+573001234567", 
                "ALERTA: Tu cuenta ha sido accedida desde un nuevo dispositivo.");
        
        // Envío a todos los canales
        System.out.println("\n=== ENVÍO A TODOS LOS CANALES ===");
        servicio.enviarATodos("+573001234567", 
                "Mantenimiento programado: 15 de enero 2:00 AM - 4:00 AM");
        
        // Mostrar historial
        servicio.mostrarHistorial();
        
        // Demostración de extensibilidad
        System.out.println("\n=== DEMOSTRACIÓN DE EXTENSIBILIDAD ===");
        System.out.println("Para agregar un nuevo canal de mensajería (ej: Telegram, Slack, Messenger):");
        System.out.println("1. Crear una nueva clase que implemente CanalMensaje");
        System.out.println("2. Implementar los métodos enviar(), getNombreCanal(), validarDestino(), getLimiteCaracteres()");
        System.out.println("3. ¡El ServicioMensajeria no necesita ninguna modificación!");
        
        // Simulación de cómo se agregaría Telegram fácilmente
        System.out.println("\n--- Ejemplo de cómo se agregaría Telegram ---");
        System.out.println("public class CanalTelegram implements CanalMensaje {");
        System.out.println("    @Override");
        System.out.println("    public void enviar(String destino, String mensaje) {");
        System.out.println("        System.out.println(\"Enviando a Telegram: \" + mensaje);");
        System.out.println("    }");
        System.out.println("    // ... implementar otros métodos");
        System.out.println("}");
        System.out.println("\nCanalTelegram telegram = new CanalTelegram(\"bot_token\");");
        System.out.println("servicio.agregarCanal(telegram); // ¡Así de simple!");
        
        // Mostrar resumen
        System.out.println("\n=== RESUMEN DE PRINCIPIO OCP APLICADO ===");
        System.out.println("✓ Clase base/servicio: Cerrada para modificación");
        System.out.println("✓ Nuevos canales: Abiertos para extensión");
        System.out.println("✓ Polimorfismo: Permite tratar todos los canales de forma uniforme");
        System.out.println("✓ Código existente: No se modificó al agregar SMS, Push o WhatsApp");
    }
}