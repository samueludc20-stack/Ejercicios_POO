// BUENA PRÁCTICA: Sobrescritura que SÍ modifica o extiende el comportamiento
public class Moto extends Vehiculo {
    @Override
    public void mover() {
        super.mover();  // Mantiene comportamiento base
        System.out.println("La moto acelera y hace un sonido de motor.");  // Agrega comportamiento
    }
}

// Otra buena práctica: Sobrescritura que reemplaza completamente
public class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avión está volando por el aire.");  // Comportamiento completamente diferente
    }
}