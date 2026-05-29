/**
 * Clase CuentaBancaria que demuestra atributos con diferentes niveles de acceso:
 * - public: tipoCuenta
 * - private: numeroCuenta y saldo
 * Incluye métodos get/set y un método para mostrar detalles.
 */
public class CuentaBancaria {
    
    // Atributo privado: número de cuenta (no debe modificarse después de creado)
    private String numeroCuenta;
    
    // Atributo privado: saldo (requiere control de acceso)
    private double saldo;
    
    // Atributo público: tipo de cuenta (ejemplo didáctico)
    public String tipoCuenta;
    
    /**
     * Constructor que inicializa todos los atributos.
     * @param numeroCuenta Número único de la cuenta
     * @param saldoInicial Saldo inicial (debe ser >= 0)
     * @param tipoCuenta   Tipo de cuenta (Ahorros, Corriente, etc.)
     */
    public CuentaBancaria(String numeroCuenta, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldoInicial);  // Usamos el setter para validar
        this.tipoCuenta = tipoCuenta;
    }
    
    /**
     * Getter público para el saldo.
     * @return Saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Setter público para el saldo con validación.
     * No permite establecer un saldo negativo.
     * @param saldo Nuevo saldo a asignar
     */
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: No se puede establecer un saldo negativo. Operación cancelada.");
        }
    }
    
    /**
     * Getter público opcional para el número de cuenta.
     * No hay setter porque el número de cuenta no debe cambiar.
     * @return Número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    /**
     * Método público que muestra todos los detalles de la cuenta.
     * Dentro de este método SÍ se puede acceder a atributos private.
     */
    public void mostrarDetalles() {
        System.out.println("=== DETALLES DE LA CUENTA ===");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("===============================");
    }
}