package ru.job4j.cinema.service;

import ru.job4j.cinema.model.Film;
import ru.job4j.cinema.dto.FilmDto;
import java.util.Collection;

public interface FilmService {

    Collection<Film> findAll();

    Collection<FilmDto> findAllDto();

}
