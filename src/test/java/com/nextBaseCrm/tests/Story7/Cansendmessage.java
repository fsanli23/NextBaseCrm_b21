package com.nextBaseCrm.tests.Story7;

import com.nextBaseCrm.pages.LoginPage;
import com.nextBaseCrm.pages.Messege;
import com.nextBaseCrm.utilities.ConfigurationReader;
import com.nextBaseCrm.utilities.Driver;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cansendmessage {
    @Test
            public void setMessege() {


        // LoginToWebsite loginPage = new LoginToWebsite();
        LoginToWebsite.loginNextBaseHD41();
        Messege messege = new Messege();
        messege.clickmessege.click();
    }}
            //Messege sear=new Messege();
            //sear.search.click();
        /*ublic Messege(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
        public WebElement clickmessege;
        //@FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
        //public WebElement sendmessege;
        //@FindBy(className = "header-search-icon header-search-icon-title")
        //public WebElement search;*/





