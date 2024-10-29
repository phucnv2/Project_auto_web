package stepDefinitions;

import common.BasePage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.LoginPage;

@RunWith(SerenityRunner.class)
public class TestDemo {

    @Steps
    BasePage basePage;
    @Steps
    LoginPage loginPage;

    @Test
    public void addingSums() {
        // Given
        basePage.createBrowser();
        loginPage.test();
    }
}
