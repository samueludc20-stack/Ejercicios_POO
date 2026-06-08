public class TestVehiculosPolimorfismo {
    public static void main(String[] args) {
        System.out.println("=== Demostración de Polimorfismo con Vehículos ===\n");
        
        // Usando referencias de clase base para apuntar a objetos derivados
        Vehiculo vehiculo1 = new Coche("Toyota", "Corolla", 4, "Gasolina");
        Vehiculo vehiculo2 = new Bicicleta("GW", "Mountain Pro", 21, "Montaña");
        Vehiculo vehiculo3 = new Coche("Tesla", "Model 3", 4, "Eléctrico");
        Vehiculo vehiculo4 = new Bicicleta("Specialized", "Allez", 18, "Ruta");
        
        System.out.println("--- Invocación polimórfica del método mover() ---");
        vehiculo1.mover();  // Ejecuta mover() de Coche
        System.out.println();
        vehiculo2.mover();  // Ejecuta mover() de Bicicleta
        System.out.println();
        vehiculo3.mover();  // Ejecuta mover() de Coche
        System.out.println();
        vehiculo4.mover();  // Ejecuta mover() de Bicicleta
        
        // Usando un arreglo polimórfico
        System.out.println("\n=== Arreglo Polimórfico de Vehículos ===");
        Vehiculo[] vehiculos = {
            new Coche("Mazda", "3", 5, "Gasolina"),
            new Bicicleta("Trek", "FX 2", 24, "Urbana"),
            new Coche("Honda", "Civic", 4, "Gasolina"),
            new Bicicleta("Scott", "Scale", 20, "Montaña")
        };
        
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\nVehículo " + (i + 1) + ":");
            vehiculos[i].mostrarInfo();
            vehiculos[i].mover();
        }
        
        // Demostración de casting para acceder a métodos específicos
        System.out.println("\n=== Acceso a Métodos Específicos mediante Casting ===");
        
        // Casting para Coche
        if (vehiculo1 instanceof Coche) {
            Coche miCoche = (Coche) vehiculo1;
            miCoche.tocarBocina();
            System.out.println("Número de puertas: " + miCoche.getNumeroPuertas());
        }
        
        // Casting para Bicicleta
        if (vehiculo2 instanceof Bicicleta) {
            Bicicleta miBici = (Bicicleta) vehiculo2;
            miBici.tocarCampana();
            System.out.println("Número de marchas: " + miBici.getNumeroMarchas());
        }
        
        // Demostración de polimorfismo en método que recibe parámetros
        System.out.println("\n=== Polimorfismo como Parámetro de Método ===");
        mostrarMovimiento(vehiculo1);
        mostrarMovimiento(vehiculo2);
        mostrarMovimiento(new Coche("Ford", "Mustang", 2, "Gasolina"));
        mostrarMovimiento(new Bicicleta("Raleigh", "Cadence", 7, "Urbana"));
    }
    
    // Método que demuestra polimorfismo en parámetros
    public static void mostrarMovimiento(Vehiculo v) {
        System.out.print("→ ");
        v.mover();
    }
}