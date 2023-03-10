package ru.job4j.cinema.service;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.model.FilmSession;
import ru.job4j.cinema.repository.FilmSessionRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class SimpleFilmSessionService implements FilmSessionService {

    private final FilmSessionRepository filmSessionRepository;

    public SimpleFilmSessionService(FilmSessionRepository sql2oCityRepository) {
        this.filmSessionRepository = sql2oCityRepository;
    }

    @Override
    public Collection<FilmSession> findAll() {
        return filmSessionRepository.findAll();
    }

    @Override
    public Collection<SessionDto> findAllDto() {
        return filmSessionRepository.findAllDto();
    }

    @Override
    public Optional<SessionDto> findById(int id) {
        return filmSessionRepository.findById(id);
    }
}
