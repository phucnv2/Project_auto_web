package com.autoTest.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"}
        , features = "src/test/resources/features/Login/Login.feature"
        , glue = "com.autoTest.definitions"
        , tags = "@ValidCredentials"
)
public class SerenityRunnerTests {
}
