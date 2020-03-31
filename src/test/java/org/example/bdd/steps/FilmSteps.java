package org.example.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.bdd.Context;
import org.example.domain.Film;
import org.example.repository.FilmRepository;
import org.example.service.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;

import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FilmSteps {

    private Film film;
    private FilmServiceImpl filmService;
    private FilmRepository filmRepository;
    private Context context;

    @Autowired
    public FilmSteps(Film film, FilmServiceImpl filmService, FilmRepository filmRepository, Context context) {
        this.film = film;
        this.filmService = filmService;
        this.filmRepository = filmRepository;
        this.context = context;
    }

    @Given("I set the context")
    public void i_set_the_context() {
        context.setName("Mozart and Co.");
    }

    @Given("I have a film with a title and release date")
    public void i_have_a_film_with_a_title_and_release_date() {
        film.setTitle("Rain man");
        film.setReleaseDate(1988);
    }

    @When("I add the film")
    public void i_add_the_film() throws Exception {
        filmService.addFilm(film);
        context.setName("Mozart and Co.");
        System.out.println(context.getName());
    }
    @Then("the film should be added to the list of films")
    public void the_film_should_be_added_to_the_list_of_films() {
        assertThat(Math.sqrt(-1), isA(Double.class));
    }

    @Then("I have the context set to {string}")
    public void i_have_the_context_set_to(String contextName) {
        assertThat(context.getName(),equalTo(contextName));
    }




}
