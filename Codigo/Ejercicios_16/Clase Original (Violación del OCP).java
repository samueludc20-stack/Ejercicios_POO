// VIOLACIÓN DEL OCP - Cada nuevo descuento requiere modificar esta clase
public class CalculadoraDescuentoOriginal {
    public double aplicarDescuento(String tipoDescuento, double precio, double valor) {
        if (tipoDescuento.equals("PORCENTAJE")) {
            return precio - (precio * valor / 100);
        } else if (tipoDescuento.equals("FIJO")) {
            // Si agregamos descuento fijo, modificamos esta clase
            return precio - valor;
        }
        // Si agregamos "DESCUENTO_2X1" o "DESCUENTO_CUPON", seguimos modificando
        return precio;
    }
}