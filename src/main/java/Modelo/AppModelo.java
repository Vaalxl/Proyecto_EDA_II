package Modelo;

import java.util.List;


public class AppModelo {

    private final String institucion = "Escuela Politécnica Nacional";
    private final String materia = "Estructura de Datos y Algoritmos II";
    private final String estudiante = "Valeria Zapata";

    public String getInstitucion() { return institucion; }
    public String getMateria() { return materia; }
    public String getEstudiante() { return estudiante; }

    public List<TemaModelo> getTemas() {
        return List.of(TemaModelo.values());
    }
}
