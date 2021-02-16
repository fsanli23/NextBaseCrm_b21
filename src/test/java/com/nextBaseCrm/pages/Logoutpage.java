package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {

    public Logoutpage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "user-block")
    public WebElement Logoubutton;
@FindBy(linkText = "Log out")
    public WebElement Logoutclick;
}
