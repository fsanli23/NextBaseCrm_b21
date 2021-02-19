package com.nextBaseCrm.tests.UserStory5;

import com.nextBaseCrm.utilities.BrowserUtils;
import com.nextBaseCrm.utilities.Driver;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PollsFunctionality {


    @BeforeMethod
    public void setupMethod() {
        LoginToWebsite.loginNextBaseHD41();
        Driver.getDriver().manage().window().maximize();
        BrowserUtils.sleep(2);
    }


    @Test (description = "users can select an answer to vote a poll")
    public void VerifyPollAnswer() {



    }


    //@Test ()


}



