package Vista;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Polygon;

public final class DecoracionVista {

    private DecoracionVista() { }

    public static Region franja(String claseCss) {
        Region r = new Region();
        r.getStyleClass().add(claseCss);
        return r;
    }

    public static ImageView logo(double alto) {
        ImageView logo = new ImageView();
        var stream = DecoracionVista.class.getResourceAsStream("/ec/edu/epn/eda2/images/logo_epn.png");
        if (stream != null) {
            logo.setImage(new Image(stream));
        }
        logo.setFitHeight(alto);
        logo.setPreserveRatio(true);
        logo.setSmooth(true);
        return logo;
    }

    /** Línea roja — rombo azul — línea roja. */
    public static HBox ornamento(double anchoLinea) {
        Region izq = franja("linea-ornamento");
        Region der = franja("linea-ornamento");
        izq.setPrefWidth(anchoLinea);
        der.setPrefWidth(anchoLinea);
        Polygon rombo = new Polygon(0, 7, 7, 0, 14, 7, 7, 14);
        rombo.getStyleClass().add("rombo");
        HBox h = new HBox(8, izq, rombo, der);
        h.setAlignment(Pos.CENTER);
        return h;
    }

    /** Barra superior: franja roja gruesa, línea blanca y franja azul. */
    public static VBox encabezadoTricolor() {
        return new VBox(franja("franja-roja-gruesa"), franja("franja-blanca"), franja("franja-azul-media"));
    }

    /** Pie de página: línea roja y franja azul gruesa. */
    public static VBox pie() {
        return new VBox(franja("franja-roja-delgada"), franja("franja-azul-gruesa"));
    }

    /** Fondo con triángulos decorativos en las esquinas y el contenido al centro. */
    public static StackPane fondoConEsquinas(Node contenido) {
        Polygon azulSupIzq = new Polygon(0, 0, 170, 0, 0, 170);
        azulSupIzq.getStyleClass().add("tri-azul");
        Polygon rojoSupIzq = new Polygon(0, 0, 100, 0, 0, 100);
        rojoSupIzq.getStyleClass().add("tri-rojo");

        Polygon azulInfDer = new Polygon(170, 0, 170, 170, 0, 170);
        azulInfDer.getStyleClass().add("tri-azul");
        Polygon rojoInfDer = new Polygon(100, 0, 100, 100, 0, 100);
        rojoInfDer.getStyleClass().add("tri-rojo");

        StackPane fondo = new StackPane(azulSupIzq, rojoSupIzq, azulInfDer, rojoInfDer, contenido);
        StackPane.setAlignment(azulSupIzq, Pos.TOP_LEFT);
        StackPane.setAlignment(rojoSupIzq, Pos.TOP_LEFT);
        StackPane.setAlignment(azulInfDer, Pos.BOTTOM_RIGHT);
        StackPane.setAlignment(rojoInfDer, Pos.BOTTOM_RIGHT);
        StackPane.setAlignment(contenido, Pos.CENTER);
        fondo.getStyleClass().add("fondo-decorado");
        return fondo;
    }
}
