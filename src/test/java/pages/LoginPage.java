package pages;

import common.BaseTest;
import org.openqa.selenium.By;

public class LoginPage {
    private By inputUserName = By.xpath("//input[@id='user-name']");
    private By inputPassword = By.xpath("//input[@id='password']");
    private By buttonLogin = By.xpath("//input[@id='login-button']");
    private By titleLoginSuccess = By.xpath("//div[@class='app_logo']");
    private By titleLoginPage = By.xpath("//div[@class='login_logo']");
    private By headerUserPassWrong = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");
    private By headerUsernameNull = By.xpath("//h3[normalize-space()='Epic sadface: Username is required']"); // cả 2 cungf null là xài cái này
    private By headerPasswordNull = By.xpath("//h3[normalize-space()='Epic sadface: Password is required']");

    public void userInsertAndSuccess(String username, String password){
        BaseTest.setText(inputUserName,username);
        BaseTest.setText(inputPassword,password);
    }
    public void clickButtonLogin() {
        BaseTest.clickElement(buttonLogin);
    }
    public void verifyLoginPage() {

    }
    public void verifyLoginPageSuccess() {

    }

    public void verifyPassNull() {

    }

    public void verifyUserNull() {

    }
}
