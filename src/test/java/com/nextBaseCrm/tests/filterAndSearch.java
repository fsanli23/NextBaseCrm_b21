package com.nextBaseCrm.tests;

import com.nextBaseCrm.pages.filterAndSearchWebElements;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.testng.annotations.Test;

public class filterAndSearch {
    filterAndSearchWebElements filterAndSearch = new filterAndSearchWebElements();    //user story
//"12. As a user, I should be able to use ""Filter
//and search"" functionality on Active Stream."

    //aaceptence criteria
    //"1. users (hr, marketing and helpdesk) search by type keyword to search previous posts with
    //""Filter and search"" functionality on Active Stream.
    //2. users search by choosing a ""DATE"" , ""TYPE"", ""AUTHOR"", ""TO""
    //
    //3. users filter posts by ""WORK"", ""fAVORITES"",
    //""MY ACTIVITY"", ""ANNOUCEMENT"", ""WORKFLOWS""
    //"

//scenerio
//"1. Verify users search by type-in keyword to search previous posts
//2. Verify users can search by editing Date, Type, Author,
//To and more default dropdowns.
//3. Users should be able to Filter by work, favorites, my activity,
//announcement and workflow."


    @Test
    public void search() {//user can make search on the search and filter box
        LoginToWebsite.loginNextBaseHR41();
        filterAndSearch.SearchAndFilterInBox.sendKeys("hello");
        Assert.assertTrue(filterAndSearch.SearchResult.getText().equalsIgnoreCase("hello"));
    }

    @Test
    public void DateTypeAuthor() {
        LoginToWebsite.loginNextBaseHR41();
        filterAndSearch.SearchAndFilterInBox.click();
        filterAndSearch.Author.sendKeys("fatih");
        filterAndSearch.To.sendKeys("helpdesk21@cybertekschool.com");
        filterAndSearch.TypeBox.click();
        // filterAndSearch.Post.click();
        filterAndSearch.SearchButton.click();

    }

    @Test
    public void filterByFav() {//filtering search by fav
        LoginToWebsite.loginNextBaseHR41();
        filterAndSearch.SearchAndFilterInBox.click();
        filterAndSearch.Author.sendKeys("fatih");
        filterAndSearch.To.sendKeys("helpdesk21@cybertekschool.com");
        filterAndSearch.TypeBox.click();
        filterAndSearch.Favorites.click();
        filterAndSearch.SearchButton.click();

    }

    @Test
    public void FilterByWork() {//filtering search byWork
        LoginToWebsite.loginNextBaseHR41();
        filterAndSearch.SearchAndFilterInBox.click();
        filterAndSearch.Author.sendKeys("fatih");
        filterAndSearch.To.sendKeys("helpdesk21@cybertekschool.com");
        filterAndSearch.TypeBox.click();
        filterAndSearch.Work.click();
        filterAndSearch.SearchButton.click();
    }


}
