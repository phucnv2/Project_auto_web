package pages;

import common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage {
    private By inputUserName = By.xpath("//input[@id='user-name']");
    private By inputPassword = By.xpath("//input[@id='password']");
    private By buttonLogin = By.xpath("//input[@id='login-button']");
    private By titleLoginSuccess = By.xpath("//div[@class='app_logo']");
    private By titleLoginPage = By.xpath("//div[@class='login_logo']");
    private By headerUserPassWrong = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");
    private By headerUsernameNull = By.xpath("//h3[normalize-space()='Epic sadface: Username is required']"); // cả 2 cungf null là xài cái này
    private By headerPasswordNull = By.xpath("//h3[normalize-space()='Epic sadface: Password is required']");

    public void userInsertAndSuccess(String username, String password) {
        BaseTest.setText(inputUserName, username);
        BaseTest.setText(inputPassword, password);
    }

    public void clickButtonLogin() {
        BaseTest.clickElement(buttonLogin);
    }

    public void verifyLoginPage() {
        if (BaseTest.getElementText(titleLoginPage) == "Swag Labs") {
            System.out.println("Pass! Đây là trang đăng nhập");
        }
        System.out.println("Fail! Đây không phải trang đăng nhập");
        Assert.assertEquals(BaseTest.getElementText(titleLoginPage),"Swag Labs","Fail! Đây không phải trang đăng nhập");
    }

    public void verifyLoginPageSuccess() {
//        if (BaseTest.getElementText(titleLoginSuccess) == "Swag Lab") {
//            System.out.println("Pass! Login thành công đây là trang chủ");
//        } else {
//            System.out.println("Fail! Đây không phải trang chủ");
//        }
        Assert.assertEquals(BaseTest.getElementText(titleLoginSuccess),"Swag Lab","Fail! Đây không phải trang đăng nhập");
    }

    public void verifyPassNull() {

    }

    public void verifyUserNull() {

    }
}
