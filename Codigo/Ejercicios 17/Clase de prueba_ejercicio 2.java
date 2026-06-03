// Clase de prueba - Demuestra que CuentaAhorros puede sustituir a CuentaBancaria
public class TestCuentaBancariaLSP {
    
    // Este método acepta CUALQUIER CuentaBancaria (base o derivada)
    // Demuestra LSP: CuentaAhorros puede sustituir a CuentaBancaria
    public static void realizarOperacionEstandar(CuentaBancaria cuenta, double monto) {
        System.out.println("=== Operación estándar con: " + cuenta.getNumeroCuenta() + " ===");
        try {
            cuenta.depositar(monto);
            cuenta.retirar(monto / 2);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        cuenta.mostrarInformacion();
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio LSP con Cuentas Bancarias ===\n");
        
        // Crear una cuenta base
        CuentaBancaria cuentaNormal = new CuentaBancaria("1001", 5000);
        
        // Crear una cuenta de ahorros (puede tratarse como CuentaBancaria)
        CuentaBancaria cuentaAhorros = new CuentaAhorros("2001", 10000, 5.0);
        
        // Demostración de LSP: ambas pueden ser usadas de la misma manera
        System.out.println("--- Usando Cuenta Normal ---");
        realizarOperacionEstandar(cuentaNormal, 1000);
        
        System.out.println("--- Usando Cuenta de Ahorros (tratada como CuentaBancaria) ---");
        realizarOperacionEstandar(cuentaAhorros, 2000);
        
        // Demostración de que CuentaAhorros también tiene funcionalidad específica
        // (Esto NO viola LSP porque es funcionalidad adicional, no sustitutiva)
        System.out.println("--- Funcionalidad específica de CuentaAhorros ---");
        if (cuentaAhorros instanceof CuentaAhorros) {
            CuentaAhorros ahorros = (CuentaAhorros) cuentaAhorros;
            ahorros.aplicarInteres();
            ahorros.mostrarInformacion();
        }
        
        // Demostración del límite de retiros
        System.out.println("\n--- Demostración de límite de retiros (violación esperada) ---");
        try {
            CuentaAhorros ahorrosConLimite = new CuentaAhorros("3001", 5000, 3.0);
            ahorrosConLimite.retirar(100);  // Retiro 1
            ahorrosConLimite.retirar(100);  // Retiro 2
            ahorrosConLimite.retirar(100);  // Retiro 3
            ahorrosConLimite.retirar(100);  // Intento de retiro 4 - debe fallar
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}