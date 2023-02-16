package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Hall;

import java.util.*;

public interface HallRepository {

    Collection<Hall> findAll();

    Optional<Hall> findById(int id);

    Optional<Hall> findByName(String name);
}
