package com.nextBaseCrm.tests.UserStory6;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClockWebElement {

    public ClockWebElement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[@class='timeman-beginning-but']")
    public WebElement ClickClock;


     @FindBy(xpath = "//div[@class='tm-popup-button-handler']")
    public WebElement Clockin;

    @FindBy(xpath = "//span[@class='webform-small-button tm-popup-main-button webform-small-button-decline']")
    public WebElement Clockout;

    @FindBy(xpath = "(//span[@class='tm-popup-section-text'])[1]")
    public WebElement TodaysTask;

    @FindBy(xpath = "//input[@class='tm-popup-event-form-textbox_am_pm']")
    public WebElement addEvent;

    @FindBy(xpath = "//input[@class='tm-popup-event-start-time-textbox_am_pm']")
    public WebElement DayStartingTime;

    @FindBy(xpath = "(//td[@title='Increase (Up)'])[1]")
    public WebElement IncreaseTime;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement ClickSelect;

    @FindBy(xpath = "//input[@class='tm-popup-event-end-time-textbox_am_pm']")
    public WebElement DayEndingTime;

   @FindBy(xpath = "(//input[@class='bxc-cus-sel'])[2]))")
    public WebElement addTime;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement ClickEndSelect;

    @FindBy(xpath = "//span[@class='tm-popup-event-form-submit']")
    public WebElement addMeetingHours;



}
