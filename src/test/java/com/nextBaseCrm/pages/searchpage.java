package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class searchpage {

    public searchpage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }



   @FindBy(id="search-textbox-input")
   public WebElement searchBox;








}
