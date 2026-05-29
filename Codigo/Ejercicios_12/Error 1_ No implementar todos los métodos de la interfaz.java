/**
 * INTERFAZ con dos métodos abstractos.
 */
interface Trabajador {
    void trabajar();
    void descansar();
}

/**
 * CLASE INCORRECTA: Solo implementa UNO de los métodos.
 * Error de compilación porque falta implementar descansar().
 */
class EmpleadoIncorrecto implements Trabajador {
    
    @Override
    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
    
    // Falta implementar descansar()
    // Error: class must be declared abstract or implement abstract method descansar()
}