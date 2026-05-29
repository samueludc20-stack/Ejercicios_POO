// Clase base original
class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

// Subclase SIN @Override
class Perro extends Animal {
    public void hacerSonido() {  // Todo bien hasta aquí
        System.out.println("Guau");
    }
}

// Tiempo después, alguien modifica la clase base:
class Animal {
    public void emitirSonido() {  // Cambió el nombre del método
        System.out.println("Sonido genérico");
    }
}

// La clase Perro ahora tiene un método hacerSonido() que NO sobrescribe nada
// El código compila, pero el comportamiento es incorrecto.