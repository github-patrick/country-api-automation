package org.example.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.bdd.Context;
import org.example.domain.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FooSteps {

    private String name;
    private boolean result;

    @Autowired
    private Context context;

    @DataTableType
    public Film filmEntry(Map<String, String> entry) {
        return new Film(
                entry.get("title"),
                Integer.parseInt(entry.get("release_date"))
        );
    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
    }

    @Given("I am an object")
    public void i_am_an_object() {
        name = "Patrick";

    }

    @When("I execute my method")
    public void i_execute_my_method() {
        result = name.isEmpty();
    }

    @Then("I should see an output")
    public void i_should_see_an_output() {
        context.setName("Mozart and Co.");
        assertThat(result, is(false));
    }

    @Then("the context in foo should be {string}")
    public void the_context_in_foo_should_be(String contextName) {
        assertThat(context.getName(),equalTo(contextName));
    }

    @Given("a list of numbers")
    public void a_list_of_numbers(List<Integer> numbers) {
        numbers.forEach(number -> System.out.println(number));
    }

    @When("I summarize them")
    public void i_summarize_them() {

    }

    @Then("should I get {int}")
    public void should_I_get(Integer int1) {

    }

    @Given("I have a film")
    public void i_have_a_film(List<Film> films) {

        films.forEach(film -> System.out.println(film.toString()));
    }



}
