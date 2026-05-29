/**
 * CLASE ABSTRACTA con un método abstracto que todas las subclases
 * implementarán de la MISMA manera.
 * 
 * Esto es una MALA PRÁCTICA porque el método debería ser concreto.
 */
abstract class FiguraMala {
    // Este método abstracto es innecesario porque todas las figuras
    // podrían mostrar el área de la misma forma.
    public abstract void mostrarArea();
}

class CirculoMalo extends FiguraMala {
    private double radio;
    
    public CirculoMalo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void mostrarArea() {
        // Todas las subclases harían algo similar...
        double area = Math.PI * radio * radio;
        System.out.println("Área: " + area);
    }
}

class RectanguloMalo extends FiguraMala {
    private double base, altura;
    
    public RectanguloMalo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void mostrarArea() {
        // Misma estructura, solo cambia la fórmula...
        double area = base * altura;
        System.out.println("Área: " + area);
    }
}