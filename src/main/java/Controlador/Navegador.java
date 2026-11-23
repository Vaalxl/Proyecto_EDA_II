package Controlador;

import Modelo.AppModelo;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Controla el cambio entre pantallas
public class Navegador {

    private final Stage stage;
    private final AppModelo modelo;
    private Scene scene;

    public Navegador(Stage stage, AppModelo modelo) {
        this.stage = stage;
        this.modelo = modelo;
    }

    public void mostrarInicio() {
        mostrar(new InicioControlador(modelo, this).getVista());
    }

    public void mostrarMenu() {
        mostrar(new MenuControlador(modelo, this).getVista());
    }

    private void mostrar(Parent vista) {
        if (scene == null) {
            scene = new Scene(vista);
            var css = Navegador.class.getResource("/ec/edu/epn/eda2/styles.css");
            if (css != null) {
                scene.getStylesheets().add(css.toExternalForm());
            }
            stage.setScene(scene);
        } else {
            scene.setRoot(vista);
        }
    }
}
