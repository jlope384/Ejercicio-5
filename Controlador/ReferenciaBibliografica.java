package Controlador;

import java.util.ArrayList;

import Modelo.MaterialBibliografico;
import Modelo.DVD;
import Modelo.Libro;
import Modelo.ArticuloCientifico;
import Modelo.Otros;
import Modelo.Periodico;
import Modelo.Tesis;

public class ReferenciaBibliografica {
    ArrayList<MaterialBibliografico> libro = new ArrayList<MaterialBibliografico>();
    ArrayList<MaterialBibliografico> DVD = new ArrayList<MaterialBibliografico>();
    ArrayList<MaterialBibliografico> Periodico = new ArrayList<MaterialBibliografico>();
    ArrayList<MaterialBibliografico> Tesis = new ArrayList<MaterialBibliografico>();
    ArrayList<MaterialBibliografico> ArticuloCientifico = new ArrayList<MaterialBibliografico>();
    ArrayList<MaterialBibliografico> Otros = new ArrayList<MaterialBibliografico>();

    public void AddMaterialBibliograficoLibro(String tipo, String nombre, String editorial, String fechaPublicacion,
            String genero, String autor) {
        Libro libros = new Libro(tipo, nombre, editorial, fechaPublicacion, genero, autor);
        libro.add(libros);
    }

    public void AddMaterialBibliograficoDVD(String tipo, String nombre, String productora, String fechaPublicacion,
            String genero, String duracion, String autor) {
        DVD dvd = new DVD(tipo, nombre, productora, fechaPublicacion, genero, duracion, autor);
        DVD.add(dvd);
    }

    public void AddMaterialBibliograficoPeriodico(String tipo, String nombre, String editorial, String fechaPublicacion,
            String titularPeriodico, String autor) {
        Periodico periodico = new Periodico(tipo, nombre, editorial, fechaPublicacion, titularPeriodico, autor, autor);
        Periodico.add(periodico);
    }

    public void AddMaterialBibliograficoTesis(String tipo, String nombre, String institucionAcademica,
            String fechaPublicacion, String genero, String autor) {
        Tesis tesis = new Tesis(tipo, nombre, institucionAcademica, fechaPublicacion, genero, autor);
        Tesis.add(tesis);
    }

    public void AddMaterialBibliograficoArticuloCientifico(String tipo, String nombre, String editorial,
            String fechaPublicacion, String genero, String numeroPaginas, String volumen, String autor) {
        ArticuloCientifico arCient = new ArticuloCientifico(tipo, nombre, editorial, fechaPublicacion, genero,
                numeroPaginas, volumen, autor);
        ArticuloCientifico.add(arCient);
    }

    public void AddMaterialBibliograficoOtros(String tipo, String nombre, String editorial, String fechaPublicacion,
            String genero, String autor) {
        Otros otros = new Otros(tipo, nombre, editorial, fechaPublicacion, genero, autor);
        Otros.add(otros);
    }

    public String referenciaBibliograficaLibro() {
        StringBuilder referencias = new StringBuilder();
        for (MaterialBibliografico material : libro) {
            if (material.getTipo().equalsIgnoreCase("libro")) {
                String referencia = material.getAutor() + " (" + material.getFechaPublicacion() + "). "
                        + material.getNombre() + ". " + material.getEditorial() + ".";
                referencias.append(referencia).append("\n");
            }
        }

        return referencias.toString();
    }

    public String referenciaBibliograficaDVD() {
        StringBuilder referencias = new StringBuilder();
        for (MaterialBibliografico material : DVD) {
            if (material.getTipo().equalsIgnoreCase("DVD")) {
                String referencia = material.getAutor() + " (" + material.getFechaPublicacion() + "). "
                        + material.getNombre() + " [" + material.getDuracion() + "]. " + material.getProductora() + ".";
                referencias.append(referencia).append("\n");
            }
        }

        return referencias.toString();
    }

