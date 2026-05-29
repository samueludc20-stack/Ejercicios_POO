public class TestUtilidades {
    public static void main(String[] args) {
        // No necesitamos instanciar, son métodos estáticos
        System.out.println("Suma 5 + 3 = " + Utilidades.suma(5, 3));
        System.out.println("Resta 10 - 4 = " + Utilidades.resta(10, 4));
        System.out.println("Multiplicación 6 * 7 = " + Utilidades.multiplicacion(6, 7));
        System.out.println("División 15 / 3 = " + Utilidades.division(15, 3));
        System.out.println("División entre cero: " + Utilidades.division(8, 0));
    }
}