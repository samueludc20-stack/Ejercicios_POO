// Interfaz base con operaciones comunes a todas las cuentas
public interface Consultable {
    double getSaldo();
    String getNumeroCuenta();
}

// Interfaz específica para transferencias
public interface Transferible extends Consultable {
    void transferir(String cuentaDestino, double monto);
}

// Interfaz específica para retiros
public interface Retirable extends Consultable {
    void retirar(double monto);
}

// Interfaz específica para pago de facturas
public interface PagableFacturas extends Consultable {
    void pagarFactura(String codigoFactura, double monto);
}

// Clase CuentaBasica - Solo soporta retiros (implementa solo Retirable)
public class CuentaBasica implements Retirable {
    private String numeroCuenta;
    private double saldo;
    
    public CuentaBasica(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (monto > saldo) {
            System.out.println("Saldo insuficiente. Saldo actual: $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso de $" + monto + " en cuenta " + numeroCuenta);
        System.out.println("Nuevo saldo: $" + saldo);
    }
}

// Clase CuentaAhorros - Soporta retiros y pago de facturas
public class CuentaAhorros implements Retirable, PagableFacturas {
    private String numeroCuenta;
    private double saldo;
    private double tasaInteres;
    
    public CuentaAhorros(String numeroCuenta, double saldoInicial, double tasaInteres) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (monto > saldo) {
            System.out.println("Saldo insuficiente en cuenta de ahorros. Saldo: $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso de $" + monto + " desde cuenta de ahorros " + numeroCuenta);
        System.out.println("Nuevo saldo: $" + saldo);
    }
    
    @Override
    public void pagarFactura(String codigoFactura, double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (monto > saldo) {
            System.out.println("Saldo insuficiente para pagar factura. Saldo: $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Factura " + codigoFactura + " pagada por $" + monto);
        System.out.println("Nuevo saldo en cuenta de ahorros: $" + saldo);
    }
}

// Clase CuentaCorriente - Soporta todas las operaciones
public class CuentaCorriente implements Transferible, Retirable, PagableFacturas {
    private String numeroCuenta;
    private double saldo;
    private double sobregiroPermitido;
    
    public CuentaCorriente(String numeroCuenta, double saldoInicial, double sobregiroPermitido) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.sobregiroPermitido = sobregiroPermitido;
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        double disponible = saldo + sobregiroPermitido;
        if (monto > disponible) {
            System.out.println("Fondos insuficientes. Disponible: $" + disponible);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso de $" + monto + " desde cuenta corriente " + numeroCuenta);
        System.out.println("Nuevo saldo: $" + saldo);
    }
    
    @Override
    public void transferir(String cuentaDestino, double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (monto > saldo + sobregiroPermitido) {
            System.out.println("Saldo insuficiente para transferir. Saldo: $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Transferencia de $" + monto + " a cuenta " + cuentaDestino);
        System.out.println("Nuevo saldo en cuenta corriente: $" + saldo);
    }
    
    @Override
    public void pagarFactura(String codigoFactura, double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (monto > saldo + sobregiroPermitido) {
            System.out.println("Saldo insuficiente para pagar factura. Saldo: $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Factura " + codigoFactura + " pagada por $" + monto);
        System.out.println("Nuevo saldo en cuenta corriente: $" + saldo);
    }
}