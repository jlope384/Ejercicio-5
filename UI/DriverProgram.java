package UI;

import java.util.Scanner;

import Controlador.ReferenciaBibliografica;

//import Controlador.CSVManager;
public class DriverProgram {

    public static void main(String[] args) {
        String nombre;
        String editorial;
        String anoPublicacion;
        String genero;
        String autor;
        String tipo;
        String titularPeriodico;
        String institucionAcademica;
        String productora;
        String duracion;
        String volumen;
        String numeroPaginas;

        Scanner teclado = new Scanner(System.in);
        ReferenciaBibliografica referencias = new ReferenciaBibliografica();
        boolean ciclo = true;
        while (ciclo) {
            System.out.println("---Amparo Codina de Campollo ---");
            System.out.println("1. Agregar Material Bibliografico");
            System.out.println("2. Catalogo Disponible");
            System.out.println("3. Conteo de material bibliografico");
            System.out.println("5. Salir");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Agregar Material Bibliografico");
                    System.out.println("1. Libro");
                    System.out.println("2. Periodico");
                    System.out.println("3. Tesis");
                    System.out.println("4. DVD");
                    System.out.println("5. Articulo Cientifico");
                    System.out.println("6. Otros");
                    int MateBibl = teclado.nextInt();
                    teclado.nextLine();
                    if (MateBibl == 1) {
                        System.out.println("1. Libro");
                        System.out.println("Nombre del libro");
                        nombre = teclado.nextLine();
                        System.out.println("Editorial:");
                        editorial = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Genero:");
                        genero = teclado.nextLine();
                        System.out.println("Autor:");
                        autor = teclado.nextLine();
                        tipo = "libro";
                        referencias.AddMaterialBibliograficoLibro(tipo, nombre, editorial, anoPublicacion, genero,
                                autor);

                    }
                    if (MateBibl == 2) {
                        System.out.println("2. Periodico");
                        System.out.println("Nombre del Periodico");
                        nombre = teclado.nextLine();
                        System.out.println("Editorial Del Periodico:");
                        editorial = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Titular del Periodico:");
                        titularPeriodico = teclado.nextLine();
                        System.out.println("Autor:");
                        autor = teclado.nextLine();
                        tipo = "Periodico";
                        referencias.AddMaterialBibliograficoPeriodico(tipo, nombre, editorial, anoPublicacion,
                                titularPeriodico, autor);
                    }
                    if (MateBibl == 3) {
                        System.out.println("3. Tesis");
                        System.out.println("Titulo de la Tesis");
                        nombre = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Nombre de la Institucion Academica:");
                        institucionAcademica = teclado.nextLine();
                        System.out.println("Genero:");
                        genero = teclado.nextLine();
                        System.out.println("Autor:");
                        autor = teclado.nextLine();
                        tipo = "Tesis";
                        referencias.AddMaterialBibliograficoTesis(tipo, nombre, institucionAcademica, anoPublicacion,
                                genero, autor);
                    }
                    if (MateBibl == 4) {
                        System.out.println("4. DVD");
                        System.out.println("Nombre de la Pelicula");
                        nombre = teclado.nextLine();
                        System.out.println("Productura de la Pelicula:");
                        productora = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Genero:");
                        genero = teclado.nextLine();
                        System.out.println("Director:");
                        autor = teclado.nextLine();
                        System.out.println("Duracion:");
                        duracion = teclado.nextLine();
                        tipo = "DVD";
                        referencias.AddMaterialBibliograficoDVD(tipo, nombre, productora, anoPublicacion, genero,
                                duracion, autor);
                    }
                    if (MateBibl == 5) {
                        System.out.println("5. Articulo Cientifico");
                        System.out.println("Nombre del Articulo");
                        nombre = teclado.nextLine();
                        System.out.println("Titulo de la Revista:");
                        editorial = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Genero Cientifico:");
                        genero = teclado.nextLine();
                        System.out.println("Numero de Paginas:");
                        numeroPaginas = teclado.nextLine();
                        System.out.println("Volumen del Articulo:");
                        volumen = teclado.nextLine();
                        System.out.println("Autor:");
                        autor = teclado.nextLine();
                        tipo = "Articulo Cientifico";
                        referencias.AddMaterialBibliograficoArticuloCientifico(tipo, nombre, editorial, anoPublicacion,
                                genero, numeroPaginas, volumen, autor);
                    }
                    if (MateBibl == 6) {
                        System.out.println("5. Otros");
                        System.out.println("Nombre del Material Bibliografico");
                        nombre = teclado.nextLine();
                        System.out.println("Distribuidora del Material Bibliografico:");
                        editorial = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Genero:");
                        genero = teclado.nextLine();
                        System.out.println("Autor:");
                        autor = teclado.nextLine();
                        System.out.println("Tipo de Material Bibliografico");
                        tipo = teclado.nextLine();
                        referencias.AddMaterialBibliograficoOtros(tipo, nombre, editorial, anoPublicacion, genero,
                                autor);
                    }
                    break;
                case 2: // Llevar el conteo de materiales por género, autor y año de publicación de
                        // material bibliográfico
                    break;
                case 3: // Mostrar catálogo disponible con sus citas en formato APA.
                    referencias.generarCitaLibro();
                    referencias.generarCitaDVD();
                    referencias.generarCitaArticuloCientifico();
                    referencias.generarCitaPeriodico();
                    referencias.generarCitaTesis();
                    referencias.generarCitaOtros();
                    break;
                case 4:
                    ciclo = false;
            }
        }
    }
}
