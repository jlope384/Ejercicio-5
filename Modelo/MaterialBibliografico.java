package Modelo;

public class MaterialBibliografico {
    private String nombre;
    private String editorial;
    private String fechaPublicacion;
    private String genero;
    private String autor;
    private String tipo;

    public MaterialBibliografico(String nombre, String editorial, String fechaPublicacion, String genero,
            String autor, String tipo) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.genero = genero;
        this.autor = autor;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}