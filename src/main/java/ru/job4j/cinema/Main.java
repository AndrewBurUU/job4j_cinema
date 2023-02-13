package ru.job4j.cinema;

import ru.job4j.cinema.model.*;

import java.time.*;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.now().toLocalDate().atTime(10, 30);
        System.out.println(localDateTime1);
    }
}