    public String referenciaBibliograficaArticuloCientifico() {
        StringBuilder referencias = new StringBuilder();
        for (MaterialBibliografico material : ArticuloCientifico) {
            if (material.getTipo().equalsIgnoreCase("Articulo Cientifico")) {
                String referencia = material.getAutor() + " (" + material.getFechaPublicacion() + "). "
                        + material.getNombre() + ". " + material.getEditorial() + ", " + material.getVolumen() + "("
                        + material.getNumeroPaginas() + ").";
                referencias.append(referencia).append("\n");
            }
        }

        return referencias.toString();
    }

    public String referenciaBibliograficacitarPeriodico() {
        StringBuilder referencias = new StringBuilder();
        for (MaterialBibliografico material : Periodico) {
            if (material.getTipo().equalsIgnoreCase("Periodico")) {
                String referencia = material.getAutor() + " (" + material.getFechaPublicacion() + "). "
                        + material.getTitularPeriodico() + ". " + material.getNombre() + ". " + material.getEditorial()
                        + ".";
                referencias.append(referencia).append("\n");
            }
        }

        return referencias.toString();
    }

    public String referenciaBibliograficaTesis() {
        StringBuilder referencias = new StringBuilder();
        for (MaterialBibliografico material : Tesis) {
            if (material.getTipo().equalsIgnoreCase("Tesis")) {
                String referencia = material.getAutor() + " (" + material.getFechaPublicacion() + "). "
                        + material.getNombre() + ". Tesis de grado, " + material.getInstitucionAcademica() + ".";
                referencias.append(referencia).append("\n");
            }
        }

        return referencias.toString();
    }

    public String referenciaBibliograficaOtros() {
        StringBuilder referencias = new StringBuilder();
        for (MaterialBibliografico material : Otros) {
            if (material.getTipo().equalsIgnoreCase("Otros")) {
                String referencia = material.getAutor() + " (" + material.getFechaPublicacion() + "). "
                        + material.getNombre() + ". " + material.getEditorial() + ".";
                referencias.append(referencia).append("\n");
            }
        }

        return referencias.toString();
    }

    public String generarCitaLibro() {
        StringBuilder cita = new StringBuilder();
        for (MaterialBibliografico material : libro) {
            if (material != null) {
                if (material.getAutor() != null) {
                    cita.append(material.getAutor());
                    if (material.getNombre() != null) {
                        cita.append(" (").append(material.getFechaPublicacion()).append("). ")
                                .append(material.getNombre()).append("\n");
                    }
                }
            } else {
                cita.append("No se encontraron materiales para citar.\n");
            }
        }
        return cita.toString();
    }

    public String generarCitaDVD() {
        StringBuilder cita = new StringBuilder();
        for (MaterialBibliografico material : DVD) {
            if (material != null) {
                if (material.getAutor() != null) {
                    cita.append(material.getAutor());
                    if (material.getNombre() != null) {
                        cita.append(" (").append(material.getFechaPublicacion()).append("). ").append(" [")
                                .append(material.getDuracion()).append("]. ").append(material.getProductora())
                                .append("\n");
                        cita.append("\n");
                    }
                }
            } else {
                cita.append("No se encontraron materiales para citar.\n");
            }
        }

        return cita.toString();
    }

    public String generarCitaArticuloCientifico() {
        StringBuilder cita = new StringBuilder();
        for (MaterialBibliografico material : ArticuloCientifico) {
            if (material != null) {
                if (material.getAutor() != null) {
                    cita.append(material.getAutor());
                    if (material.getNombre() != null) {
                        cita.append(" (").append(material.getFechaPublicacion()).append("). ")
                                .append(material.getNombre()).append("\n").append(". ").append(material.getEditorial())
                                .append(", ").append(material.getVolumen())
                                .append("(").append(material.getNumeroPaginas()).append(").");
                    }
                }
            } else {
                cita.append("No se encontraron materiales para citar.\n");
            }
        }
        return cita.toString();
    }

