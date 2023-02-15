package ru.job4j.cinema.model;

import ru.job4j.cinema.dto.*;

import java.util.*;

public class Film {

    public static final Map<String, String> COLUMN_MAPPING = Map.of(
            "id", "id",
            "name", "name",
            "description", "description",
            "year", "year",
            "genre_id", "genreId",
            "minimal_age", "minimalAge",
            "duration_in_minutes", "durationInMinutes",
            "file_id", "fileId"
    );

    private int id;

    private String name;

    private String description;

    private int year;

    private int genreId;

    private int minimalAge;

    private int durationInMinutes;

    private int fileId;

    public Film() {
    }

    /** checkstyle не дает создавать более 7 параметров в конструкторе, поэтому fileId отдельно */
    public Film(int id, String name, String description, int year, int genreId, int minimalAge, int durationInMinutes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
        this.genreId = genreId;
        this.minimalAge = minimalAge;
        this.durationInMinutes = durationInMinutes;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
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

    public int getGenreId() {
        return genreId;
    }

    public int getMinimalAge() {
        return minimalAge;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getFileId() {
        return fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Film film = (Film) o;
        return id == film.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
