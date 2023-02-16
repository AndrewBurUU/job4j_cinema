package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Film;
import ru.job4j.cinema.dto.FilmDto;

import java.util.*;

public interface FilmRepository {

    Collection<Film> findAll();

    Collection<FilmDto> findAllDto();

}
