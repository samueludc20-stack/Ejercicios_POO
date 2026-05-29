/**
 * Clase Pez que implementa las interfaces Nadador y Respirador.
 * 
 * DEMOSTRACIÓN DE HERENCIA MÚLTIPLE CON INTERFACES:
 * - Un pez puede nadar Y respirar (dos capacidades diferentes).
 * - La implementación es específica para peces.
 */
public class Pez implements Nadador, Respirador {
    private String nombre;
    private String especie;
    private String tipoAgua;  // "dulce" o "salada"
    
    /**
     * Constructor de Pez.
     * @param nombre Nombre del pez
     * @param especie Especie del pez
     * @param tipoAgua Tipo de agua (dulce/salada)
     */
    public Pez(String nombre, String especie, String tipoAgua) {
        this.nombre = nombre;
        this.especie = especie;
        this.tipoAgua = tipoAgua;
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
    
    public String getTipoAgua() {
        return tipoAgua;
    }
    
    public void setTipoAgua(String tipoAgua) {
        if (tipoAgua.equalsIgnoreCase("dulce") || tipoAgua.equalsIgnoreCase("salada")) {
            this.tipoAgua = tipoAgua;
        } else {
            System.out.println("Error: Tipo de agua inválido. Se establece 'desconocido'.");
            this.tipoAgua = "desconocido";
        }
    }
    
    /**
     * IMPLEMENTACIÓN del método nadar() de la interfaz Nadador.
     * Un pez nada moviendo su cola y aletas.
     */
    @Override
    public void nadar() {
        System.out.println(nombre + " (" + especie + ") está nadando ágilmente:");
        System.out.println("  ~ Mueve su cola y aletas en agua " + tipoAgua + " ~");
    }
    
    /**
     * IMPLEMENTACIÓN del método respirar() de la interfaz Respirador.
     * Un pez respira por branquias, extrayendo oxígeno del agua.
     */
    @Override
    public void respirar() {
        System.out.println(nombre + " (" + especie + ") está respirando:");
        System.out.println("  ~ Toma oxígeno del agua a través de sus branquias ~");
    }
    
    /**
     * Sobrescritura OPCIONAL del método default tomarAire().
     * Un pez toma oxígeno del agua, no del aire.
     */
    @Override
    public void tomarAire() {
        System.out.println(nombre + " extrae oxígeno disuelto en el agua.");
    }
    
    /**
     * Sobrescritura OPCIONAL del método default flotar() de Nadador.
     */
    @Override
    public void flotar() {
        System.out.println(nombre + " flota suavemente en el agua " + tipoAgua + ".");
    }
    
    /**
     * Método adicional propio de Pez.
     */
    public void saltarDelAgua() {
        System.out.println(nombre + " salta fuera del agua mostrando sus escamas.");
    }
    
    /**
     * Método para mostrar información completa del pez.
     */
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL PEZ ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Tipo de agua: " + tipoAgua);
        System.out.println("Capacidades: Nadador, Respirador");
    }
}