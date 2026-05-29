/**
 * Interfaz Volador.
 * Define el contrato para cualquier entidad que pueda volar.
 * 
 * Las interfaces representan CAPACIDADES o COMPORTAMIENTOS.
 * Relación: "puede-hacer" (can-do)
 */
public interface Volador {
    
    /**
     * Método abstracto que debe implementar cualquier clase voladora.
     * No tiene cuerpo porque la forma de volar depende de cada ser.
     */
    void volar();
    
    /**
     * Método predeterminado (default) - opcional.
     * Proporciona una implementación por defecto que las clases pueden heredar
     * o sobrescribir.
     */
    default void despegar() {
        System.out.println("Preparándose para el despegue...");
    }
    
    /**
     * Método estático - pertenece a la interfaz, no a las instancias.
     */
    static void mostrarMensaje() {
        System.out.println("Las criaturas voladoras surcan los cielos.");
    }
}