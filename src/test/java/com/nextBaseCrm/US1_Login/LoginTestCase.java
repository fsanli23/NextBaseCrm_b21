package com.nextBaseCrm.US1_Login;

import com.nextBaseCrm.pages.LoginPage;
import com.nextBaseCrm.utilities.BrowserUtils;
import com.nextBaseCrm.utilities.ConfigurationReader;
import com.nextBaseCrm.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCase {

    @Test
    public void setupMethod() {
        //1. users (hr, marketing and helpdesk) login with valid credentilas

        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseURL"));

        LoginPage loginPage = new LoginPage();
        loginPage.inputUsername.sendKeys("helpdesk41@cybertekschool.com");
        loginPage.inputPassword.sendKeys("UserUser");
        BrowserUtils.sleep(2);

        loginPage.loginButton.click();


       Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
Driver.closeDriver();
    }


    }


/*
1. users (hr, marketing and helpdesk) login with valid credentilas
2. users cannot login with invalid credentials. (Negative )
3. users can check "Remember me on this computer" option
4. users access to "FORGOT YOUR PASSWORD?" link page
 */