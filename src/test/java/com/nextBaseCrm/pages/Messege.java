package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messege {

    public Messege(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement clickmessege;
    //@FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    //public WebElement sendmessege;
    //@FindBy(className = "header-search-icon header-search-icon-title")
    //public WebElement search;
}
