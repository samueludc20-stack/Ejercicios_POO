public class Utilidades {
    // Métodos públicos estáticos para operaciones matemáticas básicas

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División entre cero. Se retorna 0.");
            return 0;
        }
        return a / b;
    }
}