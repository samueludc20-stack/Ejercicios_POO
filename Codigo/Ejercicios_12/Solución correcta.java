class EmpleadoCorrecto implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
    
    @Override
    public void descansar() {
        System.out.println("El empleado está descansando.");
    }
}