package ru.job4j.cinema.service;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.Hall;
import ru.job4j.cinema.repository.HallRepository;

import java.util.*;

@Service
public class SimpleHallService implements HallService {

    private final HallRepository hallRepository;

    public SimpleHallService(HallRepository sql2oCityRepository) {
        this.hallRepository = sql2oCityRepository;
    }

    @Override
    public Collection<Hall> findAll() {
        return hallRepository.findAll();
    }

    @Override
    public Optional<Hall> findById(int id) {
        return hallRepository.findById(id);
    }

    @Override
    public Optional<Hall> findByName(String name) {
        return hallRepository.findByName(name);
    }

    @Override
    public List getRowsByHallName(String name) {
        List rows = new ArrayList<>();
        for (int i = 0; i < hallRepository.findByName(name).get().getRowCount(); i++) {
            rows.add(i + 1);
        }
        return rows;
    }

    @Override
    public List getPlacesByHallName(String name) {
        List places = new ArrayList<>();
        for (int i = 0; i < hallRepository.findByName(name).get().getPlaceCount(); i++) {
            places.add(i + 1);
        }
        return places;
    }
}
