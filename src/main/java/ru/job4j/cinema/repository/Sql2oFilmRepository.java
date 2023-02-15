package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import org.sql2o.Sql2o;
import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.model.Film;

import java.util.Collection;
import java.util.Optional;

@Repository
public class Sql2oFilmRepository implements FilmRepository {

    private final Sql2o sql2o;

    public Sql2oFilmRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    public Collection<Film> findAll() {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM films");
            return query.executeAndFetch(Film.class);
        }
    }

    public Collection<FilmDto> findAllDto() {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT f.id, f.name, f.description, f.year, f.minimal_age, f.duration_in_minutes, g.name genre\n"
                    + "FROM films f, genres g\n"
                    + "WHERE f.genre_id = g.id");
            return query.setColumnMappings(FilmDto.COLUMN_MAPPING).executeAndFetch(FilmDto.class);
        }
    }

    @Override
    public Optional<Film> findById(int id) {
        return Optional.empty();
    }
}
