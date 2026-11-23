package Modelo;


public enum TemaModelo {
    EFICIENCIA_ALGORITMICA(1, "Eficiencia Algorítmica"),
    ANALISIS_COMPLEJIDAD(2, "Análisis de Complejidad"),
    P_NP(3, "P - NP - NP Hard - NP Completo"),
    GRAFOS(4, "Grafos");

    private final int numero;
    private final String titulo;

    TemaModelo(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero() { return numero; }
    public String getTitulo() { return titulo; }

    @Override
    public String toString() { return numero + ". " + titulo; }
}
