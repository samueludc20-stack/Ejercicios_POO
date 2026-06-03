// Clase de prueba - Demuestra el cumplimiento del ISP
public class TestOperacionesBancariasISP {
    
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio ISP - Sistema Bancario ===\n");
        
        // Crear diferentes tipos de cuentas
        Retirable cuentaBasica = new CuentaBasica("1001", 500000);
        Retirable cuentaAhorrosRetiros = new CuentaAhorros("2001", 1000000, 4.5);
        PagableFacturas cuentaAhorrosPagos = new CuentaAhorros("2001", 1000000, 4.5);
        Transferible cuentaCorrienteTransfer = new CuentaCorriente("3001", 2000000, 500000);
        Retirable cuentaCorrienteRetiros = new CuentaCorriente("3001", 2000000, 500000);
        PagableFacturas cuentaCorrientePagos = new CuentaCorriente("3001", 2000000, 500000);
        
        // Clientes especializados
        CajeroAutomatico cajero = new CajeroAutomatico();
        BancaEnLinea bancaEnLinea = new BancaEnLinea();
        PortalPagos portalPagos = new PortalPagos();
        
        // Demostración: cada cliente usa solo la interfaz que necesita
        System.out.println("--- Usando Cuenta Básica (solo retiros) ---");
        cajero.realizarRetiro(cuentaBasica, 100000);
        
        System.out.println("--- Usando Cuenta de Ahorros (retiros y pagos) ---");
        cajero.realizarRetiro(cuentaAhorrosRetiros, 200000);
        portalPagos.pagarFactura(cuentaAhorrosPagos, "FACT-001", 150000);
        
        System.out.println("--- Usando Cuenta Corriente (todas las operaciones) ---");
        cajero.realizarRetiro(cuentaCorrienteRetiros, 300000);
        bancaEnLinea.realizarTransferencia(cuentaCorrienteTransfer, "Cuenta-5001", 500000);
        portalPagos.pagarFactura(cuentaCorrientePagos, "FACT-002", 200000);
        
        // Verificación de ISP
        System.out.println("=== Verificación del Principio ISP ===");
        System.out.println("✓ Transferible solo tiene: transferir(), getSaldo(), getNumeroCuenta()");
        System.out.println("✓ Retirable solo tiene: retirar(), getSaldo(), getNumeroCuenta()");
        System.out.println("✓ PagableFacturas solo tiene: pagarFactura(), getSaldo(), getNumeroCuenta()");
        System.out.println("✓ CajeroAutomático depende SOLO de Retirable");
        System.out.println("✓ BancaEnLínea depende SOLO de Transferible");
        System.out.println("✓ PortalPagos depende SOLO de PagableFacturas");
    }
}