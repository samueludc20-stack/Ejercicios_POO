# Talleres de Programación Orientada a Objetos (POO) en Java

Este repositorio contiene una serie de ejercicios prácticos para aprender y dominar los fundamentos de la Programación Orientada a Objetos utilizando Java. Los talleres están organizados para cubrir desde los conceptos básicos de encapsulamiento hasta temas más avanzados como herencia, polimorfismo, clases abstractas, interfaces y principios SOLID.

## Contenido

- [Taller 7: Encapsulamiento y Métodos de Acceso](#taller-7-encapsulamiento-y-métodos-de-acceso)
- [Taller 8: Herencia Básica](#taller-8-herencia-básica)
- [Taller 9: Uso de `super` y Herencia](#taller-9-uso-de-super-y-herencia)
- [Taller 10: Sobrescritura de Métodos y Polimorfismo](#taller-10-sobrescritura-de-métodos-y-polimorfismo)
- [Taller 11: Clases Abstractas](#taller-11-clases-abstractas)
- [Taller 12: Interfaces y Herencia Múltiple](#taller-12-interfaces-y-herencia-múltiple)
- [Taller 13: Clases Abstractas e Interfaces - Ejercicios Combinados](#taller-13-clases-abstractas-e-interfaces---ejercicios-combinados)
- [Taller 14: Polimorfismo - Ejercicios Avanzados](#taller-14-polimorfismo---ejercicios-avanzados)
- [Taller 15: Principio de Responsabilidad Única (SRP)](#taller-15-principio-de-responsabilidad-única-srp)
- [Taller 16: Principio de Abierto/Cerrado (OCP)](#taller-16-principio-de-abiertocerrado-ocp)

---

## Taller 7: Encapsulamiento y Métodos de Acceso

### Ejercicio 1: Clase Empleado
- **Conceptos:** Modificadores de acceso (`public`, `private`), encapsulamiento, validación en setters.
- **Clase:** `Empleado` con `nombre` (público) y `salario` (privado).
- **Aprendizaje:**
    - Acceso directo a un atributo público.
    - Control de acceso a un atributo privado mediante getters y setters.
    - Validación en el setter para evitar valores negativos.
    - Uso correcto del constructor llamando al setter.

### Ejercicio 2: Clase CuentaBancaria
- **Conceptos:** Atributos públicos vs privados, errores de compilación, diseño de APIs.
- **Clase:** `CuentaBancaria` con `numeroCuenta` (privado, sin setter), `saldo` (privado) y `tipoCuenta` (público).
- **Aprendizaje:**
    - Observar errores de compilación al acceder directamente a atributos privados.
    - Decidir cuándo no proporcionar un setter (e.g., `numeroCuenta` es inmutable).

### Ejercicio 3: Clase Utilidades
- **Conceptos:** Métodos estáticos (`static`), clases sin estado.
- **Clase:** `Utilidades` con métodos `static` para operaciones matemáticas.
- **Aprendizaje:**
    - Invocar métodos sin instanciar la clase.
    - Manejar casos especiales como la división por cero.
    - Entender la diferencia entre métodos de instancia y estáticos.

---

## Taller 8: Herencia Básica

### Ejercicio 1: Clase Vehiculo y Coche
- **Conceptos:** Herencia simple (`extends`), reutilización de código.
- **Clases:** `Vehiculo` (marca, velocidadMaxima) y `Coche` (hereda y añade `numeroDePuertas`).
- **Aprendizaje:**
    - Uso de `super()` en el constructor para inicializar la clase base.
    - Las subclases heredan atributos y métodos de la superclase.

### Ejercicio 2: Clase Persona y Estudiante
- **Conceptos:** Herencia, sobrescritura básica.
- **Clases:** `Persona` (nombre, edad) y `Estudiante` (hereda y añade `matricula`).
- **Aprendizaje:**
    - Sobrescribir el método `mostrarDetalles()`.
    - Usar la anotación `@Override` para mayor claridad y seguridad.

### Ejercicio 3: Clase Empleado y Gerente
- **Conceptos:** Herencia y sobrescritura con `super`.
- **Clases:** `Empleado` y `Gerente` (añade `departamento`).
- **Aprendizaje:** Reutilizar la lógica de la clase base con `super.metodo()` y luego extenderla.

### Ejercicio 4: Uso Incorrecto de la Herencia
- **Conceptos:** Errores comunes en herencia.
- **Aprendizaje:**
    - Java no soporta herencia múltiple de clases.
    - Una subclase no puede acceder directamente a atributos `private` de la superclase.

---

## Taller 9: Uso de `super` y Herencia

### Ejercicio 1: Clase Persona y Empleado
- **Conceptos:** Dos contextos de `super`: constructor y método.
- **Clases:** `Persona` y `Empleado` (hereda y añade `departamento`).
- **Aprendizaje:**
    - `super(nombre, edad)` para inicializar la parte de `Persona` en `Empleado`.
    - `super.mostrarDetalles()` para extender (no reemplazar) el comportamiento.

### Ejercicio 2: Clase Animal y Pez
- **Conceptos:** Reforzar el uso de `super`.
- **Clases:** `Animal` (especie) y `Pez` (hereda y añade `tipoDeAgua`).
- **Aprendizaje:** Aplicar los dos usos de `super` en un nuevo contexto (animales).

### Ejercicio 3: Uso Incorrecto de `super`
- **Conceptos:** Errores de compilación con `super`.
- **Aprendizaje:**
    - No se puede usar `super` fuera de una clase derivada.
    - `super` no otorga acceso a atributos `private`.

---

## Taller 10: Sobrescritura de Métodos y Polimorfismo

### Ejercicio 1: Clase Persona, Estudiante y Profesor
- **Conceptos:** Polimorfismo, sobrescritura, extensión vs reemplazo.
- **Clases:** `Persona`, `Estudiante` (reemplaza `presentarse()`), `Profesor` (extiende `presentarse()` con `super`).
- **Aprendizaje:**
    - Una variable de tipo `Persona` puede referirse a un `Estudiante` o `Profesor`.
    - Diferencia entre **reemplazar** completamente un método y **extenderlo** usando `super`.

### Ejercicio 2: Clase Vehiculo y Bicicleta
- **Conceptos:** Polimorfismo simple.
- **Clases:** `Vehiculo` y `Bicicleta` (sobrescribe `moverse()`).
- **Aprendizaje:** Demostración básica de que el método ejecutado depende del objeto real, no del tipo de la variable.

### Ejercicio 3: Uso Incorrecto de Sobrescritura
- **Conceptos:** Errores y malas prácticas en sobrescritura.
- **Aprendizaje:**
    - Cambiar la firma del método no es sobrescritura.
    - Siempre usar `@Override` para detectar errores.
    - Una subclase no puede reducir la visibilidad de un método sobrescrito.

---

## Taller 11: Clases Abstractas

### Ejercicio 1: Clase Figura, Circulo y Rectangulo
- **Conceptos:** Clases abstractas, métodos abstractos.
- **Clases:** `Figura` (abstracta con `calcularArea()`), `Circulo`, `Rectangulo`.
- **Aprendizaje:**
    - No se puede instanciar una clase abstracta.
    - Las subclases concretas **deben** implementar todos los métodos abstractos.
    - Combinar métodos abstractos con métodos concretos (e.g., `mostrarArea()`).

### Ejercicio 2: Clase Empleado, Gerente y Vendedor
- **Conceptos:** Clases abstractas en un caso de uso real.
- **Clases:** `Empleado` (abstracta con `calcularSalario()`), `Gerente` (salario + bono), `Vendedor` (salario + comisión).
- **Aprendizaje:** Diferentes implementaciones de una misma abstracción para distintas reglas de negocio.

### Ejercicio 3: Uso Incorrecto de Clases Abstractas
- **Conceptos:** Errores comunes con abstracción.
- **Aprendizaje:**
    - No instanciar clases abstractas.
    - No olvidar implementar métodos abstractos en subclases concretas.
    - Evitar métodos abstractos innecesarios (si todas las subclases hacen lo mismo, el método debe ser concreto).

---

## Taller 12: Interfaces y Herencia Múltiple

### Ejercicio 1: Clase Ave con Interfaces Volador y Cantante
- **Conceptos:** Interfaces como contrato, herencia múltiple de tipo.
- **Interfaces:** `Volador` (`volar()`), `Cantante` (`cantar()`).
- **Clase:** `Ave` implementa ambas.
- **Aprendizaje:**
    - Una clase puede implementar múltiples interfaces ("puede-hacer").
    - Las interfaces definen capacidades, no una taxonomía ("es-un").

### Ejercicio 2: Clase Pez con Interfaces Nadador y Respirador
- **Conceptos:** Múltiples interfaces, métodos `default`.
- **Interfaces:** `Nadador` (`nadar()`), `Respirador` (`respirar()` y método `default tomarAire()`).
- **Clase:** `Pez` implementa ambas.
- **Aprendizaje:** Uso de métodos `default` para proporcionar implementaciones comunes en interfaces.

### Ejercicio 3: Implementación Incorrecta de Múltiples Interfaces
- **Conceptos:** Errores y malas prácticas con interfaces.
- **Aprendizaje:**
    - Una clase concreta debe implementar **todos** los métodos de la interfaz.
    - Resolver conflictos de métodos `default` sobrescribiéndolos.
    - No implementar una interfaz si la clase no tiene una relación semántica clara con ella (ej. `Edificio implements Movible`).

---

## Taller 13: Clases Abstractas e Interfaces - Ejercicios Combinados

### Ejercicio 1: Clase Figura con Rectángulo y Triángulo
- **Conceptos:** Clases abstractas, métodos abstractos, polimorfismo.
- **Clases:** `Figura` (abstracta con `calcularArea()`), `Rectangulo` (base * altura), `Triangulo` (base * altura / 2).
- **Aprendizaje:**
    - Una clase abstracta define un contrato que las subclases deben cumplir.
    - Cada figura implementa su propia fórmula de área.
    - Las clases de prueba pueden tratar todas las figuras como objetos de tipo `Figura`.

### Ejercicio 2: Interfaces Volador y Nadador con Clase Pato
- **Conceptos:** Herencia múltiple mediante interfaces, clases que implementan múltiples interfaces.
- **Interfaces:** `Volador` (`volar()`), `Nadador` (`nadar()`).
- **Clase:** `Pato` implementa ambas interfaces.
- **Aprendizaje:**
    - Java permite que una clase implemente múltiples interfaces.
    - Las interfaces definen capacidades o roles ("puede-hacer").
    - Un pato puede volar Y nadar, demostrando la flexibilidad de las interfaces frente a la herencia simple.

### Ejercicio 3: Uso Incorrecto de Clases Abstractas e Interfaces
- **Conceptos:** Errores de compilación, diferencias entre clases abstractas e interfaces.
- **Aprendizaje:**
    - **Error 1:** Una clase concreta debe implementar **todos** los métodos de una interfaz.
    - **Error 2:** La palabra clave `default` **solo existe para interfaces** (Java 8+), no para clases abstractas.
    - En clases abstractas, los métodos con implementación se escriben normalmente, sin la palabra `default`.

---

## Taller 14: Polimorfismo - Ejercicios Avanzados

### Ejercicio 1: Clase Figura con Círculo y Rectángulo
- **Conceptos:** Polimorfismo dinámico, sobrescritura de métodos.
- **Clases:** `Figura` (método `calcularArea()` general), `Circulo`, `Rectangulo` (sobrescriben el método).
- **Aprendizaje:**
    - Una variable de tipo `Figura` puede apuntar a objetos `Circulo` o `Rectangulo`.
    - El método que se ejecuta depende del **objeto real**, no del tipo de referencia.

### Ejercicio 2: Clase Persona con Estudiante y Profesor
- **Conceptos:** Polimorfismo con jerarquías del mundo real.
- **Clases:** `Persona`, `Estudiante`, `Profesor` (cada una sobrescribe `presentarse()`).
- **Aprendizaje:**
    - El polimorfismo permite tratar objetos de diferentes subclases de manera uniforme.
    - Cada clase derivada personaliza el comportamiento del método heredado.

### Ejercicio 3: Uso Incorrecto de Polimorfismo
- **Conceptos:** Errores de compilación, malas prácticas en sobrescritura.
- **Aprendizaje:**
    - **Error 1:** No se puede invocar un método que existe solo en la subclase usando una referencia de la clase base.
    - **Mala práctica:** Sobrescribir un método sin cambiar su comportamiento (llamar solo a `super.metodo()` sin agregar nada) es redundante y confuso.

### Ejercicio 4: Clase Vehículo con Coche y Bicicleta
- **Conceptos:** Polimorfismo aplicado a vehículos.
- **Clases:** `Vehiculo` (`mover()`), `Coche`, `Bicicleta` (sobrescriben `mover()`).
- **Aprendizaje:** Una misma llamada a `mover()` produce diferentes resultados según el tipo de vehículo, demostrando la flexibilidad del polimorfismo.

---

## Taller 15: Principio de Responsabilidad Única (SRP)

### Ejercicio 1: Refactorización de una Clase Libro
- **Conceptos:** SRP (Single Responsibility Principle), identificación de violaciones, delegación.
- **Clase original:** `Libro` mezclaba datos del libro, generación de reportes y persistencia en BD.
- **Refactorización:**
    - `Libro`: Solo datos del libro.
    - `LibroReporteService`: Responsable de generar reportes.
    - `LibroRepository`: Responsable de persistencia.
- **Aprendizaje:** Una clase no debe tener más de una razón para cambiar. Separar responsabilidades facilita el mantenimiento.

### Ejercicio 2: Separación de Responsabilidades en una Clase Producto
- **Conceptos:** SRP aplicado a datos, lógica de negocio y presentación.
- **Clase original:** `Producto` mezclaba datos, cálculo de precios con impuestos y generación de etiquetas.
- **Refactorización:**
    - `Producto`: Solo datos del producto.
    - `CalculadoraPrecios`: Responsable de cálculos de precios e impuestos.
    - `EtiquetaService`: Responsable de generar etiquetas de producto.
- **Aprendizaje:** Separar la lógica de negocio de la presentación mejora la reutilización y el testing.

### Ejercicio 3: Separar la Lógica de Autenticación en un Sistema
- **Conceptos:** SRP aplicado a seguridad y validación.
- **Clase original:** `Usuario` mezclaba datos de usuario, validación de campos y lógica de autenticación.
- **Refactorización:**
    - `Usuario`: Solo datos del usuario.
    - `ValidadorUsuario`: Responsable de validar email, contraseña, etc.
    - `AutenticacionService`: Responsable de verificar credenciales.
- **Aprendizaje:** Separar las reglas de negocio (validaciones) de la lógica de seguridad (autenticación) hace el código más modular y seguro.

---
## Taller 16: Principio de Abierto/Cerrado (OCP)

### Definición Formal del OCP
> "Las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para la extensión, pero cerradas para la modificación."

**Analogía:** Construir una casa con una estructura sólida. Para hacer mejoras o agregar una habitación, no se destruye una pared estructural, sino que se construye una nueva habitación anexa (extensión). En software, se deben poder agregar nuevas funcionalidades sin alterar el código que ya funciona, utilizando herencia y polimorfismo.

### Beneficios del OCP
| Beneficio | Descripción |
|-----------|-------------|
| **Facilita el Mantenimiento** | Agregar nuevas características sin modificar código existente minimiza el riesgo de errores. |
| **Permite la Evolución del Código** | Los requisitos cambian con el tiempo; el OCP facilita el crecimiento seguro del sistema. |
| **Mayor Reusabilidad** | Clases extensibles mediante herencia o interfaces son más reutilizables en diferentes contextos. |

### Desventajas del OCP
| Desventaja | Descripción |
|------------|-------------|
| **Complejidad Inicial** | Requiere planificación y diseño inicial más complejo (herencia, composición, interfaces). |
| **Aumento de Clases** | Puede llevar a la creación de múltiples clases, difíciles de gestionar sin una estructura clara. |

### Conceptos Relacionados que se Deben Dominar
- **Herencia:** Capacidad de una clase para heredar las características de otra clase.
- **Polimorfismo:** Capacidad de diferentes clases para implementar métodos con la misma firma de diferentes maneras.
- **Abstracción:** Definición de una clase base o interfaz que define un comportamiento común sin especificar detalles de implementación.

---

## Cómo usar estos ejercicios

1. **Por taller:** Cada taller introduce un nuevo concepto fundamental de POO.
2. **Por ejercicio:** Dentro de cada taller, los ejercicios aumentan en complejidad.
3. **Código:** Las soluciones incluyen el código completo de las clases y las clases de prueba (`Test...`).
4. **Errores:** Los talleres también muestran ejemplos de **código incorrecto** y sus mensajes de error, lo cual es excelente para aprender a depurar y evitar malas prácticas.

## Requisitos para ejecutar el código

- Java Development Kit (JDK) 8 o superior.
- Un editor de código o IDE (IntelliJ IDEA, Eclipse, VS Code).
- Compilar y ejecutar desde la terminal con `javac` y `java` o usando el IDE.

## Resumen de Buenas Prácticas Destacadas

- **Encapsulamiento:** Hacer los atributos `private` y proporcionar getters/setters con validación.
- **Herencia:** Usar `super()` en el constructor de la subclase. Preferir `protected` sobre `private` si se espera herencia.
- **Sobrescritura:** Siempre usar la anotación `@Override`. No reducir la visibilidad del método. Solo sobrescribir si se va a cambiar o extender el comportamiento.
- **Polimorfismo:** Programar usando tipos abstractos (clases base o interfaces) para mayor flexibilidad.
- **Clases Abstractas:** Usarlas cuando se tiene una base común con comportamiento que las subclases deben implementar de forma diferente.
- **Interfaces:** Usarlas para definir capacidades o roles que una clase puede cumplir, permitiendo herencia múltiple de tipo.
- **SRP (Single Responsibility Principle):** Una clase debe tener una sola razón para cambiar. Separar datos, lógica de negocio, persistencia y presentación en clases diferentes.