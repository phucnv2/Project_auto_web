package stepDefinitions.Login;

import io.cucumber.java.en.*;
import pages.LoginPage;

import static common.BasePage.openURL;


public class LoginDef{
    LoginPage loginPage;

    @Given("user navigate to login")
    public void userNavigateToLogin() {
//        loginPage.openBrowser("https://www.saucedemo.com/");
        openURL("https://www.saucedemo.com/");
        loginPage.verifyLoginPage();
    }
    @When("user insert username and password success")
    public void userInsertUsernameAndPasswordSuccess() {
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
}
