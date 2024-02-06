import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase que representa una biblioteca con funcionalidades para prestar, devolver y gestionar libros.
 */
public class Biblioteca {

    /** Mapa que mantiene un registro de los libros prestados por cada usuario. */
    public Map<String, List<String>> prestamosPorUsuario;

    /** Mapa que almacena la cantidad de copias disponibles para cada libro. */
    public Map<String, Integer> copiasPorLibro;

    /**
     * Constructor de la clase Biblioteca.
     * Inicializa los mapas de prestamosPorUsuario y copiasPorLibro.
     */
    public Biblioteca() {
        this.prestamosPorUsuario = new HashMap<>();
        this.copiasPorLibro = new HashMap<>();
    }

    /**
     * Método para prestar un libro a un usuario.
     *
     * @param usuario El nombre del usuario que está solicitando el préstamo.
     * @param libro El título del libro que se va a prestar.
     * @throws IllegalArgumentException Si el libro no está disponible o si el usuario ya tiene el máximo de copias permitidas.
     */
    public void prestarLibro(String usuario, String libro) {
        if (!this.copiasPorLibro.containsKey(libro)) {
            throw new IllegalArgumentException("El libro " + libro + " no está disponible.");
        }
        if (this.copiasPorLibro.get(libro) == 0) {
            throw new IllegalArgumentException("No hay copias disponibles del libro " + libro + ".");
        }
        if (!this.prestamosPorUsuario.containsKey(usuario)) {
            this.prestamosPorUsuario.put(usuario, new ArrayList<>());
        }
        this.prestamosPorUsuario.get(usuario).add(libro);
        this.copiasPorLibro.put(libro, this.copiasPorLibro.get(libro) - 1);
    }

    /**
     * Método para devolver un libro prestado por un usuario.
     *
     * @param usuario El nombre del usuario que está devolviendo el libro.
     * @param libro El título del libro que se está devolviendo.
     * @throws IllegalArgumentException Si el usuario no ha prestado ningún libro o si el usuario no ha prestado el libro especificado.
     */
    public void devolverLibro(String usuario, String libro) {
        if (!this.prestamosPorUsuario.containsKey(usuario)) {
            throw new IllegalArgumentException("El usuario " + usuario + " no ha prestado ningún libro.");
        }
        if (!this.prestamosPorUsuario.get(usuario).contains(libro)) {
            throw new IllegalArgumentException("El usuario " + usuario + " no ha prestado el libro " + libro + ".");
        }
        this.prestamosPorUsuario.get(usuario).remove(libro);
        this.copiasPorLibro.put(libro, this.copiasPorLibro.get(libro) + 1);
    }

    /**
     * Método para agregar un libro a la biblioteca con una cantidad inicial de copias.
     *
     * @param libro El título del libro que se va a agregar.
     * @param cantidad La cantidad inicial de copias disponibles para el libro.
     * @throws IllegalArgumentException Si la cantidad de copias es negativa.
     */
    public void agregarLibro(String libro, int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de copias debe ser mayor o igual a cero.");
        }
        this.copiasPorLibro.put(libro, cantidad);
    }

    /**
     * Método para obtener la cantidad de copias disponibles de un libro en la biblioteca.
     *
     * @param libro El título del libro del que se desea obtener la cantidad de copias disponibles.
     * @return La cantidad de copias disponibles para el libro especificado.
     * @throws IllegalArgumentException Si el libro no existe en la biblioteca.
     */
    public int obtenerCopiasDisponibles(String libro) {
        if (!this.copiasPorLibro.containsKey(libro)) {
            throw new IllegalArgumentException("El libro " + libro + " no existe en la biblioteca.");
        }
        return this.copiasPorLibro.get(libro);
    }
}
