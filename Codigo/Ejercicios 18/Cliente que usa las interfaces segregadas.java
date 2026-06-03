// Servicio que solo necesita reparaciones (depende solo de Reparable)
public class ServicioMantenimiento {
    
    public void realizarReparacion(Reparable reparable) {
        System.out.println("=== Servicio de Reparación ===");
        reparable.diagnosticar();
        reparable.reparar();
        System.out.println("Reparación completada.\n");
    }
}

// Servicio que solo necesita limpieza (depende solo de Limpiable)
public class ServicioLimpieza {
    
    public void realizarLimpieza(Limpiable limpiable) {
        System.out.println("=== Servicio de Limpieza ===");
        limpiable.limpiar();
        limpiable.desinfectar();
        System.out.println("Limpieza completada.\n");
    }
}