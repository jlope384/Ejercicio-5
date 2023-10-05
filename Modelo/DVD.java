package Modelo;

public class DVD extends MaterialBibliografico {
    private String productora;
    private String duracion;
    public DVD(String nombre, String editorial, String fechaPublicacion, String genero, String autor, String tipo) {
        super(nombre, editorial, fechaPublicacion, genero, autor, tipo);
    }
    public String getProductora() {
        return productora;
    }
    public void setProductora(String productora) {
        this.productora = productora;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
