package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Ticket;

import java.util.*;

public interface TicketRepository {

    Optional<Ticket> save(Ticket ticket);

    boolean deleteById(int id);

    Optional<Ticket> findById(int id);

    Collection<Ticket> findTakenByRow(int row);

    Collection<Ticket> findOpenSeats(int row);

    Collection<Ticket> findOpenRows();

}
