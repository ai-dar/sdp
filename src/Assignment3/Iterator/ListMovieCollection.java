package Assignment3.Iterator;

import java.util.ArrayList; // Импортируем ArrayList
import java.util.Iterator; // Импортируем Iterator
import java.util.List; // Импортируем List

public class ListMovieCollection {
    private List<String> movies;

    public ListMovieCollection() {
        movies = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public Iterator<String> createIterator() {
        return (Iterator<String>) new ListMovieIterator(movies);
    }
}