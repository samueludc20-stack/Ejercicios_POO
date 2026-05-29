// Clase base
class Vehiculo {
    private String marca;  // Atributo privado
    
    public Vehiculo(String marca) {
        this.marca = marca;
    }
}

// Clase derivada
class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }
    
    public void mostrarMarca() {
        // ERROR: marca es private en Vehiculo
        System.out.println(marca);  // <-- LÍNEA QUE GENERA ERROR
    }
}