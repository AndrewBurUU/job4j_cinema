package ru.job4j.cinema.service;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.Ticket;
import ru.job4j.cinema.repository.TicketRepository;
import ru.job4j.cinema.repository.Sql2oTicketRepository;

import java.util.Optional;
import java.util.Collection;

@Service
public class SimpleTicketService implements TicketService {

    private final TicketRepository ticketRepository;

    public SimpleTicketService(Sql2oTicketRepository sql2oUserRepository) {
        this.ticketRepository = sql2oUserRepository;
    }

    @Override
    public Optional<Ticket> save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public boolean deleteById(int id) {
        return ticketRepository.deleteById(id);
    }

    @Override
    public Optional<Ticket> findById(int id) {
        return ticketRepository.findById(id);
    }

    @Override
    public Collection<Ticket> findTakenByRow(int row) {
        return ticketRepository.findTakenByRow(row);
    }

    @Override
    public Collection<Ticket> findOpenSeats() {
        return ticketRepository.findOpenSeats();
    }
}
