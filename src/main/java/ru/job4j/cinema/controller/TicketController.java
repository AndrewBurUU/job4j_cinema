package ru.job4j.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ru.job4j.cinema.model.Ticket;
import ru.job4j.cinema.service.*;

@Controller
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    private final FilmService filmService;

    private final FilmSessionService filmSessionService;

    public TicketController(TicketService ticketService, FilmService filmService, FilmSessionService filmSessionService) {
        this.ticketService = ticketService;
        this.filmService = filmService;
        this.filmSessionService = filmSessionService;
    }

    @GetMapping("/take")
    public String getTakePage(Model model) {
        model.addAttribute("films", filmService.findAllDto());
        model.addAttribute("sessions", filmSessionService.findAllDto());
        return "tickets/take";
    }

    @GetMapping("/{id}")
    public String getById(Model model, @PathVariable int id) {
        var filmSessionOptional = filmSessionService.findById(id);
        if (filmSessionOptional.isEmpty()) {
            model.addAttribute("message", "Вакансия с указанным идентификатором не найдена");
            return "errors/404";
        }
        model.addAttribute("rows", ticketService.findOpenRows());
        model.addAttribute("seats", ticketService.findOpenSeats(1));
        model.addAttribute("filmsession", filmSessionOptional.get());
        return "tickets/take";
    }

    @PostMapping("/take")
    public String take(@ModelAttribute Ticket ticket, Model model) {
        try {
            var isTaken = ticketService.save(ticket).isPresent();
            if (isTaken) {
                model.addAttribute("message", "Билет уже забронирован. Выберите другое место.");
                return "errors/404";
            }
            return "redirect:/tickets/taken";
        } catch (Exception exception) {
            model.addAttribute("message", exception.getMessage());
            return "errors/404";
        }
    }

}
