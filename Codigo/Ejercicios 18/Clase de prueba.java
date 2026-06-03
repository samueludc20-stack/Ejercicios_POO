// Clase de prueba - Demuestra el cumplimiento del ISP
public class TestMantenimientoISP {
    
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio ISP - Sistema de Mantenimiento ===\n");
        
        // Crear instancias con sus interfaces específicas
        Reparable mecanico = new Mecanico("Carlos Gómez", "Motores");
        Limpiable personalLimpieza = new PersonalLimpieza("Ana Martínez", "Sala de máquinas");
        
        // Técnico que puede hacer ambas cosas
        Reparable tecnicoReparador = new TecnicoEspecializado("Luis Rodríguez");
        Limpiable tecnicoLimpieza = new TecnicoEspecializado("Luis Rodríguez");
        
        // Servicios especializados
        ServicioMantenimiento servicioMant = new ServicioMantenimiento();
        ServicioLimpieza servicioLimp = new ServicioLimpieza();
        
        // Demostración: cada servicio usa solo la interfaz que necesita
        System.out.println("--- Usando Mecánico (solo Reparable) ---");
        servicioMant.realizarReparacion(mecanico);
        
        System.out.println("--- Usando Personal de Limpieza (solo Limpiable) ---");
        servicioLimp.realizarLimpieza(personalLimpieza);
        
        System.out.println("--- Usando Técnico Especializado (ambas interfaces) ---");
        servicioMant.realizarReparacion(tecnicoReparador);
        servicioLimp.realizarLimpieza(tecnicoLimpieza);
        
        // Demostración de que las interfaces no tienen métodos innecesarios
        System.out.println("=== Verificación de ISP ===");
        System.out.println("✓ Reparable solo tiene: reparar(), diagnosticar()");
        System.out.println("✓ Limpiable solo tiene: limpiar(), desinfectar()");
        System.out.println("✓ Cada clase implementa SOLO lo que necesita");
        System.out.println("✓ Las clases que necesitan ambas, implementan ambas interfaces");
    }
}