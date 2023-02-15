package ru.job4j.cinema.service;

import ru.job4j.cinema.model.FilmSession;
import ru.job4j.cinema.dto.SessionDto;
import java.util.Collection;

public interface FilmSessionService {

    Collection<FilmSession> findAll();

    Collection<SessionDto> findAllDto();
}
