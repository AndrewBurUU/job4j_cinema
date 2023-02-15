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

    public FilmDto(int id, String name, String description, int year, int minimalAge, int durationInMinutes, String genre) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
        this.minimalAge = minimalAge;
        this.durationInMinutes = durationInMinutes;
        this.genre = genre;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilmDto filmDto = (FilmDto) o;
        return id == filmDto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
