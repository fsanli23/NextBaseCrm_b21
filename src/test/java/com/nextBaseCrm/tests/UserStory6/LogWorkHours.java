package com.nextBaseCrm.tests.UserStory6;

import com.nextBaseCrm.utilities.BrowserUtils;
import com.nextBaseCrm.utilities.Driver;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogWorkHours {

    @Test
    public void LogWorkHoursHR(){

        ClockWebElement clockWebElement = new ClockWebElement();

        LoginToWebsite.loginNextBaseHR41();
        BrowserUtils.sleep(1);

        clockWebElement.ClickClock.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockin.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockout.click();
        BrowserUtils.sleep(1);

        clockWebElement.TodaysTask.click();
        BrowserUtils.sleep(1);

        clockWebElement.addEvent.click();
        clockWebElement.addEvent.sendKeys("meeting day");
        BrowserUtils.sleep(1);

        clockWebElement.DayStartingTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.IncreaseTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.addMeetingHours.click();
        BrowserUtils.sleep(1);



        Driver.closeDriver();



    }


    @Test
    public void LogWorkHoursMarketing1(){


        ClockWebElement clockWebElement = new ClockWebElement();

        LoginToWebsite.loginNextBaseM41();
        BrowserUtils.sleep(1);

        clockWebElement.ClickClock.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockin.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockout.click();
        BrowserUtils.sleep(1);

        clockWebElement.TodaysTask.click();
        BrowserUtils.sleep(1);

        clockWebElement.addEvent.click();
        clockWebElement.addEvent.sendKeys("meeting day");
        BrowserUtils.sleep(1);

        clockWebElement.DayStartingTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.IncreaseTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.addMeetingHours.click();
        BrowserUtils.sleep(1);



        Driver.closeDriver();






    }


    @Test
    public void LogWorkHoursMarketing2(){

        ClockWebElement clockWebElement = new ClockWebElement();

        LoginToWebsite.loginNextBaseM42();
        BrowserUtils.sleep(1);

        clockWebElement.ClickClock.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockin.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockout.click();
        BrowserUtils.sleep(1);

        clockWebElement.TodaysTask.click();
        BrowserUtils.sleep(1);

        clockWebElement.addEvent.click();
        clockWebElement.addEvent.sendKeys("meeting day");
        BrowserUtils.sleep(1);

        clockWebElement.DayStartingTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.IncreaseTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.addMeetingHours.click();
        BrowserUtils.sleep(1);



        Driver.closeDriver();







    }


    @Test
    public void LogWorkHoursHelpDesk1(){

        ClockWebElement clockWebElement = new ClockWebElement();

        LoginToWebsite.loginNextBaseHD41();
        BrowserUtils.sleep(1);

        clockWebElement.ClickClock.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockin.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockout.click();
        BrowserUtils.sleep(1);

        clockWebElement.TodaysTask.click();
        BrowserUtils.sleep(1);

        clockWebElement.addEvent.click();
        clockWebElement.addEvent.sendKeys("meeting day");
        BrowserUtils.sleep(1);

        clockWebElement.DayStartingTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.IncreaseTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.addMeetingHours.click();
        BrowserUtils.sleep(1);



        Driver.closeDriver();


    }

    @Test
    public void LogWorkHoursHelpDesk2(){
        ClockWebElement clockWebElement = new ClockWebElement();

        LoginToWebsite.loginNextBaseHD42();
        BrowserUtils.sleep(1);

        clockWebElement.ClickClock.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockin.click();
        BrowserUtils.sleep(1);

        clockWebElement.Clockout.click();
        BrowserUtils.sleep(1);

        clockWebElement.TodaysTask.click();
        BrowserUtils.sleep(1);

        clockWebElement.addEvent.click();
        clockWebElement.addEvent.sendKeys("meeting day");
        BrowserUtils.sleep(1);

        clockWebElement.DayStartingTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.IncreaseTime.click();
        BrowserUtils.sleep(1);

        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.ClickSelect.click();
        BrowserUtils.sleep(1);


        clockWebElement.addMeetingHours.click();
        BrowserUtils.sleep(1);



        Driver.closeDriver();


    }



}
