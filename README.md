# Calculadora de Áreas — Figuras Geométricas (Java Swing)

Aplicación de escritorio sencilla en Java que permite calcular el área de figuras geométricas (Rectángulo, Triángulo y Círculo) a través de una interfaz gráfica con Swing.

---

## Contenidos
- Descripción
- Características
- Requisitos
- Estructura del proyecto
- Cómo ejecutar
  - Con IDE (Eclipse)
  - Con línea de comandos (javac/java)
- Uso de la aplicación
- API y diseño (Clases e interfaz)
- Extender el proyecto (añadir nuevas figuras)
- Manejo de errores y validaciones
- Posibles mejoras
- Licencia

---

## Descripción
- Proyecto educativo para practicar:
  - Programación orientada a interfaces.
  - Implementación de clases que representan figuras geométricas.
  - Uso de Java Swing para construir GUIs simples.
- La interfaz permite seleccionar una figura, ingresar los valores correspondientes y calcular el área.

---

## Características
- Interfaz gráfica con Swing.
- Soporte para:
  - Rectángulo (ancho x alto).
  - Triángulo (base x altura).
  - Círculo (radio).
- Cálculo de área unificado mediante la interfaz `FiguraGeometrica`.
- Método de comparación `mayorQue` para comparar áreas entre figuras.
- Mensajes de error para entradas no numéricas.

---

## Requisitos
- JDK 8 o superior.
- (Opcional) IDE como Eclipse, IntelliJ IDEA o NetBeans.

---

## Estructura del proyecto
- FiguraGeometricaACT/
  - .classpath
  - .project
  - .settings/
    - org.eclipse.core.resources.prefs
    - org.eclipse.jdt.core.prefs
  - bin/
    - Circulo.class
    - FiguraGeometrica.class
    - Main.class
    - Main$1.class
    - Main$2.class
    - Rectangulo.class
    - Triangulo.class
  - src/
    - Circulo.java
    - FiguraGeometrica.java
    - Main.java
    - Rectangulo.java
    - Triangulo.java


---

## Cómo ejecutar

### Opción A: Ejecutar con Eclipse
- Importa el proyecto como “Existing Projects into Workspace”.
- Asegúrate de que el JRE asociado sea JDK 8+.
- Ejecuta la clase `Main` (Run As > Java Application).

### Opción B: Ejecutar por línea de comandos
- Compilar:
  ```bash
  cd FiguraGeometricaACT
  javac -d bin src/*.java
