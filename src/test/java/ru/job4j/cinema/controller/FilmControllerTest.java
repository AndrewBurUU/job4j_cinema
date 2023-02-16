package ru.job4j.cinema.controller;

import org.junit.jupiter.api.*;
import org.springframework.ui.ConcurrentModel;
import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.service.FilmService;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class FilmControllerTest {

    private FilmService filmService;

    private FilmController filmController;

    @BeforeEach
    public void initServices() {
        filmService = mock(FilmService.class);
        filmController = new FilmController(filmService);
    }

    @Test
    public void whenRequestFilmListPageThenGetPageWithFilms() {
        var film1 = new FilmDto(1, "Фильм1", "Описание Фильма1", 2022, 10, 100, "Комедия");
        var film2 = new FilmDto(2, "Фильм2", "Описание Фильма2", 2022, 12, 120, "Фантастика");
        var expectedFilms = List.of(film1, film2);
        when(filmService.findAllDto()).thenReturn(expectedFilms);

        var model = new ConcurrentModel();
        var view = filmController.getAllDto(model);
        var actualFilms = model.getAttribute("films");

        assertThat(view).isEqualTo("films/list");
        assertThat(actualFilms).isEqualTo(expectedFilms);
    }

}