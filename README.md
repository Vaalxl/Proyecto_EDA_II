# EPN – Estructura de Datos y Algoritmos II (JavaFX, MVC)

Autora: Valeria Zapata

## Estructura
```
src/main/java/ec/edu/epn/eda2/
├── Main.java / App.java        → arranque
├── view/Decoracion.java       → franjas, ornamentos y esquinas decorativas
├── model/      AppModel, Tema  → datos (institución, materia, nombre, temas)
├── view/       InicioView, MenuView → interfaz (solo construyen la pantalla)
└── controller/ Navegador, InicioController, MenuController → eventos y navegación
src/main/resources/ec/edu/epn/eda2/
├── styles.css            → colores EPN (rojo, blanco, azul marino)
└── images/logo_epn.png   → logo
```

## Ejecutar
Requisitos: JDK 17 o superior y Maven.

```
mvn clean javafx:run
```

En NetBeans: abrir la carpeta como proyecto Maven y ejecutar la clase Main


