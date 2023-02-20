package ru.job4j.cinema.service;

import ru.job4j.cinema.model.User;

import java.util.Optional;
import java.util.Collection;

public interface UserService {

    Optional<User> save(User user);

    Optional<User> findByEmailAndPassword(String email, String password);

}
