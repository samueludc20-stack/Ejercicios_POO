/**
 * Clase de prueba para CuentaBancaria.
 * Demuestra acceso correcto a atributos public/private
 * y muestra los errores de compilación al intentar acceder a atributos private.
 */
public class TestCuentaBancaria {
    public static void main(String[] args) {
        
        System.out.println("=== CREANDO CUENTA BANCARIA ===\n");
        CuentaBancaria cuenta = new CuentaBancaria("100-2345678", 1500.75, "Ahorros");
        
        // ACCESO CORRECTO A ATRIBUTO PÚBLICO
        System.out.println("Tipo de cuenta (acceso directo): " + cuenta.tipoCuenta);
        
        // MODIFICACIÓN DIRECTA DE ATRIBUTO PÚBLICO (permitido)
        cuenta.tipoCuenta = "Corriente";
        System.out.println("Tipo de cuenta modificado: " + cuenta.tipoCuenta);
        
        // ACCESO CORRECTO MEDIANTE GETTERS
        System.out.println("Saldo actual (vía getter): $" + cuenta.getSaldo());
        System.out.println("Número de cuenta (vía getter): " + cuenta.getNumeroCuenta());
        
        // MODIFICACIÓN CORRECTA DEL SALDO (usando setter)
        System.out.println("\n=== MODIFICANDO SALDO ===");
        cuenta.setSaldo(2300.00);
        System.out.println("Nuevo saldo: $" + cuenta.getSaldo());
        
        // INTENTO DE SALDO NEGATIVO (validación)
        System.out.println("\n=== PRUEBA DE VALIDACIÓN ===");
        cuenta.setSaldo(-500.00);
        System.out.println("Saldo después de intento negativo: $" + cuenta.getSaldo());
        
        // MOSTRAR TODOS LOS DETALLES
        System.out.println();
        cuenta.mostrarDetalles();
        
        // ========== ERRORES DE COMPILACIÓN ==========
        // Los siguientes accesos NO compilarían. Se muestran comentados para que el estudiante los observe.
        
        System.out.println("\n=== ERRORES DE COMPILACIÓN (descomentar para ver) ===");
        
        // Error 1: Acceso directo a atributo private numeroCuenta
        // System.out.println(cuenta.numeroCuenta);  // DESCOMENTAR = ERROR
        
        // Error 2: Modificación directa de atributo private numeroCuenta
        // cuenta.numeroCuenta = "999-9999999";     // DESCOMENTAR = ERROR
        
        // Error 3: Acceso directo a atributo private saldo
        // System.out.println(cuenta.saldo);         // DESCOMENTAR = ERROR
        
        // Error 4: Modificación directa de atributo private saldo
        // cuenta.saldo = 3000.00;                  // DESCOMENTAR = ERROR
        
        System.out.println("\n*** EXPLICACIÓN ***");
        System.out.println("Los atributos 'numeroCuenta' y 'saldo' son private,");
        System.out.println("por lo tanto NO pueden ser accedidos directamente");
        System.out.println("desde la clase TestCuentaBancaria.");
        System.out.println("Para acceder a ellos se deben usar los métodos públicos");
        System.out.println("getNumeroCuenta(), getSaldo() y setSaldo().");
    }
}