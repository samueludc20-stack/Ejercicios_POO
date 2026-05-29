/**
 * Interfaz Respirador.
 * Define el contrato para cualquier entidad que respire.
 * Demuestra que diferentes seres pueden respirar de formas distintas.
 */
public interface Respirador {
    
    /**
     * Método abstracto para respirar.
     * Cada ser tiene su propio mecanismo respiratorio.
     */
    void respirar();
    
    /**
     * Método predeterminado - todos los respiradores pueden tomar aire
     * de alguna manera (los peces toman oxígeno del agua).
     */
    default void tomarAire() {
        System.out.println("Tomando oxígeno del ambiente...");
    }
}