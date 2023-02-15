package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.model.FilmSession;

import java.time.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemoryFilmSessionRepository implements FilmSessionRepository {

    private final Map<Integer, FilmSession> filmSessions = new HashMap<>() {
        {
            put(1, new FilmSession(1, 1, 3,
                    LocalDateTime.now().toLocalDate().atTime(10, 00),
                    LocalDateTime.now().toLocalDate().atTime(12, 00)));
            put(2, new FilmSession(1, 1, 3,
                    LocalDateTime.now().toLocalDate().atTime(12, 30),
                    LocalDateTime.now().toLocalDate().atTime(14, 30)));
            put(3, new FilmSession(1, 1, 3,
                    LocalDateTime.now().toLocalDate().atTime(16, 00),
                    LocalDateTime.now().toLocalDate().atTime(18, 00)));
            put(4, new FilmSession(1, 1, 3,
                    LocalDateTime.now().toLocalDate().atTime(18, 00),
                    LocalDateTime.now().toLocalDate().atTime(20, 00)));
        }
    };

    @Override
    public Collection<FilmSession> findAll() {
         return filmSessions.values();
        }

    @Override
    public Collection<SessionDto> findAllDto() {
        return null;
    }
}
