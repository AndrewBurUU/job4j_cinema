package ru.job4j.cinema.service;

import ru.job4j.cinema.model.User;

import java.util.Optional;
import java.util.Collection;

public interface UserService {

    Optional<User> save(User user);

    boolean deleteById(int id);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findById(int id);

    Collection<User> findAll();

}
