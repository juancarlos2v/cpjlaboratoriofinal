import negocio.CatalogoPeliculas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        StringBuilder opciones= new StringBuilder();
        CatalogoPeliculas catalogoPeliculas;

        opciones.append("1.-Iniciar Pelicula\n");
        opciones.append("2.-Agregar Pelicula\n");
        opciones.append("3.-Buscar Pelicula\n");
        opciones.append("0.-Salir\n");

        //int opcion = scan.nextInt();

        System.out.println(opciones);
    }
}