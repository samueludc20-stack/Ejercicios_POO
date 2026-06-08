// EXTENSIÓN AVANZADA - Permite combinar múltiples descuentos
public class DescuentoCompuesto extends Descuento {
    private List<Descuento> descuentos;
    
    public DescuentoCompuesto(String nombre) {
        super(nombre);
        this.descuentos = new ArrayList<>();
    }
    
    public void agregarDescuento(Descuento descuento) {
        descuentos.add(descuento);
    }
    
    @Override
    public double aplicar(double precio) {
        double precioFinal = precio;
        for (Descuento descuento : descuentos) {
            precioFinal = descuento.aplicar(precioFinal);
        }
        return Math.max(precioFinal, 0);
    }
    
    @Override
    public String getDescripcion() {
        StringBuilder sb = new StringBuilder("Descuento compuesto: ");
        for (Descuento d : descuentos) {
            sb.append("\n  - ").append(d.getDescripcion());
        }
        return sb.toString();
    }
}