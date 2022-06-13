package com.vytrack.tests.user_stories.oguzhan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_06 {
    public static void main(String[] args) {

        //Check if truck driver can login with empty credentials


        // 1- Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //3- Make the page fullscreen
        driver.manage().window().maximize();

        //Given I am on Vytrack Login page
        driver.get("https://qa2.vytrack.com/");

        //When I enter nothing in the User Name input box
        WebElement userNameInput = driver.findElement(By.id("prependedInput"));
        userNameInput.sendKeys("");

        //And I enter nothing in the Password input box
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        passwordInput.sendKeys("");

        //And I click on Login button
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        //Then I should see a message "Please fill out this field."

        //We can not find web element it is appeared couple second and then disappear!

    }

}