package ru.job4j.cinema.model;

public class Genre {

    private int id;

    private String name;

    public Genre(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
