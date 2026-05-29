/**
 * Clase de utilidades que agrupa operaciones matemáticas básicas.
 * Todos los métodos son estáticos y públicos para ser usados desde cualquier lugar.
 * No es necesario instanciar esta clase.
 */
public class Utilidades {
    
    /**
     * Suma dos números enteros.
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de a + b
     */
    public static int suma(int a, int b) {
        return a + b;
    }
    
    /**
     * Resta dos números enteros.
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de a - b
     */
    public static int resta(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números enteros.
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de a * b
     */
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide dos números decimales.
     * Si el divisor es 0, imprime un mensaje de error y retorna 0.
     * @param a Dividendo
     * @param b Divisor
     * @return Resultado de a / b, o 0 si b es 0
     */
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error matemático: División por cero. Retornando 0.");
            return 0;
        }
        return a / b;
    }
    
    /**
     * Método opcional: calcula el módulo (residuo) de dos enteros.
     * @param a Dividendo
     * @param b Divisor
     * @return a % b
     */
    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Módulo con divisor cero. Retornando 0.");
            return 0;
        }
        return a % b;
    }
}