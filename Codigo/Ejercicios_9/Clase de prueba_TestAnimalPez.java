/**
 * Clase de prueba para demostrar el uso de super en la herencia Animal→Pez.
 */
public class TestAnimalPez {
    public static void main(String[] args) {
        
        System.out.println("=== TALLER 9: USO DE super ===\n");
        System.out.println("--- EJERCICIO 2: Animal → Pez ---\n");
        
        // Crear un objeto Animal (clase base)
        System.out.println(">>> Objeto de tipo Animal (clase base):");
        Animal animal = new Animal("Mamífero");
        animal.mostrarEspecie();
        animal.respirar();
        
        System.out.println();
        
        // Crear un objeto Pez (usa super en constructor)
        System.out.println(">>> Objeto de tipo Pez (clase derivada):");
        Pez pez = new Pez("Salmón", "dulce");
        
        System.out.println("Llamando a mostrarEspecie() - versión sobrescrita:");
        pez.mostrarEspecie();
        
        System.out.println();
        
        System.out.println("Llamando a respirar() - versión sobrescrita:");
        pez.respirar();
        
        System.out.println();
        
        System.out.println("Llamando a nadar() - método propio de Pez:");
        pez.nadar();
        
        System.out.println();
        
        // Demostración de validación en setter
        System.out.println(">>> Prueba de validación:");
        System.out.println("Intentando asignar 'agua salobre' como tipo de agua:");
        pez.setTipoDeAgua("salobre");
        System.out.println("Tipo de agua actual: " + pez.getTipoDeAgua());
        
        System.out.println();
        
        // Demostración del polimorfismo y super
        System.out.println(">>> Demostración de que super.mostrarEspecie() es necesario:");
        System.out.println("Si en Pez no usáramos super.mostrarEspecie(),");
        System.out.println("tendríamos que reescribir:");
        System.out.println("  System.out.println('Especie: ' + especie);");
        System.out.println("Eso duplicaría código. super lo evita.");
        
        System.out.println();
        System.out.println("*** CONCLUSIÓN DEL EJERCICIO 2 ***");
        System.out.println("✓ super(especie) inicializa el atributo heredado especie.");
        System.out.println("✓ super.mostrarEspecie() reutiliza el código de Animal.");
        System.out.println("✓ Pez puede agregar nuevos métodos como nadar().");
        System.out.println("✓ Pez puede sobrescribir métodos como respirar().");
    }
}