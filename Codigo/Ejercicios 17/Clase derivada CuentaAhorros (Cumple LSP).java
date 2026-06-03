// Clase derivada - Extiende el comportamiento sin violar LSP
public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;
    private int retirosDelMes;
    private static final int LIMITE_RETIROS_MENSUALES = 3;
    
    public CuentaAhorros(String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, saldoInicial);
        if (tasaInteres < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa");
        }
        this.tasaInteres = tasaInteres;
        this.retirosDelMes = 0;
    }
    
    // Método adicional propio de cuenta de ahorros (NO viola LSP porque no está en la base)
    public void aplicarInteres() {
        double interes = saldo * (tasaInteres / 100);
        saldo += interes;
        System.out.println("Interés aplicado: $" + interes + ". Nuevo saldo: $" + saldo);
    }
    
    // Método adicional: reiniciar contador de retiros
    public void reiniciarContadorRetiros() {
        retirosDelMes = 0;
        System.out.println("Contador de retiros reiniciado");
    }
    
    @Override
    public void retirar(double monto) throws SaldoInsuficienteException {
        // Validación adicional: límite de retiros mensuales
        if (retirosDelMes >= LIMITE_RETIROS_MENSUALES) {
            throw new SaldoInsuficienteException(
                "Límite de retiros mensuales alcanzado (" + LIMITE_RETIROS_MENSUALES + " retiros)"
            );
        }
        
        // Llamar al método de la clase base para la validación principal
        super.retirar(monto);
        
        // Si el retiro fue exitoso, incrementar el contador
        retirosDelMes++;
        System.out.println("Retiros realizados en el mes: " + retirosDelMes);
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Cuenta de Ahorros");
        System.out.println("Tasa de interés: " + tasaInteres + "%");
        System.out.println("Retiros disponibles este mes: " + (LIMITE_RETIROS_MENSUALES - retirosDelMes));
    }
}