package com.vytrack.tests.user_stories.oguzhan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC_05 {
    public static void main(String[] args) throws InterruptedException {

        //Check if truck driver can login with invalid username and valid password


        // 1- Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //3- Make the page fullscreen
        driver.manage().window().maximize();

        //Given I am on Vytrack Login page
        driver.get("https://qa2.vytrack.com/");

        //When I enter invalid user name
        WebElement userNameInput = driver.findElement(By.id("prependedInput"));
        userNameInput.sendKeys("Oguzhan");

        //And I enter valid password
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        passwordInput.sendKeys("UserUser123");

        //And I click on Login button
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        // Then I should see a message "Invalid user name or password."
        WebElement afterLogin = driver.findElement(By.xpath("//div[.='Invalid user name or password.']"));
        afterLogin.getText();

        String actualMsj = afterLogin.getText();
        String expectedMsj ="Invalid user name or password.";

        Assert.assertTrue(actualMsj.equals(expectedMsj));


        driver.quit();

    }

}
