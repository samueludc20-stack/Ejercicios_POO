/**
 * CLASE ABSTRACTA con método abstracto
 */
abstract class Vehiculo {
    public abstract void conducir();
}

/**
 * CLASE DERIVADA QUE NO IMPLEMENTA EL MÉTODO ABSTRACTO (ERROR)
 */
class Coche extends Vehiculo {
    // No implementa el método conducir()
    // Error de compilación porque Coche no es abstracta y tiene métodos abstractos pendientes
}