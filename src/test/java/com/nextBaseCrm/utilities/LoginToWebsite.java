package com.nextBaseCrm.utilities;

import com.nextBaseCrm.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginToWebsite {
    public static void loginNextBaseHD41() {

        //TODO: Setup the driver This code for QA website

        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseURL"));



        //TODO: Enter Username:
        LoginPage loginPage=new LoginPage();
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("usernameHD41"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        // TODO: Enter Password:
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        //TODO: Click to login button
        loginPage.loginButton.click();

        BrowserUtils.sleep(1);



    }
    public static void loginNextBaseHD42(){
        //TODO: Setup the driver This code for QA website

        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseURL"));



        //TODO: Enter Username:
        LoginPage loginPage=new LoginPage();
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("usernameHD42"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        // TODO: Enter Password:
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        //TODO: Click to login button
        loginPage.loginButton.click();

        BrowserUtils.sleep(1);




    }
    public static void loginNextBaseHR41(){
        //TODO: Setup the driver This code for QA website

        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseURL"));



        //TODO: Enter Username:
        LoginPage loginPage=new LoginPage();
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("usernameHR41"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        // TODO: Enter Password:
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        //TODO: Click to login button
        loginPage.loginButton.click();

        BrowserUtils.sleep(1);



    }
    public static void loginNextBaseM41(){
        //TODO: Setup the driver This code for QA website

        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseURL"));



        //TODO: Enter Username:
        LoginPage loginPage=new LoginPage();
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("usernameM41"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        // TODO: Enter Password:
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        //TODO: Click to login button
        loginPage.loginButton.click();

        BrowserUtils.sleep(1);




    }
    public static void loginNextBaseM42(){
        //TODO: Setup the driver This code for QA website

        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseURL"));



        //TODO: Enter Username:
        LoginPage loginPage=new LoginPage();
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("usernameM42"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        // TODO: Enter Password:
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        //TODO: Click to login button
        loginPage.loginButton.click();

        BrowserUtils.sleep(1);




    }



}
