package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.Genre;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryGenreRepository implements GenreRepository {

    private final Map<Integer, Genre> genres = new HashMap<>() {
        {
            put(1, new Genre(1, "комедия"));
            put(2, new Genre(2, "фантастика"));
            put(3, new Genre(3, "детектив"));
        }
    };

    @Override
    public Collection<Genre> findAll() {
        return genres.values();
    }
}
