// Interfaz específica para vehículos que se pueden conducir
public interface Conducible {
    void encender();
    void conducir();
    void frenar();
    void apagar();
    double getVelocidadActual();
}

// Interfaz específica para vehículos que pueden transportar carga
public interface Cargable {
    void cargarMercancia(double peso);
    void descargarMercancia();
    double getPesoCargado();
    double getCapacidadMaximaCarga();
    boolean estaLleno();
}

// Clase Moto - Solo implementa Conducible (no necesita Cargable)
public class Moto implements Conducible {
    private String modelo;
    private double velocidadActual;
    private boolean encendido;
    
    public Moto(String modelo) {
        this.modelo = modelo;
        this.velocidadActual = 0;
        this.encendido = false;
    }
    
    @Override
    public void encender() {
        encendido = true;
        System.out.println("Moto " + modelo + " encendida.");
    }
    
    @Override
    public void conducir() {
        if (!encendido) {
            System.out.println("Error: Debe encender la moto primero.");
            return;
        }
        velocidadActual = 50;
        System.out.println("Conduciendo moto " + modelo + " a " + velocidadActual + " km/h");
    }
    
    @Override
    public void frenar() {
        velocidadActual = 0;
        System.out.println("Moto " + modelo + " frenó.");
    }
    
    @Override
    public void apagar() {
        encendido = false;
        velocidadActual = 0;
        System.out.println("Moto " + modelo + " apagada.");
    }
    
    @Override
    public double getVelocidadActual() {
        return velocidadActual;
    }
}

// Clase AutoDeportivo - Solo implementa Conducible
public class AutoDeportivo implements Conducible {
    private String modelo;
    private double velocidadActual;
    private boolean encendido;
    
    public AutoDeportivo(String modelo) {
        this.modelo = modelo;
        this.velocidadActual = 0;
        this.encendido = false;
    }
    
    @Override
    public void encender() {
        encendido = true;
        System.out.println("Auto deportivo " + modelo + " encendido. ¡Vroom!");
    }
    
    @Override
    public void conducir() {
        if (!encendido) {
            System.out.println("Error: Debe encender el auto primero.");
            return;
        }
        velocidadActual = 120;
        System.out.println("Conduciendo auto deportivo " + modelo + " a " + velocidadActual + " km/h");
    }
    
    @Override
    public void frenar() {
        velocidadActual = 0;
        System.out.println("Auto deportivo " + modelo + " frenó.");
    }
    
    @Override
    public void apagar() {
        encendido = false;
        velocidadActual = 0;
        System.out.println("Auto deportivo " + modelo + " apagado.");
    }
    
    @Override
    public double getVelocidadActual() {
        return velocidadActual;
    }
}

// Clase Camion - Implementa ambas interfaces (Conducible y Cargable)
public class Camion implements Conducible, Cargable {
    private String modelo;
    private double velocidadActual;
    private boolean encendido;
    private double pesoCargado;
    private double capacidadMaxima;
    
    public Camion(String modelo, double capacidadMaxima) {
        this.modelo = modelo;
        this.velocidadActual = 0;
        this.encendido = false;
        this.pesoCargado = 0;
        this.capacidadMaxima = capacidadMaxima;
    }
    
    // Métodos de Conducible
    @Override
    public void encender() {
        encendido = true;
        System.out.println("Camión " + modelo + " encendido. Motor diésel rugiendo.");
    }
    
    @Override
    public void conducir() {
        if (!encendido) {
            System.out.println("Error: Debe encender el camión primero.");
            return;
        }
        velocidadActual = 80;
        System.out.println("Conduciendo camión " + modelo + " a " + velocidadActual + " km/h");
        System.out.println("  Carga actual: " + pesoCargado + " kg / " + capacidadMaxima + " kg");
    }
    
    @Override
    public void frenar() {
        velocidadActual = 0;
        System.out.println("Camión " + modelo + " frenó (sistema de frenos de aire).");
    }
    
    @Override
    public void apagar() {
        encendido = false;
        velocidadActual = 0;
        System.out.println("Camión " + modelo + " apagado.");
    }
    
    @Override
    public double getVelocidadActual() {
        return velocidadActual;
    }
    
    // Métodos de Cargable
    @Override
    public void cargarMercancia(double peso) {
        if (peso <= 0) {
            System.out.println("Error: El peso a cargar debe ser positivo.");
            return;
        }
        if (pesoCargado + peso > capacidadMaxima) {
            System.out.println("Error: Excede la capacidad máxima. Capacidad disponible: " 
                               + (capacidadMaxima - pesoCargado) + " kg");
            return;
        }
        pesoCargado += peso;
        System.out.println("Cargados " + peso + " kg. Peso total: " + pesoCargado + " kg");
    }
    
    @Override
    public void descargarMercancia() {
        if (pesoCargado == 0) {
            System.out.println("No hay mercancía para descargar.");
            return;
        }
        System.out.println("Descargando " + pesoCargado + " kg de mercancía.");
        pesoCargado = 0;
    }
    
    @Override
    public double getPesoCargado() {
        return pesoCargado;
    }
    
    @Override
    public double getCapacidadMaximaCarga() {
        return capacidadMaxima;
    }
    
    @Override
    public boolean estaLleno() {
        return pesoCargado >= capacidadMaxima;
    }
}

// Clase Camioneta - Implementa ambas interfaces
public class Camioneta implements Conducible, Cargable {
    private String modelo;
    private double velocidadActual;
    private boolean encendido;
    private double pesoCargado;
    private double capacidadMaxima;
    
    public Camioneta(String modelo, double capacidadMaxima) {
        this.modelo = modelo;
        this.velocidadActual = 0;
        this.encendido = false;
        this.pesoCargado = 0;
        this.capacidadMaxima = capacidadMaxima;
    }
    
    @Override
    public void encender() {
        encendido = true;
        System.out.println("Camioneta " + modelo + " encendida.");
    }
    
    @Override
    public void conducir() {
        if (!encendido) {
            System.out.println("Error: Debe encender la camioneta primero.");
            return;
        }
        velocidadActual = 100;
        System.out.println("Conduciendo camioneta " + modelo + " a " + velocidadActual + " km/h");
    }
    
    @Override
    public void frenar() {
        velocidadActual = 0;
        System.out.println("Camioneta " + modelo + " frenó.");
    }
    
    @Override
    public void apagar() {
        encendido = false;
        velocidadActual = 0;
        System.out.println("Camioneta " + modelo + " apagada.");
    }
    
    @Override
    public double getVelocidadActual() {
        return velocidadActual;
    }
    
    @Override
    public void cargarMercancia(double peso) {
        if (peso <= 0) {
            System.out.println("Error: El peso debe ser positivo.");
            return;
        }
        if (pesoCargado + peso > capacidadMaxima) {
            System.out.println("Error: Capacidad excedida. Capacidad restante: " 
                               + (capacidadMaxima - pesoCargado) + " kg");
            return;
        }
        pesoCargado += peso;
        System.out.println("Cargados " + peso + " kg en la camioneta. Total: " + pesoCargado + " kg");
    }
    
    @Override
    public void descargarMercancia() {
        System.out.println("Descargando " + pesoCargado + " kg de la camioneta.");
        pesoCargado = 0;
    }
    
    @Override
    public double getPesoCargado() {
        return pesoCargado;
    }
    
    @Override
    public double getCapacidadMaximaCarga() {
        return capacidadMaxima;
    }
    
    @Override
    public boolean estaLleno() {
        return pesoCargado >= capacidadMaxima;
    }
}