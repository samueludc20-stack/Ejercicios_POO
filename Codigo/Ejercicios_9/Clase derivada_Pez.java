/**
 * Clase Pez que hereda de Animal.
 * Un pez ES UN animal, con atributo adicional: tipoDeAgua (dulce o salada).
 * 
 * DEMOSTRACIÓN DEL USO DE super:
 * 1. super(especie) -> llama al constructor de Animal
 * 2. super.mostrarEspecie() -> llama al método de Animal desde el override
 */
public class Pez extends Animal {
    private String tipoDeAgua;  // "dulce" o "salada"
    
    /**
     * Constructor de Pez.
     * @param especie Especie del pez
     * @param tipoDeAgua Tipo de agua donde vive (dulce/salada)
     */
    public Pez(String especie, String tipoDeAgua) {
        // USO DE super (1): Invocar constructor de la clase base
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }
    
    // Getter y setter específico
    public String getTipoDeAgua() {
        return tipoDeAgua;
    }
    
    public void setTipoDeAgua(String tipoDeAgua) {
        // Validación básica
        if (tipoDeAgua.equalsIgnoreCase("dulce") || tipoDeAgua.equalsIgnoreCase("salada")) {
            this.tipoDeAgua = tipoDeAgua;
        } else {
            System.out.println("Error: Tipo de agua debe ser 'dulce' o 'salada'");
            this.tipoDeAgua = "desconocido";
        }
    }
    
    /**
     * SOBRESCRITURA del método mostrarEspecie.
     * USO DE super (2): Llamar al método de la clase base para reutilizar su código.
     */
    @Override
    public void mostrarEspecie() {
        // Llamamos al método de Animal usando super
        super.mostrarEspecie();
        // Agregamos la información específica de Pez
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
    
    /**
     * Método propio de Pez (no existe en Animal).
     */
    public void nadar() {
        System.out.println("El pez está nadando en agua " + tipoDeAgua + ".");
    }
    
    /**
     * Sobrescritura del método respirar (los peces respiran por branquias).
     */
    @Override
    public void respirar() {
        System.out.println("El pez respira por branquias.");
    }
}