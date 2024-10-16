package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;
    public static String browser;

    public static void openBrowser() {
        browser = "";
        if (browser.contains("Chorme")) {
            driver = new ChromeDriver();
        }
        if (browser.contains("")) {
            driver = new ChromeDriver();
        }
        driver = new ChromeDriver();
    }
    public static void closeBrowser() {
        driver.quit();
    }
    public static void sleep(double second) {
        try {
            Thread.sleep((long) (1000 * second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void openURL(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }
}
