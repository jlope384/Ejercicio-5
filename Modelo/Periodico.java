package Modelo;

public class Periodico extends MaterialBibliografico {

    private String titularPeriodico;

    public Periodico(String nombre, String editorial, String fechaPublicacion, String genero, String autor,
            String tipo, String autor2) {
        super(nombre, editorial, fechaPublicacion, genero, autor, tipo);
    }

    public String getTitularPeriodico() {
        return titularPeriodico;
    }
}
