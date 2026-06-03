// Interfaz específica para tareas de reparación
public interface Reparable {
    void reparar();
    void diagnosticar();
}

// Interfaz específica para tareas de limpieza
public interface Limpiable {
    void limpiar();
    void desinfectar();
}

// Clase Mecanico - Solo implementa lo relacionado con reparaciones
public class Mecanico implements Reparable {
    private String nombre;
    private String especialidad;
    
    public Mecanico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    @Override
    public void reparar() {
        System.out.println("El mecánico " + nombre + " está reparando equipos.");
        System.out.println("  Especialidad: " + especialidad);
    }
    
    @Override
    public void diagnosticar() {
        System.out.println("El mecánico " + nombre + " está diagnosticando fallas.");
    }
    
    public String getNombre() {
        return nombre;
    }
}

// Clase PersonalLimpieza - Solo implementa lo relacionado con limpieza
public class PersonalLimpieza implements Limpiable {
    private String nombre;
    private String areaAsignada;
    
    public PersonalLimpieza(String nombre, String areaAsignada) {
        this.nombre = nombre;
        this.areaAsignada = areaAsignada;
    }
    
    @Override
    public void limpiar() {
        System.out.println("El personal de limpieza " + nombre + " está limpiando.");
        System.out.println("  Área asignada: " + areaAsignada);
    }
    
    @Override
    public void desinfectar() {
        System.out.println("El personal de limpieza " + nombre + " está desinfectando el área.");
    }
    
    public String getNombre() {
        return nombre;
    }
}

// Clase que puede realizar ambas tareas (Técnico especializado)
// ¡Esto es posible gracias a que las interfaces están segregadas!
public class TecnicoEspecializado implements Reparable, Limpiable {
    private String nombre;
    
    public TecnicoEspecializado(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void reparar() {
        System.out.println("El técnico " + nombre + " está realizando reparaciones especializadas.");
    }
    
    @Override
    public void diagnosticar() {
        System.out.println("El técnico " + nombre + " está diagnosticando fallas complejas.");
    }
    
    @Override
    public void limpiar() {
        System.out.println("El técnico " + nombre + " está limpiando equipos después de repararlos.");
    }
    
    @Override
    public void desinfectar() {
        System.out.println("El técnico " + nombre + " está desinfectando equipos sensibles.");
    }
}