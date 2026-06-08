// Cliente que solo necesita conducir vehículos
public class Conductor {
    private String nombre;
    
    public Conductor(String nombre) {
        this.nombre = nombre;
    }
    
    public void realizarViaje(Conducible vehiculo) {
        System.out.println("=== " + nombre + " realizando viaje ===");
        vehiculo.encender();
        vehiculo.conducir();
        System.out.println("Velocidad actual: " + vehiculo.getVelocidadActual() + " km/h");
        vehiculo.frenar();
        vehiculo.apagar();
        System.out.println("Viaje completado.\n");
    }
}

// Cliente que solo necesita manejar carga
public class OperadorCarga {
    private String nombre;
    
    public OperadorCarga(String nombre) {
        this.nombre = nombre;
    }
    
    public void gestionarCarga(Cargable vehiculo, double pesoACargar) {
        System.out.println("=== " + nombre + " gestionando carga ===");
        System.out.println("Capacidad máxima: " + vehiculo.getCapacidadMaximaCarga() + " kg");
        System.out.println("Peso actual: " + vehiculo.getPesoCargado() + " kg");
        
        vehiculo.cargarMercancia(pesoACargar);
        
        if (vehiculo.estaLleno()) {
            System.out.println("El vehículo está lleno.");
        }
        
        System.out.println("Peso final: " + vehiculo.getPesoCargado() + " kg");
        vehiculo.descargarMercancia();
        System.out.println("Gestión de carga completada.\n");
    }
}