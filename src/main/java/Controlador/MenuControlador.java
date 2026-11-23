package Controlador;

import Modelo.AppModelo;
import Modelo.TemaModelo;
import Vista.MenuVista;
import javafx.scene.Parent;
import javafx.scene.control.Alert;


public class MenuControlador {

    private final MenuVista vista;

    public MenuControlador(AppModelo modelo, Navegador navegador) {
        this.vista = new MenuVista(modelo);
        vista.getBtnRegresar().setOnAction(e -> navegador.mostrarInicio());
        vista.getBotonesTema().forEach((tema, boton) ->
                boton.setOnAction(e -> seleccionarTema(tema)));
    }

    //conecta cada modulo
    private void seleccionarTema(TemaModelo tema) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Escuela Politécnica Nacional");
        alerta.setHeaderText(tema.toString());
        alerta.setContentText("Módulo en construcción.");
        alerta.showAndWait();
    }

    public Parent getVista() { return vista.getRoot(); }
}
