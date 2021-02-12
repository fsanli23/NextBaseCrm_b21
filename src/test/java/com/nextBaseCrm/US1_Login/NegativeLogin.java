package com.nextBaseCrm.US1_Login;

import com.nextBaseCrm.pages.LoginPage;
import com.nextBaseCrm.utilities.BrowserUtils;
import com.nextBaseCrm.utilities.ConfigurationReader;
import com.nextBaseCrm.utilities.Driver;
import com.sun.tools.corba.se.idl.constExpr.Negative;
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




    }





}
