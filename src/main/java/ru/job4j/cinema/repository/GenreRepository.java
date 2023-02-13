package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Genre;

import java.util.*;

public interface GenreRepository {

    Collection<Genre> findAll();
}
