package org.example.config;

import org.example.domain.Film;
import org.example.domain.Streamer;
import org.example.repository.FilmRepository;
import org.example.service.FilmServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

//    @Bean
//    public FilmRepository filmRepository() {
//        return new FilmRepository();
//    }

    @Bean
    @Scope("application")
    public Streamer streamer() {
        return new Streamer();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("hello and post construct");
    }

}
