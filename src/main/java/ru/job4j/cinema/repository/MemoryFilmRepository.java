package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.*;

import java.util.Collection;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryFilmRepository implements FilmRepository {

    private final Map<Integer, Film> films = new HashMap<>() {
        {
            put(1, new Film(1, "Чебурашка",
                    new FilmDescription("Фильм про Чебурашку", 2022, 1, 0, 120), 1));
            put(2, new Film(2, "Непослушник-2",
                    new FilmDescription("Продолжение про блоггера-послушника", 2022, 1, 0, 120), 2));
            put(3, new Film(3, "Аватар-2",
                    new FilmDescription("Продолжение про аватара", 2022, 2, 18, 190), 3));
        }
    };

    @Override
    public Collection<Film> findAll() {
        return films.values();
    }

    @Override
    public Optional<Film> findById(int id) {
        return Optional.ofNullable(films.get(id));
    }
}
