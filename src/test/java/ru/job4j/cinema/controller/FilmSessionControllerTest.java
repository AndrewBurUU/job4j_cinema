package ru.job4j.cinema.controller;

import org.junit.jupiter.api.*;
import org.springframework.ui.ConcurrentModel;
import ru.job4j.cinema.dto.*;
import ru.job4j.cinema.service.*;

import java.time.*;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class FilmSessionControllerTest {

    private FilmSessionService filmSessionService;

    private FilmSessionController filmSessionController;

    @BeforeEach
    public void initServices() {
        filmSessionService = mock(FilmSessionService.class);
        filmSessionController = new FilmSessionController(filmSessionService);
    }

    @Test
    public void whenRequestSessionListPageThenGetPageWithSessions() {
        var session1 = new SessionDto(1, "Фильм1", "Зал1",
                LocalDateTime.now().toLocalDate().atTime(10, 00),
                LocalDateTime.now().toLocalDate().atTime(12, 00));
        var session2 = new SessionDto(2, "Фильм2", "Зал2",
                LocalDateTime.now().toLocalDate().atTime(11, 00),
                LocalDateTime.now().toLocalDate().atTime(13, 00));
        var expectedSessions = List.of(session1, session2);
        when(filmSessionService.findAllDto()).thenReturn(expectedSessions);

        var model = new ConcurrentModel();
        var view = filmSessionController.getAllDto(model);
        var actualSessions = model.getAttribute("filmsessions");

        assertThat(view).isEqualTo("filmsessions/list");
        assertThat(actualSessions).isEqualTo(expectedSessions);

    }

}