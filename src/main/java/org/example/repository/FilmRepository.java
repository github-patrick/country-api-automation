package org.example.repository;

import org.example.domain.Film;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmRepository {


    private List<Film> films;

    public FilmRepository() {
        this.films = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }
}
