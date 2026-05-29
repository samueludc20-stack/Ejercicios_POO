// Esto NO compila en Java
class ClaseA {
    public void metodoA() {
        System.out.println("Método de ClaseA");
    }
}

class ClaseB {
    public void metodoB() {
        System.out.println("Método de ClaseB");
    }
}

// ERROR: No se puede heredar de múltiples clases
class ClaseC extends ClaseA, ClaseB {  // <-- LÍNEA QUE GENERA ERROR
    // Intenta heredar de dos clases
}