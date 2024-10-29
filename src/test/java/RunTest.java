import io.cucumber.junit.CucumberSerenityRunner;
import io.cucumber.testng.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features", // Đường dẫn đến các file feature
        glue = "stepDefinitions",                  // Đường dẫn đến các lớp step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Các plugin để tạo báo cáo
        tags = "@RunTest"
)
public class RunTest {
}