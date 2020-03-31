package org.example.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"}, features = "classpath:features/",
                 glue = {"org.example.bdd.steps","org.example.bdd.hooks"} , strict = true)
public class RunCukesIT {
}
