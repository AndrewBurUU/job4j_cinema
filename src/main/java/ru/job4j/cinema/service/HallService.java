package ru.job4j.cinema.service;

import ru.job4j.cinema.model.Hall;

import java.util.*;

public interface HallService {

    Collection<Hall> findAll();

    Optional<Hall> findById(int id);

    Optional<Hall> findByName(String name);

    List getRowsByHallName(String name);

    List getPlacesByHallName(String name);
}
