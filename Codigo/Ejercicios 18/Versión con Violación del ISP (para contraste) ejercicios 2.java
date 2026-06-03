// INTERFAZ VIOLADORA DEL ISP
public interface OperacionBancariaViolacion {
    void transferir(String destino, double monto);
    void retirar(double monto);
    void pagarFactura(String codigoFactura, double monto);
    double getSaldo();
}

// CuentaBásica - Solo necesita retirar y consultar saldo, pero obligada a implementar todo
public class CuentaBasicaViolacion implements OperacionBancariaViolacion {
    private double saldo;
    
    public CuentaBasicaViolacion(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    @Override
    public void transferir(String destino, double monto) {
        // Violación de ISP: esta cuenta no soporta transferencias
        throw new UnsupportedOperationException("Esta cuenta no soporta transferencias");
    }
    
    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }
    
    @Override
    public void pagarFactura(String codigoFactura, double monto) {
        // Violación de ISP: esta cuenta no soporta pago de facturas
        throw new UnsupportedOperationException("Esta cuenta no soporta pago de facturas");
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
}