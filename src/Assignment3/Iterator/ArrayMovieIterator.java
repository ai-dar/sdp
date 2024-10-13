package Assignment3.Iterator;

import java.util.Iterator;

public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position = 0;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return position < movies.length;
    }

    @Override
    public String next() {
        return movies[position++];
    }
}