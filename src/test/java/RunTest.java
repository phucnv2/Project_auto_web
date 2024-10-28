
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static common.BasePage.*;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)
@Test
public class RunTest extends AbstractTestNGCucumberTests {
    @BeforeMethod
    public void browser(){
        createBrowser();
    }
    @AfterMethod
    public void close(){
        closeBrowser();
    }
}