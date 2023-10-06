package Modelo;

public class DVD extends MaterialBibliografico {
    private String duracion;

    public DVD(String nombre, String editorial, String fechaPublicacion, String genero, String autor, String duracion,
            String tipo) {
        super(nombre, editorial, fechaPublicacion, genero, autor, tipo);
        this.duracion = duracion;

    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
