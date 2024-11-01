package com.autoTest.steps;

import com.autoTest.common.BasePage;
import com.autoTest.common.Constant;
import com.autoTest.common.DriverManager;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
//import org.testng.Assert;


public class LoginPage extends PageObject {
    @Steps
    BasePage basePage;
    private final By inputUserName = By.xpath("//input[@id='user-name']");
    private final By inputPassword = By.xpath("//input[@id='password']");
    private final By buttonLogin = By.xpath("//input[@id='login-button']");
    private final By titleLoginSuccess = By.xpath("//div[@class='app_logo']");
    private final By titleLoginPage = By.xpath("//div[@class='login_logo']");
    private final By headerUserPassWrong = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");
    private final By headerUsernameNull = By.xpath("//h3[normalize-space()='Epic sadface: Username is required']"); // cả 2 cungf null là xài cái này
    private final By headerPasswordNull = By.xpath("//h3[normalize-space()='Epic sadface: Password is required']");

    @Step
    public void openWebByDomain(String nameDomain) {
        String nameOpenWeb = Constant.DATA_FILE_CONF.getProperty("environments.default.domain." + nameDomain);
        openAt(nameOpenWeb);
        DriverManager.setDriver(Serenity.getDriver());
        Serenity.getDriver().manage().window().maximize();
    }

    @Step
    public void userInsertAndSuccess(String username, String password) {
        basePage.setText(inputUserName, username);
        basePage.setText(inputPassword, password);

    }

    @Step
    public void clickButtonLogin() {
        basePage.clickElement(buttonLogin);
    }

    @Step
    public void verifyLoginPage() {
        System.setProperty("serenity.take.screenshots", "FOR_EACH_ACTION");
//        Assert.assertEquals(getElementText(titleLoginPage),"Swag Labs","Fail! Đây không phải trang đăng nhập");
    }

    public void verifyLoginPageSuccess() {
//        Assert.assertEquals(getElementText(titleLoginSuccess),"Swag Labs","Fail! Đây không phải trang đăng nhập");
    }

}
