public class TestLibroSRP {
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio SRP con Libros ===\n");
        
        // Crear un libro (solo datos)
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 
                                "978-3-16-148410-0", 1943, 15.99);
        
        // Servicio de reportes
        LibroReporteService reporteService = new LibroReporteService();
        
        // Servicio de persistencia
        LibroRepository repository = new LibroRepository();
        
        // Usar cada servicio independientemente
        System.out.println("--- 1. Generando Reportes ---");
        reporteService.generarReporteTexto(libro);
        
        System.out.println("\n--- 2. Reporte HTML ---");
        System.out.println(reporteService.generarReporteHTML(libro));
        
        System.out.println("\n--- 3. Reporte CSV ---");
        System.out.println("Título;Autor;ISBN;Año;Precio");
        System.out.println(reporteService.generarReporteCSV(libro));
        
        System.out.println("\n--- 4. Persistencia en Base de Datos ---");
        repository.guardar(libro);
        
        System.out.println("\n--- 5. Buscar por ISBN ---");
        Libro libroEncontrado = repository.buscarPorIsbn("978-3-16-148410-0");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado);
        }
        
        System.out.println("\n--- 6. Modificar y Actualizar ---");
        libro.setPrecio(18.50);
        repository.actualizar(libro);
        
        System.out.println("\n--- 7. Eliminar libro ---");
        repository.eliminar("978-3-16-148410-0");
    }
}