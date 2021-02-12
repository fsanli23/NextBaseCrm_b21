package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class filterAndSearchWebElements {

    public filterAndSearchWebElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "LIVEFEED_search")
    public WebElement SearchAndFilterInBox;

    @FindBy(xpath = "//div[@class='main-ui-control main-ui-multi-select']")
    public WebElement TypeBox;

    @FindBy(xpath = "(//div[.='Posts'])[3]")
    public WebElement Post;

    @FindBy(xpath = "//input[@name='CREATED_BY_ID_label']")
    public WebElement Author;

    @FindBy(xpath = "//input[@name='TO_label']")
    public WebElement To;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement Date;

    @FindBy(xpath = "//span[.='Any date']")
    public WebElement Anydate;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button  main-ui-filter-find']")
    public WebElement SearchButton;

    @FindBy(id = "blog_post_body_3411")
    public WebElement SearchResult;

@FindBy(xpath = "//span[.='Favorites']")
    public WebElement Favorites;

    @FindBy(xpath = "//div[@data-id='work']")
    public WebElement Work;


}
