package stepDefinitions.Login;

import common.BaseTest;
import io.cucumber.java.en.*;

public class StepsLoginCMS {
    @Given("user navigate to login")
    public void userNavigateToLogin() {
        BaseTest.createBrowser();
        BaseTest.openURL("https://www.demoblaze.com/index.html");
    }

    @When("user insert {string} abd {string} success")
    public void userInsertAbdSuccess(String arg0, String arg1) {
    }

    @And("click login button")
    public void clickLoginButton() {
    }

    @Then("user redirect to admin page {string}")
    public void userRedirectToAdminPage(String arg0) {
    }


}
