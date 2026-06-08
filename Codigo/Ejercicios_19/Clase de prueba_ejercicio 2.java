// Clase de prueba - Demuestra el cumplimiento del DIP
public class TestAlmacenamientoDIP {
    
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio DIP - Sistema de Almacenamiento ===\n");
        
        // DIP: El GestorArchivos puede trabajar con CUALQUIER implementación de Almacenamiento
        // PRIMERA CONFIGURACIÓN: Almacenamiento Local
        System.out.println("--- Configuración 1: Usando Almacenamiento Local ---");
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal("/home/usuario/documentos/");
        GestorArchivos gestor = new GestorArchivos(almacenamientoLocal);
        
        try {
            // Listar archivos existentes
            gestor.listarTodosLosArchivos();
            
            // Recuperar un archivo existente
            gestor.mostrarInfoArchivo("documento.txt");
            
            // Guardar un nuevo archivo
            Archivo nuevoArchivo = new Archivo("notas.txt", "Estas son mis notas personales.", "texto");
            gestor.guardarArchivo(nuevoArchivo);
            
            // Verificar que se guardó
            gestor.listarTodosLosArchivos();
            
            // Eliminar un archivo
            gestor.eliminarArchivo("datos.csv");
            gestor.listarTodosLosArchivos();
            
        } catch (AlmacenamientoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // SEGUNDA CONFIGURACIÓN: Almacenamiento en la Nube
        System.out.println("\n--- Configuración 2: Usando Almacenamiento en la Nube ---");
        Almacenamiento almacenamientoNube = new AlmacenamientoNube("Google Cloud", "mi-empresa-bucket");
        
        // El mismo gestor puede cambiar de estrategia de almacenamiento
        gestor.cambiarAlmacenamiento(almacenamientoNube);
        
        try {
            // Listar archivos en la nube
            gestor.listarTodosLosArchivos();
            
            // Recuperar un archivo de la nube
            gestor.mostrarInfoArchivo("reporte_mensual.pdf");
            
            // Guardar un archivo en la nube
            Archivo reporteNube = new Archivo("ventas_2024.csv", "mes,ventas\nEnero,5000\nFebrero,7500", "csv");
            gestor.guardarArchivo(reporteNube);
            
            // Verificar
            gestor.listarTodosLosArchivos();
            
        } catch (AlmacenamientoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Verificación de DIP
        System.out.println("\n=== Verificación del Principio DIP ===");
        System.out.println("✓ GestorArchivos depende de Almacenamiento (abstracción)");
        System.out.println("✓ AlmacenamientoLocal implementa Almacenamiento");
        System.out.println("✓ AlmacenamientoNube implementa Almacenamiento");
        System.out.println("✓ Se puede cambiar de almacenamiento local a nube sin modificar GestorArchivos");
        System.out.println("✓ Las dependencias se inyectan por constructor");
    }
}