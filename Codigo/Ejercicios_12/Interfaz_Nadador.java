/**
 * Interfaz Nadador.
 * Define el contrato para cualquier entidad que pueda nadar.
 */
public interface Nadador {
    
    /**
     * Método abstracto para nadar.
     * Cada ser acuático tiene su propia forma de nadar.
     */
    void nadar();
    
    /**
     * Método predeterminado que describe cómo flotar.
     */
    default void flotar() {
        System.out.println("Flotando en la superficie del agua...");
    }
    
    /**
     * Método estático para mostrar un mensaje general.
     */
    static void mostrarMensaje() {
        System.out.println("Los nadadores se desplazan en el agua.");
    }
}