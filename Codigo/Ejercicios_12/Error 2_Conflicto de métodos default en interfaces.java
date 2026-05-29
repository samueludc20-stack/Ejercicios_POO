/**
 * INTERFAZ A con método default.
 */
interface Volador {
    default void despegar() {
        System.out.println("Volador: Despegando...");
    }
}

/**
 * INTERFAZ B con método default del MISMO NOMBRE.
 */
interface Nadador {
    default void despegar() {
        System.out.println("Nadador: Despegando... (¿en agua?)");
    }
}

/**
 * CLASE INCORRECTA: Implementa ambas interfaces.
 * Error de compilación porque hay conflicto entre los métodos default.
 * La clase no sabe cuál de los dos métodos default heredar.
 */
class AnfibioIncorrecto implements Volador, Nadador {
    // Error: Duplicate default methods named despegar
}