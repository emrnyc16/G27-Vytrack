package com.vytrack.tests.user_stories.janna.vytrack;

import com.vytrack.tests.user_stories.janna.TestBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_17 extends TestBase {

    @Test
    public void addEventActivity(){

        // Go to https://qa2.vytrack.com/user/login page
        driver.get("https://qa2.vytrack.com/user/login");

        // Enter username and password and click log in
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("user177");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

        WebElement button = driver.findElement(By.id("_submit"));
        button.click();

        // Go to fleet module and click on it
        WebElement fleet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleet.click();

        // Go to vehicle feature
        WebElement vehicleInfo = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        vehicleInfo.click();

        // Click on license number 12324124
        WebElement licenseNumber = driver.findElement(By.xpath("//td[.='12324124']"));
        licenseNumber.click();

        // Click on Add Event button
        WebElement eventBtn = driver.findElement(By.xpath("(//a[@href='javascript: void(0);'])[2]"));
        eventBtn.click();

        // Title input
        WebElement titleInput = driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[title]']"));
        titleInput.sendKeys("Title");

        // Save button
        WebElement saveBtn = driver.findElement(By.xpath("//button[.='Save']"));
        saveBtn.click();

        // "Calendar event saved" appear under General Lab
        WebElement calendarPopUp = driver.findElement(By.xpath("//div[.='Calendar event saved']"));
        Assert.assertEquals(calendarPopUp.getText(), "Calendar event saved");

        // "Calendar event saved" appear under Activity Lab
        WebElement activityLab = driver.findElement(By.xpath("//div[@class='details']"));
        activityLab.isDisplayed();


    }
}
