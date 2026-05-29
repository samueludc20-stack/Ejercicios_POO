/**
 * INTERFAZ VACÍA (marcadora) pero sin propósito claro.
 * Las interfaces marcadoras (como Serializable) tienen utilidad,
 * pero inventarlas sin necesidad es mala práctica.
 */
interface Procesable {
    // No tiene métodos
}

/**
 * Clase que implementa una interfaz vacía sin razón.
 */
class Datos implements Procesable {
    // La interfaz no aporta nada
}