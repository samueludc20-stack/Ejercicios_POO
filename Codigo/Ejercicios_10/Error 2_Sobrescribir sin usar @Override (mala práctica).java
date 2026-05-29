/**
 * CLASE BASE
 */
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

/**
 * CLASE DERIVADA CON MALA PRÁCTICA
 * El código COMPILA y FUNCIONA, pero es peligroso no usar @Override.
 */
class Gato extends Animal {
    
    // Sin @Override - esto es una sobrescritura, pero no está explícita
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}