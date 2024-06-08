package negocio;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface CatalogoPeliculas {
    void agregarPelicula(String nombrePelicula, String nombreArchivo);
    void listarPeliculas(String nombreArchivo) throws IOException;
    void buscarPelicula(String nombreArchivo, String buscar) throws IOException;
    void iniciarArchivo(String nombreArchivo);
}
