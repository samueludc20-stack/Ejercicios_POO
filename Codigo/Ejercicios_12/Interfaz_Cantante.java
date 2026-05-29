/**
 * Interfaz Cantante.
 * Define el contrato para cualquier entidad que pueda cantar.
 * 
 * Las interfaces permiten que una clase tenga múltiples comportamientos.
 */
public interface Cantante {
    
    /**
     * Método abstracto para cantar.
     * Cada cantante tiene su propio estilo.
     */
    void cantar();
    
    /**
     * Método predeterminado - las clases pueden usarlo u sobrescribirlo.
     */
    default void afinar() {
        System.out.println("Afinando la voz...");
    }
}