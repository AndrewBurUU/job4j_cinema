package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.Hall;

import java.util.*;

public class MemoryHallRepository implements HallRepository {

    private final Map<Integer, Hall> halls = new HashMap<>() {
        {
            put(1, new Hall(1, "Зал1", 20, 25, "IMAX"));
            put(2, new Hall(2, "Зал2", 10, 15, "Обычный"));
            put(3, new Hall(3, "Зал3", 10, 15, "3D"));
        }
    };

    @Override
    public Collection<Hall> findAll() {
        return halls.values();
    }

    @Override
    public Optional<Hall> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Hall> findByName(String name) {
        return Optional.empty();
    }
}
