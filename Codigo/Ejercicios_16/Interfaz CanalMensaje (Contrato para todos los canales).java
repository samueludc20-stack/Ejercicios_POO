// Interfaz base - Abierta para extensión, cerrada para modificación
public interface CanalMensaje {
    void enviar(String destino, String mensaje);
    String getNombreCanal();
    boolean validarDestino(String destino);
    int getLimiteCaracteres();
}