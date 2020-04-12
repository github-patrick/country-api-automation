package org.example.service;

import org.example.domain.Film;
import org.example.repository.FilmRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;

@RunWith(MockitoJUnitRunner.class)
public class FilmServiceImplTest {

    private Film film;

    @Mock
    private FilmRepository filmRepository;

    @InjectMocks
    private FilmService filmService  = new FilmServiceImpl(filmRepository);;


    @Before
    public void setUp() {
        film = Film.builder().title("Molly's Game").build();
    }

    @Test
    public void addFilm() {
        film.setTitle("Rain man");
        String name = film.getTitle();
        assertFalse(name.isEmpty());
    }

    @Test
    public void addFilmAgain() throws Exception {
        film.setTitle("Molly's Game");

        doNothing().when(filmRepository).addFilm(film);
        filmService.addFilm(film);
    }
}