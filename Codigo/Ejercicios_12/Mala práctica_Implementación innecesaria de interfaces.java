/**
 * INTERFAZ Movible.
 * Define capacidad de moverse.
 */
interface Movible {
    void moverse();
}

/**
 * CLASE INCORRECTA (mala práctica): Implementa Movible sin sentido.
 * Un edificio NO tiene lógica para moverse.
 * El código COMPILA pero es una mala práctica de diseño.
 */
class Edificio implements Movible {
    
    @Override
    public void moverse() {
        // Esto no tiene sentido lógico
        System.out.println("Los edificios no se mueven.");
    }
}