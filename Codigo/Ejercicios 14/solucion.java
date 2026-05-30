// Solución 1: Usar casting
if (miAnimal instanceof Perro) {
    Perro miPerro = (Perro) miAnimal;
    miPerro.correr();  // Ahora sí funciona
}

// Solución 2: Declarar la referencia como Perro
Perro miPerro = new Perro();
miPerro.correr();  // Funciona