public class CuentaBancaria {
    private String numeroCuenta;   // Privada
    private double saldo;          // Privada
    public String tipoCuenta;      // Pública

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldoInicial);
        this.tipoCuenta = tipoCuenta;
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para saldo con validación
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo. No se cambia el valor.");
        }
    }

    // Método público para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }

    // Getter opcional para número de cuenta (solo lectura, sin setter)
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}