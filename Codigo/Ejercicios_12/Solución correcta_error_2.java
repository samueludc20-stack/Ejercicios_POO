class AnfibioCorrecto implements Volador, Nadador {
    // Obligatorio: sobrescribir el método conflictivo
    @Override
    public void despegar() {
        System.out.println("Anfibio: Despegando a mi manera...");
        // Opcionalmente, se puede llamar a uno de los métodos default:
        // Volador.super.despegar();
        // Nadador.super.despegar();
    }
}