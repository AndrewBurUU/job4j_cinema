package ru.job4j.cinema.model;

import java.util.*;

public class Film {

    public static final Map<String, String> COLUMN_MAPPING = Map.of(
            "id", "id",
            "name", "name",
            "description", "description.description",
            "year", "description.year",
            "genre_id", "description.genreId",
            "minimal_age", "description.minimalAge",
            "duration_in_minutes", "description.durationInMinutes",
            "file_id", "fileId"
    );

    private int id;

    private String name;

    private FilmDescription description;

    private int fileId;

    public Film() {
    }

    /** checkstyle не дает создавать более 7 параметров в конструкторе, поэтому свернул описание в поле description */
    public Film(int id, String name, FilmDescription description, int fileId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fileId = fileId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public FilmDescription getDescription() {
        return description;
    }

    public int getFileId() {
        return fileId;
    }

}
