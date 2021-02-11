package com.nextBaseCrm.tests.UserStory11;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllWebElementTimeAndReportsModule {

    public AllWebElementTimeAndReportsModule() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[9]")
    public WebElement timeAndReportModule;

    @FindBy(xpath = "(//span[@class='bx-c'])[3]")
    public WebElement dayFilter;

    @FindBy(xpath = "(//span[@class='bx-c'])[2]")
    public WebElement weekFilter;

    @FindBy(xpath = "(//span[@class='bx-c'])[1]")
    public WebElement monthFilter;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement workTimeButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement showStartAndEndTimes;


}
/*
11. As a user, I should be able to access
to time and reports module


 1. Verify only hr and marketing team can access to time and report module.
2. Verify users can filter absence chartt by day / week / month
3. Verify uers can check statistics under worktime
4. Verify uers can check Show start and end times under worktime

1. users (hr, marketing only ) access to time and report module.
2. Helpdesk cannot access to time and report module. (Negative )
3. users (hr, marketing ) can filter absence chartt by day / week / month
4. uers (hr, marketing ) can check statistics under worktime
5. uers can check Show start and end times under worktime


 */