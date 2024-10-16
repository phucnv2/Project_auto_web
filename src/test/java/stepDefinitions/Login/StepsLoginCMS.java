package stepDefinitions.Login;

import common.BaseTest;
import io.cucumber.java.en.*;

import static common.BaseTest.driver;

public class StepsLoginCMS {
    @Given("user navigate to login")
    public void userNavigateToLogin() {
        BaseTest.openBrowser();
        BaseTest.openURL("https://crm.anhtester.com/admin/authentication");
        BaseTest.sleep(5);
        BaseTest.closeBrowser();
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
