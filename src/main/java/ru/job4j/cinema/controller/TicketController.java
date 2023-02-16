package ru.job4j.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ru.job4j.cinema.model.Ticket;
import ru.job4j.cinema.service.*;

import java.util.*;

@Controller
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    private final FilmSessionService filmSessionService;

    private final HallService hallService;

    public TicketController(TicketService ticketService,
                            FilmSessionService filmSessionService,
                            HallService hallService) {
        this.ticketService = ticketService;
        this.filmSessionService = filmSessionService;
        this.hallService = hallService;
    }

    @GetMapping("/{id}")
    public String getById(Model model, @PathVariable int id) {
        var filmSessionOptional = filmSessionService.findById(id);
        if (filmSessionOptional.isEmpty()) {
            model.addAttribute("message", "Сеанс не найден");
            return "errors/404";
        }
        var hallName = filmSessionOptional.get().getHallname();
        var hallOptional = hallService.findByName(hallName);
        if (hallOptional.isEmpty()) {
            model.addAttribute("message", "Зал не найден");
            return "errors/404";
        }
        model.addAttribute("rows", hallService.getRowsByHallName(hallName));
        model.addAttribute("places", hallService.getPlacesByHallName(hallName));
        model.addAttribute("filmsession", filmSessionOptional.get());
        return "tickets/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Ticket ticket, Model model) {
        try {
            var ticketOptional = ticketService.save(ticket);
            if (ticketOptional.isEmpty()) {
                model.addAttribute("message", "Билет уже забронирован. Выберите другое место.");
                return "errors/404";
            }
            return "tickets/taken";
        } catch (Exception exception) {
            model.addAttribute("message", exception.getMessage());
            return "errors/404";
        }
    }

}
