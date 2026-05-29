/**
 * CLASE BASE
 */
class Vehiculo {
    public void acelerar(int velocidad) {
        System.out.println("El vehículo acelera a " + velocidad + " km/h.");
    }
}

/**
 * CLASE DERIVADA CON ERROR
 * Error: El método acelerar() no tiene la misma firma que el de Vehiculo.
 */
class Coche extends Vehiculo {
    
    // INTENTO INCORRECTO DE SOBRESCRITURA: falta el parámetro int velocidad
    @Override  // <-- ESTA ANOTACIÓN GENERARÁ ERROR DE COMPILACIÓN
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}