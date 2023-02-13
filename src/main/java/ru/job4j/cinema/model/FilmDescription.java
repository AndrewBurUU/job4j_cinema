package ru.job4j.cinema.model;

public class FilmDescription {

    private String description;

    private int year;

    private int genreId;

    private int minimalAge;

    private int durationInMinutes;

    public FilmDescription() {

    }

    public FilmDescription(String description, int year, int genreId, int minimalAge, int durationInMinutes) {
        this.description = description;
        this.year = year;
        this.genreId = genreId;
        this.minimalAge = minimalAge;
        this.durationInMinutes = durationInMinutes;
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

    @Override
    public String toString() {
        return "FilmDescription{"
                + "description='" + description + '\''
                + ", year=" + year
                + ", genreId=" + genreId
                + ", minimalAge=" + minimalAge
                + ", durationInMinutes=" + durationInMinutes
                + '}';
    }
}
