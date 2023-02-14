package ru.job4j.cinema.service;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.Hall;
import ru.job4j.cinema.repository.HallRepository;

import java.util.Collection;

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
}
