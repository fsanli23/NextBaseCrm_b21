package com.nextBaseCrm.tests.US7_SeePostHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk41@cybertekschool.com");

        driver.findElement(By.name("USER_PASSWORD"))
        .sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("microoPostFormLHE_blogPostForm_inner")).click();

    }
}
