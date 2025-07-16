package Controllers;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import Models.Book;

public class LibroController {
    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Map<Book, Book> resultado = new TreeMap<>();
        for (Book libro : libros) {
            resultado.putIfAbsent(libro, libro); // Evita duplicados según equals/hashCode
        }
        return resultado;
    }
}
