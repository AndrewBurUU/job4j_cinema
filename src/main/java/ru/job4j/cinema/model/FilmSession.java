package ru.job4j.cinema.model;

import java.time.*;
import java.util.*;

public class FilmSession {

    public static final Map<String, String> COLUMN_MAPPING = Map.of(
            "id", "id",
            "film_id", "filmId",
            "halls_id", "hallsId",
            "start_time", "startTime",
            "end_time", "endTime"
    );

    private int id;

    private int filmId;

    private int hallsId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    public FilmSession(int id, int filmId, int hallsId, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.filmId = filmId;
        this.hallsId = hallsId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public int getFilmId() {
        return filmId;
    }

    public int getHallsId() {
        return hallsId;
    }

    public LocalDateTime getStarTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
