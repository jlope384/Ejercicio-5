package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Modelo.ArticuloCientifico;
import Modelo.DVD;
import Modelo.Libro;
import Modelo.MaterialBibliografico;
import Modelo.Otros;
import Modelo.Periodico;
import Modelo.Tesis;

public class CSVManager {
    public static void main(String[] args) {
        String line = "";
        String csvSeparator = ",";

        // Crear una instancia de ReferenciaBibliografica
        ReferenciaBibliografica referencias = new ReferenciaBibliografica();

        try (BufferedReader br = new BufferedReader(new FileReader("Controlador/Catalogo.csv"))) {
            // Leemos la primera línea que generalmente contiene los nombres de las columnas
            line = br.readLine();

            while ((line = br.readLine()) != null) {
                // Dividimos la línea en partes usando la coma como separador
                String[] data = line.split(csvSeparator);

                // Ahora puedes acceder a los datos individualmente
                String tipo = data[0];
                String nombre = data[1];
                String editorial = data[2];
                String fechaPublicacion = data[3];
                String genero = data[4];
                String autor = data[5];

                MaterialBibliografico material;

                // Comprobamos el tipo de material y creamos la instancia correspondiente
                if (tipo.equalsIgnoreCase("Libro")) {
                    material = new Libro(tipo, nombre, editorial, fechaPublicacion, genero, autor);
                } else if (tipo.equalsIgnoreCase("DVD")) {
                    String duracion = data[6];
                    material = new DVD(tipo, nombre, editorial, fechaPublicacion, genero, duracion, autor);
                } else if (tipo.equalsIgnoreCase("Articulo Cientifico")) {
                    String numeroPaginas = data[6];
                    String volumen = data[7];
                    material = new ArticuloCientifico(tipo, nombre, editorial, fechaPublicacion, genero, numeroPaginas, volumen, autor);
                } else if (tipo.equalsIgnoreCase("Periodico")) {
                    String titularPeriodico = data[6];
                    material = new Periodico(tipo, nombre, editorial, fechaPublicacion, genero, titularPeriodico, autor);
                } else if (tipo.equalsIgnoreCase("Tesis")) {
                    String institucionAcademica = data[6];
                    material = new Tesis(tipo, nombre, editorial, fechaPublicacion, genero, institucionAcademica);
                } else {
                    material = new Otros(tipo, nombre, editorial, fechaPublicacion, genero, autor);
                }

                // Agregamos el material a ReferenciaBibliografica
                referencias.agregarMaterialBibliografico(material);
            }

            // Mostramos el catálogo de materiales
            referencias.mostrarCatalogo();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
