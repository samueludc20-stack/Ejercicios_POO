// Clase base
public class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada con sobrescritura INNECESARIA
public class Moto extends Vehiculo {
    @Override
    public void mover() {
        super.mover();  // Solo llama al método de la clase base
        // No agrega ni modifica ningún comportamiento
    }
}

// Clase derivada con sobrescritura sin cambios
public class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        // Hace exactamente lo mismo que el método de Vehiculo
        System.out.println("El vehículo se está moviendo.");
    }
}