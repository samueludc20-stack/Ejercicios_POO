/**
 * Clase Ave que implementa las interfaces Volador y Cantante.
 * 
 * DEMOSTRACIÓN DE HERENCIA MÚLTIPLE CON INTERFACES:
 * - Una clase puede implementar MÚLTIPLES interfaces.
 * - Debe proporcionar implementación de TODOS los métodos abstractos.
 * - Los métodos default son opcionales (pueden usarse o sobrescribirse).
 */
public class Ave implements Volador, Cantante {
    private String nombre;
    private String especie;
    
    /**
     * Constructor de Ave.
     * @param nombre Nombre del ave
     * @param especie Especie del ave
     */
    public Ave(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    /**
     * IMPLEMENTACIÓN del método volar() de la interfaz Volador.
     * Un ave vuela batiendo sus alas.
     */
    @Override
    public void volar() {
        System.out.println(nombre + " (" + especie + ") está volando batiendo sus alas.");
        System.out.println("  ~ Vuela a través del cielo ~");
    }
    
    /**
     * IMPLEMENTACIÓN del método cantar() de la interfaz Cantante.
     * Un ave canta con su trino característico.
     */
    @Override
    public void cantar() {
        System.out.println(nombre + " (" + especie + ") está cantando:");
        System.out.println("  ♪ ♫ ¡Pío, pío, trinarín, trinarán! ♪ ♫");
    }
    
    /**
     * Sobrescritura OPCIONAL del método default despegar() de Volador.
     * Se puede sobrescribir para personalizar el comportamiento.
     */
    @Override
    public void despegar() {
        System.out.println(nombre + " salta desde una rama y comienza a volar.");
    }
    
    /**
     * Método adicional propio de Ave (no está en ninguna interfaz).
     */
    public void construirNido() {
        System.out.println(nombre + " está construyendo un nido con ramitas.");
    }
    
    /**
     * Método para mostrar información completa del ave.
     */
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL AVE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Capacidades: Volador, Cantante");
    }
}