package com.nextBaseCrm.tests;

import com.nextBaseCrm.pages.pollingWEbElements;
import com.nextBaseCrm.utilities.Driver;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pollFunction {
    pollingWEbElements poll = new pollingWEbElements();
    //User Story
    //4. As a user, I should be able to create a poll

//Ac
    //"1. Verify users can write a poll message title with question & answer.
    //2. Verify users can check ""allow multiple Choice""
    //3. Verify users can add questions
    //4. Verify users can cancle poll"


//scenerios
    //"1. users (hr, marketing and helpdesk) create a poll with Q/A
    //2. users get error message ""The message title is not specified""
    //when they are trying to create a poll without poll title (negative )
    //3. users check ""allow multiple Choice"" while create a poll
    //4. users can add more questions to a poll
    //5. users are able to cancle creating a poll"


    @Test// creates poll from scratch with no issue
    public void creatingPoll() {
        LoginToWebsite.loginNextBaseHR41();

        poll.pollButton.click();
        Driver.getDriver().switchTo().frame(poll.iframe);
        poll.title.sendKeys("choosing best soda");
        Driver.getDriver().switchTo().parentFrame();
        poll.QuestionInput.sendKeys("best pop");
        poll.Answer1.sendKeys("drpepper");
        poll.Answer2.sendKeys("mrpibb");
        poll.Send.click();

    }

    @Test
    public void NoTitlePoll() {//creating poll without title
       LoginToWebsite.loginNextBaseHR41();

        poll.pollButton.click();
        poll.QuestionInput.sendKeys("best pop");
        poll.Answer1.sendKeys("drpepper");
        poll.Answer2.sendKeys("mrpibb");
        poll.Send.click();
        Assert.assertTrue(poll.TitleIsNotSpecified.isDisplayed());
    }

    @Test
    public void AddMultipleOption() {//users can select multiple option
        LoginToWebsite.loginNextBaseHR41();

        poll.pollButton.click();
        Driver.getDriver().switchTo().frame(poll.iframe);
        poll.title.sendKeys("choosing best soda");
        Driver.getDriver().switchTo().parentFrame();
        poll.QuestionInput.sendKeys("best pop");
        poll.Answer1.sendKeys("drpepper");
        poll.Answer2.sendKeys("mrpibb");
        poll.AllowMultipleChoice.click();
        Assert.assertTrue(poll.AllowMultipleChoice.isSelected());
    }


    @Test
    public void UsercanAddMoreQuestion() {// useradd  more question
        LoginToWebsite.loginNextBaseHR41();

        poll.pollButton.click();
        Driver.getDriver().switchTo().frame(poll.iframe);
        poll.title.sendKeys("choosing best soda");
        Driver.getDriver().switchTo().parentFrame();
        poll.QuestionInput.sendKeys("best pop");
        poll.Answer1.sendKeys("drpepper");
        poll.Answer2.sendKeys("mrpibb");
        poll.AddQuestion.click();
        poll.SecondQuestinInBox.sendKeys("East cost or West cost");
        poll.SecondAnswer1.sendKeys("east cost");
        poll.SecondAnswer2.sendKeys("west cost");
        // Assert.assertTrue(poll.SecondAnswer1.getText().equalsIgnoreCase("east cost"));
    }

    @Test
    public void UserCancelPoll() {// user can cancel poll
        LoginToWebsite.loginNextBaseHR41();

        poll.pollButton.click();
        poll.QuestionInput.sendKeys("best pop");
        poll.Answer1.sendKeys("drpepper");
        poll.Answer2.sendKeys("mrpibb");
        poll.Cancel.click();
    }


}
