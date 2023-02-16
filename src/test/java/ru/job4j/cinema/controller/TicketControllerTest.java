package ru.job4j.cinema.controller;

import org.checkerframework.checker.units.qual.*;
import org.junit.jupiter.api.*;
import org.springframework.ui.ConcurrentModel;
import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.model.*;
import ru.job4j.cinema.service.*;

import java.time.*;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class TicketControllerTest {

    private TicketService ticketService;

    private FilmSessionService filmSessionService;

    private HallService hallService;

    private TicketController ticketController;

    @BeforeEach
    public void initServices() {
        ticketService = mock(TicketService.class);
        filmSessionService = mock(FilmSessionService.class);
        hallService = mock(HallService.class);
        ticketController = new TicketController(ticketService, filmSessionService, hallService);
    }

    @Test
    public void whenRequestTicketPageThenGetPage() {
        int filmSessionId = 1;
        var filmSession = new SessionDto(filmSessionId, "Фильм1", "Зал1",
                LocalDateTime.now().toLocalDate().atTime(10, 00),
                LocalDateTime.now().toLocalDate().atTime(12, 00));
        var hall = new Hall(1, "Зал1", 5, 5, "VIP");
        when(filmSessionService.findById(filmSessionId)).thenReturn(Optional.of(filmSession));
        when(hallService.findByName(filmSession.getHallname())).thenReturn(Optional.of(hall));

        var model = new ConcurrentModel();
        var view = ticketController.getById(model, filmSessionId);

        assertThat(view).isEqualTo("tickets/create");
    }

    @Test
    public void whenTakeTicketThenGetTakenPage() {
        var ticket = new Ticket(1, 1, 1, 1, 1);
        when(ticketService.save(ticket)).thenReturn(Optional.of(ticket));

        var model = new ConcurrentModel();
        var view = ticketController.create(ticket, model);

        assertThat(view).isEqualTo("tickets/taken");
    }

}