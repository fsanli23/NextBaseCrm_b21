package com.nextBaseCrm.tests.US7_SeePostHomePage;

import com.nextBaseCrm.pages.PostPage;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LikeFollowEyeFavoriteCommentButtons {
    @Test
    public void likeButton(){
        LoginToWebsite.loginNextBaseHR41();
        PostPage postPage=new PostPage();
        postPage.likeButton.click();
        Assert.assertTrue(postPage.likedMessage.getText().contains("You"));



    }


}
//1. users (hr, marketing and helpdesk) click "Like" button for any post
//2. users are able to follow a post by clicking "Follow" button
//3. users can see who are the people viewed a post with eye icon
//4. users click star icon to save a post as favorite
//5. users can write a comment to a post
//6. users cancel a comment with "Cancel" button