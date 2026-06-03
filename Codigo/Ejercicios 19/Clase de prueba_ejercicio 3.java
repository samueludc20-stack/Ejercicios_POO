// Clase de prueba - Demuestra el cumplimiento del DIP
public class TestReportesDIP {
    
    public static void main(String[] args) {
        System.out.println("=== Demostración del Principio DIP - Sistema de Reportes ===\n");
        
        // Crear datos de ejemplo para los reportes
        DatosReporte datosVentas = new DatosReporte("Reporte Ventas Anuales", "Gerente Comercial");
        datosVentas.agregarEncabezados("Mes", "Ventas", "Crecimiento", "Meta Alcanzada");
        datosVentas.agregarFila("Enero", 125000, "5%", "Sí");
        datosVentas.agregarFila("Febrero", 142000, "13.6%", "Sí");
        datosVentas.agregarFila("Marzo", 138000, "-2.8%", "No");
        datosVentas.agregarFila("Abril", 156000, "13%", "Sí");
        datosVentas.agregarMetadato("Año", 2024);
        datosVentas.agregarMetadato("Departamento", "Ventas");
        
        DatosReporte datosEmpleados = new DatosReporte("Reporte Empleados", "Recursos Humanos");
        datosEmpleados.agregarEncabezados("ID", "Nombre", "Área", "Salario", "Antigüedad");
        datosEmpleados.agregarFila("001", "Carlos López", "TI", 3500000, "3 años");
        datosEmpleados.agregarFila("002", "Ana Martínez", "Ventas", 3200000, "2 años");
        datosEmpleados.agregarFila("003", "Luis Rodríguez", "TI", 4000000, "5 años");
        datosEmpleados.agregarFila("004", "María Gómez", "Administración", 3800000, "4 años");
        datosEmpleados.agregarMetadato("Total Empleados", 4);
        
        // DIP: El GestorReportes puede trabajar con CUALQUIER implementación de GeneradorReporte
        // PRIMERA CONFIGURACIÓN: Reporte PDF
        System.out.println("--- Configuración 1: Generando Reporte PDF ---");
        GeneradorReporte generadorPDF = new ReportePDF("./reportes", true, "Verde");
        GestorReportes gestor = new GestorReportes(generadorPDF);
        
        gestor.generarReporteConResumen(datosVentas);
        gestor.generarReporteConResumen(datosEmpleados);
        
        // SEGUNDA CONFIGURACIÓN: Reporte Excel
        System.out.println("\n--- Configuración 2: Generando Reporte Excel ---");
        GeneradorReporte generadorExcel = new ReporteExcel("./reportes", true, "Ventas 2024");
        
        // El mismo gestor puede cambiar de generador sin modificar su código
        gestor.cambiarGenerador(generadorExcel);
        
        gestor.generarReporteConResumen(datosVentas);
        
        // TERCERA CONFIGURACIÓN: Reporte HTML (nuevo formato, demostrando extensibilidad)
        System.out.println("\n--- Configuración 3: Generando Reporte HTML (Nuevo formato) ---");
        GeneradorReporte generadorHTML = new ReporteHTML("./reportes", true);
        gestor.cambiarGenerador(generadorHTML);
        
        gestor.generarReporteConResumen(datosEmpleados);
        
        // Mostrar historial
        gestor.mostrarHistorial();
        
        // Verificación de DIP
        System.out.println("\n=== Verificación del Principio DIP ===");
        System.out.println("✓ GestorReportes depende de GeneradorReporte (abstracción)");
        System.out.println("✓ ReportePDF implementa GeneradorReporte");
        System.out.println("✓ ReporteExcel implementa GeneradorReporte");
        System.out.println("✓ Se puede cambiar de PDF a Excel a HTML sin modificar GestorReportes");
        System.out.println("✓ Las dependencias se inyectan por constructor");
        System.out.println("✓ Nuevos formatos se pueden agregar sin modificar código existente");
    }
}