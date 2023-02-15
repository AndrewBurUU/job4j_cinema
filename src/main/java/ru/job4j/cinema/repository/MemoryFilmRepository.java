package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.model.*;

import java.util.Collection;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

public class MemoryFilmRepository implements FilmRepository {

    private final Map<Integer, Film> films = new HashMap<>() {
        {
            Film film = new Film(1, "Чебурашка", "Фильм про Чебурашку", 2022, 1, 0, 120);
            film.setFileId(1);
            put(1, film);
            film = new Film(2, "Непослушник-2", "Продолжение про блоггера-послушника", 2022, 1, 0, 120);
            film.setFileId(2);
            put(2, film);
            film = new Film(3, "Аватар-2", "Продолжение про аватара", 2022, 2, 18, 190);
            put(3, film);
        }
    };

    @Override
    public Collection<Film> findAll() {
        return films.values();
    }

    @Override
    public Collection<FilmDto> findAllDto() {
        return null;
    }

    @Override
    public Optional<Film> findById(int id) {
        return Optional.ofNullable(films.get(id));
    }
}
