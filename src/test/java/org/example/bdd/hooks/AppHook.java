package org.example.bdd.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import lombok.extern.slf4j.Slf4j;
import org.example.bdd.config.TestConfig;
import org.example.bdd.constants.Constants;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
@Slf4j
public class AppHook {

    @Before
    public void setUp() {
        log.info("Executing hook before the test scenario");
    }

    @After
    public void tearDown(Scenario scenario) {
        log.info(scenario.getId());
        log.info("Executing hook after the test scenario");
    }

    @Before("@Api")
    public void setUpApiTests() {
        RestAssured.baseURI = Constants.COUNTRY_BASE_URL;
        RestAssured.port = 80;

    }


}
