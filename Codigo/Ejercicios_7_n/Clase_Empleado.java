/**
 * Clase Empleado que demuestra la combinación de atributos public y private
 * con sus respectivos getters y setters.
 */
public class Empleado {
    
    // Atributo público: accesible desde cualquier clase (ejemplo didáctico)
    public String nombre;
    
    // Atributo privado: solo accesible dentro de esta clase
    private double salario;
    
    /**
     * Constructor que inicializa nombre y salario.
     * Se usa el setter para aplicar validación desde el inicio.
     * @param nombre   Nombre del empleado
     * @param salario  Salario del empleado
     */
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); // Reutilizamos la validación del setter
    }
    
    /**
     * Getter público para obtener el salario.
     * @return Salario actual del empleado
     */
    public double getSalario() {
        return salario;
    }
    
    /**
     * Setter público con validación: no permite salarios negativos.
     * @param salario Nuevo salario a asignar
     */
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo. Se mantiene el valor anterior.");
            // Si es la primera vez (constructor), se asigna 0 por defecto
            if (this.salario == 0 && salario < 0) {
                this.salario = 0;
            }
        }
    }
    
    /**
     * Método auxiliar para mostrar la información del empleado.
     * Útil para verificar el estado del objeto en la prueba.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("------------------------");
    }
}