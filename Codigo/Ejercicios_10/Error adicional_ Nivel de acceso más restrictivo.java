class Animal {
    public void moverse() {
        System.out.println("El animal se mueve.");
    }
}

class Pez extends Animal {
    @Override
    protected void moverse() {  // ERROR: más restrictivo (public → protected)
        System.out.println("El pez nada.");
    }
}