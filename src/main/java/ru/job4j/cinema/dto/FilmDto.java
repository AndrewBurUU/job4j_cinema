package ru.job4j.cinema.dto;

import java.util.*;

public class FilmDto {

    public static final Map<String, String> COLUMN_MAPPING = Map.of(
            "id", "id",
            "name", "name",
            "description", "description",
            "year", "year",
            "minimal_age", "minimalAge",
            "duration_in_minutes", "durationInMinutes",
            "genre", "genre"
    );

    private int id;

    private String name;

    private String description;

    private int year;

    private int minimalAge;

    private int durationInMinutes;

    private String genre;

    public FilmDto() {

    }

    public FilmDto(int id, String description, int year, String genre, int minimalAge, int durationInMinutes) {
        this.id = id;
        this.description = description;
        this.year = year;
        this.genre = genre;
        this.minimalAge = minimalAge;
        this.durationInMinutes = durationInMinutes;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public int getMinimalAge() {
        return minimalAge;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "FilmDto{"
                + "id='" + id + '\''
                + ", name='" + name + '\''
                + ", description='" + description + '\''
                + ", year=" + year
                + ", minimalAge=" + minimalAge
                + ", durationInMinutes=" + durationInMinutes
                + ", genre=" + genre
                + '}';
    }

}
