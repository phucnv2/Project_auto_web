package common;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import pages.LoginPage;

public class Hooks extends BasePage {

    @Before
    public void setUp() {
        // create browser
        createBrowser();
        System.out.println("Starting the scenario...");
    }

    @After
    public void tearDown() {
        DriverManager.getDriver().quit();
        System.out.println("Ending the scenario...");
    }
}
