package com.vytrack.tests.user_stories.maxim;

import com.vytrack.tests.user_stories.maxim.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestCase14 extends TestBase {


    // Verify user can click the "Refresh" button

    @Test
    public void verifyRefreshBtn() throws InterruptedException, IOException {

//     2. Go to website: https://qa2.vytrack.com/user/login

        driver.get("https://qa2.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        // Entering username
        userName.sendKeys("storemanager210");

        WebElement passWord = driver.findElement(By.id("prependedInput2"));
        // Entering password
        passWord.sendKeys("UserUser123");

        // Pressing on the Login button
        WebElement logInBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        logInBtn.click();

        // Locating and selecting Fleet module
        WebElement fleetClass = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetClass.click();

        Actions actions = new Actions(driver);
        //actions.moveToElement(fleetClass).build().perform();

        //Hover over Fleet module in order to select Vehicle class
        WebElement vehiclesClass = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehiclesClass.click();

        Thread.sleep(3000);

        // Locating Refresh button and clicking on it.
        WebElement refreshBtn = driver.findElement(By.xpath("//i[@class='fa-repeat']"));
        actions.moveToElement(refreshBtn).build().perform();
        refreshBtn.click();


        //Assert.assertTrue(refreshBtn.isSelected(),"Refresh button not selected!");

        File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\maxim\\IdeaProjects\\G27-Vytrack1\\TestCase14.png"));




















    }



}
