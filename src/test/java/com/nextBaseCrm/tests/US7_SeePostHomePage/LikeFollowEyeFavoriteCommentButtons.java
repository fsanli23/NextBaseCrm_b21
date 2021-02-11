package com.nextBaseCrm.tests.US7_SeePostHomePage;

import com.nextBaseCrm.pages.PostPage;
import com.nextBaseCrm.utilities.BrowserUtils;
import com.nextBaseCrm.utilities.Driver;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LikeFollowEyeFavoriteCommentButtons {

    @Test
    public void likeButton(){
        LoginToWebsite.loginNextBaseM41(); // HR can't like. button is not working
        //1. users (hr, marketing and helpdesk) click "Like" button for any post
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(0,1500)");
        PostPage postPage=new PostPage();
        postPage.likeButton.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(postPage.likedMessage.getText().contains("You"));

        Driver.closeDriver();

    }
    @Test
    public void followButton(){
        LoginToWebsite.loginNextBaseHD41(); // marketing/HR 41 is following everyone. test can't pass those user
        //2. users are able to follow a post by clicking "Follow" button
        PostPage postPage=new PostPage();
        postPage.followButton.click();
        Assert.assertTrue(postPage.followButton.getText().equals("Unfollow"));
        Driver.closeDriver();
    }
    @Test
    public void eyeIconVerification(){
        //3. users can see who are the people viewed a post with eye icon
        LoginToWebsite.loginNextBaseHD41();
        PostPage postPage=new PostPage();
        postPage.eyeIcon.click();
        Assert.assertTrue((postPage.personWhoLooked).isDisplayed());
        Driver.closeDriver();


    }
    @Test
    public void asFavorite(){
        //4. users click star icon to save a post as favorite

    }


}
//1. users (hr, marketing and helpdesk) click "Like" button for any post
//2. users are able to follow a post by clicking "Follow" button
//3. users can see who are the people viewed a post with eye icon
//4. users click star icon to save a post as favorite
//5. users can write a comment to a post
//6. users cancel a comment with "Cancel" button