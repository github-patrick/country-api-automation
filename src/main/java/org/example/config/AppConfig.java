package org.example.config;

import org.example.domain.Film;
import org.example.repository.FilmRepository;
import org.example.service.FilmServiceImpl;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public Film film() {
        return new Film();
    }

    @Bean
    public FilmRepository filmRepository() {
        return new FilmRepository();
    }

    @Bean
    public FilmServiceImpl filmService(FilmRepository repository) {
        return new FilmServiceImpl(repository);
    }
}
