// Cliente que solo necesita operaciones de retiro
public class CajeroAutomatico {
    
    public void realizarRetiro(Retirable cuenta, double monto) {
        System.out.println("=== Cajero Automático ===");
        System.out.println("Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        cuenta.retirar(monto);
        System.out.println("Operación completada.\n");
    }
}

// Cliente que solo necesita transferencias
public class BancaEnLinea {
    
    public void realizarTransferencia(Transferible cuentaOrigen, String destino, double monto) {
        System.out.println("=== Banca en Línea ===");
        System.out.println("Cuenta origen: " + cuentaOrigen.getNumeroCuenta());
        System.out.println("Saldo actual: $" + cuentaOrigen.getSaldo());
        cuentaOrigen.transferir(destino, monto);
        System.out.println("Transferencia completada.\n");
    }
}

// Cliente que solo necesita pagar facturas
public class PortalPagos {
    
    public void pagarFactura(PagableFacturas cuenta, String codigoFactura, double monto) {
        System.out.println("=== Portal de Pagos ===");
        System.out.println("Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        cuenta.pagarFactura(codigoFactura, monto);
        System.out.println("Pago completado.\n");
    }
}