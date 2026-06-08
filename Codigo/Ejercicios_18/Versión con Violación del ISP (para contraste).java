// INTERFAZ VIOLADORA DEL ISP - DEMOSTRACIÓN DEL PROBLEMA
public interface MantenimientoViolacion {
    void reparar();
    void limpiar();
}

// Clase Mecanico - Solo necesita reparar, pero obligado a implementar limpiar()
public class MecanicoViolacion implements MantenimientoViolacion {
    @Override
    public void reparar() {
        System.out.println("El mecánico está reparando el equipo.");
    }
    
    @Override
    public void limpiar() {
        // ¡Violación de ISP! El mecánico no debería tener que limpiar
        // Se deja vacío o se lanza excepción - ambas son malas prácticas
        System.out.println("ADVERTENCIA: El mecánico no realiza tareas de limpieza.");
    }
}

// Clase Limpieza - Solo necesita limpiar, pero obligado a implementar reparar()
public class LimpiezaViolacion implements MantenimientoViolacion {
    @Override
    public void reparar() {
        // ¡Violación de ISP! El personal de limpieza no repara equipos
        System.out.println("ADVERTENCIA: El personal de limpieza no repara equipos.");
    }
    
    @Override
    public void limpiar() {
        System.out.println("El personal de limpieza está limpiando las instalaciones.");
    }
}