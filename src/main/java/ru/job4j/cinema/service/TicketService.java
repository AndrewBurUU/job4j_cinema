package ru.job4j.cinema.service;

import ru.job4j.cinema.model.Ticket;

import java.util.Optional;
import java.util.Collection;

public interface TicketService {

    Optional<Ticket> save(Ticket ticket);

    boolean deleteById(int id);

    Optional<Ticket> findById(int id);

}
