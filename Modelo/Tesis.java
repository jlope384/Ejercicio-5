package Modelo;

public class Tesis extends MaterialBibliografico {
    private String nombreInstitucionAcademica;

    public Tesis(String nombre, String editorial, String fechaPublicacion, String genero, String autor, String tipo) {
        super(nombre, editorial, fechaPublicacion, genero, autor, tipo);
    }
    
    public String getInstitucionAcademica() {
        return nombreInstitucionAcademica;
    }
    public void setInstitucionAcademica(String nombreInstitucionAcademica) {
        this.nombreInstitucionAcademica = nombreInstitucionAcademica;
    }
}
