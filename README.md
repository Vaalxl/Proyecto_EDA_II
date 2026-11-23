# EPN – Estructura de Datos y Algoritmos II (JavaFX, MVC)

Autora: Valeria Zapata

### Estructura 
### Paquete Modelo
- *AppModelo.java*: guarda los datos de la aplicación (institución, materia y nombre de la estudiante) y la lista de temas del menú.
- *TemaModelo.java*: enumeración con las 4 opciones del menú: Eficiencia Algorítmica, Análisis de Complejidad, P - NP - NP Hard - NP Completo y Grafos.

### Paquete Vista
- *InicioVista.java: pantalla de inicio con el logo de la EPN, el nombre de la institución, la materia, la estudiante y el botón *Ingresar.
- *MenuVista.java: pantalla del menú principal con las 4 opciones y el botón *Regresar.
- *DecoracionVista.java*: elementos decorativos compartidos por las vistas (franjas con los colores de la EPN, logo, fondo y esquinas).

### Paquete Controlador
- *InicioControlador.java: maneja el botón *Ingresar y abre el menú.
- *MenuControlador.java: maneja las opciones del menú y el botón *Regresar.
- *Navegador.java*: se encarga de cambiar entre pantallas.

### Paquete Launcher
- *App.java*: inicia la aplicación JavaFX y crea la ventana.
- *Main.java*: clase principal que lanza la aplicación.

### Recursos
- *styles.css*: colores y estilos (rojo, blanco y azul marino).
- *images/logo_epn.png*: logo de la institución.


## Ejecutar
Requisitos: JDK 17 o superior y Maven.

```
mvn clean javafx:run
```

En NetBeans: abrir la carpeta como proyecto Maven y ejecutar la clase Main


