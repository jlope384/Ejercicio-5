package UI;

import java.util.Scanner;

public class DriverProgram {

    public static void maim(String[] args) {
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
                    }
                    if (MateBibl == 3) {
                        System.out.println("3. Tesis");
                        System.out.println("Titulo de la Tesis");
                        nombre = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Nombre de la Institucion Academica:");
                        institucionAcademica = teclado.nextLine();
                        System.out.println("Autor:");
                        autor = teclado.nextLine();
                        tipo = "Tesis";
                    }
                    if (MateBibl == 4) {
                        System.out.println("4. DVD");
                        System.out.println("Nombre de la Pelicula");
                        nombre = teclado.nextLine();
                        System.out.println("Productura de la Pelicula:");
                        productora = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Director:");
                        autor = teclado.nextLine();
                        System.out.println("Duracion:");
                        duracion = teclado.nextLine();
                        tipo = "DVD";
                    }
                    if (MateBibl == 5) {
                        System.out.println("5. Articulo Cientifico");
                        System.out.println("Nombre del Articulo");
                        nombre = teclado.nextLine();
                        System.out.println("Titulo de la Revista:");
                        editorial = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Numero de Paginas:");
                        numeroPaginas = teclado.nextLine();
                        System.out.println("Volumen del Articulo:");
                        volumen = teclado.nextLine();
                        System.out.println("Autor:");
                        autor = teclado.nextLine();
                        tipo = "Articulo Cientifico";
                    }
                    if (MateBibl == 6) {
                        System.out.println("5. Otros");
                        System.out.println("Nombre del Material Bibliografico");
                        nombre = teclado.nextLine();
                        System.out.println("Titulo del Material Bibliografico:");
                        editorial = teclado.nextLine();
                        System.out.println("Año de Publicacion:");
                        anoPublicacion = teclado.nextLine();
                        System.out.println("Autor:");
                        autor = teclado.nextLine();
                        System.out.println("Tipo de Material Bibliografico");
                        tipo = teclado.nextLine();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    ciclo = false;
            }
        }
    }
}
