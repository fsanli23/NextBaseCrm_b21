package com.nextBaseCrm.tests.UserStory8;

import com.nextBaseCrm.utilities.BrowserUtils;
import com.nextBaseCrm.utilities.Driver;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskModuleFunctionality {

    @Test(description = "HR should able to see all the tasks under Task module")
    public void TaskModuleHR() {

        //TODO: HR can login to website with correct username and password.
        LoginToWebsite.loginNextBaseHR41();

        //TODO: Created an object for access to TaskModule @Findby.
        AllWebElementTaskModule allWebElement = new AllWebElementTaskModule();

        //TODO: HR click the task module on the left menu.
        allWebElement.TaskModule.click();
        BrowserUtils.sleep(1);


        //TODO: HR can select all the task with a check box on the 1st row.
        allWebElement.CheckBoxForAllTask.click();
        Assert.assertTrue(allWebElement.CheckBoxForAllTask.isSelected());
        allWebElement.CheckBoxForAllTask.click();
        BrowserUtils.sleep(1);


        //TODO: HR can access to any module by one click.
        allWebElement.openTaskWithOneClickHR.click();
        Assert.assertTrue(allWebElement.openTaskWithOneClickHR.isDisplayed());

        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }

    @Test(description = "Marketing should able to see all the tasks under Task module")
    public void TaskModuleMarketing() {

        //TODO: Marketing can login to website with correct username and password.
        LoginToWebsite.loginNextBaseM41();

        //TODO: Created an object for access to TaskModule @Findby.
        AllWebElementTaskModule allWebElement = new AllWebElementTaskModule();

        //TODO: Marketing click the task module on the left menu.
        allWebElement.TaskModule.click();
        BrowserUtils.sleep(1);

        //TODO: Marketing can select all the task with a check box on the 1st row.
        allWebElement.CheckBoxForAllTask.click();
        Assert.assertTrue(allWebElement.CheckBoxForAllTask.isDisplayed());
        allWebElement.CheckBoxForAllTask.click();

        //TODO: Marketing can access to any module by one click.
        allWebElement.openTaskWithOneClickMarketing.click();
        Assert.assertTrue(allWebElement.openTaskWithOneClickMarketing.isDisplayed());

        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }

    @Test(description = "HelpDesk should able to see all the tasks under Task module")
    public void TaskModuleHelpDesk() {

        //TODO: HelpDesk can login to website with correct username and password.
        LoginToWebsite.loginNextBaseHD42();

        //TODO: Created an object for access to TaskModule @Findby.
        AllWebElementTaskModule allWebElement = new AllWebElementTaskModule();

        //TODO: HelpDesk click the task module on the left menu.
        allWebElement.TaskModule.click();
        BrowserUtils.sleep(1);

        //TODO: HelpDesk can select all the task with a check box on the 1st row.
        allWebElement.CheckBoxForAllTask.click();
        Assert.assertTrue(allWebElement.CheckBoxForAllTask.isDisplayed());
        allWebElement.CheckBoxForAllTask.click();

        //TODO: HelpDesk can access to any module by one click.
        allWebElement.getOpenTaskWithOneClickHelpDesk.click();
        Assert.assertTrue(allWebElement.getOpenTaskWithOneClickHelpDesk.isDisplayed());

        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }


}
/*
1. Verify only hr and marketing team members can access to Task module.
2. Verify users can see all the task on task page.
3. Verify users can select all the task with a check box on the 1st row.
4. Verify users can access to any module by one click.
 */