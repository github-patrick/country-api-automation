package org.example.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.authentication.BasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.internal.http.AuthConfig;
import io.restassured.internal.http.HTTPBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.bdd.ApiContext;
import org.example.bdd.dtos.CountryDto;
import org.example.bdd.dtos.CountrySpecificDto;
import org.example.bdd.utils.CountryUtils;
import org.example.bdd.utils.HelperUtils;
import org.example.bdd.utils.RestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static io.restassured.RestAssured.with;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetCountrySteps {

    @Autowired
    private ApiContext apiContext;


    @Given("the country of interest is {string}")
    public void the_country_of_interest_is(String countryName) {
        apiContext.getRequestSpecBuilder().addQueryParam("pName", countryName);

        apiContext.getRequestSpecBuilder().log(LogDetail.ALL);
        apiContext.getRequestSpecBuilder().setUrlEncodingEnabled(true);
    }

    @When("I make a request to get its details")
    public void i_make_a_request_to_get_its_details() {
        apiContext.setResponse(CountryUtils.getCountry(apiContext.getRequestSpecBuilder().build()));
    }

    @Then("I should see details for {string}")
    public void i_should_see_details_for(String country) {
        Response response = apiContext.getResponse();

        JsonPath jsonPath = RestUtils.getJsonPath(response.getBody().asString());
        String nameResponse = jsonPath.get("Response[0].Name");
        assertThat(country, equalTo(nameResponse));
        HelperUtils.assertOnObject(response);
    }

    @Then("I should see an empty data set")
    public void i_should_see_an_empty_data_set() {
        JsonPath jsonPath = RestUtils.getJsonPath(apiContext.getResponse().getBody().asString());
        Integer countResponse = jsonPath.get("TotalCount");
        assertThat(countResponse, equalTo(0));
    }

    @Then("the status code is {int}")
    public void the_status_code_is(Integer statusCode) {
        assertThat(apiContext.getResponse().getStatusCode(), equalTo(statusCode));

    }

    @Then("the schema is correct")
    public void the_schema_is_correct() {
        apiContext.getResponse().then().body(matchesJsonSchemaInClasspath("get-country-schema.json"));
    }

}
