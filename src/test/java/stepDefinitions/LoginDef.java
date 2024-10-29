package stepDefinitions;

import common.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.LoginPage;

@RunWith(SerenityRunner.class)
public class LoginDef extends BasePage {

    @Steps
    BasePage basePage;
    @Steps
    LoginPage loginPage;

    @Given("user navigate to login")
    public void userNavigateToLogin() {
        openURL("https://www.saucedemo.com/");
        loginPage.verifyLoginPage();
    }

    @When("user insert username and password success")
    public void userInsertUsernameAndPasswordSuccess() {
        loginPage.userInsertAndSuccess("standard_user", "secret_sauce");
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickButtonLogin();
    }

    @Then("user redirect to admin page")
    public void userRedirectToAdminPage() {
        loginPage.verifyLoginPageSuccess();
    }
}
