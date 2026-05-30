public class TestPato {
    public static void main(String[] args) {
        // Instanciar un objeto Pato
        Pato pato = new Pato("Lucas");
        
        System.out.println("=== Comportamientos del Pato ===");
        
        // Usar ambos métodos de las interfaces
        pato.volar();
        pato.nadar();
        pato.hacerSonido();
        
        // Demostrando polimorfismo con interfaces
        System.out.println("\n=== Demostración de Polimorfismo con Interfaces ===");
        
        Volador volador = pato;
        Nadador nadador = pato;
        
        volador.volar(); // Tratado como Volador
        nadador.nadar(); // Tratado como Nadador
        
        // Verificar que es el mismo objeto
        System.out.println("\n=== Verificación ===");
        System.out.println("¿El pato es Volador? " + (pato instanceof Volador));
        System.out.println("¿El pato es Nadador? " + (pato instanceof Nadador));
        System.out.println("¿El pato es Pato? " + (pato instanceof Pato));
    }
}