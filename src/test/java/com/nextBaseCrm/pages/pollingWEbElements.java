package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pollingWEbElements {

    public pollingWEbElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[.='Poll'])[2]")
    public WebElement pollButton;

    @FindBy(xpath = "//input[@placeholder='Question ']")
    public WebElement QuestionInput;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement Answer1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement Answer2;

    @FindBy(name = "UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][MULTI]")
    public WebElement AllowMultipleChoice;

    @FindBy(xpath = "(//button[.='Send'])[3]")
    public WebElement Send;

    @FindBy(className = "feed-add-info-text")
    public WebElement TitleIsNotSpecified;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement AddQuestion;


    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement title;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(id = "question_1")
    public WebElement SecondQuestinInBox;

    @FindBy(id = "answer_1__0_")
    public WebElement SecondAnswer1;

    @FindBy(id = "answer_1__1_")
    public WebElement SecondAnswer2;

    @FindBy(id = "blog-submit-button-draft")
    public WebElement SaveAsDraft;
    @FindBy(id = "blog-submit-button-cancel")
    public WebElement Cancel;


}
