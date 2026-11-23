package Vista;

import Modelo.AppModelo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

//construye la interfaz
public class InicioVista {

    private final BorderPane root = new BorderPane();
    private final Button btnIngresar = new Button("INGRESAR");

    public InicioVista(AppModelo modelo) {
        root.setTop(DecoracionVista.encabezadoTricolor());
        root.setBottom(DecoracionVista.pie());

        Label lblInstitucion = new Label(modelo.getInstitucion());
        lblInstitucion.getStyleClass().add("titulo");

        Label lblMateria = new Label(modelo.getMateria());
        lblMateria.getStyleClass().add("subtitulo");

        Label lblNombre = new Label(modelo.getEstudiante());
        lblNombre.getStyleClass().add("nombre");

        btnIngresar.getStyleClass().add("boton-rojo");
        btnIngresar.setDefaultButton(true);

        VBox tarjeta = new VBox(12,
                DecoracionVista.logo(160),
                lblInstitucion,
                lblMateria,
                lblNombre,
                btnIngresar);
        tarjeta.setAlignment(Pos.CENTER);
        tarjeta.getStyleClass().add("tarjeta");
        tarjeta.setMaxWidth(620);
        tarjeta.setMinHeight(VBox.USE_PREF_SIZE);
        tarjeta.setMaxHeight(VBox.USE_PREF_SIZE);
        VBox.setMargin(btnIngresar, new Insets(10, 0, 0, 0));

        root.setCenter(DecoracionVista.fondoConEsquinas(tarjeta));
    }

    public Parent getRoot() { return root; }
    public Button getBtnIngresar() { return btnIngresar; }
}
