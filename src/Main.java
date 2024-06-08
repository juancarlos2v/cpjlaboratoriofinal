import negocio.CatalogoPeliculaImpl;
import negocio.CatalogoPeliculas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan= new Scanner(System.in);
        CatalogoPeliculas catalogoPeliculas=new CatalogoPeliculaImpl();
        final String nombreArchivo="peliculas.txt";

        String opciones = "1.-Iniciar Pelicula\n" +
                "2.-Agregar Pelicula\n" +
                "3.-Buscar Pelicula\n" +
                "0.-Salir\n";

        System.out.println(opciones);

        int opcion = scan.nextInt();

        switch (opcion) {
            case 1 -> catalogoPeliculas.listarPeliculas(nombreArchivo);
            case 2 -> {
                System.out.println("Agregar Pelicula:");
                String nombrePelicula= scan.next();
                catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
            }
            case 3 -> {
                System.out.println("Buscar Pelicula:");
                String nombrePelicula= scan.next();
                catalogoPeliculas.buscarPelicula(nombreArchivo, nombrePelicula);
            }
            default -> System.out.println("Opcion no encontrada");
        }
    }
}