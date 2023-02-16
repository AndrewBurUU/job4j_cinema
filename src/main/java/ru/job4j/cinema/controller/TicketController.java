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
        var hallOptional = hallService.findByName(filmSessionOptional.get().getHallname());
        if (hallOptional.isEmpty()) {
            model.addAttribute("message", "Зал не найден");
            return "errors/404";
        }
        List rowList = new ArrayList<>();
        for (int i = 0; i < hallOptional.get().getRowCount(); i++) {
            rowList.add(i + 1);
        }
        List placeList = new ArrayList<>();
        for (int i = 0; i < hallOptional.get().getPlaceCount(); i++) {
            placeList.add(i + 1);
        }
        model.addAttribute("rows", rowList);
        model.addAttribute("places", placeList);
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
