package Modelo;

public class Libro extends MaterialBibliografico {

    public Libro(String nombre, String editorial, String fechaPublicacion, String genero, String autor, String tipo) {
        super(tipo, nombre, editorial, fechaPublicacion, genero, autor);
    }
}
