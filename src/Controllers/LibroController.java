package Controllers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Models.Book;

public class LibroController {
    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Set<Book> setOrdenadoSinDuplicados = new TreeSet<>(libros);

        Map<Book, Book> resultado = new LinkedHashMap<>();
        for (Book libro : setOrdenadoSinDuplicados) {
            resultado.put(libro, libro);
        }

        return resultado;
    }

}
