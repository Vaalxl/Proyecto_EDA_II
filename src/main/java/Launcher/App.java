package Launcher;

import Controlador.Navegador;
import Modelo.AppModelo;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        AppModelo modelo = new AppModelo();
        Navegador navegador = new Navegador(stage, modelo);

        stage.setTitle(modelo.getInstitucion() + " - " + modelo.getMateria());
        var logo = App.class.getResourceAsStream("images/logo_epn.png");
        if (logo != null) {
            stage.getIcons().add(new Image(logo));
        }
        stage.setWidth(900);

        double altoPantalla = Screen.getPrimary().getVisualBounds().getHeight();
        stage.setHeight(Math.min(720, altoPantalla - 20));
        stage.setMinWidth(760);
        stage.setMinHeight(620);

        navegador.mostrarInicio();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
