package org.example.bdd.config;

import org.example.bdd.Context;
import org.example.domain.Film;
import org.example.repository.FilmRepository;
import org.example.service.FilmServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

// Configuration file for the application context of the spring container
@Configuration
public class TestConfig {

    @Bean
    public Film film() {
        return new Film();
    }

    @Bean
    public FilmServiceImpl filmService(FilmRepository filmRepository) {
        return new FilmServiceImpl(filmRepository);
    }

    @Bean
    public FilmRepository filmRepository() {
        return new FilmRepository();
    }

    @Bean
    @Scope(SCOPE_CUCUMBER_GLUE)
    public Context context() {
        return new Context();
    }
}
