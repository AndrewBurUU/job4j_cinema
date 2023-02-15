package ru.job4j.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import ru.job4j.cinema.service.FilmSessionService;

@Controller
@RequestMapping("/sessions")
public class FilmSessionController {

    private final FilmSessionService filmSessionService;

    public FilmSessionController(FilmSessionService filmSessionService) {
        this.filmSessionService = filmSessionService;
    }

    @GetMapping
    public String getAllDto(Model model) {
        model.addAttribute("sessions", filmSessionService.findAllDto());
        return "sessions/list";
    }

}
