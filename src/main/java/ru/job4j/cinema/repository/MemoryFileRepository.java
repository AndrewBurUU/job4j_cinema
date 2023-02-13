package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemoryFileRepository implements FileRepository {

    private final Map<Integer, File> files = new HashMap<>() {
        {
            put(1, new File("чебурашка", "files/cheburashka.png"));
            put(2, new File("непослушник2", "files/neposlushnik2.png"));
            put(3, new File("аватар2", "files/avatar2.png"));
        }
    };

    @Override
    public Optional<File> findById(int id) {
        return Optional.ofNullable(files.get(id));
    }

    @Override
    public Collection<File> findAll() {
        return files.values();
    }

}
