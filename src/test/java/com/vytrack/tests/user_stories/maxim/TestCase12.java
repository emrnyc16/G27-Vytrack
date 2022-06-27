package com.vytrack.tests.user_stories.maxim;

import com.vytrack.tests.user_stories.emrepackage.utilities.WebDriverFactory;
import com.vytrack.tests.user_stories.maxim.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase12 extends TestBase {

                 // As an authorized user I can access Vehicle Fuel logs

    @Test
    public void confirmAllSelected() throws InterruptedException, IOException {

//     2. Go to website: https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user177");

        WebElement passWord = driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123");

        WebElement logInBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        logInBtn.click();

        WebElement fleetClass = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetClass.click();

        WebElement fleetFuelLog = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[5]"));
        fleetFuelLog.click();

        String expectedFuelLog = driver.getTitle();
        //WebElement actualFuelLog = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));

        Thread.sleep(2000);

        Assert.assertTrue(expectedFuelLog.contains("Fuel Logs"));


        File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\maxim\\IdeaProjects\\G27-Vytrack1\\TestCase12.png"));


    }
}



