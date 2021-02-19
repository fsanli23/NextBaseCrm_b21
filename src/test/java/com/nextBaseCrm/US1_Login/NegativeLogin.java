package com.nextBaseCrm.US1_Login;

import com.nextBaseCrm.pages.LoginPage;
import com.nextBaseCrm.utilities.BrowserUtils;
import com.nextBaseCrm.utilities.ConfigurationReader;
import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLogin {
    @Test
    public void setupMethod() {
       // 2. users cannot login with invalid credentials. (Negative)

        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseURL"));

        LoginPage loginPage = new LoginPage();
        loginPage.inputUsername.sendKeys("helpdesk41@cybertekschool.com");
        loginPage.inputPassword.sendKeys("UserNotUser");
        BrowserUtils.sleep(2);

        loginPage.loginButton.click();

       // 4. users access to "FORGOT YOUR PASSWORD?" link page

        //WebElement ForgotPassword = Driver.getDriver().findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
        //ForgotPassword.click();
        loginPage.ForgotPassword.click();

        Assert.assertTrue(loginPage.ResetPassword.isDisplayed());

        Driver.closeDriver();



    }





}
