package Vista;

import Modelo.AppModelo;
import Modelo.TemaModelo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.util.LinkedHashMap;
import java.util.Map;

//menú principal 
public class MenuVista {

    private final BorderPane root = new BorderPane();
    private final Map<TemaModelo, Button> botonesTema = new LinkedHashMap<>();
    private final Button btnRegresar = new Button("← Regresar");

    public MenuVista(AppModelo modelo) {
       
        Label lblInst = new Label(modelo.getInstitucion());
        lblInst.getStyleClass().add("header-titulo");
        Label lblMat = new Label(modelo.getMateria());
        lblMat.getStyleClass().add("header-subtitulo");
        Label lblNom = new Label(modelo.getEstudiante());
        lblNom.getStyleClass().add("header-nombre");
        VBox textos = new VBox(3, lblInst, lblMat, lblNom);
        textos.setAlignment(Pos.CENTER_LEFT);

        Region espacio = new Region();
        HBox.setHgrow(espacio, Priority.ALWAYS);
        btnRegresar.getStyleClass().add("boton-borde");

        HBox banda = new HBox(18, DecoracionVista.logo(90), textos, espacio, btnRegresar);
        banda.setAlignment(Pos.CENTER_LEFT);
        banda.setPadding(new Insets(16, 28, 16, 28));
        banda.getStyleClass().add("header-azul");

        root.setTop(new VBox(
                DecoracionVista.franja("franja-roja-media"),
                banda,
                DecoracionVista.franja("franja-blanca"),
                DecoracionVista.franja("franja-roja-media")));
        root.setBottom(DecoracionVista.pie());

        
        Label lblMenu = new Label("MENÚ PRINCIPAL");
        lblMenu.getStyleClass().add("menu-titulo");

        VBox opciones = new VBox(14);
        opciones.setAlignment(Pos.CENTER);
        for (TemaModelo tema : modelo.getTemas()) {
            Button b = crearBotonTema(tema);
            botonesTema.put(tema, b);
            opciones.getChildren().add(b);
        }

        VBox tarjeta = new VBox(16, lblMenu, DecoracionVista.ornamento(90), opciones);
        tarjeta.setAlignment(Pos.CENTER);
        tarjeta.getStyleClass().add("tarjeta");
        tarjeta.setMaxSize(580, VBox.USE_PREF_SIZE);

        root.setCenter(DecoracionVista.fondoConEsquinas(tarjeta));
    }

    private Button crearBotonTema(TemaModelo tema) {
        Label numero = new Label(String.valueOf(tema.getNumero()));
        numero.getStyleClass().add("opcion-numero");
        numero.setMinSize(42, 42);
        numero.setAlignment(Pos.CENTER);

        Label titulo = new Label(tema.getTitulo());
        titulo.getStyleClass().add("opcion-texto");

        Region espacio = new Region();
        HBox.setHgrow(espacio, Priority.ALWAYS);
        Label flecha = new Label("›");
        flecha.getStyleClass().add("opcion-flecha");

        HBox contenido = new HBox(16, numero, titulo, espacio, flecha);
        contenido.setAlignment(Pos.CENTER_LEFT);
        contenido.setMaxWidth(Double.MAX_VALUE);

        Button b = new Button();
        b.setGraphic(contenido);
        b.getStyleClass().add("opcion-menu");
        b.setMaxWidth(Double.MAX_VALUE);
        contenido.prefWidthProperty().bind(b.widthProperty().subtract(36));
        return b;
    }

    public Parent getRoot() { return root; }
    public Map<TemaModelo, Button> getBotonesTema() { return botonesTema; }
    public Button getBtnRegresar() { return btnRegresar; }
}
