package com.nextBaseCrm.tests.UserStory5;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllWebElementsPollModule {
    public AllWebElementsPollModule() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollButton;


    @FindBy(id = "question531")
    public WebElement movieQuestion;

    @FindBy(id = "vote-CXt162498")
    public WebElement favoriteColorQuestion;

    @FindBy(className = "bx-vote-buttons")
    public WebElement voteButton;

}
