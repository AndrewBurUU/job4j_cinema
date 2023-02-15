package ru.job4j.cinema.service;

import ru.job4j.cinema.model.FilmSession;
import ru.job4j.cinema.dto.SessionDto;

import java.util.*;

public interface FilmSessionService {

    Collection<FilmSession> findAll();

    Collection<SessionDto> findAllDto();

    Optional<SessionDto> findById(int id);
}
