package stepDefinitions.Login;

import common.BaseTest;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class StepsLoginCMS {
    LoginPage loginPage;
    @Given("user navigate to login")
    public void userNavigateToLogin() {
        BaseTest.createBrowser();
        BaseTest.openURL("https://www.saucedemo.com/");
//        loginPage.verifyLoginPage();
    }
    @When("user insert username and password success")
    public void userInsertUsernameAndPasswordSuccess() {
        loginPage = new LoginPage();
        loginPage.userInsertAndSuccess("standard_user","secret_sauce");
    }
    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickButtonLogin();
    }

    @Then("user redirect to admin page")
    public void userRedirectToAdminPage() {
        loginPage.verifyLoginPageSuccess();
    }

    @When("user insert username wrong and password wrong")
    public void userInsertUsernameWrongAndPasswordWrong() {
        
    }

    @Then("verify text when login fail")
    public void verifyTextWhenLoginFail() {
    }
}
