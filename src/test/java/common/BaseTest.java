package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


public class BaseTest {

    public static String browser;

    public static void createBrowser() {
        WebDriver driver = setBrowser();
        DriverManager.setDriver(driver);
    }

    public static WebDriver setBrowser() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
        return driver;
    }

    public static void openURL(String url) {
        DriverManager.getDriver().get(url);
        sleep(0);
    }


    public static void sleep(double second) {
        try {
            Thread.sleep((long) (1000 * second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static WebElement getWebElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }

    public static void waitForElementClickable(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10), Duration.ofMillis(500));
            wait.until(ExpectedConditions.elementToBeClickable(getWebElement(by)));
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for the element ready to click. " + by.toString());
        }
    }

    public static void clickElement(String by) {
        waitForElementClickable(By.xpath(by));
        sleep(0);
        DriverManager.getDriver().findElement(By.xpath(by)).click();
    }
}
