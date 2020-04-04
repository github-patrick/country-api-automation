package org.example.bdd.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import org.example.bdd.config.TestConfig;
import org.example.bdd.constants.Constants;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public class AppHook {


    @Before
    public void setUp() {
        System.out.println("Executing  the before scenario block");
    }


    @After
    public void tearDown(Scenario scenario) {
        System.out.println(scenario.getUri());
        System.out.println("Executing the after scenario block");
    }

    @Before("@Api")
    public void setUpApiTests() {
        RestAssured.baseURI = Constants.COUNTRY_BASE_URL;
        RestAssured.port = 80;

    }


}