    public String generarCitaPeriodico() {
        StringBuilder cita = new StringBuilder();
        for (MaterialBibliografico material : Periodico) {
            if (material != null) {
                if (material.getAutor() != null) {
                    cita.append(material.getAutor());
                    if (material.getNombre() != null) {
                        cita.append(" (").append(material.getFechaPublicacion()).append("). ")
                                .append(material.getNombre()).append("\n").append("\"")
                                .append(material.getTitularPeriodico()).append("\", ").append(". ")
                                .append(material.getEditorial());
                    }
                }
            } else {
                cita.append("No se encontraron materiales para citar.\n");
            }
        }
        return cita.toString();
    }

    public String generarCitaTesis() {
        StringBuilder cita = new StringBuilder();
        for (MaterialBibliografico material : Tesis) {
            if (material != null) {
                if (material.getAutor() != null) {
                    cita.append(material.getAutor());
                    if (material.getNombre() != null) {
                        cita.append(" (").append(material.getFechaPublicacion()).append("). ")
                                .append(material.getNombre()).append("\n").append("\"").append(material.getNombre())
                                .append("\", ").append(material.getInstitucionAcademica());
                    }
                }
            } else {
                cita.append("No se encontraron materiales para citar.\n");
            }
        }
        return cita.toString();
    }

    public String generarCitaOtros() {
        StringBuilder cita = new StringBuilder();
        for (MaterialBibliografico material : Otros) {
            if (material != null) {
                if (material.getAutor() != null) {
                    cita.append(material.getAutor());
                    if (material.getNombre() != null) {
                        cita.append(" (").append(material.getFechaPublicacion()).append("). ")
                                .append(material.getNombre()).append("\n");
                    }
                }
            } else {
                cita.append("No se encontraron materiales para citar.\n");
            }
        }
        return cita.toString();
    }


    public void mostrarCatalogo() {
        System.out.println("Catálogo de Materiales Bibliográficos:");

        // Mostrar libros
        System.out.println("Libros:");
        for (MaterialBibliografico libro : libro) {
            System.out.println(libro.toString());
        }

        // Mostrar DVDs
        System.out.println("DVDs:");
        for (MaterialBibliografico dvd : DVD) {
            System.out.println(dvd.toString());
        }

        // Mostrar Articulos Cientificos
        System.out.println("Articulos Cientificos:");
        for (MaterialBibliografico articuloCientifico : ArticuloCientifico) {
            System.out.println(articuloCientifico.toString());
        }

        // Mostrar Periodicos
        System.out.println("Periodicos:");
        for (MaterialBibliografico periodico : Periodico) {
            System.out.println(periodico.toString());
        }

        // Mostrar Tesis
        System.out.println("Tesis:");
        for (MaterialBibliografico tesis : Tesis) {
            System.out.println(tesis.toString());
        }

        // Mostrar Otros
        System.out.println("Otros:");
        for (MaterialBibliografico otros : Otros) {
            System.out.println(otros.toString());
        }
    }
    
    // Agregar un material bibliográfico al catálogo
    public void agregarMaterialBibliografico(MaterialBibliografico material) {
        if (material instanceof Libro) {
            libro.add(material);
        } else if (material instanceof DVD) {
            DVD.add(material);
        } else if (material instanceof ArticuloCientifico) {
            ArticuloCientifico.add(material);
        } else if (material instanceof Periodico) {
            Periodico.add(material);
        } else if (material instanceof Tesis) {
            Tesis.add(material);
        } else if (material instanceof Otros) {
            Otros.add(material);
        }
    }
    //Necesito saber cuanto material bibliografico hay en el catalogo
    public int contarMaterialBibliografico() {
        int cantidad = 0;
        cantidad += libro.size();
        cantidad += DVD.size();
        cantidad += ArticuloCientifico.size();
        cantidad += Periodico.size();
        cantidad += Tesis.size();
        cantidad += Otros.size();
        System.out.println("Hay " + cantidad + " materiales bibliograficos en el catalogo.");
        return cantidad;
    }   
}