package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostPage {
    public PostPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "bx-ilike-button-BLOG_POST_3447-1612976834")
    public WebElement likeButton;
    @FindBy(id = "feed-post-emoji-top-panel-container-BLOG_POST_3447-1612976834")
    public WebElement likedMessage;
    @FindBy(id = "blog-post-addc-add-3447")
    public WebElement commentButton;
    @FindBy(id = "log_entry_follow_7533")
    public WebElement followButton;
    @FindBy(id = "feed-post-menuanchor-3447")
    public WebElement moreButton;
    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[6]")
    public WebElement addToFavorite;
    @FindBy(id = "feed-post-contentview-cnt-BLOG_POST-3447")
    public WebElement eyeIcon;

}
