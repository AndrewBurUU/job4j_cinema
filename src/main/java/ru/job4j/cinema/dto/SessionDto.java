package ru.job4j.cinema.dto;

import java.sql.*;
import java.time.*;
import java.util.*;

public class SessionDto {

    public static final Map<String, String> COLUMN_MAPPING = Map.of(
            "id", "id",
            "filmname", "filmname",
            "hallname", "hallname",
            "start_time", "startTime",
            "end_time", "endTime"
    );

    private int id;

    private String filmname;

    private String hallname;

    private LocalDateTime startTime = LocalDateTime.now();

    private LocalDateTime endTime = LocalDateTime.now();

    public SessionDto() {
    }

    public SessionDto(int id, String filmname, String hallname, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.filmname = filmname;
        this.hallname = hallname;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public String getFilmname() {
        return filmname;
    }

    public String getHallname() {
        return hallname;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
