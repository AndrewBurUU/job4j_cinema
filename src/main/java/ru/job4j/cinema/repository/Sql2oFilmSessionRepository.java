package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import org.sql2o.Sql2o;
import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.model.FilmSession;

import java.util.*;

@Repository
public class Sql2oFilmSessionRepository implements FilmSessionRepository {

    private final Sql2o sql2o;

    public Sql2oFilmSessionRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public Collection<FilmSession> findAll() {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM filmsessions");
            return query.executeAndFetch(FilmSession.class);
        }
    }

    @Override
    public Collection<SessionDto> findAllDto() {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT fs.id, f.name filmname, h.name hallname, fs.start_time, fs.end_time\n"
                    + "FROM film_sessions fs, films f, halls h\n"
                    + "WHERE fs.film_id = f.id and fs.halls_id = h.id");
            return query.setColumnMappings(SessionDto.COLUMN_MAPPING).executeAndFetch(SessionDto.class);
        }
    }

    @Override
    public Optional<SessionDto> findById(int id) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT fs.id, f.name filmname, h.name hallname, fs.start_time, fs.end_time\n"
                    + "FROM film_sessions fs, films f, halls h\n"
                    + "WHERE fs.id = :id and fs.film_id = f.id and fs.halls_id = h.id");
            query.addParameter("id", id);
            var filmsession = query.setColumnMappings(SessionDto.COLUMN_MAPPING).executeAndFetchFirst(SessionDto.class);
            return Optional.ofNullable(filmsession);
        }
    }
}
