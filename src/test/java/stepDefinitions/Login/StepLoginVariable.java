package stepDefinitions.Login;

import common.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepLoginVariable extends BaseTest {
    LoginPage loginPage;
    @Given("user navigate to login {string}")
    public void userNavigateToLogin(String url) {
        openURL(url);
        loginPage = new LoginPage();
        loginPage.verifyLoginPage();
    }

    @When("user insert {string} wrong and {string} wrong")
    public void userInsertWrongAndWrong(String username, String password) {
        loginPage.userInsertAndSuccess(username,password);
    }

    @And("click login buttonn")
    public void clickLoginButtonn() {
        loginPage.clickButtonLogin();
    }
    @Then("verify text when login fail")
    public void verifyTextWhenLoginFail() {
        loginPage.verifyLoginFail();
    }

}
