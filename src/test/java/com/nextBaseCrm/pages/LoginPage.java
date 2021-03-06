package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(name = "USER_LOGIN")
    public WebElement inputUsername;
    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;
    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMe;
    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement ForgotPassword;
    @FindBy(xpath = "//button[@value='Reset password']")
    public WebElement ResetPassword;
}

