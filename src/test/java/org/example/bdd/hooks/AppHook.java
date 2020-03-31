package org.example.bdd.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.bdd.config.TestConfig;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public class AppHook {


    @Before
    public void setUp() {
        System.out.println("Executing  the before scenario block");
    }


    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Executing the after scenario block");
    }


}
