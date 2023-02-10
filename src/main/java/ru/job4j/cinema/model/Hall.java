package ru.job4j.cinema.model;

import java.util.*;

public class Hall {

    public static final Map<String, String> COLUMN_MAPPING = Map.of(
            "id", "id",
            "name", "name",
            "row_count", "rowCount",
            "place_count", "placeCount",
            "description", "description"
    );

    private int id;

    private String name;

    private int rowCount;

    private int placeCount;

    private String description;

    public Hall(int id, String name, int rowCount, int placeCount, String description) {
        this.id = id;
        this.name = name;
        this.rowCount = rowCount;
        this.placeCount = placeCount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getPlaceCount() {
        return placeCount;
    }

    public String getDescription() {
        return description;
    }
}
