package org.example;

import org.example.config.AppConfig;
import org.example.domain.Film;
import org.example.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class App {

    public static void main( String[] args ) throws IOException {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        FilmService filmService = applicationContext.getBean(FilmService.class);
        Film film = applicationContext.getBean(Film.class);


        film.setTitle("Rainman");
        film.setReleaseDate(1988);

        try {
            filmService.addFilm(film);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(film);
    }
}
