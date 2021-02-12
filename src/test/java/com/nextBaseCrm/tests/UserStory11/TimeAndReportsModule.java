package com.nextBaseCrm.tests.UserStory11;

import com.nextBaseCrm.utilities.BrowserUtils;
import com.nextBaseCrm.utilities.Driver;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeAndReportsModule {


    @Test(description = "HR should able to access to time and reports module")
    public void TimeAndReportsModuleHR() {

        //TODO: Created a new object for access all WebElements
        AllWebElementTimeAndReportsModule allWebElements = new AllWebElementTimeAndReportsModule();

        // TODO: HR can login to website successfully
        LoginToWebsite.loginNextBaseHR41();
        BrowserUtils.sleep(1);

        //TODO: HR can access to time and report module on the left menu
        allWebElements.timeAndReportModule.click();
        Assert.assertTrue(allWebElements.timeAndReportModule.isDisplayed());
        BrowserUtils.sleep(1);

        //TODO: HR can filter absence chart by day / week / month
        allWebElements.dayFilter.click();
        allWebElements.weekFilter.click();
        allWebElements.monthFilter.click();

        Assert.assertTrue(allWebElements.dayFilter.isDisplayed());
        Assert.assertTrue(allWebElements.weekFilter.isDisplayed());
        Assert.assertTrue(allWebElements.monthFilter.isDisplayed());
        BrowserUtils.sleep(1);


        //TODO: HR can check statistics under workTime
        allWebElements.workTimeButton.click();
        Assert.assertTrue(allWebElements.workTimeButton.isDisplayed());
        BrowserUtils.sleep(1);

        //TODO: HR can check Show start and end times under workTime
        allWebElements.showStartAndEndTimes.click();
        Assert.assertTrue(allWebElements.showStartAndEndTimes.isDisplayed());

        BrowserUtils.sleep(2);
        Driver.closeDriver();

    }


    @Test(description = "Marketing should able to access to time and reports module")
    public void TimeAndReportsModuleMarketing(){

        //TODO: Created a new object for access all WebElements
        AllWebElementTimeAndReportsModule allWebElements = new AllWebElementTimeAndReportsModule();

        // TODO: Marketing can login to website successfully
        LoginToWebsite.loginNextBaseM41();
        BrowserUtils.sleep(1);

        //TODO: Marketing can access to time and report module on the left menu
        allWebElements.timeAndReportModule.click();
        Assert.assertTrue(allWebElements.timeAndReportModule.isDisplayed());
        BrowserUtils.sleep(1);

        //TODO: Marketing can filter absence chart by day / week / month
        allWebElements.dayFilter.click();
        allWebElements.weekFilter.click();
        allWebElements.monthFilter.click();

        Assert.assertTrue(allWebElements.dayFilter.isDisplayed());
        Assert.assertTrue(allWebElements.weekFilter.isDisplayed());
        Assert.assertTrue(allWebElements.monthFilter.isDisplayed());
        BrowserUtils.sleep(1);


        //TODO: Marketing can check statistics under workTime
        allWebElements.workTimeButton.click();
        Assert.assertTrue(allWebElements.workTimeButton.isDisplayed());
        BrowserUtils.sleep(1);

        //TODO: Marketing can check Show start and end times under workTime
        allWebElements.showStartAndEndTimes.click();
        Assert.assertTrue(allWebElements.showStartAndEndTimes.isDisplayed());

        BrowserUtils.sleep(2);
        Driver.closeDriver();

    }


    @Test(description = "HelpDesk should able to access to time and reports module")
    public void TimeAndReportsModuleHelpDesk(){

        //TODO: Created a new object for access all WebElements
        AllWebElementTimeAndReportsModule allWebElements = new AllWebElementTimeAndReportsModule();

        // TODO: HelpDesk can login to website successfully
        LoginToWebsite.loginNextBaseHD41();
        BrowserUtils.sleep(1);

        //TODO: HelpDesk can access to time and report module on the left menu
        allWebElements.timeAndReportModule.click();
        Assert.assertTrue(allWebElements.timeAndReportModule.isDisplayed());
        BrowserUtils.sleep(1);

        //TODO: HelpDesk can filter absence chart by day / week / month
        allWebElements.dayFilter.click();
        allWebElements.weekFilter.click();
        allWebElements.monthFilter.click();

        Assert.assertTrue(allWebElements.dayFilter.isDisplayed());
        Assert.assertTrue(allWebElements.weekFilter.isDisplayed());
        Assert.assertTrue(allWebElements.monthFilter.isDisplayed());
        BrowserUtils.sleep(1);


        //TODO: HelpDesk can check statistics under workTime
        allWebElements.workTimeButton.click();
        Assert.assertTrue(allWebElements.workTimeButton.isDisplayed());
        BrowserUtils.sleep(1);

        //TODO: HelpDesk can check Show start and end times under workTime
        allWebElements.showStartAndEndTimes.click();
        Assert.assertTrue(allWebElements.showStartAndEndTimes.isDisplayed());

        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }


}



/*
11. As a user, I should be able to access
to time and reports module


 1. Verify only hr and marketing team can access to time and report module.
2. Verify users can filter absence chartt by day / week / month
3. Verify uers can check statistics under worktime
4. Verify uers can check Show start and end times under worktime



 */
