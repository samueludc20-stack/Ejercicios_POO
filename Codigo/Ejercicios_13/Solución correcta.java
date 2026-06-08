// Solución correcta
public class Musico implements Cantante {
    @Override
    public void cantar() {
        System.out.println("El músico está cantando.");
    }
    
    @Override
    public void bailar() {
        System.out.println("El músico está bailando.");
    }
}