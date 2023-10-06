package Modelo;

public class ArticuloCientifico extends MaterialBibliografico {
    private String numeroPaginas;
    private String volumen;

    public ArticuloCientifico(String nombre, String editorial, String fechaPublicacion, String genero,
            String numeroPaginas, String volumen, String autor,
            String tipo) {
        super(nombre, editorial, fechaPublicacion, genero, autor, tipo);
        this.numeroPaginas = numeroPaginas;
        this.volumen = volumen;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }
}
