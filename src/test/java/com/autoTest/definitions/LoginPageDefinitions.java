package com.autoTest.definitions;

import com.autoTest.steps.StepLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginPageDefinitions {
    @Steps
    StepLoginPage loginPage;


    @Given("User is on Home page")
    public void openApplication() {
        System.out.println("Page is opened");
    }

    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);
    }

    @When("User enters password as {string}")
    public void enterPassword(String passWord) throws InterruptedException {
        loginPage.inputPassword(passWord);

        loginPage.clickLogin();
    }
}
