package Modelo;

public class Tesis extends MaterialBibliografico {
    private String nombreInstitucionAcademica;

    public Tesis(String tipo, String nombre, String institucionAcademica, String fechaPublicacion, String genero,
            String autor) {
        super(tipo, nombre, institucionAcademica, fechaPublicacion, genero, autor);
    }

    public String getInstitucionAcademica() {
        return nombreInstitucionAcademica;
    }

    public void setInstitucionAcademica(String nombreInstitucionAcademica) {
        this.nombreInstitucionAcademica = nombreInstitucionAcademica;
    }
}
