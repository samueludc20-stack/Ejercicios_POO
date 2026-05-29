/**
 * Clase base Animal.
 * Representa a cualquier animal con una especie.
 */
public class Animal {
    protected String especie;
    
    /**
     * Constructor de Animal.
     * @param especie Especie del animal
     */
    public Animal(String especie) {
        this.especie = especie;
    }
    
    /**
     * Muestra la especie del animal.
     * Este método será sobrescrito por Pez.
     */
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
    
    /**
     * Método genérico que todos los animales pueden hacer.
     */
    public void respirar() {
        System.out.println("El animal está respirando.");
    }
    
    // Getters y setters
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}