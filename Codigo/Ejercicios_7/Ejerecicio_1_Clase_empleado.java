// Clase Empleado
public class Empleado {
    // Propiedad nombre es pública (según el enunciado)
    public String nombre;

    // Propiedad salario es privada
    private double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); // Usamos el setter para validar
    }

    // Getter público para salario
    public double getSalario() {
        return salario;
    }

    // Setter público para salario con validación
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo. Se dejará en 0.");
            this.salario = 0;
        }
    }

    // Método para mostrar información (opcional, para prueba)
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}