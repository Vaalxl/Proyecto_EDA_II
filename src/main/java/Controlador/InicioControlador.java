package Controlador;

import Modelo.AppModelo;
import Vista.InicioVista;
import javafx.scene.Parent;


public class InicioControlador {

    private final InicioVista vista;

    public InicioControlador(AppModelo modelo, Navegador navegador) {
        this.vista = new InicioVista(modelo);
        vista.getBtnIngresar().setOnAction(e -> navegador.mostrarMenu());
    }

    public Parent getVista() { return vista.getRoot(); }
}
