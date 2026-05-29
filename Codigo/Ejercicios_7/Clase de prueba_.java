public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345ABC", 1000, "Ahorros");

        // Acceso correcto a tipoCuenta (público)
        System.out.println("Tipo cuenta: " + cuenta.tipoCuenta);

        // Acceso correcto mediante getters
        System.out.println("Saldo: " + cuenta.getSaldo());

        // Mostrar detalles (incluye número de cuenta privado pero accesible dentro del método)
        cuenta.mostrarDetalles();

        // ************ ERRORES DE COMPILACIÓN (descomentar para ver) ************
        // cuenta.numeroCuenta = "67890";   // Error: numeroCuenta tiene acceso private
        // System.out.println(cuenta.numeroCuenta); // Error: mismo motivo
        // cuenta.saldo = 2000;             // Error: saldo es private
    }
}