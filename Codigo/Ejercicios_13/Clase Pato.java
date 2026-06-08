public class Pato implements Volador, Nadador {
    private String nombre;
    
    // Constructor
    public Pato(String nombre) {
        this.nombre = nombre;
    }
    
    // Implementación del método de la interfaz Volador
    @Override
    public void volar() {
        System.out.println(nombre + " está volando. ¡Cuac cuac!");
    }
    
    // Implementación del método de la interfaz Nadador
    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando. ¡Cuac cuac!");
    }
    
    // Método adicional específico del pato
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Cuac cuac cuac!");
    }
    
    public String getNombre() {
        return nombre;
    }
}