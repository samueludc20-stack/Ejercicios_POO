// Clase LibroRepository - Responsabilidad Única: Manejar persistencia de libros
import java.util.ArrayList;
import java.util.List;

public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();
    
    // Guardar libro en memoria (simulando base de datos)
    public void guardar(Libro libro) {
        System.out.println("Conectando a la base de datos...");
        System.out.println("INSERT INTO libros (titulo, autor, isbn, año, precio) VALUES ('"
                + libro.getTitulo() + "', '"
                + libro.getAutor() + "', '"
                + libro.getIsbn() + "', "
                + libro.getAñoPublicacion() + ", "
                + libro.getPrecio() + ")");
        libros.add(libro);
        System.out.println("✓ Libro guardado exitosamente.");
    }
    
    // Buscar libro por ISBN
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    // Eliminar libro
    public void eliminar(String isbn) {
        System.out.println("DELETE FROM libros WHERE isbn = '" + isbn + "'");
        Libro libroAEliminar = buscarPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("✓ Libro eliminado de la base de datos.");
        } else {
            System.out.println("✗ Libro no encontrado.");
        }
    }
    
    // Actualizar libro
    public void actualizar(Libro libro) {
        System.out.println("UPDATE libros SET titulo = '" + libro.getTitulo()
                + "', autor = '" + libro.getAutor()
                + "', precio = " + libro.getPrecio()
                + " WHERE isbn = '" + libro.getIsbn() + "'");
        System.out.println("✓ Libro actualizado en la base de datos.");
    }
    
    // Obtener todos los libros
    public List<Libro> obtenerTodos() {
        return new ArrayList<>(libros);
    }
}