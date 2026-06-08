// Definición de una interfaz
public interface Cantante {
    void cantar();
    void bailar();
}

// Clase incorrecta - NO implementa todos los métodos
public class Musico implements Cantante {
    // Solo implementa un método, falta bailar()
    @Override
    public void cantar() {
        System.out.println("El músico está cantando.");
    }
    
    // ERROR: Falta la implementación del método bailar()
}