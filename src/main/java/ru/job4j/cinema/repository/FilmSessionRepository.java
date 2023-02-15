package ru.job4j.cinema.repository;

import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.model.FilmSession;

import java.util.*;

public interface FilmSessionRepository {

    Collection<FilmSession> findAll();

    Collection<SessionDto> findAllDto();

    Optional<SessionDto> findById(int id);
}
