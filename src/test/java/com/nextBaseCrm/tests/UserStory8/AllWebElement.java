package com.nextBaseCrm.tests.UserStory8;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllWebElement {

    public AllWebElement() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='menu-item-link'])[2]")
    public WebElement TaskModule;

    @FindBy(xpath = "(//input[@class='main-grid-checkbox main-grid-row-checkbox main-grid-check-all'])[1]")
    public WebElement CheckBoxForAllTask;

    @FindBy(xpath = "//a[@href='/company/personal/user/733/tasks/task/view/3184/']")
    public WebElement openTaskWithOneClickHR;

    @FindBy(xpath = "//a[@href='/company/personal/user/632/tasks/task/view/599/']")
    public WebElement openTaskWithOneClickMarketing;

    @FindBy(xpath = "(//a[@class='task-title task-status-text-color-accepted'])[1]")
    public WebElement getOpenTaskWithOneClickHelpDesk;


}
/*
1. Verify only hr and marketing team members can access to Task module.
2. Verify users can see all the task on task page.
3. Verify users can select all the task with a check box on the 1st row.
4. Verify users can access to any module by one click.


 */