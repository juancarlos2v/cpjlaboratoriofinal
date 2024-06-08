package negocio;

import datos.AccesoDatos;
import datos.AccesoDatosImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoPeliculaImpl implements CatalogoPeliculas {

    AccesoDatos datos = new AccesoDatosImpl();

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {

        File file = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(file, true));
            salida.println(nombrePelicula);
            salida.close();
            System.out.println("Pelicula agregada con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) throws IOException {
        FileReader file = new FileReader(nombreArchivo);
        BufferedReader br = new BufferedReader(file);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) throws IOException {
        FileReader file = new FileReader(nombreArchivo);
        BufferedReader br = new BufferedReader(file);
        List<String> peliculas=new ArrayList<>();
        String line;

        while ((line=br.readLine())!=null){
            peliculas.add(line);
        }
        System.out.println(peliculas);
        Optional<String> s= peliculas.stream().filter(p->p.equals(buscar)).findFirst();
        System.out.println(s.get());

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {

    }
}
