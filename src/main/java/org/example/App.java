package org.example;

import org.example.config.AppConfig;
import org.example.domain.Film;
import org.example.service.FilmService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) throws Exception {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        FilmService filmService = applicationContext.getBean(FilmService.class);
        Film film = new Film();
        film.setTitle("Rainman");
        film.setReleaseDate(1988);
        filmService.addFilm(new Film());


//        System.out.println(film);
        System.out.println( "Hello World!" );
    }
}
