
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "",
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        tags="@loginSuccess"
)
@Test
public class RunTest extends AbstractTestNGCucumberTests {

}