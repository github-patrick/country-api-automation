package org.example.service;

import org.example.domain.Film;
import org.example.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class FilmServiceImpl implements FilmService {

    private FilmRepository filmRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public boolean isAfterMillennial() {
        return false;
    }

    public void addFilm(Film film) throws Exception {

        if (film.getTitle() == null) {
            throw new Exception("film needs a title");
        }
        filmRepository.addFilm(film);
    }

}
