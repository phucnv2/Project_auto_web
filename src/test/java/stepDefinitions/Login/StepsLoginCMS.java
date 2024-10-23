package stepDefinitions.Login;

import common.BaseTest;
import io.cucumber.java.en.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class StepsLoginCMS extends BaseTest{
    LoginPage loginPage;

    @Given("user navigate to login")
    public void userNavigateToLogin() {
        openURL("https://www.saucedemo.com/");
        loginPage = new LoginPage();
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
