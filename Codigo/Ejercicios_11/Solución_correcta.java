// Opción 1: Implementar el método
class CocheCorrecto extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El coche está siendo conducido.");
    }
}

// Opción 2: Hacer la clase también abstracta
abstract class CocheAbstracto extends Vehiculo {
    // Puede dejar el método sin implementar
}