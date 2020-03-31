package org.example.service;

import org.example.domain.Film;
import org.springframework.stereotype.Service;

@Service
public interface FilmService {

    boolean isAfterMillennial();

    void addFilm(Film film) throws Exception;
}
